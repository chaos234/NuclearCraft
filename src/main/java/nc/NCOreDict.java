package nc;

import nc.block.NCBlocks;
import nc.item.NCItems;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;

public class NCOreDict {
    public static void add(){
        // Ores Ore Dictionary
        OreDictionary.registerOre("oreUranium", new ItemStack(NCBlocks.blockOre, 1, 4));
        OreDictionary.registerOre("oreCopper", new ItemStack(NCBlocks.blockOre, 1, 0));
        OreDictionary.registerOre("oreTin", new ItemStack(NCBlocks.blockOre, 1, 1));
        OreDictionary.registerOre("oreLead", new ItemStack(NCBlocks.blockOre, 1, 2));
        OreDictionary.registerOre("oreSilver", new ItemStack(NCBlocks.blockOre, 1, 3));
        OreDictionary.registerOre("oreThorium", new ItemStack(NCBlocks.blockOre, 1, 5));
        OreDictionary.registerOre("orePlutonium", new ItemStack(NCBlocks.blockOre, 1, 6));
        OreDictionary.registerOre("oreLithium", new ItemStack(NCBlocks.blockOre, 1, 7));
        OreDictionary.registerOre("oreBoron", new ItemStack(NCBlocks.blockOre, 1, 8));
        OreDictionary.registerOre("oreMagnesium", new ItemStack(NCBlocks.blockOre, 1, 9));

        // Items Ore Dictionary
        OreDictionary.registerOre("ingotUranium", new ItemStack(NCItems.material, 1, 4));
        OreDictionary.registerOre("ingotCopper", new ItemStack(NCItems.material, 1, 0));
        OreDictionary.registerOre("ingotTin", new ItemStack(NCItems.material, 1, 1));
        OreDictionary.registerOre("ingotLead", new ItemStack(NCItems.material, 1, 2));
        OreDictionary.registerOre("ingotSilver", new ItemStack(NCItems.material, 1, 3));
        OreDictionary.registerOre("ingotBronze", new ItemStack(NCItems.material, 1, 6));
        OreDictionary.registerOre("ingotThorium", new ItemStack(NCItems.material, 1, 5));
        OreDictionary.registerOre("ingotLithium", new ItemStack(NCItems.material, 1, 42));
        OreDictionary.registerOre("ingotBoron", new ItemStack(NCItems.material, 1, 43));
        OreDictionary.registerOre("ingotTough", new ItemStack(NCItems.material, 1, 7));
        OreDictionary.registerOre("ingotMagnesium", new ItemStack(NCItems.material, 1, 50));
        OreDictionary.registerOre("ingotUraniumOxide", new ItemStack(NCItems.material, 1, 53));
        OreDictionary.registerOre("ingotThoriumOxide", new ItemStack(NCItems.material, 1, 126));
        OreDictionary.registerOre("ingotMagnesiumDiboride", new ItemStack(NCItems.material, 1, 71));
        OreDictionary.registerOre("gemRhodochrosite", new ItemStack(NCItems.material, 1, 73));
        OreDictionary.registerOre("ingotGraphite", new ItemStack(NCItems.material, 1, 76));
        OreDictionary.registerOre("ingotHardCarbon", new ItemStack(NCItems.material, 1, 78));
        OreDictionary.registerOre("ingotLithiumManganeseDioxide", new ItemStack(NCItems.material, 1, 80));

        // Dusts Ore Dictionary
        OreDictionary.registerOre("dustIron", new ItemStack(NCItems.material, 1, 8));
        OreDictionary.registerOre("dustGold", new ItemStack(NCItems.material, 1, 9));
        OreDictionary.registerOre("dustLapis", new ItemStack(NCItems.material, 1, 10));
        OreDictionary.registerOre("dustDiamond", new ItemStack(NCItems.material, 1, 11));
        OreDictionary.registerOre("dustEmerald", new ItemStack(NCItems.material, 1, 12));
        OreDictionary.registerOre("dustQuartz", new ItemStack(NCItems.material, 1, 13));
        OreDictionary.registerOre("dustCoal", new ItemStack(NCItems.material, 1, 14));
        OreDictionary.registerOre("dustCopper", new ItemStack(NCItems.material, 1, 15));
        OreDictionary.registerOre("dustLead", new ItemStack(NCItems.material, 1, 17));
        OreDictionary.registerOre("dustTinyLead", new ItemStack(NCItems.material, 1, 23));
        OreDictionary.registerOre("dustTin", new ItemStack(NCItems.material, 1, 16));
        OreDictionary.registerOre("dustSilver", new ItemStack(NCItems.material, 1, 18));
        OreDictionary.registerOre("dustUranium", new ItemStack(NCItems.material, 1, 19));
        OreDictionary.registerOre("dustThorium", new ItemStack(NCItems.material, 1, 20));
        OreDictionary.registerOre("dustBronze", new ItemStack(NCItems.material, 1, 21));
        OreDictionary.registerOre("dustLithium", new ItemStack(NCItems.material, 1, 44));
        OreDictionary.registerOre("dustBoron", new ItemStack(NCItems.material, 1, 45));
        OreDictionary.registerOre("dustTough", new ItemStack(NCItems.material, 1, 22));
        OreDictionary.registerOre("dustMagnesium", new ItemStack(NCItems.material, 1, 51));
        OreDictionary.registerOre("dustObsidian", new ItemStack(NCItems.material, 1, 52));
        OreDictionary.registerOre("dustUraniumOxide", new ItemStack(NCItems.material, 1, 54));
        OreDictionary.registerOre("dustThoriumOxide", new ItemStack(NCItems.material, 1, 127));
        OreDictionary.registerOre("dustMagnesiumDiboride", new ItemStack(NCItems.material, 1, 72));
        OreDictionary.registerOre("dustManganeseOxide", new ItemStack(NCItems.material, 1, 74));
        OreDictionary.registerOre("dustManganeseDioxide", new ItemStack(NCItems.material, 1, 75));
        OreDictionary.registerOre("dustGraphite", new ItemStack(NCItems.material, 1, 77));
        OreDictionary.registerOre("dustHardCarbon", new ItemStack(NCItems.material, 1, 79));
        OreDictionary.registerOre("dustLithiumManganeseDioxide", new ItemStack(NCItems.material, 1, 81));

        // Blocks Ore Dictionary
        OreDictionary.registerOre("blockUranium", new ItemStack(NCBlocks.blockBlock, 1, 4));
        OreDictionary.registerOre("blockCopper", new ItemStack(NCBlocks.blockBlock, 1, 0));
        OreDictionary.registerOre("blockTin", new ItemStack(NCBlocks.blockBlock, 1, 1));
        OreDictionary.registerOre("blockLead", new ItemStack(NCBlocks.blockBlock, 1, 2));
        OreDictionary.registerOre("blockSilver", new ItemStack(NCBlocks.blockBlock, 1, 3));
        OreDictionary.registerOre("blockBronze", new ItemStack(NCBlocks.blockBlock, 1, 6));
        OreDictionary.registerOre("blockThorium", new ItemStack(NCBlocks.blockBlock, 1, 5));
        OreDictionary.registerOre("blockTough", new ItemStack(NCBlocks.blockBlock, 1, 7));
        OreDictionary.registerOre("blockLithium", new ItemStack(NCBlocks.blockBlock, 1, 8));
        OreDictionary.registerOre("blockBoron", new ItemStack(NCBlocks.blockBlock, 1, 9));
        OreDictionary.registerOre("blockMagnesium", new ItemStack(NCBlocks.blockBlock, 1, 10));
        OreDictionary.registerOre("blockGraphite", new ItemStack(NCBlocks.graphiteBlock));

        // Parts Ore Dictionary
        OreDictionary.registerOre("plateBasic", new ItemStack(NCItems.parts, 1, 0));
        OreDictionary.registerOre("plateIron", new ItemStack(NCItems.parts, 1, 1));
        OreDictionary.registerOre("plateReinforced", new ItemStack(NCItems.parts, 1, 3));
        OreDictionary.registerOre("universalReactant", new ItemStack(NCItems.parts, 1, 4));
        OreDictionary.registerOre("plateTin", new ItemStack(NCItems.parts, 1, 6));
        OreDictionary.registerOre("plateDU", new ItemStack(NCItems.parts, 1, 8));
        OreDictionary.registerOre("plateAdvanced", new ItemStack(NCItems.parts, 1, 9));
        OreDictionary.registerOre("plateLead", new ItemStack(NCItems.parts, 1, 14));

        // Fission Fuel Materials Ore Dictionary
        OreDictionary.registerOre("U238", new ItemStack(NCItems.material, 1, 24));
        OreDictionary.registerOre("U238Base", new ItemStack(NCItems.material, 1, 24));
        OreDictionary.registerOre("U238", new ItemStack(NCItems.material, 1, 55));
        OreDictionary.registerOre("U238Oxide", new ItemStack(NCItems.material, 1, 55));
        OreDictionary.registerOre("tinyU238", new ItemStack(NCItems.material, 1, 25));
        OreDictionary.registerOre("tinyU238Base", new ItemStack(NCItems.material, 1, 25));
        OreDictionary.registerOre("tinyU238", new ItemStack(NCItems.material, 1, 56));
        OreDictionary.registerOre("tinyU238Oxide", new ItemStack(NCItems.material, 1, 56));

        OreDictionary.registerOre("U235", new ItemStack(NCItems.material, 1, 26));
        OreDictionary.registerOre("U235Base", new ItemStack(NCItems.material, 1, 26));
        OreDictionary.registerOre("U235", new ItemStack(NCItems.material, 1, 57));
        OreDictionary.registerOre("U235Oxide", new ItemStack(NCItems.material, 1, 57));
        OreDictionary.registerOre("tinyU235", new ItemStack(NCItems.material, 1, 27));
        OreDictionary.registerOre("tinyU235Base", new ItemStack(NCItems.material, 1, 27));
        OreDictionary.registerOre("tinyU235", new ItemStack(NCItems.material, 1, 58));
        OreDictionary.registerOre("tinyU235Oxide", new ItemStack(NCItems.material, 1, 58));

        OreDictionary.registerOre("U233", new ItemStack(NCItems.material, 1, 28));
        OreDictionary.registerOre("U233Base", new ItemStack(NCItems.material, 1, 28));
        OreDictionary.registerOre("U233", new ItemStack(NCItems.material, 1, 59));
        OreDictionary.registerOre("U233Oxide", new ItemStack(NCItems.material, 1, 59));
        OreDictionary.registerOre("tinyU233", new ItemStack(NCItems.material, 1, 29));
        OreDictionary.registerOre("tinyU233Base", new ItemStack(NCItems.material, 1, 29));
        OreDictionary.registerOre("tinyU233", new ItemStack(NCItems.material, 1, 60));
        OreDictionary.registerOre("tinyU233Oxide", new ItemStack(NCItems.material, 1, 60));

        OreDictionary.registerOre("Pu238", new ItemStack(NCItems.material, 1, 30));
        OreDictionary.registerOre("Pu238Base", new ItemStack(NCItems.material, 1, 30));
        OreDictionary.registerOre("Pu238", new ItemStack(NCItems.material, 1, 61));
        OreDictionary.registerOre("Pu238Oxide", new ItemStack(NCItems.material, 1, 61));
        OreDictionary.registerOre("tinyPu238", new ItemStack(NCItems.material, 1, 31));
        OreDictionary.registerOre("tinyPu238Base", new ItemStack(NCItems.material, 1, 31));
        OreDictionary.registerOre("tinyPu238", new ItemStack(NCItems.material, 1, 62));
        OreDictionary.registerOre("tinyPu238Oxide", new ItemStack(NCItems.material, 1, 62));

        OreDictionary.registerOre("Pu239", new ItemStack(NCItems.material, 1, 32));
        OreDictionary.registerOre("Pu239Base", new ItemStack(NCItems.material, 1, 32));
        OreDictionary.registerOre("Pu239", new ItemStack(NCItems.material, 1, 63));
        OreDictionary.registerOre("Pu239Oxide", new ItemStack(NCItems.material, 1, 63));
        OreDictionary.registerOre("tinyPu239", new ItemStack(NCItems.material, 1, 33));
        OreDictionary.registerOre("tinyPu239Base", new ItemStack(NCItems.material, 1, 33));
        OreDictionary.registerOre("tinyPu239", new ItemStack(NCItems.material, 1, 64));
        OreDictionary.registerOre("tinyPu239Oxide", new ItemStack(NCItems.material, 1, 64));

        OreDictionary.registerOre("Pu242", new ItemStack(NCItems.material, 1, 34));
        OreDictionary.registerOre("Pu242Base", new ItemStack(NCItems.material, 1, 34));
        OreDictionary.registerOre("Pu242", new ItemStack(NCItems.material, 1, 65));
        OreDictionary.registerOre("Pu242Oxide", new ItemStack(NCItems.material, 1, 65));
        OreDictionary.registerOre("tinyPu242", new ItemStack(NCItems.material, 1, 35));
        OreDictionary.registerOre("tinyPu242Base", new ItemStack(NCItems.material, 1, 35));
        OreDictionary.registerOre("tinyPu242", new ItemStack(NCItems.material, 1, 66));
        OreDictionary.registerOre("tinyPu242Oxide", new ItemStack(NCItems.material, 1, 66));

        OreDictionary.registerOre("Pu241", new ItemStack(NCItems.material, 1, 36));
        OreDictionary.registerOre("Pu241Base", new ItemStack(NCItems.material, 1, 36));
        OreDictionary.registerOre("Pu241", new ItemStack(NCItems.material, 1, 67));
        OreDictionary.registerOre("Pu241Oxide", new ItemStack(NCItems.material, 1, 67));
        OreDictionary.registerOre("tinyPu241", new ItemStack(NCItems.material, 1, 37));
        OreDictionary.registerOre("tinyPu241Base", new ItemStack(NCItems.material, 1, 37));
        OreDictionary.registerOre("tinyPu241", new ItemStack(NCItems.material, 1, 68));
        OreDictionary.registerOre("tinyPu241Oxide", new ItemStack(NCItems.material, 1, 68));

        OreDictionary.registerOre("Th232", new ItemStack(NCItems.material, 1, 38));
        OreDictionary.registerOre("Th232Base", new ItemStack(NCItems.material, 1, 38));
        OreDictionary.registerOre("Th232", new ItemStack(NCItems.material, 1, 82));
        OreDictionary.registerOre("Th232Oxide", new ItemStack(NCItems.material, 1, 82));
        OreDictionary.registerOre("tinyTh232", new ItemStack(NCItems.material, 1, 39));
        OreDictionary.registerOre("tinyTh232Base", new ItemStack(NCItems.material, 1, 39));
        OreDictionary.registerOre("tinyTh232", new ItemStack(NCItems.material, 1, 83));
        OreDictionary.registerOre("tinyTh232Oxide", new ItemStack(NCItems.material, 1, 83));

        OreDictionary.registerOre("Th230", new ItemStack(NCItems.material, 1, 40));
        OreDictionary.registerOre("Th230Base", new ItemStack(NCItems.material, 1, 40));
        OreDictionary.registerOre("Th230", new ItemStack(NCItems.material, 1, 84));
        OreDictionary.registerOre("Th230Oxide", new ItemStack(NCItems.material, 1, 84));
        OreDictionary.registerOre("tinyTh230", new ItemStack(NCItems.material, 1, 41));
        OreDictionary.registerOre("tinyTh230Base", new ItemStack(NCItems.material, 1, 41));
        OreDictionary.registerOre("tinyTh230", new ItemStack(NCItems.material, 1, 85));
        OreDictionary.registerOre("tinyTh230Oxide", new ItemStack(NCItems.material, 1, 85));

        OreDictionary.registerOre("Np236", new ItemStack(NCItems.material, 1, 86));
        OreDictionary.registerOre("Np236Base", new ItemStack(NCItems.material, 1, 86));
        OreDictionary.registerOre("Np236", new ItemStack(NCItems.material, 1, 104));
        OreDictionary.registerOre("Np236Oxide", new ItemStack(NCItems.material, 1, 104));
        OreDictionary.registerOre("tinyNp236", new ItemStack(NCItems.material, 1, 87));
        OreDictionary.registerOre("tinyNp236Base", new ItemStack(NCItems.material, 1, 87));
        OreDictionary.registerOre("tinyNp236", new ItemStack(NCItems.material, 1, 105));
        OreDictionary.registerOre("tinyNp236Oxide", new ItemStack(NCItems.material, 1, 105));

        OreDictionary.registerOre("Np237", new ItemStack(NCItems.material, 1, 88));
        OreDictionary.registerOre("Np237Base", new ItemStack(NCItems.material, 1, 88));
        OreDictionary.registerOre("Np237", new ItemStack(NCItems.material, 1, 106));
        OreDictionary.registerOre("Np237Oxide", new ItemStack(NCItems.material, 1, 106));
        OreDictionary.registerOre("tinyNp237", new ItemStack(NCItems.material, 1, 89));
        OreDictionary.registerOre("tinyNp237Base", new ItemStack(NCItems.material, 1, 89));
        OreDictionary.registerOre("tinyNp237", new ItemStack(NCItems.material, 1, 107));
        OreDictionary.registerOre("tinyNp237Oxide", new ItemStack(NCItems.material, 1, 107));

        OreDictionary.registerOre("Am241", new ItemStack(NCItems.material, 1, 90));
        OreDictionary.registerOre("Am241Base", new ItemStack(NCItems.material, 1, 90));
        OreDictionary.registerOre("Am241", new ItemStack(NCItems.material, 1, 108));
        OreDictionary.registerOre("Am241Oxide", new ItemStack(NCItems.material, 1, 108));
        OreDictionary.registerOre("tinyAm241", new ItemStack(NCItems.material, 1, 91));
        OreDictionary.registerOre("tinyAm241Base", new ItemStack(NCItems.material, 1, 91));
        OreDictionary.registerOre("tinyAm241", new ItemStack(NCItems.material, 1, 109));
        OreDictionary.registerOre("tinyAm241Oxide", new ItemStack(NCItems.material, 1, 109));

        OreDictionary.registerOre("Am242", new ItemStack(NCItems.material, 1, 92));
        OreDictionary.registerOre("Am242Base", new ItemStack(NCItems.material, 1, 92));
        OreDictionary.registerOre("Am242", new ItemStack(NCItems.material, 1, 110));
        OreDictionary.registerOre("Am242Oxide", new ItemStack(NCItems.material, 1, 110));
        OreDictionary.registerOre("tinyAm242", new ItemStack(NCItems.material, 1, 93));
        OreDictionary.registerOre("tinyAm242Base", new ItemStack(NCItems.material, 1, 93));
        OreDictionary.registerOre("tinyAm242", new ItemStack(NCItems.material, 1, 111));
        OreDictionary.registerOre("tinyAm242Oxide", new ItemStack(NCItems.material, 1, 111));

        OreDictionary.registerOre("Am243", new ItemStack(NCItems.material, 1, 94));
        OreDictionary.registerOre("Am243Base", new ItemStack(NCItems.material, 1, 94));
        OreDictionary.registerOre("Am243", new ItemStack(NCItems.material, 1, 112));
        OreDictionary.registerOre("Am243Oxide", new ItemStack(NCItems.material, 1, 112));
        OreDictionary.registerOre("tinyAm243", new ItemStack(NCItems.material, 1, 95));
        OreDictionary.registerOre("tinyAm243Base", new ItemStack(NCItems.material, 1, 95));
        OreDictionary.registerOre("tinyAm243", new ItemStack(NCItems.material, 1, 113));
        OreDictionary.registerOre("tinyAm243Oxide", new ItemStack(NCItems.material, 1, 113));

        OreDictionary.registerOre("Cm243", new ItemStack(NCItems.material, 1, 96));
        OreDictionary.registerOre("Cm243Base", new ItemStack(NCItems.material, 1, 96));
        OreDictionary.registerOre("Cm243", new ItemStack(NCItems.material, 1, 114));
        OreDictionary.registerOre("Cm243Oxide", new ItemStack(NCItems.material, 1, 114));
        OreDictionary.registerOre("tinyCm243", new ItemStack(NCItems.material, 1, 97));
        OreDictionary.registerOre("tinyCm243Base", new ItemStack(NCItems.material, 1, 97));
        OreDictionary.registerOre("tinyCm243", new ItemStack(NCItems.material, 1, 115));
        OreDictionary.registerOre("tinyCm243Oxide", new ItemStack(NCItems.material, 1, 115));

        OreDictionary.registerOre("Cm245", new ItemStack(NCItems.material, 1, 98));
        OreDictionary.registerOre("Cm245Base", new ItemStack(NCItems.material, 1, 98));
        OreDictionary.registerOre("Cm245", new ItemStack(NCItems.material, 1, 116));
        OreDictionary.registerOre("Cm245Oxide", new ItemStack(NCItems.material, 1, 116));
        OreDictionary.registerOre("tinyCm245", new ItemStack(NCItems.material, 1, 99));
        OreDictionary.registerOre("tinyCm245Base", new ItemStack(NCItems.material, 1, 99));
        OreDictionary.registerOre("tinyCm245", new ItemStack(NCItems.material, 1, 117));
        OreDictionary.registerOre("tinyCm245Oxide", new ItemStack(NCItems.material, 1, 117));

        OreDictionary.registerOre("Cm246", new ItemStack(NCItems.material, 1, 100));
        OreDictionary.registerOre("Cm246Base", new ItemStack(NCItems.material, 1, 100));
        OreDictionary.registerOre("Cm246", new ItemStack(NCItems.material, 1, 118));
        OreDictionary.registerOre("Cm246Oxide", new ItemStack(NCItems.material, 1, 118));
        OreDictionary.registerOre("tinyCm246", new ItemStack(NCItems.material, 1, 101));
        OreDictionary.registerOre("tinyCm246Base", new ItemStack(NCItems.material, 1, 101));
        OreDictionary.registerOre("tinyCm246", new ItemStack(NCItems.material, 1, 119));
        OreDictionary.registerOre("tinyCm246Oxide", new ItemStack(NCItems.material, 1, 119));

        OreDictionary.registerOre("Cm247", new ItemStack(NCItems.material, 1, 102));
        OreDictionary.registerOre("Cm247Base", new ItemStack(NCItems.material, 1, 102));
        OreDictionary.registerOre("Cm247", new ItemStack(NCItems.material, 1, 120));
        OreDictionary.registerOre("Cm247Oxide", new ItemStack(NCItems.material, 1, 120));
        OreDictionary.registerOre("tinyCm247", new ItemStack(NCItems.material, 1, 103));
        OreDictionary.registerOre("tinyCm247Base", new ItemStack(NCItems.material, 1, 103));
        OreDictionary.registerOre("tinyCm247", new ItemStack(NCItems.material, 1, 121));
        OreDictionary.registerOre("tinyCm247Oxide", new ItemStack(NCItems.material, 1, 121));

        OreDictionary.registerOre("Cf250", new ItemStack(NCItems.material, 1, 122));
        OreDictionary.registerOre("Cf250Base", new ItemStack(NCItems.material, 1, 122));
        OreDictionary.registerOre("Cf250", new ItemStack(NCItems.material, 1, 124));
        OreDictionary.registerOre("Cf250Oxide", new ItemStack(NCItems.material, 1, 124));
        OreDictionary.registerOre("tinyCf250", new ItemStack(NCItems.material, 1, 123));
        OreDictionary.registerOre("tinyCf250Base", new ItemStack(NCItems.material, 1, 123));
        OreDictionary.registerOre("tinyCf250", new ItemStack(NCItems.material, 1, 125));
        OreDictionary.registerOre("tinyCf250Oxide", new ItemStack(NCItems.material, 1, 125));

        // Lithium and Boron Isotopes
        OreDictionary.registerOre("Li6", new ItemStack(NCItems.material, 1, 46));
        OreDictionary.registerOre("tinyLi6", new ItemStack(NCItems.material, 1, 69));
        OreDictionary.registerOre("Li7", new ItemStack(NCItems.material, 1, 47));
        OreDictionary.registerOre("B10", new ItemStack(NCItems.material, 1, 48));
        OreDictionary.registerOre("tinyB10", new ItemStack(NCItems.material, 1, 70));
        OreDictionary.registerOre("B11", new ItemStack(NCItems.material, 1, 49));

        // Fission Fuels Ore Dictionary
        OreDictionary.registerOre("LEU235", new ItemStack(NCItems.fuel, 1, 0));
        OreDictionary.registerOre("LEU235Oxide", new ItemStack(NCItems.fuel, 1, 51));
        OreDictionary.registerOre("LEU235Cell", new ItemStack(NCItems.fuel, 1, 11));
        OreDictionary.registerOre("LEU235CellOxide", new ItemStack(NCItems.fuel, 1, 59));
        OreDictionary.registerOre("dLEU235Cell", new ItemStack(NCItems.fuel, 1, 22));
        OreDictionary.registerOre("dLEU235CellOxide", new ItemStack(NCItems.fuel, 1, 67));

        OreDictionary.registerOre("HEU235", new ItemStack(NCItems.fuel, 1, 1));
        OreDictionary.registerOre("HEU235Oxide", new ItemStack(NCItems.fuel, 1, 52));
        OreDictionary.registerOre("HEU235Cell", new ItemStack(NCItems.fuel, 1, 12));
        OreDictionary.registerOre("HEU235CellOxide", new ItemStack(NCItems.fuel, 1, 60));
        OreDictionary.registerOre("dHEU235Cell", new ItemStack(NCItems.fuel, 1, 23));
        OreDictionary.registerOre("dHEU235CellOxide", new ItemStack(NCItems.fuel, 1, 68));

        OreDictionary.registerOre("LEP239", new ItemStack(NCItems.fuel, 1, 2));
        OreDictionary.registerOre("LEP239Oxide", new ItemStack(NCItems.fuel, 1, 53));
        OreDictionary.registerOre("LEP239Cell", new ItemStack(NCItems.fuel, 1, 13));
        OreDictionary.registerOre("LEP239CellOxide", new ItemStack(NCItems.fuel, 1, 61));
        OreDictionary.registerOre("dLEP239Cell", new ItemStack(NCItems.fuel, 1, 24));
        OreDictionary.registerOre("dLEP239CellOxide", new ItemStack(NCItems.fuel, 1, 69));

        OreDictionary.registerOre("HEP239", new ItemStack(NCItems.fuel, 1, 3));
        OreDictionary.registerOre("HEP239Oxide", new ItemStack(NCItems.fuel, 1, 54));
        OreDictionary.registerOre("HEP239Cell", new ItemStack(NCItems.fuel, 1, 14));
        OreDictionary.registerOre("HEP239CellOxide", new ItemStack(NCItems.fuel, 1, 62));
        OreDictionary.registerOre("dHEP239Cell", new ItemStack(NCItems.fuel, 1, 25));
        OreDictionary.registerOre("dHEP239CellOxide", new ItemStack(NCItems.fuel, 1, 70));

        OreDictionary.registerOre("MOX239", new ItemStack(NCItems.fuel, 1, 4));
        OreDictionary.registerOre("MOX239Cell", new ItemStack(NCItems.fuel, 1, 15));
        OreDictionary.registerOre("dMOX239Cell", new ItemStack(NCItems.fuel, 1, 26));

        OreDictionary.registerOre("TBU", new ItemStack(NCItems.fuel, 1, 5));
        OreDictionary.registerOre("TBUOxide", new ItemStack(NCItems.fuel, 1, 76));
        OreDictionary.registerOre("TBUCell", new ItemStack(NCItems.fuel, 1, 16));
        OreDictionary.registerOre("TBUCellOxide", new ItemStack(NCItems.fuel, 1, 77));
        OreDictionary.registerOre("dTBUCell", new ItemStack(NCItems.fuel, 1, 27));
        OreDictionary.registerOre("dTBUCellOxide", new ItemStack(NCItems.fuel, 1, 78));

        OreDictionary.registerOre("LEU233", new ItemStack(NCItems.fuel, 1, 6));
        OreDictionary.registerOre("LEU233Oxide", new ItemStack(NCItems.fuel, 1, 55));
        OreDictionary.registerOre("LEU233Cell", new ItemStack(NCItems.fuel, 1, 17));
        OreDictionary.registerOre("LEU233CellOxide", new ItemStack(NCItems.fuel, 1, 63));
        OreDictionary.registerOre("dLEU233Cell", new ItemStack(NCItems.fuel, 1, 28));
        OreDictionary.registerOre("dLEU233CellOxide", new ItemStack(NCItems.fuel, 1, 71));

        OreDictionary.registerOre("HEU233", new ItemStack(NCItems.fuel, 1, 7));
        OreDictionary.registerOre("HEU233Oxide", new ItemStack(NCItems.fuel, 1, 56));
        OreDictionary.registerOre("HEU233Cell", new ItemStack(NCItems.fuel, 1, 18));
        OreDictionary.registerOre("HEU233CellOxide", new ItemStack(NCItems.fuel, 1, 64));
        OreDictionary.registerOre("dHEU233Cell", new ItemStack(NCItems.fuel, 1, 29));
        OreDictionary.registerOre("dHEU233CellOxide", new ItemStack(NCItems.fuel, 1, 72));

        OreDictionary.registerOre("LEP241", new ItemStack(NCItems.fuel, 1, 8));
        OreDictionary.registerOre("LEP241Oxide", new ItemStack(NCItems.fuel, 1, 57));
        OreDictionary.registerOre("LEP241Cell", new ItemStack(NCItems.fuel, 1, 19));
        OreDictionary.registerOre("LEP241CellOxide", new ItemStack(NCItems.fuel, 1, 65));
        OreDictionary.registerOre("dLEP241Cell", new ItemStack(NCItems.fuel, 1, 30));
        OreDictionary.registerOre("dLEP241CellOxide", new ItemStack(NCItems.fuel, 1, 73));

        OreDictionary.registerOre("HEP241", new ItemStack(NCItems.fuel, 1, 9));
        OreDictionary.registerOre("HEP241Oxide", new ItemStack(NCItems.fuel, 1, 58));
        OreDictionary.registerOre("HEP241Cell", new ItemStack(NCItems.fuel, 1, 20));
        OreDictionary.registerOre("HEP241CellOxide", new ItemStack(NCItems.fuel, 1, 66));
        OreDictionary.registerOre("dHEP241Cell", new ItemStack(NCItems.fuel, 1, 31));
        OreDictionary.registerOre("dHEP241CellOxide", new ItemStack(NCItems.fuel, 1, 74));

        OreDictionary.registerOre("MOX241", new ItemStack(NCItems.fuel, 1, 10));
        OreDictionary.registerOre("MOX241Cell", new ItemStack(NCItems.fuel, 1, 21));
        OreDictionary.registerOre("dMOX241Cell", new ItemStack(NCItems.fuel, 1, 32));

        OreDictionary.registerOre("LEN236", new ItemStack(NCItems.fuel, 1, 79));
        OreDictionary.registerOre("LEN236Oxide", new ItemStack(NCItems.fuel, 1, 89));
        OreDictionary.registerOre("LEN236Cell", new ItemStack(NCItems.fuel, 1, 99));
        OreDictionary.registerOre("LEN236CellOxide", new ItemStack(NCItems.fuel, 1, 109));
        OreDictionary.registerOre("dLEN236Cell", new ItemStack(NCItems.fuel, 1, 119));
        OreDictionary.registerOre("dLEN236CellOxide", new ItemStack(NCItems.fuel, 1, 129));

        OreDictionary.registerOre("HEN236", new ItemStack(NCItems.fuel, 1, 80));
        OreDictionary.registerOre("HEN236Oxide", new ItemStack(NCItems.fuel, 1, 90));
        OreDictionary.registerOre("HEN236Cell", new ItemStack(NCItems.fuel, 1, 100));
        OreDictionary.registerOre("HEN236CellOxide", new ItemStack(NCItems.fuel, 1, 110));
        OreDictionary.registerOre("dHEN236Cell", new ItemStack(NCItems.fuel, 1, 120));
        OreDictionary.registerOre("dHEN236CellOxide", new ItemStack(NCItems.fuel, 1, 130));

        OreDictionary.registerOre("LEA242", new ItemStack(NCItems.fuel, 1, 81));
        OreDictionary.registerOre("LEA242Oxide", new ItemStack(NCItems.fuel, 1, 91));
        OreDictionary.registerOre("LEA242Cell", new ItemStack(NCItems.fuel, 1, 101));
        OreDictionary.registerOre("LEA242CellOxide", new ItemStack(NCItems.fuel, 1, 111));
        OreDictionary.registerOre("dLEA242Cell", new ItemStack(NCItems.fuel, 1, 121));
        OreDictionary.registerOre("dLEA242CellOxide", new ItemStack(NCItems.fuel, 1, 131));

        OreDictionary.registerOre("HEA242", new ItemStack(NCItems.fuel, 1, 82));
        OreDictionary.registerOre("HEA242Oxide", new ItemStack(NCItems.fuel, 1, 92));
        OreDictionary.registerOre("HEA242Cell", new ItemStack(NCItems.fuel, 1, 102));
        OreDictionary.registerOre("HEA242CellOxide", new ItemStack(NCItems.fuel, 1, 112));
        OreDictionary.registerOre("dHEA242Cell", new ItemStack(NCItems.fuel, 1, 122));
        OreDictionary.registerOre("dHEA242CellOxide", new ItemStack(NCItems.fuel, 1, 132));

        OreDictionary.registerOre("LEC243", new ItemStack(NCItems.fuel, 1, 83));
        OreDictionary.registerOre("LEC243Oxide", new ItemStack(NCItems.fuel, 1, 93));
        OreDictionary.registerOre("LEC243Cell", new ItemStack(NCItems.fuel, 1, 103));
        OreDictionary.registerOre("LEC243CellOxide", new ItemStack(NCItems.fuel, 1, 113));
        OreDictionary.registerOre("dLEC243Cell", new ItemStack(NCItems.fuel, 1, 123));
        OreDictionary.registerOre("dLEC243CellOxide", new ItemStack(NCItems.fuel, 1, 133));

        OreDictionary.registerOre("HEC243", new ItemStack(NCItems.fuel, 1, 84));
        OreDictionary.registerOre("HEC243Oxide", new ItemStack(NCItems.fuel, 1, 94));
        OreDictionary.registerOre("HEC243Cell", new ItemStack(NCItems.fuel, 1, 104));
        OreDictionary.registerOre("HEC243CellOxide", new ItemStack(NCItems.fuel, 1, 114));
        OreDictionary.registerOre("dHEC243Cell", new ItemStack(NCItems.fuel, 1, 124));
        OreDictionary.registerOre("dHEC243CellOxide", new ItemStack(NCItems.fuel, 1, 134));

        OreDictionary.registerOre("LEC245", new ItemStack(NCItems.fuel, 1, 85));
        OreDictionary.registerOre("LEC245Oxide", new ItemStack(NCItems.fuel, 1, 95));
        OreDictionary.registerOre("LEC245Cell", new ItemStack(NCItems.fuel, 1, 105));
        OreDictionary.registerOre("LEC245CellOxide", new ItemStack(NCItems.fuel, 1, 115));
        OreDictionary.registerOre("dLEC245Cell", new ItemStack(NCItems.fuel, 1, 125));
        OreDictionary.registerOre("dLEC245CellOxide", new ItemStack(NCItems.fuel, 1, 135));

        OreDictionary.registerOre("HEC245", new ItemStack(NCItems.fuel, 1, 86));
        OreDictionary.registerOre("HEC245Oxide", new ItemStack(NCItems.fuel, 1, 96));
        OreDictionary.registerOre("HEC245Cell", new ItemStack(NCItems.fuel, 1, 106));
        OreDictionary.registerOre("HEC245CellOxide", new ItemStack(NCItems.fuel, 1, 116));
        OreDictionary.registerOre("dHEC245Cell", new ItemStack(NCItems.fuel, 1, 126));
        OreDictionary.registerOre("dHEC245CellOxide", new ItemStack(NCItems.fuel, 1, 136));

        OreDictionary.registerOre("LEC247", new ItemStack(NCItems.fuel, 1, 87));
        OreDictionary.registerOre("LEC247Oxide", new ItemStack(NCItems.fuel, 1, 97));
        OreDictionary.registerOre("LEC247Cell", new ItemStack(NCItems.fuel, 1, 107));
        OreDictionary.registerOre("LEC247CellOxide", new ItemStack(NCItems.fuel, 1, 117));
        OreDictionary.registerOre("dLEC247Cell", new ItemStack(NCItems.fuel, 1, 127));
        OreDictionary.registerOre("dLEC247CellOxide", new ItemStack(NCItems.fuel, 1, 137));

        OreDictionary.registerOre("HEC247", new ItemStack(NCItems.fuel, 1, 88));
        OreDictionary.registerOre("HEC247Oxide", new ItemStack(NCItems.fuel, 1, 98));
        OreDictionary.registerOre("HEC247Cell", new ItemStack(NCItems.fuel, 1, 108));
        OreDictionary.registerOre("HEC247CellOxide", new ItemStack(NCItems.fuel, 1, 118));
        OreDictionary.registerOre("dHEC247Cell", new ItemStack(NCItems.fuel, 1, 128));
        OreDictionary.registerOre("dHEC247CellOxide", new ItemStack(NCItems.fuel, 1, 138));

        // Vanilla Ore Dictionary
        OreDictionary.registerOre("gemCoal", new ItemStack(Items.coal, 1));
        OreDictionary.registerOre("oreObsidian", new ItemStack(Blocks.obsidian, 1));

        // Filled Fluid Cell Dictionary
        OreDictionary.registerOre("filledNCGasCell", new ItemStack(NCItems.fuel, 1, 34));
        OreDictionary.registerOre("filledNCGasCell", new ItemStack(NCItems.fuel, 1, 35));
        OreDictionary.registerOre("filledNCGasCell", new ItemStack(NCItems.fuel, 1, 36));
        OreDictionary.registerOre("filledNCGasCell", new ItemStack(NCItems.fuel, 1, 37));
        OreDictionary.registerOre("filledNCGasCell", new ItemStack(NCItems.fuel, 1, 38));
        OreDictionary.registerOre("filledNCGasCell", new ItemStack(NCItems.fuel, 1, 39));
        OreDictionary.registerOre("filledNCGasCell", new ItemStack(NCItems.fuel, 1, 40));

        // Record Ore Dictionary
        OreDictionary.registerOre("record", new ItemStack(NCItems.recordPractice, 1));
        OreDictionary.registerOre("record", new ItemStack(NCItems.recordArea51, 1));
        OreDictionary.registerOre("record", new ItemStack(NCItems.recordNeighborhood, 1));
    }
}
