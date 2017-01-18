package nc.achievment;

import cpw.mods.fml.common.FMLCommonHandler;
import nc.NCConfig;
import nc.block.NCBlocks;
import nc.item.NCItems;
import nc.util.Achievements;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.stats.Achievement;
import net.minecraft.stats.AchievementList;

/**
 * Created by gifsu on 18.01.2017.
 */
public class NCAchievement {

    public static Achievements achievements;

    public static Achievement nuclearFurnaceAchievement;
    public static Achievement dominosAchievement;
    public static Achievement fishAndRicecakeAchievement;
    public static Achievement heavyDutyWorkspaceAchievement;
    public static Achievement fuelCellAchievement;
    public static Achievement oxidFuelCellAchievment;
    public static Achievement ingotUraniumAchievement;
    public static Achievement ingotThoriumAchievement;
    public static Achievement oreUraniumAchievement;
    public static Achievement oreThoriumAchievment;
    public static Achievement nukeAchievement;
    public static Achievement toolAchievement;
    public static Achievement reactionGeneratorAchievement;
    public static Achievement fissionControllerAchievement;
    public static Achievement RTGAchievement;
    public static Achievement fusionReactorAchievement;
    public static Achievement factoryAchievement;
    public static Achievement separatorAchievement;
    public static Achievement pistolAchievement;
    public static Achievement solarAchievement;
    public static Achievement oxidiserAchievement;
    public static Achievement synchrotronAchievement;
    public static Achievement antimatterBombAchievement;
    public static Achievement assemblerAchivement;
    public static Achievement universalRectantAchievement;

    // crafting
    public Achievement a(String name, int x, int y, Block req, Achievement pre) {
        return achievements.registerAchievement(new Achievement("achievement." + name, name, x, y, req, pre));
    }

    public Achievement a(String name, int x, int y, Item req, Achievement pre) {
        return achievements.registerAchievement(new Achievement("achievement." + name, name, x, y, req, pre));
    }

    public Achievement a(String name, int x, int y, ItemStack req, Achievement pre) {
        return achievements.registerAchievement(new Achievement("achievement." + name, name, x, y, req, pre));
    }

    // mining
    public Achievement b(String name, int x, int y, ItemStack req, Achievement pre) {
        return achievements.registerAchievement(new Achievement("achievement." + name, name, x, y, req, pre));
    }

    //smelting
    public Achievement c(String name, int x, int y, Item req, Achievement pre) {
        return achievements.registerAchievement(new Achievement("achievement." + name, name, x, y, req, pre));
    }

    public Achievement c(String name, int x, int y, ItemStack req, Achievement pre) {
        return achievements.registerAchievement(new Achievement("achievement." + name, name, x, y, req, pre));
    }

    public void add() {
        achievements = new Achievements("NuclearCraft");
        FMLCommonHandler.instance().bus().register(achievements);

        // single achivments
        nuclearFurnaceAchievement = a("nuclearFurnace", -6, 0, NCBlocks.nuclearFurnaceIdle, null).setSpecial();
        dominosAchievement = a("dominos", -6, 1, NCItems.dominoes, null).setSpecial();
        fishAndRicecakeAchievement = a("fishAndRicecake", -6, 2, NCItems.fishAndRicecake, null).setSpecial();

        // achivement chain - ores and ingots

        oreThoriumAchievment = b("oreThorium", -4, 2, new ItemStack(NCBlocks.blockOre, 1, 5), null);
        ingotThoriumAchievement = c("ingotThorium", -4, 0, new ItemStack(NCItems.material, 1, 5), oreThoriumAchievment);

        oreUraniumAchievement = b("oreUranium", -2, 2, new ItemStack(NCBlocks.blockOre, 1, 4), null);
        ingotUraniumAchievement = c("ingotUranium", -2, 0, new ItemStack(NCItems.material, 1, 4), oreUraniumAchievement);
        reactionGeneratorAchievement = a("reactionGenerator", -2, -2, NCBlocks.reactionGeneratorIdle, ingotUraniumAchievement).setSpecial();

        // Startingpoint
        if (NCConfig.workspace) {
            heavyDutyWorkspaceAchievement = a("heavyDutyWorkspace", 0, 0, NCBlocks.nuclearWorkspace, AchievementList.acquireIron);
        } else {
            universalRectantAchievement = a("uniRectant", 0, 0, new ItemStack(NCItems.parts, 1, 4), null);
        }
        factoryAchievement = a("factory", 2, 0, NCBlocks.factoryIdle, NCConfig.workspace ? heavyDutyWorkspaceAchievement : universalRectantAchievement);
        assemblerAchivement = a("assembler", 2, 1, NCBlocks.assemblerIdle, NCConfig.workspace ? heavyDutyWorkspaceAchievement : universalRectantAchievement);
            // place for Computer Plate
            // place for Mechanical Part
        separatorAchievement = a("separator", 2, -1, NCBlocks.separatorIdle, NCConfig.workspace ? heavyDutyWorkspaceAchievement : universalRectantAchievement);
            fuelCellAchievement = a("fuelCell", 2, -3, new ItemStack(NCItems.fuel, 1, 13), separatorAchievement);
            oxidiserAchievement = a("oxidiser", 2, -5, NCBlocks.oxidiserIdle, fuelCellAchievement);
            oxidFuelCellAchievment = a("oxidFuelCell", 2, -7, new ItemStack(NCItems.fuel, 1, 61), oxidiserAchievement).setSpecial();



        /*
            Old style - making a newer on

            if (NCConfig.workspace) heavyDutyWorkspaceAchievement = a("heavyDutyWorkspace", 0, 0, NCBlocks.nuclearWorkspace, null);
            nukeAchievement = a("nuke", -2, -2, NCBlocks.nukeE, NCConfig.workspace ? heavyDutyWorkspaceAchievement : null);
            toolAchievement = a("tool", 2, -2, NCItems.dUPaxel, NCConfig.workspace ? heavyDutyWorkspaceAchievement : null);
            reactionGeneratorAchievement = a("reactionGenerator", -2, 0, NCBlocks.reactionGeneratorIdle, NCConfig.workspace ? heavyDutyWorkspaceAchievement : null);
            fissionControllerAchievement = a("fissionController", 2, 2, NCBlocks.fissionReactorGraphiteIdle, factoryAchievement);
            RTGAchievement = a("RTG", 2, 0, NCBlocks.RTG, fissionControllerAchievement);
            fusionReactorAchievement = a("fusionReactor", 4, 2, NCBlocks.fusionReactor, fissionControllerAchievement);
            oxidiserAchievement = a("oxidiser", -4, 4, NCBlocks.oxidiserIdle, separatorAchievement);
            pistolAchievement = a("pistol", -4, 2, NCItems.pistol, separatorAchievement);
            solarAchievement = a("solar", 2, 4, NCBlocks.solarPanel, factoryAchievement);
            synchrotronAchievement = a("synchrotron", 4, 6, NCBlocks.synchrotronIdle, factoryAchievement);
            synchrotronAchievement = a("antimatterBomb", 4, 8, NCBlocks.antimatterBombE, synchrotronAchievement);
        */
    }
}
