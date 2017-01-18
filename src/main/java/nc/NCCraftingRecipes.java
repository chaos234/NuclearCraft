package nc;

import cpw.mods.fml.common.registry.GameRegistry;
import nc.block.NCBlocks;
import nc.item.NCItems;
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.ShapedOreRecipe;
import net.minecraftforge.oredict.ShapelessOreRecipe;

/**
 * Created by gifsu on 18.01.2017.
 */
public class NCCraftingRecipes {

    public void s(Item item, int metaIn, int metaOut) {
        GameRegistry.addSmelting(new ItemStack(item, 1, metaIn), new ItemStack(item, 1, metaOut), 0F);
    }

    public void b(int meta, String item) {
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(NCBlocks.blockBlock, 1, meta), true, new Object[] {"XXX", "XXX", "XXX", 'X', item}));
    }

    public void b(Block block, String item) {
        GameRegistry.addRecipe(new ShapedOreRecipe(block, true, new Object[] {"XXX", "XXX", "XXX", 'X', item}));
    }

    public void l(int meta, String fertile, String fissile) {
        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(NCItems.fuel, 1, meta), new Object[] {fertile, fertile, fertile, fertile, fertile, fertile, fertile, fertile, fissile}));
    }

    public void h(int meta, String fertile, String fissile) {
        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(NCItems.fuel, 1, meta), new Object[] {fertile, fertile, fertile, fertile, fertile, fissile, fissile, fissile, fissile}));
    }

    public void f(int meta, String fertile) {
        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(NCItems.fuel, 1, meta), new Object[] {fertile, fertile, fertile, fertile, fertile, fertile, fertile, fertile, fertile}));
    }

    public void m(int meta, String item) {
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(NCItems.material, 1, meta), true, new Object[] {"XXX", "XXX", "XXX", 'X', item}));
    }

    public void c(int meta, String fuel) {
        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(NCItems.fuel, 1, meta), new Object[] {fuel, new ItemStack (NCItems.fuel, 1, 33)}));
    }

    public void addRecipes() {
        // Block Crafting Recipes
        b(0, "ingotCopper");
        b(1, "ingotTin");
        b(2, "ingotLead");
        b(3, "ingotSilver");
        b(4, "ingotUranium");
        b(5, "ingotThorium");
        b(6, "ingotBronze");
        b(8, "ingotLithium");
        b(9, "ingotBoron");
        b(10, "ingotMagnesium");
        b(NCBlocks.graphiteBlock, "ingotGraphite");

        // Tiny Dust to Full Dust
        m(17, "dustTinyLead");

        // Isotope Lump Recipes
        m(24, "tinyU238Base");
        m(26, "tinyU235Base");
        m(28, "tinyU233Base");
        m(30, "tinyPu238Base");
        m(32, "tinyPu239Base");
        m(34, "tinyPu242Base");
        m(36, "tinyPu241Base");
        m(38, "tinyTh232Base");
        m(40, "tinyTh230Base");

        m(55, "tinyU238Oxide");
        m(57, "tinyU235Oxide");
        m(59, "tinyU233Oxide");
        m(61, "tinyPu238Oxide");
        m(63, "tinyPu239Oxide");
        m(65, "tinyPu242Oxide");
        m(67, "tinyPu241Oxide");
        m(82, "tinyTh232Oxide");
        m(84, "tinyTh230Oxide");

        m(46, "tinyLi6");
        m(48, "tinyB10");

        m(86, "tinyNp236Base");
        m(88, "tinyNp237Base");
        m(90, "tinyAm241Base");
        m(92, "tinyAm242Base");
        m(94, "tinyAm243Base");
        m(96, "tinyCm243Base");
        m(98, "tinyCm245Base");
        m(100, "tinyCm246Base");
        m(102, "tinyCm247Base");
        m(122, "tinyCf250Base");

        m(104, "tinyNp236Oxide");
        m(106, "tinyNp237Oxide");
        m(108, "tinyAm241Oxide");
        m(110, "tinyAm242Oxide");
        m(112, "tinyAm243Oxide");
        m(114, "tinyCm243Oxide");
        m(116, "tinyCm245Oxide");
        m(118, "tinyCm246Oxide");
        m(120, "tinyCm247Oxide");
        m(124, "tinyCf250Oxide");

        // Shaped Crafting Recipes
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(NCItems.fuel, 16, 33), true, new Object[]{" I ", "I I", " I ", 'I', "plateIron"}));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(NCItems.fuel, 16, 45), true, new Object[] {" I ", "I I", " I ", 'I', "plateTin"}));

        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(NCItems.parts, 2, 0), true, new Object[] {"LLL", "CCC", 'L', "ingotLead", 'C', "dustCoal"}));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(NCItems.parts, 1, 2), true, new Object[] {"FFF", "CCC", "SSS", 'F', Items.flint, 'C', "cobblestone", 'S', Items.stick}));

        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(NCItems.parts, 16, 1), true, new Object[] {"III", "IBI", "III", 'I', "ingotIron", 'B', "blockIron"}));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(NCItems.parts, 16, 6), true, new Object[] {"III", "IBI", "III", 'I', "ingotTin", 'B', "blockTin"}));

        GameRegistry.addRecipe(new ShapedOreRecipe(NCBlocks.nuclearFurnaceIdle, true, new Object[] {"XPX", "PFP", "XPX", 'P', "plateBasic", 'X', "dustObsidian", 'F', Blocks.furnace}));
        GameRegistry.addRecipe(new ShapedOreRecipe(NCBlocks.furnaceIdle, true, new Object[] {"PPP", "PXP", "PPP", 'P', "plateIron", 'X', Blocks.furnace}));
        GameRegistry.addRecipe(new ShapedOreRecipe(NCBlocks.crusherIdle, true, new Object[] {"PPP", "PCP", "PPP", 'P', "plateIron", 'C', new ItemStack(NCItems.parts, 1, 2)}));

        GameRegistry.addRecipe(new ShapedOreRecipe(NCBlocks.electricFurnaceIdle, true, new Object[] {"PRP", "RCR", "PRP", 'P', "plateIron", 'R', new ItemStack(NCItems.parts, 1, 12), 'C', NCBlocks.furnaceIdle}));
        GameRegistry.addRecipe(new ShapedOreRecipe(NCBlocks.electricCrusherIdle, true, new Object[] {"PRP", "RCR", "PRP", 'P', "plateIron", 'R', new ItemStack(NCItems.parts, 1, 12), 'C', NCBlocks.crusherIdle}));

        if (NCConfig.workspace) GameRegistry.addRecipe(new ShapedOreRecipe(NCBlocks.nuclearWorkspace, true, new Object[] {"NNN", " T ", "TTT", 'N', "plateBasic", 'T', "ingotTough"}));

        GameRegistry.addRecipe(new ShapedOreRecipe(NCBlocks.graphiteBlock, true, new Object[] {"CDC", "DCD", "CDC", 'D', "dustCoal", 'C', Items.coal}));

        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(NCBlocks.fusionConnector, 4), true, new Object[] {"CC", 'C', NCBlocks.electromagnetIdle}));

        GameRegistry.addRecipe(new ShapedOreRecipe(NCItems.upgradeSpeed, true, new Object[] {"PPP", "PCP", "PPP", 'P', "dustLapis", 'C', "plateIron"}));
        GameRegistry.addRecipe(new ShapedOreRecipe(NCItems.upgradeEnergy, true, new Object[] {"PPP", "PCP", "PPP", 'P', "universalReactant", 'C', "plateIron"}));

        GameRegistry.addRecipe(new ShapedOreRecipe(NCBlocks.voltaicPile, true, new Object[] {"PCP", "PMP", 'P', "plateBasic", 'C', "blockCopper", 'M', "blockMagnesium"}));

        // Tool Crafting Recipes
        GameRegistry.addRecipe(new ShapedOreRecipe(NCItems.bronzePickaxe, true, new Object[] {"XXX", " S ", " S ", 'X', "ingotBronze", 'S', Items.stick}));
        GameRegistry.addRecipe(new ShapedOreRecipe(NCItems.bronzeShovel, true, new Object[] {"X", "S", "S", 'X', "ingotBronze", 'S', Items.stick}));
        GameRegistry.addRecipe(new ShapedOreRecipe(NCItems.bronzeAxe, true, new Object[] {"XX", "XS", " S", 'X', "ingotBronze", 'S', Items.stick}));
        GameRegistry.addRecipe(new ShapedOreRecipe(NCItems.bronzeAxe, true, new Object[] {"XX", "SX", "S ", 'X', "ingotBronze", 'S', Items.stick}));
        GameRegistry.addRecipe(new ShapedOreRecipe(NCItems.bronzeHoe, true, new Object[] {"XX", "S ", "S ", 'X', "ingotBronze", 'S', Items.stick}));
        GameRegistry.addRecipe(new ShapedOreRecipe(NCItems.bronzeHoe, true, new Object[] {"XX", " S", " S", 'X', "ingotBronze", 'S', Items.stick}));
        GameRegistry.addRecipe(new ShapedOreRecipe(NCItems.bronzeSword, true, new Object[] {"X", "X", "S", 'X', "ingotBronze", 'S', Items.stick}));

        GameRegistry.addRecipe(new ShapedOreRecipe(NCItems.boronPickaxe, true, new Object[] {"XXX", " S ", " S ", 'X', "ingotBoron", 'S', Items.stick}));
        GameRegistry.addRecipe(new ShapedOreRecipe(NCItems.boronShovel, true, new Object[] {"X", "S", "S", 'X', "ingotBoron", 'S', Items.stick}));
        GameRegistry.addRecipe(new ShapedOreRecipe(NCItems.boronAxe, true, new Object[] {"XX", "XS", " S", 'X', "ingotBoron", 'S', Items.stick}));
        GameRegistry.addRecipe(new ShapedOreRecipe(NCItems.boronAxe, true, new Object[] {"XX", "SX", "S ", 'X', "ingotBoron", 'S', Items.stick}));
        GameRegistry.addRecipe(new ShapedOreRecipe(NCItems.boronHoe, true, new Object[] {"XX", "S ", "S ", 'X', "ingotBoron", 'S', Items.stick}));
        GameRegistry.addRecipe(new ShapedOreRecipe(NCItems.boronHoe, true, new Object[] {"XX", " S", " S", 'X', "ingotBoron", 'S', Items.stick}));
        GameRegistry.addRecipe(new ShapedOreRecipe(NCItems.boronSword, true, new Object[] {"X", "X", "S", 'X', "ingotBoron", 'S', Items.stick}));

        // Armour Crafting Recipes
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(NCItems.boronHelm, 1), true, new Object[] {"XXX", "X X", 'X', "ingotBoron"}));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(NCItems.boronChest, 1), true, new Object[] {"X X", "XXX", "XXX", 'X', "ingotBoron"}));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(NCItems.boronLegs, 1), true, new Object[] {"XXX", "X X", "X X", 'X', "ingotBoron"}));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(NCItems.boronBoots, 1), true, new Object[] {"X X", "X X", 'X', "ingotBoron"}));

        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(NCItems.bronzeHelm, 1), true, new Object[] {"XXX", "X X", 'X', "ingotBronze"}));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(NCItems.bronzeChest, 1), true, new Object[] {"X X", "XXX", "XXX", 'X', "ingotBronze"}));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(NCItems.bronzeLegs, 1), true, new Object[] {"XXX", "X X", "X X", 'X', "ingotBronze"}));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(NCItems.bronzeBoots, 1), true, new Object[] {"X X", "X X", 'X', "ingotBronze"}));

        // Simple Shapeless Crafting Recipes
        GameRegistry.addShapelessRecipe(new ItemStack(NCItems.material, 9, 4), new Object[] {new ItemStack(NCBlocks.blockBlock, 1, 4)});
        GameRegistry.addShapelessRecipe(new ItemStack(NCItems.material, 9, 0), new Object[] {new ItemStack(NCBlocks.blockBlock, 1, 0)});
        GameRegistry.addShapelessRecipe(new ItemStack(NCItems.material, 9, 1), new Object[] {new ItemStack(NCBlocks.blockBlock, 1, 1)});
        GameRegistry.addShapelessRecipe(new ItemStack(NCItems.material, 9, 2), new Object[] {new ItemStack(NCBlocks.blockBlock, 1, 2)});
        GameRegistry.addShapelessRecipe(new ItemStack(NCItems.material, 9, 3), new Object[] {new ItemStack(NCBlocks.blockBlock, 1, 3)});
        GameRegistry.addShapelessRecipe(new ItemStack(NCItems.material, 9, 6), new Object[] {new ItemStack(NCBlocks.blockBlock, 1, 6)});
        GameRegistry.addShapelessRecipe(new ItemStack(NCItems.material, 9, 5), new Object[] {new ItemStack(NCBlocks.blockBlock, 1, 5)});
        GameRegistry.addShapelessRecipe(new ItemStack(NCItems.material, 9, 42), new Object[] {new ItemStack(NCBlocks.blockBlock, 1, 8)});
        GameRegistry.addShapelessRecipe(new ItemStack(NCItems.material, 9, 43), new Object[] {new ItemStack(NCBlocks.blockBlock, 1, 9)});
        GameRegistry.addShapelessRecipe(new ItemStack(NCItems.material, 25, 7), new Object[] {new ItemStack(NCBlocks.blockBlock, 1, 7)});
        GameRegistry.addShapelessRecipe(new ItemStack(NCItems.material, 9, 50), new Object[] {new ItemStack(NCBlocks.blockBlock, 1, 10)});
        GameRegistry.addShapelessRecipe(new ItemStack(NCItems.material, 9, 76), new Object[] {new ItemStack(NCBlocks.graphiteBlock, 1)});

        GameRegistry.addShapelessRecipe(new ItemStack(NCBlocks.tubing1, 1), new Object[] {new ItemStack(NCBlocks.tubing2)});
        GameRegistry.addShapelessRecipe(new ItemStack(NCBlocks.tubing2, 1), new Object[] {new ItemStack(NCBlocks.tubing1)});

        // Complex Shapeless Crafting Recipes
        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(NCItems.dominoes, 4), new Object[] {Items.cooked_beef, Items.cooked_porkchop, Items.cooked_chicken, Blocks.brown_mushroom, Blocks.brown_mushroom, Items.bread, Items.bread}));

        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(NCItems.material, 4, 6), new Object[] {"ingotCopper", "ingotCopper", "ingotCopper", "ingotTin"}));
        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(NCItems.material, 4, 21), new Object[] {"dustCopper", "dustCopper", "dustCopper", "dustTin"}));

        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(NCItems.material, 3, 71), new Object[] {"ingotMagnesium", "ingotBoron", "ingotBoron"}));
        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(NCItems.material, 3, 72), new Object[] {"dustMagnesium", "dustBoron", "dustBoron"}));

        // Fission Fuel Shapeless Recipes
        l(0, "U238", "U235Base");
        h(1, "U238", "U235Base");
        l(2, "Pu242", "Pu239Base");
        h(3, "Pu242", "Pu239Base");
        l(4, "U238", "Pu239Oxide");
        f(5, "Th232Base");
        l(6, "U238", "U233Base");
        h(7, "U238", "U233Base");
        l(8, "Pu242", "Pu241Base");
        h(9, "Pu242", "Pu241Base");
        l(10, "U238", "Pu241Oxide");
        f(76, "Th232Oxide");

        l(51, "U238", "U235Oxide");
        h(52, "U238", "U235Oxide");
        l(53, "Pu242", "Pu239Oxide");
        h(54, "Pu242", "Pu239Oxide");
        l(55, "U238", "U233Oxide");
        h(56, "U238", "U233Oxide");
        l(57, "Pu242", "Pu241Oxide");
        h(58, "Pu242", "Pu241Oxide");

        l(79, "Np237", "Np236Base");
        h(80, "Np237", "Np236Base");
        l(81, "Am243", "Am242Base");
        h(82, "Am243", "Am242Base");
        l(83, "Cm246", "Cm243Base");
        h(84, "Cm246", "Cm243Base");
        l(85, "Cm246", "Cm245Base");
        h(86, "Cm246", "Cm245Base");
        l(87, "Cm246", "Cm247Base");
        h(88, "Cm246", "Cm247Base");

        l(89, "Np237", "Np236Oxide");
        h(90, "Np237", "Np236Oxide");
        l(91, "Am243", "Am242Oxide");
        h(92, "Am243", "Am242Oxide");
        l(93, "Cm246", "Cm243Oxide");
        h(94, "Cm246", "Cm243Oxide");
        l(95, "Cm246", "Cm245Oxide");
        h(96, "Cm246", "Cm245Oxide");
        l(97, "Cm246", "Cm247Oxide");
        h(98, "Cm246", "Cm247Oxide");

        // Fuel Cell Shapeless Recipes
        c(11, "LEU235");
        c(12, "HEU235");
        c(13, "LEP239");
        c(14, "HEP239");
        c(15, "MOX239");
        c(16, "TBU");
        c(17, "LEU233");
        c(18, "HEU233");
        c(19, "LEP241");
        c(20, "HEP241");
        c(21, "MOX241");
        c(77, "TBUOxide");

        c(59, "LEU235Oxide");
        c(60, "HEU235Oxide");
        c(61, "LEP239Oxide");
        c(62, "HEP239Oxide");
        c(63, "LEU233Oxide");
        c(64, "HEU233Oxide");
        c(65, "LEP241Oxide");
        c(66, "HEP241Oxide");

        c(99, "LEN236");
        c(100, "HEN236");
        c(101, "LEA242");
        c(102, "HEA242");
        c(103, "LEC243");
        c(104, "HEC243");
        c(105, "LEC245");
        c(106, "HEC245");
        c(107, "LEC247");
        c(108, "HEC247");

        c(109, "LEN236Oxide");
        c(110, "HEN236Oxide");
        c(111, "LEA242Oxide");
        c(112, "HEA242Oxide");
        c(113, "LEC243Oxide");
        c(114, "HEC243Oxide");
        c(115, "LEC245Oxide");
        c(116, "HEC245Oxide");
        c(117, "LEC247Oxide");
        c(118, "HEC247Oxide");

        c(41, "Li6");
        c(42, "Li7");
        c(43, "B10");
        c(44, "B11");

        // Other Shapeless Recipes
        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(NCItems.parts, 3, 4), new Object[] {Items.sugar, "dustLapis", Items.redstone}));

        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(NCItems.fishAndRicecake, 1), new Object[] {Items.cooked_fished, NCItems.ricecake}));

        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(NCItems.recordPractice, 1), new Object[] {"record", "ingotBoron"}));
        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(NCItems.recordArea51, 1), new Object[] {"record", "ingotTough"}));
        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(NCItems.recordNeighborhood, 1), new Object[] {"record", "universalReactant"}));

        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(NCItems.material, 4, 22), new Object[] {new ItemStack(NCItems.parts, 1, 4), "dustCoal", "dustCoal", "dustLead", "dustLead", "dustSilver", "dustSilver", "dustIron", "dustIron"}));

        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(NCItems.material, 4, 7), new Object[] {new ItemStack(NCItems.parts, 1, 4), "dustCoal", "dustCoal", "ingotLead", "ingotLead", "ingotSilver", "ingotSilver", "ingotIron", "ingotIron"}));

        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(NCItems.fuel, 1, 45), new Object[] {"filledNCGasCell"}));

        GameRegistry.addShapelessRecipe(new ItemStack(NCItems.fuel, 1, 34), (new ItemStack (Items.water_bucket, 1)), (new ItemStack (NCItems.fuel, 1, 45)));

        GameRegistry.addShapelessRecipe(new ItemStack(NCBlocks.coolerBlock, 1), (new ItemStack (Items.redstone, 1)), (new ItemStack(NCItems.parts, 1, 4)), (new ItemStack (NCBlocks.emptyCoolerBlock, 1)));
        GameRegistry.addShapelessRecipe(new ItemStack(NCBlocks.waterCoolerBlock, 1), (new ItemStack (NCItems.fuel, 1, 34)), (new ItemStack (NCBlocks.emptyCoolerBlock, 1)));
        GameRegistry.addShapelessRecipe(new ItemStack(NCBlocks.waterCoolerBlock, 1), (new ItemStack (Items.water_bucket, 1)), (new ItemStack (NCBlocks.emptyCoolerBlock, 1)));

        GameRegistry.addShapelessRecipe(new ItemStack(NCBlocks.heliumCoolerBlock, 1), (new ItemStack (NCBlocks.emptyCoolerBlock, 1)), (new ItemStack (NCItems.fuel, 1, 75)), (new ItemStack (NCItems.fuel, 1, 75)), (new ItemStack (NCItems.fuel, 1, 75)), (new ItemStack (NCItems.fuel, 1, 75)));

        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(NCItems.material, 2, 79), new Object[] {"dustGraphite", "dustDiamond"}));

        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(NCItems.material, 2, 80), new Object[] {"ingotLithium", "ingotManganeseDioxide"}));
        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(NCItems.material, 2, 81), new Object[] {"dustLithium", "dustManganeseDioxide"}));

        // Workspace Recipes
        if (!NCConfig.workspace) {
            GameRegistry.addRecipe(new ShapelessOreRecipe(NCBlocks.machineBlock, new Object[] {"plateBasic", "plateLead", "plateLead", new ItemStack(NCItems.parts, 1, 10), new ItemStack(NCItems.parts, 1, 11), new ItemStack(NCItems.parts, 1, 12), new ItemStack(NCItems.parts, 1, 13), new ItemStack(NCItems.parts, 1, 16), "dustRedstone"}));
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(NCBlocks.reactorBlock, 8), true, new Object[] {"ABA", "B B", "ABA", 'A', "ingotTough", 'B', "plateBasic"}));
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(NCBlocks.cellBlock, 1), true, new Object[] {"ABA", "CDC", "ABA", 'A', "blockGlass", 'B', "plateBasic", 'C', "ingotTough", 'D', "plateLead"}));
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(NCBlocks.emptyCoolerBlock, 8), true, new Object[] {"ABA", "B B", "ABA", 'A', "universalReactant", 'B', "plateBasic"}));
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(NCBlocks.speedBlock, 4), true, new Object[] {"ABA", "BCB", "ABA", 'A', Items.blaze_powder, 'B', "plateBasic", 'C', "dustRedstone"}));
            GameRegistry.addRecipe(new ShapedOreRecipe(NCBlocks.fissionReactorGraphiteIdle, true, new Object[] {"BAB", "ACA", "BAB", 'A', "plateReinforced", 'B', "plateDU", 'C', NCBlocks.machineBlock}));
            GameRegistry.addRecipe(new ShapedOreRecipe(NCBlocks.fissionReactorSteamIdle, true, new Object[] {"BAB", "ACA", "BAB", 'A', new ItemStack(NCItems.parts, 1, 7), 'B', "plateAdvanced", 'C', NCBlocks.fissionReactorGraphiteIdle}));
            GameRegistry.addRecipe(new ShapelessOreRecipe(NCBlocks.blastBlock, new Object[] {NCBlocks.reactorBlock, "oreObsidian"}));
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(NCItems.parts, 1, 9), true, new Object[] {"AAA", "BCB", "AAA", 'A', new ItemStack(NCItems.material, 1, 48), 'B', "plateDU", 'C', "dustDiamond"}));
            GameRegistry.addRecipe(new ShapedOreRecipe(NCBlocks.separatorIdle, true, new Object[] {"ABA", "CDC", "ABA", 'A', "plateLead", 'B', "ingotTough", 'C', "dustRedstone", 'D', NCBlocks.machineBlock}));
            GameRegistry.addRecipe(new ShapedOreRecipe(NCBlocks.recyclerIdle, true, new Object[] {"ABA", "CDC", "ABA", 'A', "plateLead", 'B', "ingotTough", 'C', "ingotHardCarbon", 'D', NCBlocks.machineBlock}));
            GameRegistry.addRecipe(new ShapedOreRecipe(NCBlocks.hastenerIdle, true, new Object[] {"ABA", "CDC", "ABA", 'A', "plateLead", 'B', "universalReactant", 'C', "ingotTough", 'D', NCBlocks.machineBlock}));
            GameRegistry.addRecipe(new ShapedOreRecipe(NCBlocks.collectorIdle, true, new Object[] {"ABA", "BBB", "ABA", 'A', "plateBasic", 'B', new ItemStack(NCItems.material, 1, 40)}));
            GameRegistry.addRecipe(new ShapedOreRecipe(NCBlocks.reactionGeneratorIdle, true, new Object[] {"ABA", "CDC", "ABA", 'A', "plateLead", 'B', new ItemStack(NCItems.parts, 1, 5), 'C', "plateBasic", 'D', NCBlocks.machineBlock}));
            GameRegistry.addRecipe(new ShapedOreRecipe(NCBlocks.electrolyserIdle, true, new Object[] {"ABA", "CDC", "ABA", 'A', "plateReinforced", 'B', new ItemStack(NCItems.parts, 1, 7), 'C', "universalReactant", 'D', NCBlocks.machineBlock}));
            GameRegistry.addRecipe(new ShapedOreRecipe(NCBlocks.oxidiserIdle, true, new Object[] {"ABA", "CDC", "ABA", 'A', "plateDU", 'B', "universalReactant", 'C', "plateLead", 'D', NCBlocks.machineBlock}));
            GameRegistry.addRecipe(new ShapedOreRecipe(NCBlocks.ioniserIdle, true, new Object[] {"ABA", "CDC", "ABA", 'A', "plateDU", 'B', "dustRedstone", 'C', "plateLead", 'D', NCBlocks.machineBlock}));
            GameRegistry.addRecipe(new ShapedOreRecipe(NCBlocks.irradiatorIdle, true, new Object[] {"ABA", "CDC", "ABA", 'A', "plateDU", 'B', "universalReactant", 'C', "ingotTough", 'D', NCBlocks.machineBlock}));
            GameRegistry.addRecipe(new ShapedOreRecipe(NCBlocks.coolerIdle, true, new Object[] {"ABA", "CDC", "ABA", 'A', "plateDU", 'B', "universalReactant", 'C', "plateBasic", 'D', NCBlocks.machineBlock}));
            GameRegistry.addRecipe(new ShapedOreRecipe(NCBlocks.factoryIdle, true, new Object[] {"ABA", "CDC", "ABA", 'A', "ingotTough", 'B', "plateBasic", 'C', "plateIron", 'D', Blocks.piston}));
            GameRegistry.addRecipe(new ShapedOreRecipe(NCBlocks.assemblerIdle, true, new Object[] {"ABA", "CDC", "ABA", 'A', "ingotTough", 'B', "plateIron", 'C', "plateBasic", 'D', Blocks.piston}));
            GameRegistry.addRecipe(new ShapedOreRecipe(NCBlocks.heliumExtractorIdle, true, new Object[] {"ABA", "CDC", "ABA", 'A', "plateReinforced", 'B', new ItemStack(NCItems.parts, 1, 5), 'C', "plateTin", 'D', NCBlocks.machineBlock}));
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(NCBlocks.electromagnetIdle, 2), true, new Object[] {"AAA", "BCB", "AAA", 'A', "plateReinforced", 'B', new ItemStack(NCItems.parts, 1, 12), 'C', "ingotIron"}));
            GameRegistry.addRecipe(new ShapedOreRecipe(NCBlocks.fusionReactor, true, new Object[] {"ABA", "BCB", "ABA", 'A', NCBlocks.reactionGeneratorIdle, 'B', "plateAdvanced", 'C', NCBlocks.electromagnetIdle}));
            GameRegistry.addRecipe(new ShapedOreRecipe(NCBlocks.fusionReactorSteam, true, new Object[] {"BAB", "ACA", "BAB", 'A', new ItemStack(NCItems.parts, 1, 7), 'B', "plateAdvanced", 'C', NCBlocks.fusionReactor}));
            GameRegistry.addRecipe(new ShapedOreRecipe(NCBlocks.superElectromagnetIdle, true, new Object[] {"AAA", "BCB", "AAA", 'A', "plateAdvanced", 'B', new ItemStack(NCItems.parts, 1, 17), 'C', "ingotTough"}));
            GameRegistry.addRecipe(new ShapedOreRecipe(NCBlocks.synchrotronIdle, true, new Object[] {"AAA", "BCB", "AAA", 'A', NCBlocks.superElectromagnetIdle, 'B', "plateAdvanced", 'C', NCBlocks.machineBlock}));
            GameRegistry.addRecipe(new ShapedOreRecipe(NCBlocks.supercoolerIdle, true, new Object[] {"AAA", "BCB", "AAA", 'A', "plateAdvanced", 'B', new ItemStack(NCItems.parts, 1, 13), 'C', "universalReactant"}));
            GameRegistry.addRecipe(new ShapedOreRecipe(NCItems.toughAlloyPickaxe, true, new Object[] {"XXX", " S ", " S ", 'X', "ingotTough", 'S', "ingotIron"}));
            GameRegistry.addRecipe(new ShapedOreRecipe(NCItems.toughAlloyShovel, true, new Object[] {"X", "S", "S", 'X', "ingotTough", 'S', "ingotIron"}));
            GameRegistry.addRecipe(new ShapedOreRecipe(NCItems.toughAlloyAxe, true, new Object[] {"XX", "XS", " S", 'X', "ingotTough", 'S', "ingotIron"}));
            GameRegistry.addRecipe(new ShapedOreRecipe(NCItems.toughAlloyAxe, true, new Object[] {"XX", "SX", "S ", 'X', "ingotTough", 'S', "ingotIron"}));
            GameRegistry.addRecipe(new ShapedOreRecipe(NCItems.toughAlloyHoe, true, new Object[] {"XX", "S ", "S ", 'X', "ingotTough", 'S', "ingotIron"}));
            GameRegistry.addRecipe(new ShapedOreRecipe(NCItems.toughAlloyHoe, true, new Object[] {"XX", " S", " S", 'X', "ingotTough", 'S', "ingotIron"}));
            GameRegistry.addRecipe(new ShapedOreRecipe(NCItems.toughAlloySword, true, new Object[] {"X", "X", "S", 'X', "ingotTough", 'S', "ingotIron"}));
            GameRegistry.addRecipe(new ShapedOreRecipe(NCItems.toughAlloyPaxel, true, new Object[] {"ASP", "HIW", " I ", 'I', "ingotIron", 'A', NCItems.toughAlloyAxe, 'S', NCItems.toughAlloyShovel, 'P', NCItems.toughAlloyPickaxe, 'H', NCItems.toughAlloyHoe, 'W', NCItems.toughAlloySword}));
            GameRegistry.addRecipe(new ShapedOreRecipe(NCItems.dUPickaxe, true, new Object[] {"XXX", " S ", " S ", 'X', "plateDU", 'S', "ingotIron"}));
            GameRegistry.addRecipe(new ShapedOreRecipe(NCItems.dUShovel, true, new Object[] {"X", "S", "S", 'X', "plateDU", 'S', "ingotIron"}));
            GameRegistry.addRecipe(new ShapedOreRecipe(NCItems.dUAxe, true, new Object[] {"XX", "XS", " S", 'X', "plateDU", 'S', "ingotIron"}));
            GameRegistry.addRecipe(new ShapedOreRecipe(NCItems.dUAxe, true, new Object[] {"XX", "SX", "S ", 'X', "plateDU", 'S', "ingotIron"}));
            GameRegistry.addRecipe(new ShapedOreRecipe(NCItems.dUHoe, true, new Object[] {"XX", "S ", "S ", 'X', "plateDU", 'S', "ingotIron"}));
            GameRegistry.addRecipe(new ShapedOreRecipe(NCItems.dUHoe, true, new Object[] {"XX", " S", " S", 'X', "plateDU", 'S', "ingotIron"}));
            GameRegistry.addRecipe(new ShapedOreRecipe(NCItems.dUSword, true, new Object[] {"X", "X", "S", 'X', "plateDU", 'S', "ingotIron"}));
            GameRegistry.addRecipe(new ShapedOreRecipe(NCItems.dUPaxel, true, new Object[] {"ASP", "HIW", " I ", 'I', "ingotIron", 'A', NCItems.dUAxe, 'S', NCItems.dUShovel, 'P', NCItems.dUPickaxe, 'H', NCItems.dUHoe, 'W', NCItems.dUSword}));
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(NCItems.toughHelm, 1), true, new Object[] {"XXX", "X X", 'X', "ingotTough"}));
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(NCItems.toughChest, 1), true, new Object[] {"X X", "XXX", "XXX", 'X', "ingotTough"}));
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(NCItems.toughLegs, 1), true, new Object[] {"XXX", "X X", "X X", 'X', "ingotTough"}));
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(NCItems.toughBoots, 1), true, new Object[] {"X X", "X X", 'X', "ingotTough"}));
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(NCItems.dUHelm, 1), true, new Object[] {"XXX", "X X", 'X', "plateDU"}));
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(NCItems.dUChest, 1), true, new Object[] {"X X", "XXX", "XXX", 'X', "plateDU"}));
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(NCItems.dULegs, 1), true, new Object[] {"XXX", "X X", "X X", 'X', "plateDU"}));
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(NCItems.dUBoots, 1), true, new Object[] {"X X", "X X", 'X', "plateDU"}));
            GameRegistry.addRecipe(new ShapedOreRecipe(NCBlocks.RTG, true, new Object[] {"ABA", "BCB", "ABA", 'A', new ItemStack(NCItems.parts, 1, 11), 'B', new ItemStack(NCItems.parts, 1, 15), 'C', new ItemStack(NCItems.fuel, 1, 46)}));
            GameRegistry.addRecipe(new ShapedOreRecipe(NCBlocks.AmRTG, true, new Object[] {"ABA", "BCB", "ABA", 'A', new ItemStack(NCItems.parts, 1, 11), 'B', new ItemStack(NCItems.parts, 1, 15), 'C', new ItemStack(NCItems.fuel, 1, 139)}));
            GameRegistry.addRecipe(new ShapedOreRecipe(NCBlocks.CfRTG, true, new Object[] {"ABA", "BCB", "ABA", 'A', new ItemStack(NCItems.parts, 1, 11), 'B', new ItemStack(NCItems.parts, 1, 15), 'C', new ItemStack(NCItems.fuel, 1, 140)}));
            GameRegistry.addRecipe(new ShapedOreRecipe(NCBlocks.WRTG, true, new Object[] {"ABA", "BBB", "ABA", 'A', "plateLead", 'B', "U238"}));
            GameRegistry.addRecipe(new ShapedOreRecipe(NCBlocks.steamGenerator, true, new Object[] {"PCP", "MMM", "PCP", 'P', "plateIron", 'C', new ItemStack(NCItems.parts, 1, 12), 'M', new ItemStack(NCItems.parts, 1, 19)}));
            GameRegistry.addRecipe(new ShapedOreRecipe(NCBlocks.steamDecompressor, true, new Object[] {"PCP", "GMG", "PCP", 'P', "plateIron", 'C', Blocks.piston, 'G', new ItemStack(NCItems.parts, 1, 10), 'M', new ItemStack(NCItems.parts, 1, 19)}));
            GameRegistry.addRecipe(new ShapedOreRecipe(NCBlocks.denseSteamDecompressor, true, new Object[] {"PPP", "CCC", "PPP", 'P', "plateAdvanced", 'C', NCBlocks.steamDecompressor}));
            if (NCConfig.enableNukes) {
                GameRegistry.addRecipe(new ShapedOreRecipe(NCBlocks.nuke, true, new Object[] {"ABA", "BBB", "ABA", 'A', "plateReinforced", 'B', new ItemStack(NCItems.material, 1, 67)}));
                GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(NCItems.nuclearGrenade, 3), true, new Object[] {"  S", " S ", "N  ", 'S', Items.string, 'N', NCBlocks.nuke}));
                GameRegistry.addRecipe(new ShapedOreRecipe(NCBlocks.antimatterBomb, true, new Object[] {"AAA", "ABA", "AAA", 'A', NCItems.antimatter, 'B', NCBlocks.superElectromagnetIdle}));
            }
            GameRegistry.addRecipe(new ShapedOreRecipe(NCBlocks.solarPanel, true, new Object[] {"DDD", "ECE", "ABA", 'A', new ItemStack(NCItems.parts, 1, 12), 'B', Blocks.iron_block, 'C', "dustCoal", 'D', new ItemStack(NCItems.parts, 1, 15), 'E', "universalReactant"}));
            GameRegistry.addRecipe(new ShapedOreRecipe(NCItems.portableEnderChest, true, new Object[] {"ABA", "CDC", "AAA", 'A', Blocks.wool, 'B', Items.string, 'C', "plateLead", 'D', Items.ender_eye}));
            GameRegistry.addRecipe(new ShapedOreRecipe(NCItems.pistol, true, new Object[] {"AAA", "BBA", "CBA", 'A', "plateReinforced", 'B', "ingotTough", 'C', "plateAdvanced"}));
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(NCItems.parts, 2, 5), true, new Object[] {"ABA", "B B", "ABA", 'A', "universalReactant", 'B', "plateBasic"}));
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(NCItems.parts, 1, 7), true, new Object[] {"ABA", "B B", "ABA", 'A', "plateTin", 'B', new ItemStack(NCItems.fuel, 1, 34)}));
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(NCItems.parts, 1, 3), true, new Object[] {" A ", "ABA", " A ", 'A', "ingotTough", 'B', "plateBasic"}));
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(NCItems.parts, 1, 8), true, new Object[] {"AAA", "BBB", "AAA", 'A', "U238", 'B', "plateReinforced"}));
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(NCBlocks.tubing1, 8), true, new Object[] {"AAA", "BBB", "AAA", 'A', "plateLead", 'B', "plateIron"}));
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(NCBlocks.tubing2, 8), true, new Object[] {"ABA", "ABA", "ABA", 'A', "plateLead", 'B', "plateIron"}));
            GameRegistry.addRecipe(new ShapedOreRecipe(NCItems.toughBow, true, new Object[] {"BA ", "B A", "BA ", 'A', "ingotTough", 'B', Items.string}));
            GameRegistry.addRecipe(new ShapedOreRecipe(NCItems.toughBow, true, new Object[] {" AB", "A B", " AB", 'A', "ingotTough", 'B', Items.string}));
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(NCItems.parts, 12, 0), true, new Object[] {"AAA", "BBB", 'A', "ingotTough", 'B', "dustTough"}));
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(NCItems.fuel, 8, 48), true, new Object[] {"ABA", "BCB", "ABA", 'B', new ItemStack(NCItems.parts, 1, 15), 'C', "ingotTough", 'A', new ItemStack (NCItems.parts, 1, 3)}));
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(NCItems.dUBullet, 4), true, new Object[] {"ABC", 'A', "U238", 'B', Items.gunpowder, 'C', "ingotTough"}));
            GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(NCItems.fuel, 1, 46), new Object[] {new ItemStack(NCItems.fuel, 1, 48), "Pu238"}));
            GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(NCItems.fuel, 1, 139), new Object[] {new ItemStack(NCItems.fuel, 1, 48), "Am241"}));
            GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(NCItems.fuel, 1, 140), new Object[] {new ItemStack(NCItems.fuel, 1, 48), "Cf250"}));

            GameRegistry.addRecipe(new ShapedOreRecipe(NCItems.lithiumIonBattery, true, new Object[] {"AAA", "BCB", "DDD", 'A', "ingotLithiumManganeseDioxide", 'B', "plateAdvanced", 'C', "dustLithium", 'D', "ingotHardCarbon"}));
        }

        // Smelting Recipes
        GameRegistry.addSmelting(new ItemStack(NCBlocks.blockOre, 1, 4), new ItemStack (NCItems.material, 1, 4), 1.2F);
        GameRegistry.addSmelting(new ItemStack(NCBlocks.blockOre, 1, 0), new ItemStack(NCItems.material, 1, 0), 0.6F);
        GameRegistry.addSmelting(new ItemStack(NCBlocks.blockOre, 1, 1), new ItemStack(NCItems.material, 1, 1), 0.6F);
        GameRegistry.addSmelting(new ItemStack(NCBlocks.blockOre, 1, 2), new ItemStack(NCItems.material, 1, 2), 0.8F);
        GameRegistry.addSmelting(new ItemStack(NCBlocks.blockOre, 1, 3), new ItemStack(NCItems.material, 1, 3), 0.8F);
        GameRegistry.addSmelting(new ItemStack(NCBlocks.blockOre, 1, 5), new ItemStack(NCItems.material, 1, 5), 1.2F);
        GameRegistry.addSmelting(new ItemStack(NCBlocks.blockOre, 1, 6), new ItemStack(NCItems.material, 1, 33), 1.2F);
        GameRegistry.addSmelting(new ItemStack(NCBlocks.blockOre, 1, 7), new ItemStack(NCItems.material, 1, 42), 0.8F);
        GameRegistry.addSmelting(new ItemStack(NCBlocks.blockOre, 1, 8), new ItemStack(NCItems.material, 1, 43), 0.8F);
        GameRegistry.addSmelting(new ItemStack(NCBlocks.blockOre, 1, 9), new ItemStack(NCItems.material, 1, 50), 0.8F);

        GameRegistry.addSmelting(new ItemStack(NCItems.material, 1, 8), new ItemStack(Items.iron_ingot), 0.0F);
        GameRegistry.addSmelting(new ItemStack(NCItems.material, 1, 9), new ItemStack(Items.gold_ingot), 0.0F);
        GameRegistry.addSmelting(new ItemStack(NCItems.material, 1, 15), new ItemStack(NCItems.material, 1, 0), 0.0F);
        GameRegistry.addSmelting(new ItemStack(NCItems.material, 1, 17), new ItemStack(NCItems.material, 1, 2), 0.0F);
        GameRegistry.addSmelting(new ItemStack(NCItems.material, 1, 16), new ItemStack(NCItems.material, 1, 1), 0.0F);
        GameRegistry.addSmelting(new ItemStack(NCItems.material, 1, 18), new ItemStack(NCItems.material, 1, 3), 0.0F);
        GameRegistry.addSmelting(new ItemStack(NCItems.material, 1, 19), new ItemStack(NCItems.material, 1, 4), 0.0F);
        GameRegistry.addSmelting(new ItemStack(NCItems.material, 1, 20), new ItemStack(NCItems.material, 1, 5), 0.0F);
        GameRegistry.addSmelting(new ItemStack(NCItems.material, 1, 21), new ItemStack(NCItems.material, 1, 6), 0.0F);
        GameRegistry.addSmelting(new ItemStack(NCItems.material, 1, 22), new ItemStack(NCItems.material, 1, 7), 0.0F);
        GameRegistry.addSmelting(new ItemStack(NCItems.material, 1, 44), new ItemStack(NCItems.material, 1, 42), 0.0F);
        GameRegistry.addSmelting(new ItemStack(NCItems.material, 1, 45), new ItemStack(NCItems.material, 1, 43), 0.0F);
        GameRegistry.addSmelting(new ItemStack(NCItems.material, 1, 51), new ItemStack(NCItems.material, 1, 50), 0.0F);
        GameRegistry.addSmelting(new ItemStack(NCItems.material, 1, 54), new ItemStack(NCItems.material, 1, 53), 0.0F);
        GameRegistry.addSmelting(new ItemStack(NCItems.material, 1, 127), new ItemStack(NCItems.material, 1, 126), 0.0F);
        GameRegistry.addSmelting(new ItemStack(NCItems.material, 1, 72), new ItemStack(NCItems.material, 1, 71), 0.0F);
        GameRegistry.addSmelting(new ItemStack(NCItems.material, 1, 77), new ItemStack(NCItems.material, 1, 76), 0.0F);
        GameRegistry.addSmelting(new ItemStack(NCItems.material, 1, 79), new ItemStack(NCItems.material, 1, 78), 0.0F);
        GameRegistry.addSmelting(new ItemStack(NCItems.material, 1, 81), new ItemStack(NCItems.material, 1, 80), 0.0F);

        GameRegistry.addSmelting(new ItemStack(Items.egg, 1), new ItemStack(NCItems.boiledEgg, 1), 0.1F);

        s(NCItems.fuel, 51, 0);
        s(NCItems.fuel, 52, 1);
        s(NCItems.fuel, 53, 2);
        s(NCItems.fuel, 54, 3);
        s(NCItems.fuel, 55, 6);
        s(NCItems.fuel, 56, 7);
        s(NCItems.fuel, 57, 8);
        s(NCItems.fuel, 58, 9);

        s(NCItems.fuel, 59, 11);
        s(NCItems.fuel, 60, 12);
        s(NCItems.fuel, 61, 13);
        s(NCItems.fuel, 62, 14);
        s(NCItems.fuel, 63, 17);
        s(NCItems.fuel, 64, 18);
        s(NCItems.fuel, 65, 19);
        s(NCItems.fuel, 66, 20);

        s(NCItems.fuel, 67, 22);
        s(NCItems.fuel, 68, 23);
        s(NCItems.fuel, 69, 24);
        s(NCItems.fuel, 70, 25);
        s(NCItems.fuel, 71, 28);
        s(NCItems.fuel, 72, 29);
        s(NCItems.fuel, 73, 30);
        s(NCItems.fuel, 74, 31);

        s(NCItems.fuel, 76, 5);
        s(NCItems.fuel, 77, 16);
        s(NCItems.fuel, 78, 27);

        s(NCItems.fuel, 89, 79);
        s(NCItems.fuel, 90, 80);
        s(NCItems.fuel, 91, 81);
        s(NCItems.fuel, 92, 82);
        s(NCItems.fuel, 93, 83);
        s(NCItems.fuel, 94, 84);
        s(NCItems.fuel, 95, 85);
        s(NCItems.fuel, 96, 86);
        s(NCItems.fuel, 97, 87);
        s(NCItems.fuel, 98, 88);

        s(NCItems.fuel, 109, 99);
        s(NCItems.fuel, 110, 100);
        s(NCItems.fuel, 111, 101);
        s(NCItems.fuel, 112, 102);
        s(NCItems.fuel, 113, 103);
        s(NCItems.fuel, 114, 104);
        s(NCItems.fuel, 115, 105);
        s(NCItems.fuel, 116, 106);
        s(NCItems.fuel, 117, 107);
        s(NCItems.fuel, 118, 108);

        s(NCItems.fuel, 129, 119);
        s(NCItems.fuel, 130, 120);
        s(NCItems.fuel, 131, 121);
        s(NCItems.fuel, 132, 122);
        s(NCItems.fuel, 133, 123);
        s(NCItems.fuel, 134, 124);
        s(NCItems.fuel, 135, 125);
        s(NCItems.fuel, 136, 126);
        s(NCItems.fuel, 137, 127);
        s(NCItems.fuel, 138, 128);

        s(NCItems.material, 53, 4);
        s(NCItems.material, 126, 5);
        s(NCItems.material, 54, 19);
        s(NCItems.material, 127, 20);

        s(NCItems.material, 55, 24);
        s(NCItems.material, 56, 25);
        s(NCItems.material, 57, 26);
        s(NCItems.material, 58, 27);
        s(NCItems.material, 59, 28);
        s(NCItems.material, 60, 29);
        s(NCItems.material, 61, 30);
        s(NCItems.material, 62, 31);
        s(NCItems.material, 63, 32);
        s(NCItems.material, 64, 33);
        s(NCItems.material, 65, 34);
        s(NCItems.material, 66, 35);
        s(NCItems.material, 67, 36);
        s(NCItems.material, 68, 37);
        s(NCItems.material, 82, 38);
        s(NCItems.material, 83, 39);
        s(NCItems.material, 84, 40);
        s(NCItems.material, 85, 41);

        s(NCItems.material, 75, 74);

        s(NCItems.material, 104, 86);
        s(NCItems.material, 105, 87);
        s(NCItems.material, 106, 88);
        s(NCItems.material, 107, 89);
        s(NCItems.material, 108, 90);
        s(NCItems.material, 109, 91);
        s(NCItems.material, 110, 92);
        s(NCItems.material, 111, 93);
        s(NCItems.material, 112, 94);
        s(NCItems.material, 113, 95);
        s(NCItems.material, 114, 96);
        s(NCItems.material, 115, 97);
        s(NCItems.material, 116, 98);
        s(NCItems.material, 117, 99);
        s(NCItems.material, 118, 100);
        s(NCItems.material, 119, 101);
        s(NCItems.material, 120, 102);
        s(NCItems.material, 121, 103);

        s(NCItems.material, 124, 122);
        s(NCItems.material, 125, 123);
    }
}
