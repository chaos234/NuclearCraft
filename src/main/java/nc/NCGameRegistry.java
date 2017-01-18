package nc;

import cpw.mods.fml.common.registry.GameRegistry;
import nc.block.NCBlocks;
import nc.block.accelerator.BlockSuperElectromagnet;
import nc.block.accelerator.BlockSupercooler;
import nc.block.accelerator.BlockSynchrotron;
import nc.block.basic.BlockBlock;
import nc.block.basic.BlockMachineBlock;
import nc.block.basic.BlockOre;
import nc.block.crafting.BlockNuclearWorkspace;
import nc.block.fluid.*;
import nc.block.generator.*;
import nc.block.machine.*;
import nc.block.nuke.*;
import nc.block.quantum.BlockSimpleQuantum;
import nc.block.reactor.*;
import nc.block.storage.BlockLithiumIonBattery;
import nc.block.storage.BlockVoltaicPile;
import nc.item.*;
import nc.item.armour.BoronArmour;
import nc.item.armour.BronzeArmour;
import nc.item.armour.DUArmour;
import nc.item.armour.ToughArmour;
import nc.itemblock.accelerator.ItemBlockSuperElectromagnet;
import nc.itemblock.accelerator.ItemBlockSupercooler;
import nc.itemblock.accelerator.ItemBlockSynchrotron;
import nc.itemblock.basic.ItemBlockBlock;
import nc.itemblock.basic.ItemBlockOre;
import nc.itemblock.crafting.ItemBlockNuclearWorkspace;
import nc.itemblock.generator.*;
import nc.itemblock.machine.*;
import nc.itemblock.nuke.ItemBlockAntimatterBomb;
import nc.itemblock.nuke.ItemBlockEMP;
import nc.itemblock.nuke.ItemBlockNuke;
import nc.itemblock.quantum.ItemBlockSimpleQuantum;
import nc.itemblock.reactor.*;
import nc.itemblock.storage.ItemBlockLithiumIonBattery;
import nc.itemblock.storage.ItemBlockVoltaicPile;
import nc.tile.accelerator.TileSuperElectromagnet;
import nc.tile.accelerator.TileSupercooler;
import nc.tile.accelerator.TileSynchrotron;
import nc.tile.crafting.TileNuclearWorkspace;
import nc.tile.generator.*;
import nc.tile.machine.*;
import nc.tile.other.TileTubing1;
import nc.tile.other.TileTubing2;
import nc.tile.quantum.TileSimpleQuantum;
import nc.tile.storage.TileLithiumIonBattery;
import nc.tile.storage.TileVoltaicPile;
import net.minecraft.block.Block;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialLiquid;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.util.DamageSource;
import net.minecraft.util.WeightedRandomChestContent;
import net.minecraftforge.common.ChestGenHooks;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fluids.Fluid;
import net.minecraftforge.fluids.FluidRegistry;

public class NCGameRegistry {

    public static Fluid liquidHelium;
    public static Fluid fusionPlasma;
    public static Fluid steam;
    public static Fluid denseSteam;
    public static Fluid superdenseSteam;

    public static final Material liquidhelium = (new MaterialLiquid(MapColor.redColor));
    public static DamageSource heliumfreeze = (new DamageSource("heliumfreeze")).setDamageBypassesArmor();
    public static final Material fusionplasma = (new MaterialLiquid(MapColor.purpleColor));
    public static DamageSource plasmaburn = (new DamageSource("plasmaburn")).setDamageBypassesArmor();
    public static final Material steamMaterial = (new MaterialLiquid(MapColor.grayColor));
    public static DamageSource steamburn = (new DamageSource("steamburn")).setDamageBypassesArmor();

    public static int toughHelmID;
    public static int toughChestID;
    public static int toughLegsID;
    public static int toughBootsID;

    public static int boronHelmID;
    public static int boronChestID;
    public static int boronLegsID;
    public static int boronBootsID;

    public static int bronzeHelmID;
    public static int bronzeChestID;
    public static int bronzeLegsID;
    public static int bronzeBootsID;

    public static int dUHelmID;
    public static int dUChestID;
    public static int dULegsID;
    public static int dUBootsID;

    public static void addToolMaterials() {
        Item.ToolMaterial Bronze = EnumHelper.addToolMaterial("Bronze", NCConfig.bronzeHarvestLevel, NCConfig.bronzeDurability, NCConfig.bronzeSpeed, NCConfig.bronzeDamage, 10).setRepairItem(new ItemStack(NCItems.material, 1, 6));
        Item.ToolMaterial ToughAlloy = EnumHelper.addToolMaterial("ToughAlloy", NCConfig.toughHarvestLevel, NCConfig.toughDurability, NCConfig.toughSpeed, NCConfig.toughDamage, 10).setRepairItem(new ItemStack(NCItems.material, 1, 7));
        Item.ToolMaterial ToughPaxel = EnumHelper.addToolMaterial("ToughPaxel", NCConfig.tPHarvestLevel, NCConfig.tPDurability, NCConfig.tPSpeed, NCConfig.tPDamage, 10).setRepairItem(new ItemStack(NCItems.material, 1, 7));
        Item.ToolMaterial dU = EnumHelper.addToolMaterial("dU", NCConfig.dUHarvestLevel, NCConfig.dUDurability, NCConfig.dUSpeed, NCConfig.dUDamage, 50).setRepairItem(new ItemStack(NCItems.parts, 1, 8));
        Item.ToolMaterial dUPaxel = EnumHelper.addToolMaterial("dUPaxel", NCConfig.dUPHarvestLevel, NCConfig.dUPDurability, NCConfig.dUPSpeed, NCConfig.dUPDamage, 50).setRepairItem(new ItemStack(NCItems.parts, 1, 8));
        Item.ToolMaterial Boron = EnumHelper.addToolMaterial("Boron", NCConfig.boronHarvestLevel, NCConfig.boronDurability, NCConfig.boronSpeed, NCConfig.boronDamage, 5).setRepairItem(new ItemStack(NCItems.material, 1, 43));

        NCItems.bronzePickaxe = new NCPickaxe(Bronze, "bronzePickaxe", "Can be repaired in an Anvil using Bronze.");
        GameRegistry.registerItem(NCItems.bronzePickaxe, "bronzePickaxe");
        NCItems.bronzeShovel = new NCShovel(Bronze, "bronzeShovel", "Can be repaired in an Anvil using Bronze.");
        GameRegistry.registerItem(NCItems.bronzeShovel, "bronzeShovel");
        NCItems.bronzeAxe = new NCAxe(Bronze, "bronzeAxe", "Can be repaired in an Anvil using Bronze.");
        GameRegistry.registerItem(NCItems.bronzeAxe, "bronzeAxe");
        NCItems.bronzeHoe = new NCHoe(Bronze, "bronzeHoe", "Can be repaired in an Anvil using Bronze.");
        GameRegistry.registerItem(NCItems.bronzeHoe, "bronzeHoe");
        NCItems.bronzeSword = new NCSword(Bronze, "bronzeSword", "Can be repaired in an Anvil using Bronze.");
        GameRegistry.registerItem(NCItems.bronzeSword, "bronzeSword");

        NCItems.boronPickaxe = new NCPickaxe(Boron, "boronPickaxe", "Can be repaired in an Anvil using Boron.");
        GameRegistry.registerItem(NCItems.boronPickaxe, "boronPickaxe");
        NCItems.boronShovel = new NCShovel(Boron, "boronShovel", "Can be repaired in an Anvil using Boron.");
        GameRegistry.registerItem(NCItems.boronShovel, "boronShovel");
        NCItems.boronAxe = new NCAxe(Boron, "boronAxe", "Can be repaired in an Anvil using Boron.");
        GameRegistry.registerItem(NCItems.boronAxe, "boronAxe");
        NCItems.boronHoe = new NCHoe(Boron, "boronHoe", "Can be repaired in an Anvil using Boron.");
        GameRegistry.registerItem(NCItems.boronHoe, "boronHoe");
        NCItems.boronSword = new NCSword(Boron, "boronSword", "Can be repaired in an Anvil using Boron.");
        GameRegistry.registerItem(NCItems.boronSword, "boronSword");

        NCItems.toughAlloyPickaxe = new NCPickaxe(ToughAlloy, "toughAlloyPickaxe", "Can be repaired in an Anvil using Tough Alloy.");
        GameRegistry.registerItem(NCItems.toughAlloyPickaxe, "toughAlloyPickaxe");
        NCItems.toughAlloyShovel = new NCShovel(ToughAlloy, "toughAlloyShovel", "Can be repaired in an Anvil using Tough Alloy.");
        GameRegistry.registerItem(NCItems.toughAlloyShovel, "toughAlloyShovel");
        NCItems.toughAlloyAxe = new NCAxe(ToughAlloy, "toughAlloyAxe", "Can be repaired in an Anvil using Tough Alloy.");
        GameRegistry.registerItem(NCItems.toughAlloyAxe, "toughAlloyAxe");
        NCItems.toughAlloyHoe = new NCHoe(ToughAlloy, "toughAlloyHoe", "Can be repaired in an Anvil using Tough Alloy.");
        GameRegistry.registerItem(NCItems.toughAlloyHoe, "toughAlloyHoe");
        NCItems.toughAlloySword = new NCSword(ToughAlloy, "toughAlloySword", "Can be repaired in an Anvil using Tough Alloy.");
        GameRegistry.registerItem(NCItems.toughAlloySword, "toughAlloySword");
        NCItems.toughAlloyPaxel = new NCPaxel(ToughPaxel, "toughAlloyPaxel", "A multitool that can be repaired", "in an Anvil using Tough Alloy.");
        GameRegistry.registerItem(NCItems.toughAlloyPaxel, "toughAlloyPaxel");

        NCItems.dUPickaxe = new NCPickaxe(dU, "dUPickaxe", "Can be repaired in an Anvil using Depleted Uranium Plating.");
        GameRegistry.registerItem(NCItems.dUPickaxe, "dUPickaxe");
        NCItems.dUShovel = new NCShovel(dU, "dUShovel", "Can be repaired in an Anvil using Depleted Uranium Plating.");
        GameRegistry.registerItem(NCItems.dUShovel, "dUShovel");
        NCItems.dUAxe = new NCAxe(dU, "dUAxe", "Can be repaired in an Anvil using Depleted Uranium Plating.");
        GameRegistry.registerItem(NCItems.dUAxe, "dUAxe");
        NCItems.dUHoe = new NCHoe(dU, "dUHoe", "Can be repaired in an Anvil using Depleted Uranium Plating.");
        GameRegistry.registerItem(NCItems.dUHoe, "dUHoe");
        NCItems.dUSword = new NCSword(dU, "dUSword", "Can be repaired in an Anvil using Depleted Uranium Plating.");
        GameRegistry.registerItem(NCItems.dUSword, "dUSword");
        NCItems.dUPaxel = new NCPaxel(dUPaxel, "dUPaxel", "A multitool that can be repaired in", "an Anvil using Depleted Uranium Plating.");
        GameRegistry.registerItem(NCItems.dUPaxel, "dUPaxel");

        NCItems.toughBow = new ItemToughBow("toughBow", "A better version of the vanilla bow - it does", "more damage and has a higher durability.", "Can be repaired in an Anvil using Tough Alloy.").setMaxStackSize(1);
        GameRegistry.registerItem(NCItems.toughBow, "toughBow");
        NCItems.pistol = new ItemPistol("pistol", "Uses DU bullets as ammunition.", "Deals a large amount of damage.");
        GameRegistry.registerItem(NCItems.pistol, "pistol");
        NCItems.dUBullet = new ItemNC("tools", "dUBullet", "Ammo for the Pistol.");
        GameRegistry.registerItem(NCItems.dUBullet, "dUBullet");
    }

    public static void addToolArmour() {
        ItemArmor.ArmorMaterial ToughArmorMaterial = EnumHelper.addArmorMaterial("ToughArmorMaterial", 40, (NCConfig.workspace ? new int [] {4, 8, 5, 3} : new int [] {3, 8, 6, 3}), 10);
        ItemArmor.ArmorMaterial BoronArmorMaterial = EnumHelper.addArmorMaterial("BoronArmorMaterial", 30, new int [] {3, 7, 5, 2}, 5);
        ItemArmor.ArmorMaterial BronzeArmorMaterial = EnumHelper.addArmorMaterial("BronzeArmorMaterial", 20, new int [] {2, 6, 5, 2}, 10);
        ItemArmor.ArmorMaterial dUArmorMaterial = EnumHelper.addArmorMaterial("dUArmorMaterial", 80, (NCConfig.workspace ? new int [] {5, 8, 5, 3} : new int [] {4, 8, 6, 3}), 50);

        NCItems.toughHelm = new ToughArmour(ToughArmorMaterial, toughHelmID, 0, "toughHelm");
        GameRegistry.registerItem(NCItems.toughHelm, "toughHelm");
        NCItems.toughChest = new ToughArmour(ToughArmorMaterial, toughChestID, 1, "toughChest");
        GameRegistry.registerItem(NCItems.toughChest, "toughChest");
        NCItems.toughLegs = new ToughArmour(ToughArmorMaterial, toughLegsID, 2, "toughLegs");
        GameRegistry.registerItem(NCItems.toughLegs, "toughLegs");
        NCItems.toughBoots = new ToughArmour(ToughArmorMaterial, toughBootsID, 3, "toughBoots");
        GameRegistry.registerItem(NCItems.toughBoots, "toughBoots");

        NCItems.boronHelm = new BoronArmour(BoronArmorMaterial, boronHelmID, 0, "boronHelm");
        GameRegistry.registerItem(NCItems.boronHelm, "boronHelm");
        NCItems.boronChest = new BoronArmour(BoronArmorMaterial, boronChestID, 1, "boronChest");
        GameRegistry.registerItem(NCItems.boronChest, "boronChest");
        NCItems.boronLegs = new BoronArmour(BoronArmorMaterial, boronLegsID, 2, "boronLegs");
        GameRegistry.registerItem(NCItems.boronLegs, "boronLegs");
        NCItems.boronBoots = new BoronArmour(BoronArmorMaterial, boronBootsID, 3, "boronBoots");
        GameRegistry.registerItem(NCItems.boronBoots, "boronBoots");

        NCItems.bronzeHelm = new BronzeArmour(BronzeArmorMaterial, bronzeHelmID, 0, "bronzeHelm");
        GameRegistry.registerItem(NCItems.bronzeHelm, "bronzeHelm");
        NCItems.bronzeChest = new BronzeArmour(BronzeArmorMaterial, bronzeChestID, 1, "bronzeChest");
        GameRegistry.registerItem(NCItems.bronzeChest, "bronzeChest");
        NCItems.bronzeLegs = new BronzeArmour(BronzeArmorMaterial, bronzeLegsID, 2, "bronzeLegs");
        GameRegistry.registerItem(NCItems.bronzeLegs, "bronzeLegs");
        NCItems.bronzeBoots = new BronzeArmour(BronzeArmorMaterial, bronzeBootsID, 3, "bronzeBoots");
        GameRegistry.registerItem(NCItems.bronzeBoots, "bronzeBoots");

        NCItems.dUHelm = new DUArmour(dUArmorMaterial, dUHelmID, 0, "dUHelm");
        GameRegistry.registerItem(NCItems.dUHelm, "dUHelm");
        NCItems.dUChest = new DUArmour(dUArmorMaterial, dUChestID, 1, "dUChest");
        GameRegistry.registerItem(NCItems.dUChest, "dUChest");
        NCItems.dULegs = new DUArmour(dUArmorMaterial, dULegsID, 2, "dULegs");
        GameRegistry.registerItem(NCItems.dULegs, "dULegs");
        NCItems.dUBoots = new DUArmour(dUArmorMaterial, dUBootsID, 3, "dUBoots");
        GameRegistry.registerItem(NCItems.dUBoots, "dUBoots");
    }

    public static void addFluids() {
        liquidHelium = new FluidHelium("liquidHelium");
        FluidRegistry.registerFluid(liquidHelium);
        NCBlocks.blockHelium = new BlockHelium(liquidHelium, liquidhelium.setReplaceable(), heliumfreeze).setCreativeTab(NuclearCraft.tabNC).setBlockName("liquidHeliumBlock");
        GameRegistry.registerBlock(NCBlocks.blockHelium, "liquidHeliumBlock");
        fusionPlasma = new FluidPlasma("fusionPlasma");
        FluidRegistry.registerFluid(fusionPlasma);
        NCBlocks.blockFusionPlasma = new BlockPlasma(fusionPlasma, fusionplasma.setReplaceable(), plasmaburn).setCreativeTab(NuclearCraft.tabNC).setBlockName("fusionPlasmaBlock");
        GameRegistry.registerBlock(NCBlocks.blockFusionPlasma, "fusionPlasmaBlock");

        steam = new FluidSteam("steam");
        FluidRegistry.registerFluid(steam);
        NCBlocks.blockSteam = new BlockSteam(steam, steamMaterial.setReplaceable(), steamburn).setCreativeTab(NuclearCraft.tabNC).setBlockName("steamBlock");
        GameRegistry.registerBlock(NCBlocks.blockSteam, "steamBlock");

        denseSteam = new FluidDenseSteam("denseSteam");
        FluidRegistry.registerFluid(denseSteam);
        NCBlocks.blockDenseSteam = new BlockDenseSteam(denseSteam, steamMaterial.setReplaceable(), steamburn).setCreativeTab(NuclearCraft.tabNC).setBlockName("denseSteamBlock");
        GameRegistry.registerBlock(NCBlocks.blockDenseSteam, "denseSteamBlock");

        superdenseSteam = new FluidSuperdenseSteam("superdenseSteam");
        FluidRegistry.registerFluid(superdenseSteam);
        NCBlocks.blockSuperdenseSteam = new BlockSuperdenseSteam(superdenseSteam, steamMaterial.setReplaceable(), steamburn).setCreativeTab(NuclearCraft.tabNC).setBlockName("superdenseSteamBlock");
        GameRegistry.registerBlock(NCBlocks.blockSuperdenseSteam, "superdenseSteamBlock");
    }

    public static void addBlocks() {
        GameRegistry.registerBlock(NCBlocks.blockOre = new BlockOre("blockOre", Material.rock), ItemBlockOre.class, "blockOre");

        GameRegistry.registerBlock(NCBlocks.blockBlock = new BlockBlock("blockBlock", Material.iron), ItemBlockBlock.class, "blockBlock");

        NCBlocks.simpleQuantumUp = new BlockSimpleQuantum(true).setBlockName("simpleQuantumUp").setCreativeTab(NuclearCraft.tabNC).setStepSound(Block.soundTypeMetal).setResistance(5.0F).setHardness(2.0F);
        GameRegistry.registerBlock(NCBlocks.simpleQuantumUp, ItemBlockSimpleQuantum.class, "simpleQuantumUp");
        NCBlocks.simpleQuantumDown = new BlockSimpleQuantum(false).setBlockName("simpleQuantumDown").setStepSound(Block.soundTypeMetal).setResistance(5.0F).setHardness(2.0F);
        GameRegistry.registerBlock(NCBlocks.simpleQuantumDown, ItemBlockSimpleQuantum.class, "simpleQuantumDown");

        NCBlocks.graphiteBlock = new BlockGraphiteBlock().setBlockName("graphiteBlock").setCreativeTab(NuclearCraft.tabNC).setStepSound(Block.soundTypeStone).setResistance(5.0F).setHardness(2.0F);
        GameRegistry.registerBlock(NCBlocks.graphiteBlock, ItemBlockGraphiteBlock.class, "graphiteBlock");
        NCBlocks.cellBlock = new BlockCellBlock().setBlockName("cellBlock").setCreativeTab(NuclearCraft.tabNC).setStepSound(Block.soundTypeMetal).setResistance(5.0F).setHardness(2.0F);
        GameRegistry.registerBlock(NCBlocks.cellBlock, ItemBlockCellBlock.class, "cellBlock");
        NCBlocks.reactorBlock = new BlockReactorBlock().setBlockName("reactorBlock").setCreativeTab(NuclearCraft.tabNC).setStepSound(Block.soundTypeMetal).setResistance(5.0F).setHardness(3.0F);
        GameRegistry.registerBlock(NCBlocks.reactorBlock, ItemBlockReactorBlock.class, "reactorBlock");
        NCBlocks.fusionConnector = new BlockFusionConnector().setBlockName("fusionConnector").setCreativeTab(NuclearCraft.tabNC).setStepSound(Block.soundTypeMetal).setResistance(5.0F).setHardness(3.0F);
        GameRegistry.registerBlock(NCBlocks.fusionConnector, ItemBlockFusionConnector.class, "fusionConnector");

        NCBlocks.coolerBlock = new BlockCoolerBlock().setBlockName("coolerBlock").setCreativeTab(NuclearCraft.tabNC).setStepSound(Block.soundTypeMetal).setResistance(5.0F).setHardness(2.0F);
        GameRegistry.registerBlock(NCBlocks.coolerBlock, ItemBlockCoolerBlock.class, "coolerBlock");
        NCBlocks.emptyCoolerBlock = new BlockCoolerBlock().setBlockName("emptyCoolerBlock").setCreativeTab(NuclearCraft.tabNC).setStepSound(Block.soundTypeMetal).setResistance(5.0F).setHardness(2.0F);
        GameRegistry.registerBlock(NCBlocks.emptyCoolerBlock, "emptyCoolerBlock");
        NCBlocks.waterCoolerBlock = new BlockCoolerBlock().setBlockName("waterCoolerBlock").setCreativeTab(NuclearCraft.tabNC).setStepSound(Block.soundTypeMetal).setResistance(5.0F).setHardness(2.0F);
        GameRegistry.registerBlock(NCBlocks.waterCoolerBlock, ItemBlockCoolerBlock.class, "waterCoolerBlock");
        NCBlocks.cryotheumCoolerBlock = new BlockCoolerBlock().setBlockName("cryotheumCoolerBlock").setCreativeTab(NuclearCraft.tabNC).setStepSound(Block.soundTypeMetal).setResistance(5.0F).setHardness(2.0F).setLightLevel(0.25F);
        GameRegistry.registerBlock(NCBlocks.cryotheumCoolerBlock, ItemBlockCoolerBlock.class, "cryotheumCoolerBlock");
        NCBlocks.redstoneCoolerBlock = new BlockCoolerBlock().setBlockName("redstoneCoolerBlock").setCreativeTab(NuclearCraft.tabNC).setStepSound(Block.soundTypeMetal).setResistance(5.0F).setHardness(2.0F).setLightLevel(0.25F);
        GameRegistry.registerBlock(NCBlocks.redstoneCoolerBlock, ItemBlockCoolerBlock.class, "redstoneCoolerBlock");
        NCBlocks.enderiumCoolerBlock = new BlockCoolerBlock().setBlockName("enderiumCoolerBlock").setCreativeTab(NuclearCraft.tabNC).setStepSound(Block.soundTypeMetal).setResistance(5.0F).setHardness(2.0F).setLightLevel(0.25F);
        GameRegistry.registerBlock(NCBlocks.enderiumCoolerBlock, ItemBlockCoolerBlock.class, "enderiumCoolerBlock");
        NCBlocks.glowstoneCoolerBlock = new BlockCoolerBlock().setBlockName("glowstoneCoolerBlock").setCreativeTab(NuclearCraft.tabNC).setStepSound(Block.soundTypeMetal).setResistance(5.0F).setHardness(2.0F).setLightLevel(1F);
        GameRegistry.registerBlock(NCBlocks.glowstoneCoolerBlock, ItemBlockCoolerBlock.class, "glowstoneCoolerBlock");
        NCBlocks.coolantCoolerBlock = new BlockCoolerBlock().setBlockName("coolantCoolerBlock").setCreativeTab(NuclearCraft.tabNC).setStepSound(Block.soundTypeMetal).setResistance(5.0F).setHardness(2.0F);
        GameRegistry.registerBlock(NCBlocks.coolantCoolerBlock, ItemBlockCoolerBlock.class, "coolantCoolerBlock");
        NCBlocks.heliumCoolerBlock = new BlockCoolerBlock().setBlockName("heliumCoolerBlock").setCreativeTab(NuclearCraft.tabNC).setStepSound(Block.soundTypeMetal).setResistance(5.0F).setHardness(2.0F);
        GameRegistry.registerBlock(NCBlocks.heliumCoolerBlock, ItemBlockCoolerBlock.class, "heliumCoolerBlock");

        NCBlocks.speedBlock = new BlockSpeedBlock().setBlockName("speedBlock").setCreativeTab(NuclearCraft.tabNC).setStepSound(Block.soundTypeMetal).setResistance(5.0F).setHardness(2.0F);
        GameRegistry.registerBlock(NCBlocks.speedBlock, ItemBlockSpeedBlock.class, "speedBlock");
        NCBlocks.blastBlock = new BlockBlastBlock().setBlockName("blastBlock").setCreativeTab(NuclearCraft.tabNC).setStepSound(Block.soundTypeMetal).setResistance(6000.0F).setHardness(10.0F);
        GameRegistry.registerBlock(NCBlocks.blastBlock, ItemBlockBlastBlock.class, "blastBlock");
        NCBlocks.machineBlock = new BlockMachineBlock().setBlockName("machineBlockNC").setCreativeTab(NuclearCraft.tabNC).setStepSound(Block.soundTypeMetal).setResistance(5.0F).setHardness(2.0F);
        GameRegistry.registerBlock(NCBlocks.machineBlock, "machineBlockNC");

        NCBlocks.tubing1 = new BlockTubing1().setBlockName("tubing1").setCreativeTab(NuclearCraft.tabNC).setStepSound(Block.soundTypeMetal).setResistance(5.0F).setHardness(2.0F);
        GameRegistry.registerBlock(NCBlocks.tubing1, "tubing1");
        NCBlocks.tubing2 = new BlockTubing2().setBlockName("tubing2").setCreativeTab(NuclearCraft.tabNC).setStepSound(Block.soundTypeMetal).setResistance(5.0F).setHardness(2.0F);
        GameRegistry.registerBlock(NCBlocks.tubing2, "tubing2");

        // Machine Registry
        // Block
        NCBlocks.electromagnetIdle = new BlockElectromagnet(false).setBlockName("electromagnetIdle").setCreativeTab(NuclearCraft.tabNC).setStepSound(Block.soundTypeMetal).setResistance(8.0F).setHardness(3.0F);
        GameRegistry.registerBlock(NCBlocks.electromagnetIdle, ItemBlockElectromagnet.class, "electromagnetIdle");
        NCBlocks.electromagnetActive = new BlockElectromagnet(true).setBlockName("electromagnetActive").setStepSound(Block.soundTypeMetal).setResistance(8.0F).setHardness(3.0F);
        GameRegistry.registerBlock(NCBlocks.electromagnetActive, ItemBlockElectromagnet.class, "electromagnetActive");
        NCBlocks.superElectromagnetIdle = new BlockSuperElectromagnet(false).setBlockName("superElectromagnetIdle").setCreativeTab(NuclearCraft.tabNC).setStepSound(Block.soundTypeMetal).setResistance(8.0F).setHardness(3.0F);
        GameRegistry.registerBlock(NCBlocks.superElectromagnetIdle, ItemBlockSuperElectromagnet.class, "superElectromagnetIdle");
        NCBlocks.superElectromagnetActive = new BlockSuperElectromagnet(true).setBlockName("superElectromagnetActive").setStepSound(Block.soundTypeMetal).setResistance(8.0F).setHardness(3.0F);
        GameRegistry.registerBlock(NCBlocks.superElectromagnetActive, ItemBlockSuperElectromagnet.class, "superElectromagnetActive");
        NCBlocks.supercoolerIdle = new BlockSupercooler(false).setBlockName("supercoolerIdle").setCreativeTab(NuclearCraft.tabNC).setStepSound(Block.soundTypeMetal).setResistance(8.0F).setHardness(3.0F);
        GameRegistry.registerBlock(NCBlocks.supercoolerIdle, ItemBlockSupercooler.class, "supercoolerIdle");
        NCBlocks.supercoolerActive = new BlockSupercooler(true).setBlockName("supercoolerActive").setStepSound(Block.soundTypeMetal).setResistance(8.0F).setHardness(3.0F);
        GameRegistry.registerBlock(NCBlocks.supercoolerActive, ItemBlockSupercooler.class, "supercoolerActive");
        NCBlocks.synchrotronIdle = new BlockSynchrotron(false).setBlockName("synchrotronIdle").setCreativeTab(NuclearCraft.tabNC).setStepSound(Block.soundTypeMetal).setResistance(8.0F).setHardness(3.0F);
        GameRegistry.registerBlock(NCBlocks.synchrotronIdle, ItemBlockSynchrotron.class, "synchrotronIdle");
        NCBlocks.synchrotronActive = new BlockSynchrotron(true).setBlockName("synchrotronActive").setStepSound(Block.soundTypeMetal).setResistance(8.0F).setHardness(3.0F);
        GameRegistry.registerBlock(NCBlocks.synchrotronActive, ItemBlockSynchrotron.class, "synchrotronActive");

        NCBlocks.nuclearWorkspace = new BlockNuclearWorkspace(Material.iron).setBlockName("nuclearWorkspace").setCreativeTab(NuclearCraft.tabNC).setStepSound(Block.soundTypeMetal).setResistance(20.0F).setHardness(5.0F);
        GameRegistry.registerBlock(NCBlocks.nuclearWorkspace, ItemBlockNuclearWorkspace.class, "nuclearWorkspace");

        NCBlocks.fusionReactor = new BlockFusionReactor(Material.iron).setBlockName("fusionReactor").setCreativeTab(NuclearCraft.tabNC).setStepSound(Block.soundTypeMetal).setResistance(20.0F).setHardness(5.0F);
        GameRegistry.registerBlock(NCBlocks.fusionReactor, ItemBlockFusionReactor.class, "fusionReactor");
        NCBlocks.fusionReactorBlock = new BlockFusionReactorBlock().setBlockName("fusionReactorBlock").setStepSound(Block.soundTypeMetal).setResistance(20.0F).setHardness(5.0F);
        GameRegistry.registerBlock(NCBlocks.fusionReactorBlock, "fusionReactorBlock");
        NCBlocks.fusionReactorBlockTop = new BlockFusionReactorBlockTop().setBlockName("fusionReactorBlockTop").setStepSound(Block.soundTypeMetal).setResistance(20.0F).setHardness(5.0F);
        GameRegistry.registerBlock(NCBlocks.fusionReactorBlockTop, "fusionReactorBlockTop");

        NCBlocks.fusionReactorSteam = new BlockFusionReactorSteam(Material.iron).setBlockName("fusionReactorSteam").setCreativeTab(NuclearCraft.tabNC).setStepSound(Block.soundTypeMetal).setResistance(20.0F).setHardness(5.0F);
        GameRegistry.registerBlock(NCBlocks.fusionReactorSteam, ItemBlockFusionReactorSteam.class, "fusionReactorSteam");
        NCBlocks.fusionReactorSteamBlock = new BlockFusionReactorSteamBlock().setBlockName("fusionReactorSteamBlock").setStepSound(Block.soundTypeMetal).setResistance(20.0F).setHardness(5.0F);
        GameRegistry.registerBlock(NCBlocks.fusionReactorSteamBlock, "fusionReactorSteamBlock");
        NCBlocks.fusionReactorSteamBlockTop = new BlockFusionReactorSteamBlockTop().setBlockName("fusionReactorSteamBlockTop").setStepSound(Block.soundTypeMetal).setResistance(20.0F).setHardness(5.0F);
        GameRegistry.registerBlock(NCBlocks.fusionReactorSteamBlockTop, "fusionReactorSteamBlockTop");

        NCBlocks.nuclearFurnaceIdle = new BlockNuclearFurnace(false).setBlockName("nuclearFurnaceIdle").setCreativeTab(NuclearCraft.tabNC).setStepSound(Block.soundTypeMetal).setResistance(20.0F).setHardness(5.0F);
        GameRegistry.registerBlock(NCBlocks.nuclearFurnaceIdle, ItemBlockNuclearFurnace.class, "nuclearFurnaceIdle");
        NCBlocks.nuclearFurnaceActive = new BlockNuclearFurnace(true).setBlockName("nuclearFurnaceActive").setStepSound(Block.soundTypeMetal).setResistance(20.0F).setHardness(5.0F);
        GameRegistry.registerBlock(NCBlocks.nuclearFurnaceActive, ItemBlockNuclearFurnace.class, "nuclearFurnaceActive");
        NCBlocks.furnaceIdle = new BlockFurnace(false).setBlockName("furnaceIdle").setCreativeTab(NuclearCraft.tabNC).setStepSound(Block.soundTypeMetal).setResistance(20.0F).setHardness(5.0F);
        GameRegistry.registerBlock(NCBlocks.furnaceIdle, ItemBlockFurnace.class, "furnaceIdle");
        NCBlocks.furnaceActive = new BlockFurnace(true).setBlockName("furnaceActive").setStepSound(Block.soundTypeMetal).setResistance(20.0F).setHardness(5.0F);
        GameRegistry.registerBlock(NCBlocks.furnaceActive, ItemBlockFurnace.class, "furnaceActive");
        NCBlocks.crusherIdle = new BlockCrusher(false).setBlockName("crusherIdle").setCreativeTab(NuclearCraft.tabNC).setStepSound(Block.soundTypeMetal).setResistance(20.0F).setHardness(5.0F);
        GameRegistry.registerBlock(NCBlocks.crusherIdle, ItemBlockCrusher.class, "crusherIdle");
        NCBlocks.crusherActive = new BlockCrusher(true).setBlockName("crusherActive").setStepSound(Block.soundTypeMetal).setResistance(20.0F).setHardness(5.0F);
        GameRegistry.registerBlock(NCBlocks.crusherActive, ItemBlockCrusher.class, "crusherActive");
        NCBlocks.electricCrusherIdle = new BlockElectricCrusher(false).setBlockName("electricCrusherIdle").setCreativeTab(NuclearCraft.tabNC).setStepSound(Block.soundTypeMetal).setResistance(20.0F).setHardness(5.0F);
        GameRegistry.registerBlock(NCBlocks.electricCrusherIdle, ItemBlockElectricCrusher.class, "electricCrusherIdle");
        NCBlocks.electricCrusherActive = new BlockElectricCrusher(true).setBlockName("electricCrusherActive").setStepSound(Block.soundTypeMetal).setResistance(20.0F).setHardness(5.0F);
        GameRegistry.registerBlock(NCBlocks.electricCrusherActive, ItemBlockElectricCrusher.class, "electricCrusherActive");
        NCBlocks.electricFurnaceIdle = new BlockElectricFurnace(false).setBlockName("electricFurnaceIdle").setCreativeTab(NuclearCraft.tabNC).setStepSound(Block.soundTypeMetal).setResistance(20.0F).setHardness(5.0F);
        GameRegistry.registerBlock(NCBlocks.electricFurnaceIdle, ItemBlockElectricFurnace.class, "electricFurnaceIdle");
        NCBlocks.electricFurnaceActive = new BlockElectricFurnace(true).setBlockName("electricFurnaceActive").setStepSound(Block.soundTypeMetal).setResistance(20.0F).setHardness(5.0F);
        GameRegistry.registerBlock(NCBlocks.electricFurnaceActive, ItemBlockElectricFurnace.class, "electricFurnaceActive");

        NCBlocks.reactionGeneratorIdle = new BlockReactionGenerator(false).setBlockName("reactionGeneratorIdle").setCreativeTab(NuclearCraft.tabNC).setStepSound(Block.soundTypeMetal).setResistance(20.0F).setHardness(5.0F);
        GameRegistry.registerBlock(NCBlocks.reactionGeneratorIdle, ItemBlockReactionGenerator.class, "reactionGeneratorIdle");
        NCBlocks.reactionGeneratorActive = new BlockReactionGenerator(true).setBlockName("reactionGeneratorActive").setStepSound(Block.soundTypeMetal).setResistance(20.0F).setHardness(5.0F);
        GameRegistry.registerBlock(NCBlocks.reactionGeneratorActive, ItemBlockReactionGenerator.class, "reactionGeneratorActive");

        NCBlocks.fissionReactorGraphiteIdle = new BlockFissionReactor(false).setBlockName("fissionReactorGraphiteIdle").setCreativeTab(NuclearCraft.tabNC).setStepSound(Block.soundTypeMetal).setResistance(5.0F).setHardness(5.0F);
        GameRegistry.registerBlock(NCBlocks.fissionReactorGraphiteIdle, ItemBlockFissionReactor.class, "fissionReactorGraphiteIdle");
        NCBlocks.fissionReactorGraphiteActive = new BlockFissionReactor(true).setBlockName("fissionReactorGraphiteActive").setStepSound(Block.soundTypeMetal).setResistance(5.0F).setHardness(5.0F);
        GameRegistry.registerBlock(NCBlocks.fissionReactorGraphiteActive, ItemBlockFissionReactor.class, "fissionReactorGraphiteActive");

        NCBlocks.fissionReactorSteamIdle = new BlockFissionReactorSteam(false).setBlockName("fissionReactorSteamIdle").setCreativeTab(NuclearCraft.tabNC).setStepSound(Block.soundTypeMetal).setResistance(5.0F).setHardness(5.0F);
        GameRegistry.registerBlock(NCBlocks.fissionReactorSteamIdle, ItemBlockFissionReactorSteam.class, "fissionReactorSteamIdle");
        NCBlocks.fissionReactorSteamActive = new BlockFissionReactorSteam(true).setBlockName("fissionReactorSteamActive").setStepSound(Block.soundTypeMetal).setResistance(5.0F).setHardness(5.0F);
        GameRegistry.registerBlock(NCBlocks.fissionReactorSteamActive, ItemBlockFissionReactorSteam.class, "fissionReactorSteamActive");

        NCBlocks.RTG = new BlockRTG().setBlockName("RTG").setCreativeTab(NuclearCraft.tabNC).setStepSound(Block.soundTypeMetal).setResistance(5.0F).setHardness(5.0F);
        GameRegistry.registerBlock(NCBlocks.RTG, ItemBlockRTG.class, "RTG");
        NCBlocks.AmRTG = new BlockAmRTG().setBlockName("AmRTG").setCreativeTab(NuclearCraft.tabNC).setStepSound(Block.soundTypeMetal).setResistance(5.0F).setHardness(5.0F);
        GameRegistry.registerBlock(NCBlocks.AmRTG, ItemBlockAmRTG.class, "AmRTG");
        NCBlocks.CfRTG = new BlockCfRTG().setBlockName("CfRTG").setCreativeTab(NuclearCraft.tabNC).setStepSound(Block.soundTypeMetal).setResistance(5.0F).setHardness(5.0F);
        GameRegistry.registerBlock(NCBlocks.CfRTG, ItemBlockCfRTG.class, "CfRTG");
        NCBlocks.WRTG = new BlockWRTG().setBlockName("WRTG").setCreativeTab(NuclearCraft.tabNC).setStepSound(Block.soundTypeMetal).setResistance(5.0F).setHardness(5.0F);
        GameRegistry.registerBlock(NCBlocks.WRTG, ItemBlockWRTG.class, "WRTG");
        NCBlocks.solarPanel = new BlockSolarPanel().setBlockName("solarPanel").setCreativeTab(NuclearCraft.tabNC).setStepSound(Block.soundTypeMetal).setResistance(5.0F).setHardness(5.0F);
        GameRegistry.registerBlock(NCBlocks.solarPanel, ItemBlockSolarPanel.class, "solarPanel");

        NCBlocks.lithiumIonBatteryBlock = new BlockLithiumIonBattery().setBlockName("lithiumIonBatteryBlock").setCreativeTab(NuclearCraft.tabNC).setStepSound(Block.soundTypeMetal).setResistance(5.0F).setHardness(5.0F);
        GameRegistry.registerBlock(NCBlocks.lithiumIonBatteryBlock, ItemBlockLithiumIonBattery.class, "lithiumIonBatteryBlock");
        NCBlocks.voltaicPile = new BlockVoltaicPile().setBlockName("voltaicPile").setCreativeTab(NuclearCraft.tabNC).setStepSound(Block.soundTypeMetal).setResistance(5.0F).setHardness(5.0F);
        GameRegistry.registerBlock(NCBlocks.voltaicPile, ItemBlockVoltaicPile.class, "voltaicPile");

        NCBlocks.separatorIdle = new BlockSeparator(false).setBlockName("separatorIdle").setCreativeTab(NuclearCraft.tabNC).setStepSound(Block.soundTypeMetal).setResistance(20.0F).setHardness(5.0F);
        GameRegistry.registerBlock(NCBlocks.separatorIdle, ItemBlockSeparator.class, "separatorIdle");
        NCBlocks.separatorActive = new BlockSeparator(true).setBlockName("separatorActive").setStepSound(Block.soundTypeMetal).setResistance(20.0F).setHardness(5.0F);
        GameRegistry.registerBlock(NCBlocks.separatorActive, ItemBlockSeparator.class, "separatorActive");
        NCBlocks.hastenerIdle = new BlockHastener(false).setBlockName("hastenerIdle").setCreativeTab(NuclearCraft.tabNC).setStepSound(Block.soundTypeMetal).setResistance(20.0F).setHardness(5.0F);
        GameRegistry.registerBlock(NCBlocks.hastenerIdle, ItemBlockHastener.class, "hastenerIdle");
        NCBlocks.hastenerActive = new BlockHastener(true).setBlockName("hastenerActive").setStepSound(Block.soundTypeMetal).setResistance(20.0F).setHardness(5.0F);
        GameRegistry.registerBlock(NCBlocks.hastenerActive, ItemBlockHastener.class, "hastenerActive");
        NCBlocks.electrolyserIdle = new BlockElectrolyser(false).setBlockName("electrolyserIdle").setCreativeTab(NuclearCraft.tabNC).setStepSound(Block.soundTypeMetal).setResistance(20.0F).setHardness(5.0F);
        GameRegistry.registerBlock(NCBlocks.electrolyserIdle, ItemBlockElectrolyser.class, "electrolyserIdle");
        NCBlocks.electrolyserActive = new BlockElectrolyser(true).setBlockName("electrolyserActive").setStepSound(Block.soundTypeMetal).setResistance(20.0F).setHardness(5.0F);
        GameRegistry.registerBlock(NCBlocks.electrolyserActive, ItemBlockElectrolyser.class, "electrolyserActive");

        NCBlocks.collectorIdle = new BlockCollector(false).setBlockName("collectorIdle").setCreativeTab(NuclearCraft.tabNC).setStepSound(Block.soundTypeMetal).setResistance(20.0F).setHardness(5.0F);
        GameRegistry.registerBlock(NCBlocks.collectorIdle, ItemBlockCollector.class, "collectorIdle");
        NCBlocks.collectorActive = new BlockCollector(true).setBlockName("collectorActive").setStepSound(Block.soundTypeMetal).setResistance(20.0F).setHardness(5.0F);
        GameRegistry.registerBlock(NCBlocks.collectorActive, ItemBlockCollector.class, "collectorActive");
        NCBlocks.oxidiserIdle = new BlockOxidiser(false).setBlockName("oxidiserIdle").setCreativeTab(NuclearCraft.tabNC).setStepSound(Block.soundTypeMetal).setResistance(20.0F).setHardness(5.0F);
        GameRegistry.registerBlock(NCBlocks.oxidiserIdle, ItemBlockOxidiser.class, "oxidiserIdle");
        NCBlocks.oxidiserActive = new BlockOxidiser(true).setBlockName("oxidiserActive").setStepSound(Block.soundTypeMetal).setResistance(20.0F).setHardness(5.0F);
        GameRegistry.registerBlock(NCBlocks.oxidiserActive, ItemBlockOxidiser.class, "oxidiserActive");
        NCBlocks.ioniserIdle = new BlockIoniser(false).setBlockName("ioniserIdle").setCreativeTab(NuclearCraft.tabNC).setStepSound(Block.soundTypeMetal).setResistance(20.0F).setHardness(5.0F);
        GameRegistry.registerBlock(NCBlocks.ioniserIdle, ItemBlockIoniser.class, "ioniserIdle");
        NCBlocks.ioniserActive = new BlockIoniser(true).setBlockName("ioniserActive").setStepSound(Block.soundTypeMetal).setResistance(20.0F).setHardness(5.0F);
        GameRegistry.registerBlock(NCBlocks.ioniserActive, ItemBlockIoniser.class, "ioniserActive");
        NCBlocks.irradiatorIdle = new BlockIrradiator(false).setBlockName("irradiatorIdle").setCreativeTab(NuclearCraft.tabNC).setStepSound(Block.soundTypeMetal).setResistance(20.0F).setHardness(5.0F);
        GameRegistry.registerBlock(NCBlocks.irradiatorIdle, ItemBlockIrradiator.class, "irradiatorIdle");
        NCBlocks.irradiatorActive = new BlockIrradiator(true).setBlockName("irradiatorActive").setStepSound(Block.soundTypeMetal).setResistance(20.0F).setHardness(5.0F);
        GameRegistry.registerBlock(NCBlocks.irradiatorActive, ItemBlockIrradiator.class, "irradiatorActive");
        NCBlocks.coolerIdle = new BlockCooler(false).setBlockName("coolerIdle").setCreativeTab(NuclearCraft.tabNC).setStepSound(Block.soundTypeMetal).setResistance(20.0F).setHardness(5.0F);
        GameRegistry.registerBlock(NCBlocks.coolerIdle, ItemBlockCooler.class, "coolerIdle");
        NCBlocks.coolerActive = new BlockCooler(true).setBlockName("coolerActive").setStepSound(Block.soundTypeMetal).setResistance(20.0F).setHardness(5.0F);
        GameRegistry.registerBlock(NCBlocks.coolerActive, ItemBlockCooler.class, "coolerActive");
        NCBlocks.factoryIdle = new BlockFactory(false).setBlockName("factoryIdle").setCreativeTab(NuclearCraft.tabNC).setStepSound(Block.soundTypeMetal).setResistance(20.0F).setHardness(5.0F);
        GameRegistry.registerBlock(NCBlocks.factoryIdle, ItemBlockFactory.class, "factoryIdle");
        NCBlocks.factoryActive = new BlockFactory(true).setBlockName("factoryActive").setStepSound(Block.soundTypeMetal).setResistance(20.0F).setHardness(5.0F);
        GameRegistry.registerBlock(NCBlocks.factoryActive, ItemBlockFactory.class, "factoryActive");
        NCBlocks.heliumExtractorIdle = new BlockHeliumExtractor(false).setBlockName("heliumExtractorIdle").setCreativeTab(NuclearCraft.tabNC).setStepSound(Block.soundTypeMetal).setResistance(20.0F).setHardness(5.0F);
        GameRegistry.registerBlock(NCBlocks.heliumExtractorIdle, ItemBlockHeliumExtractor.class, "heliumExtractorIdle");
        NCBlocks.heliumExtractorActive = new BlockHeliumExtractor(true).setBlockName("heliumExtractorActive").setStepSound(Block.soundTypeMetal).setResistance(20.0F).setHardness(5.0F);
        GameRegistry.registerBlock(NCBlocks.heliumExtractorActive, ItemBlockHeliumExtractor.class, "heliumExtractorActive");
        NCBlocks.assemblerIdle = new BlockAssembler(false).setBlockName("assemblerIdle").setCreativeTab(NuclearCraft.tabNC).setStepSound(Block.soundTypeMetal).setResistance(20.0F).setHardness(5.0F);
        GameRegistry.registerBlock(NCBlocks.assemblerIdle, ItemBlockAssembler.class, "assemblerIdle");
        NCBlocks.assemblerActive = new BlockAssembler(true).setBlockName("assemblerActive").setStepSound(Block.soundTypeMetal).setResistance(20.0F).setHardness(5.0F);
        GameRegistry.registerBlock(NCBlocks.assemblerActive, ItemBlockAssembler.class, "assemblerActive");
        NCBlocks.recyclerIdle = new BlockRecycler(false).setBlockName("recyclerIdle").setCreativeTab(NuclearCraft.tabNC).setStepSound(Block.soundTypeMetal).setResistance(20.0F).setHardness(5.0F);
        GameRegistry.registerBlock(NCBlocks.recyclerIdle, ItemBlockRecycler.class, "recyclerIdle");
        NCBlocks.recyclerActive = new BlockRecycler(true).setBlockName("recyclerActive").setStepSound(Block.soundTypeMetal).setResistance(20.0F).setHardness(5.0F);
        GameRegistry.registerBlock(NCBlocks.recyclerActive, ItemBlockRecycler.class, "recyclerActive");

        NCBlocks.steamGenerator = new BlockSteamGenerator().setBlockName("steamGenerator").setCreativeTab(NuclearCraft.tabNC).setStepSound(Block.soundTypeMetal).setResistance(5.0F).setHardness(5.0F);
        GameRegistry.registerBlock(NCBlocks.steamGenerator, ItemBlockSteamGenerator.class, "steamGenerator");
        NCBlocks.steamDecompressor = new BlockSteamDecompressor().setBlockName("steamDecompressor").setCreativeTab(NuclearCraft.tabNC).setStepSound(Block.soundTypeMetal).setResistance(5.0F).setHardness(5.0F);
        GameRegistry.registerBlock(NCBlocks.steamDecompressor, ItemBlockSteamDecompressor.class, "steamDecompressor");
        NCBlocks.denseSteamDecompressor = new BlockDenseSteamDecompressor().setBlockName("denseSteamDecompressor").setCreativeTab(NuclearCraft.tabNC).setStepSound(Block.soundTypeMetal).setResistance(5.0F).setHardness(5.0F);
        GameRegistry.registerBlock(NCBlocks.denseSteamDecompressor, ItemBlockDenseSteamDecompressor.class, "denseSteamDecompressor");

        NCBlocks.nuke = new BlockNuke().setBlockName("nuke").setCreativeTab(NuclearCraft.tabNC).setStepSound(Block.soundTypeCloth).setHardness(0.0F);
        GameRegistry.registerBlock(NCBlocks.nuke, ItemBlockNuke.class, "nuke");
        NCBlocks.nukeE = new BlockNukeExploding().setBlockName("nukeE").setStepSound(Block.soundTypeCloth).setHardness(0.0F);
        GameRegistry.registerBlock(NCBlocks.nukeE, ItemBlockNuke.class, "nukeE");

        NCBlocks.antimatterBomb = new BlockAntimatterBomb().setBlockName("antimatterBomb").setCreativeTab(NuclearCraft.tabNC).setStepSound(Block.soundTypeCloth).setHardness(0.0F);
        GameRegistry.registerBlock(NCBlocks.antimatterBomb, ItemBlockAntimatterBomb.class, "antimatterBomb");
        NCBlocks.antimatterBombE = new BlockAntimatterBombExploding().setBlockName("antimatterBombE").setStepSound(Block.soundTypeCloth).setHardness(0.0F);
        GameRegistry.registerBlock(NCBlocks.antimatterBombE, ItemBlockAntimatterBomb.class, "antimatterBombE");

        NCBlocks.EMP = new BlockEMP().setBlockName("EMP").setCreativeTab(NuclearCraft.tabNC).setStepSound(Block.soundTypeCloth).setHardness(0.0F);
        GameRegistry.registerBlock(NCBlocks.EMP, ItemBlockEMP.class, "EMP");
        NCBlocks.EMPE = new BlockEMPExploding().setBlockName("EMPE").setStepSound(Block.soundTypeCloth).setHardness(0.0F);
        GameRegistry.registerBlock(NCBlocks.EMPE, ItemBlockEMP.class, "EMPE");
    }

    public static void addTileEntities() {
        GameRegistry.registerTileEntity(TileNuclearFurnace.class, "nuclearFurnaceNC");
        GameRegistry.registerTileEntity(TileFurnace.class, "furnaceNC");
        GameRegistry.registerTileEntity(TileCrusher.class, "crusherNC");
        GameRegistry.registerTileEntity(TileElectricCrusher.class, "electricCrusherNC");
        GameRegistry.registerTileEntity(TileElectricFurnace.class, "electricFurnaceNC");
        GameRegistry.registerTileEntity(TileReactionGenerator.class, "reactionGeneratorNC");
        GameRegistry.registerTileEntity(TileSeparator.class, "separatorNC");
        GameRegistry.registerTileEntity(TileHastener.class, "hastenerNC");
        GameRegistry.registerTileEntity(TileCollector.class, "collectorNC");
        GameRegistry.registerTileEntity(TileElectrolyser.class, "electrolyserNC");
        GameRegistry.registerTileEntity(TileFissionReactor.class, "fissionReactorGraphiteNC");
        GameRegistry.registerTileEntity(TileFissionReactorSteam.class, "fissionReactorSteamNC");
        GameRegistry.registerTileEntity(TileNuclearWorkspace.class, "nuclearWorkspaceNC");
        GameRegistry.registerTileEntity(TileFusionReactor.class, "fusionReactorNC");
        GameRegistry.registerTileEntity(TileFusionReactorSteam.class, "fusionReactorSteamNC");
        GameRegistry.registerTileEntity(TileTubing1.class, "TEtubing1NC");
        GameRegistry.registerTileEntity(TileTubing2.class, "TEtubing2NC");
        GameRegistry.registerTileEntity(TileRTG.class, "RTGNC");
        GameRegistry.registerTileEntity(TileAmRTG.class, "AmRTGNC");
        GameRegistry.registerTileEntity(TileCfRTG.class, "CfRTGNC");
        GameRegistry.registerTileEntity(TileWRTG.class, "WRTGNC");
        GameRegistry.registerTileEntity(TileSteamGenerator.class, "steamGeneratorNC");
        GameRegistry.registerTileEntity(TileSteamDecompressor.class, "steamDecompressorNC");
        GameRegistry.registerTileEntity(TileDenseSteamDecompressor.class, "denseSteamDecompressorNC");
        GameRegistry.registerTileEntity(TileFusionReactorBlock.class, "fusionReactorBlockNC");
        GameRegistry.registerTileEntity(TileFusionReactorBlockTop.class, "fusionReactorBlockTopNC");
        GameRegistry.registerTileEntity(TileFusionReactorSteamBlock.class, "fusionReactorSteamBlockNC");
        GameRegistry.registerTileEntity(TileFusionReactorSteamBlockTop.class, "fusionReactorSteamBlockTopNC");
        GameRegistry.registerTileEntity(TileOxidiser.class, "oxidiserNC");
        GameRegistry.registerTileEntity(TileIoniser.class, "ioniserNC");
        GameRegistry.registerTileEntity(TileIrradiator.class, "irradiatorNC");
        GameRegistry.registerTileEntity(TileCooler.class, "coolerNC");
        GameRegistry.registerTileEntity(TileAssembler.class, "assemblerNC");
        GameRegistry.registerTileEntity(TileFactory.class, "factoryNC");
        GameRegistry.registerTileEntity(TileHeliumExtractor.class, "heliumExtractorNC");
        GameRegistry.registerTileEntity(TileRecycler.class, "recyclerNC");
        GameRegistry.registerTileEntity(TileSolarPanel.class, "solarPanelNC");

        GameRegistry.registerTileEntity(TileElectromagnet.class, "electromagnetNC");
        GameRegistry.registerTileEntity(TileSuperElectromagnet.class, "superElectromagnetNC");
        GameRegistry.registerTileEntity(TileSupercooler.class, "supercoolerNC");
        GameRegistry.registerTileEntity(TileSynchrotron.class, "synchrotronNC");

        GameRegistry.registerTileEntity(TileLithiumIonBattery.class, "lithiumIonBatteryBlockNC");
        GameRegistry.registerTileEntity(TileVoltaicPile.class, "voltaicPileNC");

        GameRegistry.registerTileEntity(TileSimpleQuantum.class, "simpleQuantumNC");
    }

    public static void addItems() {
        GameRegistry.registerItem(NCItems.fuel = new ItemFuel(), "fuel");
        GameRegistry.registerItem(NCItems.material = new ItemMaterial(), "material");
        GameRegistry.registerItem(NCItems.parts = new ItemPart(), "parts");

        NCItems.dominoes = new ItemDominos(16, 1.4F, false, "dominoes", "Paul's favourite - he'll follow anyone", "he sees carrying this in their hand...", "Restores 16 hunger.");
        GameRegistry.registerItem(NCItems.dominoes, "dominoes");
        NCItems.boiledEgg = new ItemFoodNC(5, 0.6F, false, "boiledEgg", "A tasty snack that restores 5 hunger.");
        GameRegistry.registerItem(NCItems.boiledEgg, "boiledEgg");

        NCItems.ricecake = new ItemFoodNC(4, 0.4F, false, "ricecake", "A healthy meal, especially with fish. Restores 4 hunger.");
        GameRegistry.registerItem(NCItems.ricecake, "ricecake");
        NCItems.fishAndRicecake = new ItemFoodNC(9, 1.0F, false, "fishAndRicecake", "At 8 in the morning he'll have fish and a ricecake, at 10 he'll have fish,", "at 12 he'll have fish and a ricecake, at 2 he'll have fish, at 4, just", "before he trains, he'll have fish and a ricecake, he'll train, he'll have", "his fish, he'll come home and have some more fish with a ricecake and then", "have some fish before he goes to bed.");
        GameRegistry.registerItem(NCItems.fishAndRicecake, "fishAndRicecake");

        NCItems.upgradeSpeed = new ItemUpgrade("upgradeSpeed", "Used to increase the speed of machines.", "Stacked upgrades increase the speed exponentially.").setMaxStackSize(8);
        GameRegistry.registerItem(NCItems.upgradeSpeed, "upgradeSpeed");
        NCItems.upgradeEnergy = new ItemUpgrade("upgradeEnergy", "Used to increase the energy efficiency of machines.", "Stacked upgrades increase the efficiency exponentially.").setMaxStackSize(8);
        GameRegistry.registerItem(NCItems.upgradeEnergy, "upgradeEnergy");

        NCItems.nuclearGrenade = new ItemNuclearGrenade("nuclearGrenade", "A VERY deadly bomb. It is highly recommended", "that this is kept off your hotbar while not", "about to be used.");
        GameRegistry.registerItem(NCItems.nuclearGrenade, "nuclearGrenade");
        NCItems.nuclearGrenadeThrown = new ItemNC("weapons", "nuclearGrenadeThrown", false);
        GameRegistry.registerItem(NCItems.nuclearGrenadeThrown, "nuclearGrenadeThrown");

        NCItems.portableEnderChest = new ItemEnderChest("portableEnderChest", "Portable access to your Ender Chest.").setMaxStackSize(1);
        GameRegistry.registerItem(NCItems.portableEnderChest, "portableEnderChest");

        //Records
        NCItems.recordPractice = new NCRecord(0, "Practice", "recordPractice", "Whenever Jimmy has some new discoveries", "to test out, his virtual practice labs are", "the best places to see what's possible...");
        GameRegistry.registerItem(NCItems.recordPractice, "recordPractice");
        NCItems.recordArea51 = new NCRecord(0, "Area51", "recordArea51", "Jimmy, with his newly aquired map, must", "make his way to the mines of Area 51", "to recover his invisibility technology...");
        GameRegistry.registerItem(NCItems.recordArea51, "recordArea51");
        NCItems.recordNeighborhood = new NCRecord(0, "Neighborhood", "recordNeighborhood", "Jimmy's hometown - a quiet and green place", "with roads to many great places such as", "Retroland and Downtown...");
        GameRegistry.registerItem(NCItems.recordNeighborhood, "recordNeighborhood");

        //Blank
        NCItems.blank = new ItemNC("", "blank", false);
        GameRegistry.registerItem(NCItems.blank, "blank");

        //Antimatter
        NCItems.antimatter = new ItemAntimatter("antimatter", "This is a temporary product of the Synchrotron.", "DO NOT drop this on the floor, or your base...", "...may go sadface...");
        GameRegistry.registerItem(NCItems.antimatter, "antimatter");

        //Batteries
        NCItems.lithiumIonBattery = new ItemBattery(NCConfig.lithiumIonRF, (int) Math.ceil(NCConfig.lithiumIonRF/20), "lithiumIonBattery", "A battery capable of storing " + (NCConfig.lithiumIonRF >= 1000000 ? NCConfig.lithiumIonRF/1000000 + " M" : (NCConfig.lithiumIonRF >= 1000 ? NCConfig.lithiumIonRF/1000 + " k" : NCConfig.lithiumIonRF + " ")) + "RF.");
        GameRegistry.registerItem(NCItems.lithiumIonBattery, "lithiumIonBattery");
    }

    public static void chestHooks() {
        if (NCConfig.enableLoot) {
            ChestGenHooks.getInfo(ChestGenHooks.DUNGEON_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(NCItems.dominoes, 1), 2, 4, 2*NCConfig.lootModifier));
            ChestGenHooks.getInfo(ChestGenHooks.DUNGEON_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(NCItems.ricecake, 1), 2, 4, 2*NCConfig.lootModifier));
            ChestGenHooks.getInfo(ChestGenHooks.DUNGEON_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(NCItems.toughBow, 1), 1, 1, NCConfig.lootModifier));
            ChestGenHooks.getInfo(ChestGenHooks.DUNGEON_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(NCItems.recordPractice, 1), 1, 1, 2*NCConfig.lootModifier));
            ChestGenHooks.getInfo(ChestGenHooks.DUNGEON_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(NCItems.recordArea51, 1), 1, 1, 2*NCConfig.lootModifier));
            ChestGenHooks.getInfo(ChestGenHooks.DUNGEON_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(NCItems.recordNeighborhood, 1), 1, 1, 2*NCConfig.lootModifier));
            ChestGenHooks.getInfo(ChestGenHooks.DUNGEON_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(NCItems.dUBullet, 1), 6, 8, 4*NCConfig.lootModifier));

            ChestGenHooks.getInfo(ChestGenHooks.MINESHAFT_CORRIDOR).addItem(new WeightedRandomChestContent(new ItemStack(NCItems.dominoes, 1), 1, 3, 2*NCConfig.lootModifier));
            ChestGenHooks.getInfo(ChestGenHooks.MINESHAFT_CORRIDOR).addItem(new WeightedRandomChestContent(new ItemStack(NCItems.ricecake, 1), 1, 3, 2*NCConfig.lootModifier));
            ChestGenHooks.getInfo(ChestGenHooks.MINESHAFT_CORRIDOR).addItem(new WeightedRandomChestContent(new ItemStack(NCItems.recordPractice, 1), 1, 1, NCConfig.lootModifier));
            ChestGenHooks.getInfo(ChestGenHooks.MINESHAFT_CORRIDOR).addItem(new WeightedRandomChestContent(new ItemStack(NCItems.recordArea51, 1), 1, 1, NCConfig.lootModifier));
            ChestGenHooks.getInfo(ChestGenHooks.MINESHAFT_CORRIDOR).addItem(new WeightedRandomChestContent(new ItemStack(NCItems.recordNeighborhood, 1), 1, 1, NCConfig.lootModifier));
            ChestGenHooks.getInfo(ChestGenHooks.MINESHAFT_CORRIDOR).addItem(new WeightedRandomChestContent(new ItemStack(NCItems.pistol, 1), 1, 1, NCConfig.lootModifier));
            ChestGenHooks.getInfo(ChestGenHooks.MINESHAFT_CORRIDOR).addItem(new WeightedRandomChestContent(new ItemStack(NCItems.dUBullet, 1), 6, 8, 4*NCConfig.lootModifier));

            ChestGenHooks.getInfo(ChestGenHooks.PYRAMID_DESERT_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(NCItems.dominoes, 1), 1, 2, NCConfig.lootModifier));
            ChestGenHooks.getInfo(ChestGenHooks.PYRAMID_DESERT_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(NCItems.ricecake, 1), 1, 2, 2*NCConfig.lootModifier));

            ChestGenHooks.getInfo(ChestGenHooks.PYRAMID_JUNGLE_DISPENSER).addItem(new WeightedRandomChestContent(new ItemStack(NCItems.toughBow, 1), 1, 1, NCConfig.lootModifier));
            ChestGenHooks.getInfo(ChestGenHooks.PYRAMID_JUNGLE_DISPENSER).addItem(new WeightedRandomChestContent(new ItemStack(NCItems.pistol, 1), 1, 1, NCConfig.lootModifier));
            ChestGenHooks.getInfo(ChestGenHooks.PYRAMID_JUNGLE_DISPENSER).addItem(new WeightedRandomChestContent(new ItemStack(NCItems.dUBullet, 1), 6, 8, 5*NCConfig.lootModifier));

            ChestGenHooks.getInfo(ChestGenHooks.PYRAMID_JUNGLE_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(NCItems.dominoes, 1), 1, 5, 2*NCConfig.lootModifier));
            ChestGenHooks.getInfo(ChestGenHooks.PYRAMID_JUNGLE_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(NCItems.fishAndRicecake, 1), 1, 5, 2*NCConfig.lootModifier));
            ChestGenHooks.getInfo(ChestGenHooks.PYRAMID_JUNGLE_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(NCItems.toughHelm, 1), 1, 1, NCConfig.lootModifier));
            ChestGenHooks.getInfo(ChestGenHooks.PYRAMID_JUNGLE_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(NCItems.toughChest, 1), 1, 1, NCConfig.lootModifier));
            ChestGenHooks.getInfo(ChestGenHooks.PYRAMID_JUNGLE_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(NCItems.toughLegs, 1), 1, 1, NCConfig.lootModifier));
            ChestGenHooks.getInfo(ChestGenHooks.PYRAMID_JUNGLE_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(NCItems.toughBoots, 1), 1, 1, NCConfig.lootModifier));

            ChestGenHooks.getInfo(ChestGenHooks.VILLAGE_BLACKSMITH).addItem(new WeightedRandomChestContent(new ItemStack(NCItems.toughHelm, 1), 1, 1, 2*NCConfig.lootModifier));
            ChestGenHooks.getInfo(ChestGenHooks.VILLAGE_BLACKSMITH).addItem(new WeightedRandomChestContent(new ItemStack(NCItems.toughChest, 1), 1, 1, NCConfig.lootModifier));
            ChestGenHooks.getInfo(ChestGenHooks.VILLAGE_BLACKSMITH).addItem(new WeightedRandomChestContent(new ItemStack(NCItems.toughLegs, 1), 1, 1, NCConfig.lootModifier));
            ChestGenHooks.getInfo(ChestGenHooks.VILLAGE_BLACKSMITH).addItem(new WeightedRandomChestContent(new ItemStack(NCItems.toughBoots, 1), 1, 1, NCConfig.lootModifier));
            ChestGenHooks.getInfo(ChestGenHooks.VILLAGE_BLACKSMITH).addItem(new WeightedRandomChestContent(new ItemStack(NCItems.toughBow, 1), 1, 1, NCConfig.lootModifier));

            ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_CORRIDOR).addItem(new WeightedRandomChestContent(new ItemStack(NCItems.fishAndRicecake, 1), 4, 5, 5*NCConfig.lootModifier));
            ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_CORRIDOR).addItem(new WeightedRandomChestContent(new ItemStack(NCItems.toughAlloyPaxel, 1), 1, 1, NCConfig.lootModifier));
            ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_CORRIDOR).addItem(new WeightedRandomChestContent(new ItemStack(NCBlocks.AmRTG, 1), 1, 1, NCConfig.lootModifier));
            ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_CORRIDOR).addItem(new WeightedRandomChestContent(new ItemStack(NCItems.parts, 1, 9), 4, 6, 4*NCConfig.lootModifier));
            ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_CORRIDOR).addItem(new WeightedRandomChestContent(new ItemStack(NCItems.parts, 1, 16), 7, 8, 4*NCConfig.lootModifier));
            ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_CORRIDOR).addItem(new WeightedRandomChestContent(new ItemStack(NCItems.parts, 1, 17), 7, 8, 4*NCConfig.lootModifier));
            ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_CORRIDOR).addItem(new WeightedRandomChestContent(new ItemStack(NCItems.parts, 1, 0), 7, 8, 4*NCConfig.lootModifier));
            ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_CORRIDOR).addItem(new WeightedRandomChestContent(new ItemStack(NCItems.parts, 1, 4), 7, 8, 4*NCConfig.lootModifier));
            ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_CORRIDOR).addItem(new WeightedRandomChestContent(new ItemStack(NCItems.parts, 1, 14), 6, 8, 4*NCConfig.lootModifier));

            ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_CROSSING).addItem(new WeightedRandomChestContent(new ItemStack(NCItems.fishAndRicecake, 1), 4, 5, 2*NCConfig.lootModifier));
            ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_CROSSING).addItem(new WeightedRandomChestContent(new ItemStack(NCItems.toughAlloyPaxel, 1), 1, 1, NCConfig.lootModifier));
            ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_CROSSING).addItem(new WeightedRandomChestContent(new ItemStack(NCItems.dUPaxel, 1), 1, 1, NCConfig.lootModifier));
            ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_CROSSING).addItem(new WeightedRandomChestContent(new ItemStack(NCBlocks.AmRTG, 1), 1, 1, NCConfig.lootModifier));
            ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_CROSSING).addItem(new WeightedRandomChestContent(new ItemStack(NCItems.parts, 1, 9), 2, 4, NCConfig.lootModifier));
            ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_CROSSING).addItem(new WeightedRandomChestContent(new ItemStack(NCItems.recordPractice, 1), 1, 1, 2*NCConfig.lootModifier));
            ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_CROSSING).addItem(new WeightedRandomChestContent(new ItemStack(NCItems.recordArea51, 1), 1, 1, 2*NCConfig.lootModifier));
            ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_CROSSING).addItem(new WeightedRandomChestContent(new ItemStack(NCItems.recordNeighborhood, 1), 1, 1, 2*NCConfig.lootModifier));
            ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_CROSSING).addItem(new WeightedRandomChestContent(new ItemStack(NCItems.parts, 1, 16), 4, 8, 4*NCConfig.lootModifier));
            ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_CROSSING).addItem(new WeightedRandomChestContent(new ItemStack(NCItems.parts, 1, 17), 4, 8, 4*NCConfig.lootModifier));
            ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_CROSSING).addItem(new WeightedRandomChestContent(new ItemStack(NCItems.parts, 1, 0), 4, 8, 4*NCConfig.lootModifier));
            ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_CROSSING).addItem(new WeightedRandomChestContent(new ItemStack(NCItems.parts, 1, 4), 4, 8, 4*NCConfig.lootModifier));
            ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_CROSSING).addItem(new WeightedRandomChestContent(new ItemStack(NCItems.parts, 1, 14), 6, 8, 4*NCConfig.lootModifier));

            ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_LIBRARY).addItem(new WeightedRandomChestContent(new ItemStack(NCItems.dominoes, 1), 4, 5, 3*NCConfig.lootModifier));
            ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_LIBRARY).addItem(new WeightedRandomChestContent(new ItemStack(NCItems.ricecake, 1), 4, 5, 3*NCConfig.lootModifier));
            ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_LIBRARY).addItem(new WeightedRandomChestContent(new ItemStack(NCItems.fuel, 1, 46), 1, 1, 3*NCConfig.lootModifier));
            ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_LIBRARY).addItem(new WeightedRandomChestContent(new ItemStack(NCItems.fuel, 1, 75), 4, 5, 7*NCConfig.lootModifier));
            ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_LIBRARY).addItem(new WeightedRandomChestContent(new ItemStack(NCBlocks.RTG, 1), 1, 1, NCConfig.lootModifier));
            ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_LIBRARY).addItem(new WeightedRandomChestContent(new ItemStack(NCItems.fuel, 1, 49), 2, 4, NCConfig.lootModifier));
            ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_LIBRARY).addItem(new WeightedRandomChestContent(new ItemStack(NCItems.fuel, 1, 50), 2, 4, NCConfig.lootModifier));
            ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_LIBRARY).addItem(new WeightedRandomChestContent(new ItemStack(NCItems.fuel, 1, 47), 2, 4, NCConfig.lootModifier));
            ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_LIBRARY).addItem(new WeightedRandomChestContent(new ItemStack(NCItems.recordPractice, 1), 1, 1, NCConfig.lootModifier));
            ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_LIBRARY).addItem(new WeightedRandomChestContent(new ItemStack(NCItems.recordArea51, 1), 1, 1, NCConfig.lootModifier));
            ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_LIBRARY).addItem(new WeightedRandomChestContent(new ItemStack(NCItems.recordNeighborhood, 1), 1, 1, NCConfig.lootModifier));
            ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_LIBRARY).addItem(new WeightedRandomChestContent(new ItemStack(NCBlocks.simpleQuantumUp, 1), 1, 1, NCConfig.lootModifier));
            ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_LIBRARY).addItem(new WeightedRandomChestContent(new ItemStack(NCItems.dUHelm, 1), 1, 1, NCConfig.lootModifier));
            ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_LIBRARY).addItem(new WeightedRandomChestContent(new ItemStack(NCItems.dUChest, 1), 1, 1, NCConfig.lootModifier));
            ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_LIBRARY).addItem(new WeightedRandomChestContent(new ItemStack(NCItems.dULegs, 1), 1, 1, NCConfig.lootModifier));
            ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_LIBRARY).addItem(new WeightedRandomChestContent(new ItemStack(NCItems.dUBoots, 1), 1, 1, NCConfig.lootModifier));

            ChestGenHooks.getInfo(ChestGenHooks.BONUS_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(NCItems.ricecake, 1), 2, 3, 3*NCConfig.lootModifier));
            ChestGenHooks.getInfo(ChestGenHooks.BONUS_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(NCItems.boiledEgg, 1), 2, 3, 3*NCConfig.lootModifier));
        }
    }
}
