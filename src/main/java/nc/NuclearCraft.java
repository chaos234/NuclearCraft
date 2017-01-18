package nc;

import nc.achievment.NCAchievement;
import nc.block.NCBlocks;
import nc.entity.EntityAntimatterBombPrimed;
import nc.entity.EntityBullet;
import nc.entity.EntityEMPPrimed;
import nc.entity.EntityNuclearGrenade;
import nc.entity.EntityNuclearMonster;
import nc.entity.EntityNukePrimed;
import nc.entity.EntityPaul;
import nc.gui.GuiHandler;
import nc.handler.AnvilRepairHandler;
import nc.handler.BlockDropHandler;
import nc.handler.EntityDropHandler;
import nc.handler.EntityHandler;
import nc.handler.FuelHandler;
import nc.item.NCItems;
import nc.packet.PacketHandler;
import nc.proxy.CommonProxy;
import nc.util.Achievements;
import nc.worldgen.OreGen;
import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.stats.Achievement;
import net.minecraftforge.common.MinecraftForge;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.simpleimpl.SimpleNetworkWrapper;
import cpw.mods.fml.common.registry.GameRegistry;

@Mod(modid = NuclearCraft.modid, version = NuclearCraft.version)

public class NuclearCraft {
	public static final String modid = "NuclearCraft";
	public static final String version = "1.9e";
	
	public static final CreativeTabs tabNC = new CreativeTabs("tabNC") {
		// Creative Tab Shown Item
		public Item getTabIconItem() {
			return Item.getItemFromBlock(NCBlocks.fusionReactor);
		}
	};
	
	// Mod Hooks
	public static IC2Recipes IC2Hook;
	public static TERecipes TEHook;
	
	@Instance(modid)
	public static NuclearCraft instance;
	
	public static final int guiIdNuclearFurnace = 0;
	public static final int guiIdFurnace = 1;
	public static final int guiIdCrusher = 2;
	public static final int guiIdElectricCrusher = 3;
	public static final int guiIdElectricFurnace = 4;
	public static final int guiIdReactionGenerator = 5;
	public static final int guiIdSeparator = 6;
	public static final int guiIdHastener = 7;
	public static final int guiIdFissionReactorGraphite = 8;
	public static final int guiIdNuclearWorkspace = 9;
	public static final int guiIdCollector = 10;
	public static final int guiIdFusionReactor = 11;
	public static final int guiIdElectrolyser = 12;
	public static final int guiIdOxidiser = 13;
	public static final int guiIdIoniser = 14;
	public static final int guiIdIrradiator = 15;
	public static final int guiIdCooler = 16;
	public static final int guiIdFactory = 17;
	public static final int guiIdHeliumExtractor = 18;
	public static final int guiIdSynchrotron = 19;
	public static final int guiIdAssembler = 20;
	public static final int guiIdFissionReactorSteam = 21;
	public static final int guiIdFusionReactorSteam = 22;
	public static final int guiIdRecycler = 23;

	@SidedProxy(clientSide = "nc.proxy.ClientProxy", serverSide = "nc.proxy.CommonProxy")
	public static CommonProxy NCProxy;

	public static SimpleNetworkWrapper network;

    public NCCraftingRecipes crafting;
    public NCAchievement achievement;
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {	
		//config
		NCConfig.loadConfiguragtion();
		
		// Recipes
		/*RecipeSorter.register("nuclearcraft:workspaceshaped", NuclearWorkspaceShapedOreRecipe.class, Category.SHAPED, "after:minecraft:shaped");
		RecipeSorter.register("nuclearcraft:workspaceshapeless", NuclearWorkspaceShapelessOreRecipe.class, Category.SHAPELESS, "after:minecraft:shapeless");*/
		
		// Tool Materials
		NCGameRegistry.addToolMaterials();
		
		// Armour Materials - 12, 17, 12, 8 - 5, 8, 7, 4
		NCGameRegistry.addToolArmour();
		
		// Fluid Registry
		NCGameRegistry.addFluids();
		
		// Ore Registry & Block Registry
		NCGameRegistry.addBlocks();
			
			// Tile Entity
		NCGameRegistry.addTileEntities();
	
		// Item Registry
		NCGameRegistry.addItems();
		
		// Tool Registry
		// moved to NCConfig.addToolMaterial();
		
		//Armor Registry
			// moved to NCConfig.addToolArmour();

		// Register all Recipes
		crafting.addRecipes();
		
		// Gui Handler
		@SuppressWarnings("unused")
		GuiHandler guiHandler = new GuiHandler();
		
		// Proxy
		NCProxy.registerRenderThings();
		NCProxy.registerSounds();
		NCProxy.registerTileEntitySpecialRenderer();
		
		// Packets
		PacketHandler.init();
		
		// Entities
		EntityHandler.registerMonsters(EntityNuclearMonster.class, "NuclearMonster");
		EntityHandler.registerPaul(EntityPaul.class, "Paul");
		EntityHandler.registerNuke(EntityNukePrimed.class, "NukePrimed");
		EntityHandler.registerEMP(EntityEMPPrimed.class, "EMPPrimed");
		EntityHandler.registerAntimatterBomb(EntityAntimatterBombPrimed.class, "AntimatterBombPrimed");
		EntityHandler.registerNuclearGrenade(EntityNuclearGrenade.class, "NuclearGrenade");
		EntityHandler.registerEntityBullet(EntityBullet.class, "EntityBullet");
				
		// Fuel Handler	
		GameRegistry.registerFuelHandler(new FuelHandler());
			
		// Random Chest Loot
		NCGameRegistry.chestHooks();
		
		// World Generation Registry
		GameRegistry.registerWorldGenerator(new OreGen(), 1);
		
		// Inter Mod Comms - Mekanism
		NCInterMod.add();
	}
	
	@EventHandler
	public void init(FMLInitializationEvent event) {
		// OreDictionary Registry
        NCOreDict.add();
		
		// Seeds
		MinecraftForge.addGrassSeed(NCConfig.extraDrops ? new ItemStack(Items.pumpkin_seeds) : new ItemStack(Items.wheat_seeds), 1);
			
		// Extra Block Drops
		MinecraftForge.EVENT_BUS.register(new BlockDropHandler());
		
		// Extra Mob Drops
		MinecraftForge.EVENT_BUS.register(new EntityDropHandler());
		
		// Anvil Recipes
		MinecraftForge.EVENT_BUS.register(new AnvilRepairHandler());
		
		// Achievements
        achievement.add();
	}
	
	@EventHandler
	public void postInit(FMLPostInitializationEvent event) {
		// Mod Recipes
		IC2Hook = new IC2Recipes();
		IC2Hook.hook();
		
		TEHook = new TERecipes();
		TEHook.hook();
	}
}