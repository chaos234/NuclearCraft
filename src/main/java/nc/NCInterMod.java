package nc;

import cpw.mods.fml.common.event.FMLInterModComms;
import nc.block.NCBlocks;
import nc.item.NCItems;
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
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;

/**
 * Created by gifsu on 18.01.2017.
 */
public class NCInterMod {
    public static void add() {
        NBTTagCompound copperOreEnrichment = new NBTTagCompound();
        copperOreEnrichment.setTag("input", new ItemStack(NCBlocks.blockOre, 1, 0).writeToNBT(new NBTTagCompound()));
        copperOreEnrichment.setTag("output", new ItemStack(NCItems.material, 2, 15).writeToNBT(new NBTTagCompound()));
        FMLInterModComms.sendMessage("Mekanism", "EnrichmentChamberRecipe", copperOreEnrichment);

        NBTTagCompound tinOreEnrichment = new NBTTagCompound();
        tinOreEnrichment.setTag("input", new ItemStack(NCBlocks.blockOre, 1, 1).writeToNBT(new NBTTagCompound()));
        tinOreEnrichment.setTag("output", new ItemStack(NCItems.material, 2, 16).writeToNBT(new NBTTagCompound()));
        FMLInterModComms.sendMessage("Mekanism", "EnrichmentChamberRecipe", tinOreEnrichment);

        NBTTagCompound leadOreEnrichment = new NBTTagCompound();
        leadOreEnrichment.setTag("input", new ItemStack(NCBlocks.blockOre, 1, 2).writeToNBT(new NBTTagCompound()));
        leadOreEnrichment.setTag("output", new ItemStack(NCItems.material, 2, 17).writeToNBT(new NBTTagCompound()));
        FMLInterModComms.sendMessage("Mekanism", "EnrichmentChamberRecipe", leadOreEnrichment);

        NBTTagCompound silverOreEnrichment = new NBTTagCompound();
        silverOreEnrichment.setTag("input", new ItemStack(NCBlocks.blockOre, 1, 3).writeToNBT(new NBTTagCompound()));
        silverOreEnrichment.setTag("output", new ItemStack(NCItems.material, 2, 18).writeToNBT(new NBTTagCompound()));
        FMLInterModComms.sendMessage("Mekanism", "EnrichmentChamberRecipe", silverOreEnrichment);

        NBTTagCompound uraniumOreEnrichment = new NBTTagCompound();
        uraniumOreEnrichment.setTag("input", new ItemStack(NCBlocks.blockOre, 1, 4).writeToNBT(new NBTTagCompound()));
        uraniumOreEnrichment.setTag("output", new ItemStack(NCItems.material, 2, 19).writeToNBT(new NBTTagCompound()));
        FMLInterModComms.sendMessage("Mekanism", "EnrichmentChamberRecipe", uraniumOreEnrichment);

        NBTTagCompound thoriumOreEnrichment = new NBTTagCompound();
        thoriumOreEnrichment.setTag("input", new ItemStack(NCBlocks.blockOre, 1, 5).writeToNBT(new NBTTagCompound()));
        thoriumOreEnrichment.setTag("output", new ItemStack(NCItems.material, 2, 20).writeToNBT(new NBTTagCompound()));
        FMLInterModComms.sendMessage("Mekanism", "EnrichmentChamberRecipe", thoriumOreEnrichment);

        NBTTagCompound plutoniumOreEnrichment = new NBTTagCompound();
        plutoniumOreEnrichment.setTag("input", new ItemStack(NCBlocks.blockOre, 1, 6).writeToNBT(new NBTTagCompound()));
        plutoniumOreEnrichment.setTag("output", new ItemStack(NCItems.material, 2, 33).writeToNBT(new NBTTagCompound()));
        FMLInterModComms.sendMessage("Mekanism", "EnrichmentChamberRecipe", plutoniumOreEnrichment);

        NBTTagCompound lithiumOreEnrichment = new NBTTagCompound();
        lithiumOreEnrichment.setTag("input", new ItemStack(NCBlocks.blockOre, 1, 7).writeToNBT(new NBTTagCompound()));
        lithiumOreEnrichment.setTag("output", new ItemStack(NCItems.material, 2, 44).writeToNBT(new NBTTagCompound()));
        FMLInterModComms.sendMessage("Mekanism", "EnrichmentChamberRecipe", lithiumOreEnrichment);

        NBTTagCompound boronOreEnrichment = new NBTTagCompound();
        boronOreEnrichment.setTag("input", new ItemStack(NCBlocks.blockOre, 1, 8).writeToNBT(new NBTTagCompound()));
        boronOreEnrichment.setTag("output", new ItemStack(NCItems.material, 2, 45).writeToNBT(new NBTTagCompound()));
        FMLInterModComms.sendMessage("Mekanism", "EnrichmentChamberRecipe", boronOreEnrichment);

        NBTTagCompound magnesiumOreEnrichment = new NBTTagCompound();
        magnesiumOreEnrichment.setTag("input", new ItemStack(NCBlocks.blockOre, 1, 9).writeToNBT(new NBTTagCompound()));
        magnesiumOreEnrichment.setTag("output", new ItemStack(NCItems.material, 2, 51).writeToNBT(new NBTTagCompound()));
        FMLInterModComms.sendMessage("Mekanism", "EnrichmentChamberRecipe", magnesiumOreEnrichment);

        NBTTagCompound basicPlatingEnrichment = new NBTTagCompound();
        basicPlatingEnrichment.setTag("input", new ItemStack(NCItems.parts, NCConfig.workspace ? 4 : 8, 0).writeToNBT(new NBTTagCompound()));
        basicPlatingEnrichment.setTag("output", new ItemStack(NCItems.parts, 1, 3).writeToNBT(new NBTTagCompound()));
        FMLInterModComms.sendMessage("Mekanism", "EnrichmentChamberRecipe", basicPlatingEnrichment);

        NBTTagCompound ingotToPlatingEnrichment = new NBTTagCompound();
        ingotToPlatingEnrichment.setTag("input", new ItemStack(NCItems.material, 1, 7).writeToNBT(new NBTTagCompound()));
        ingotToPlatingEnrichment.setTag("output", new ItemStack(NCItems.parts, 2, 0).writeToNBT(new NBTTagCompound()));
        FMLInterModComms.sendMessage("Mekanism", "EnrichmentChamberRecipe", ingotToPlatingEnrichment);

        NBTTagCompound uraniumIngotCrushing = new NBTTagCompound();
        uraniumIngotCrushing.setTag("input", new ItemStack(NCItems.material, 1, 4).writeToNBT(new NBTTagCompound()));
        uraniumIngotCrushing.setTag("output", new ItemStack(NCItems.material, 1, 19).writeToNBT(new NBTTagCompound()));
        FMLInterModComms.sendMessage("Mekanism", "CrusherRecipe", uraniumIngotCrushing);

        NBTTagCompound thoriumIngotCrushing = new NBTTagCompound();
        thoriumIngotCrushing.setTag("input", new ItemStack(NCItems.material, 1, 5).writeToNBT(new NBTTagCompound()));
        thoriumIngotCrushing.setTag("output", new ItemStack(NCItems.material, 1, 20).writeToNBT(new NBTTagCompound()));
        FMLInterModComms.sendMessage("Mekanism", "CrusherRecipe", thoriumIngotCrushing);

        NBTTagCompound uraniumIngotOxideCrushing = new NBTTagCompound();
        uraniumIngotOxideCrushing.setTag("input", new ItemStack(NCItems.material, 1, 53).writeToNBT(new NBTTagCompound()));
        uraniumIngotOxideCrushing.setTag("output", new ItemStack(NCItems.material, 1, 54).writeToNBT(new NBTTagCompound()));
        FMLInterModComms.sendMessage("Mekanism", "CrusherRecipe", uraniumIngotOxideCrushing);

        NBTTagCompound thoriumIngotOxideCrushing = new NBTTagCompound();
        thoriumIngotOxideCrushing.setTag("input", new ItemStack(NCItems.material, 1, 126).writeToNBT(new NBTTagCompound()));
        thoriumIngotOxideCrushing.setTag("output", new ItemStack(NCItems.material, 1, 127).writeToNBT(new NBTTagCompound()));
        FMLInterModComms.sendMessage("Mekanism", "CrusherRecipe", thoriumIngotOxideCrushing);

        NBTTagCompound bronzeIngotCrushing = new NBTTagCompound();
        bronzeIngotCrushing.setTag("input", new ItemStack(NCItems.material, 1, 6).writeToNBT(new NBTTagCompound()));
        bronzeIngotCrushing.setTag("output", new ItemStack(NCItems.material, 1, 21).writeToNBT(new NBTTagCompound()));
        FMLInterModComms.sendMessage("Mekanism", "CrusherRecipe", bronzeIngotCrushing);

        NBTTagCompound toughIngotCrushing = new NBTTagCompound();
        toughIngotCrushing.setTag("input", new ItemStack(NCItems.material, 1, 7).writeToNBT(new NBTTagCompound()));
        toughIngotCrushing.setTag("output", new ItemStack(NCItems.material, 1, 22).writeToNBT(new NBTTagCompound()));
        FMLInterModComms.sendMessage("Mekanism", "CrusherRecipe", toughIngotCrushing);

        NBTTagCompound lithiumIngotCrushing = new NBTTagCompound();
        lithiumIngotCrushing.setTag("input", new ItemStack(NCItems.material, 1, 42).writeToNBT(new NBTTagCompound()));
        lithiumIngotCrushing.setTag("output", new ItemStack(NCItems.material, 1, 44).writeToNBT(new NBTTagCompound()));
        FMLInterModComms.sendMessage("Mekanism", "CrusherRecipe", lithiumIngotCrushing);

        NBTTagCompound boronIngotCrushing = new NBTTagCompound();
        boronIngotCrushing.setTag("input", new ItemStack(NCItems.material, 1, 43).writeToNBT(new NBTTagCompound()));
        boronIngotCrushing.setTag("output", new ItemStack(NCItems.material, 1, 45).writeToNBT(new NBTTagCompound()));
        FMLInterModComms.sendMessage("Mekanism", "CrusherRecipe", boronIngotCrushing);

        NBTTagCompound magnesiumIngotCrushing = new NBTTagCompound();
        magnesiumIngotCrushing.setTag("input", new ItemStack(NCItems.material, 1, 50).writeToNBT(new NBTTagCompound()));
        magnesiumIngotCrushing.setTag("output", new ItemStack(NCItems.material, 1, 51).writeToNBT(new NBTTagCompound()));
        FMLInterModComms.sendMessage("Mekanism", "CrusherRecipe", magnesiumIngotCrushing);

        NBTTagCompound mgbIngotCrushing = new NBTTagCompound();
        mgbIngotCrushing.setTag("input", new ItemStack(NCItems.material, 1, 71).writeToNBT(new NBTTagCompound()));
        mgbIngotCrushing.setTag("output", new ItemStack(NCItems.material, 1, 72).writeToNBT(new NBTTagCompound()));
        FMLInterModComms.sendMessage("Mekanism", "CrusherRecipe", mgbIngotCrushing);

        NBTTagCompound rCrushing = new NBTTagCompound();
        rCrushing.setTag("input", new ItemStack(NCItems.material, 1, 73).writeToNBT(new NBTTagCompound()));
        rCrushing.setTag("output", new ItemStack(NCItems.material, 1, 74).writeToNBT(new NBTTagCompound()));
        FMLInterModComms.sendMessage("Mekanism", "CrusherRecipe", rCrushing);

        NBTTagCompound graphiteIngotCrushing = new NBTTagCompound();
        graphiteIngotCrushing.setTag("input", new ItemStack(NCItems.material, 1, 76).writeToNBT(new NBTTagCompound()));
        graphiteIngotCrushing.setTag("output", new ItemStack(NCItems.material, 1, 77).writeToNBT(new NBTTagCompound()));
        FMLInterModComms.sendMessage("Mekanism", "CrusherRecipe", graphiteIngotCrushing);

        NBTTagCompound hardCarbonIngotCrushing = new NBTTagCompound();
        hardCarbonIngotCrushing.setTag("input", new ItemStack(NCItems.material, 1, 78).writeToNBT(new NBTTagCompound()));
        hardCarbonIngotCrushing.setTag("output", new ItemStack(NCItems.material, 1, 79).writeToNBT(new NBTTagCompound()));
        FMLInterModComms.sendMessage("Mekanism", "CrusherRecipe", hardCarbonIngotCrushing);

        NBTTagCompound LiMnO2IngotCrushing = new NBTTagCompound();
        LiMnO2IngotCrushing.setTag("input", new ItemStack(NCItems.material, 1, 80).writeToNBT(new NBTTagCompound()));
        LiMnO2IngotCrushing.setTag("output", new ItemStack(NCItems.material, 1, 81).writeToNBT(new NBTTagCompound()));
        FMLInterModComms.sendMessage("Mekanism", "CrusherRecipe", LiMnO2IngotCrushing);

		/*NBTTagCompound oxygenFilling = new NBTTagCompound();
		oxygenFilling.setTag("input", new ItemStack(NCItems.fuel, 1, 45).writeToNBT(new NBTTagCompound()));
		oxygenFilling.setTag("gasType", GasRegistry.getGas("oxygen").write(new NBTTagCompound()));
		oxygenFilling.setTag("output", new ItemStack(NCItems.fuel, 1, 35).writeToNBT(new NBTTagCompound()));
		FMLInterModComms.sendMessage("Mekanism", "ChemicalInjectionChamberRecipe", oxygenFilling);

		NBTTagCompound hydrogenFilling = new NBTTagCompound();
		hydrogenFilling.setTag("input", new ItemStack(NCItems.fuel, 1, 45).writeToNBT(new NBTTagCompound()));
		hydrogenFilling.setTag("gasType", GasRegistry.getGas("hydrogen").write(new NBTTagCompound()));
		hydrogenFilling.setTag("output", new ItemStack(NCItems.fuel, 1, 36).writeToNBT(new NBTTagCompound()));
		FMLInterModComms.sendMessage("Mekanism", "ChemicalInjectionChamberRecipe", hydrogenFilling);

		NBTTagCompound deuteriumFilling = new NBTTagCompound();
		deuteriumFilling.setTag("input", new ItemStack(NCItems.fuel, 1, 45).writeToNBT(new NBTTagCompound()));
		deuteriumFilling.setTag("gasType", GasRegistry.getGas("deuterium").write(new NBTTagCompound()));
		deuteriumFilling.setTag("output", new ItemStack(NCItems.fuel, 1, 37).writeToNBT(new NBTTagCompound()));
		FMLInterModComms.sendMessage("Mekanism", "ChemicalInjectionChamberRecipe", deuteriumFilling);

		NBTTagCompound tritiumFilling = new NBTTagCompound();
		tritiumFilling.setTag("input", new ItemStack(NCItems.fuel, 1, 45).writeToNBT(new NBTTagCompound()));
		tritiumFilling.setTag("gasType", GasRegistry.getGas("tritium").write(new NBTTagCompound()));
		tritiumFilling.setTag("output", new ItemStack(NCItems.fuel, 1, 38).writeToNBT(new NBTTagCompound()));
		FMLInterModComms.sendMessage("Mekanism", "ChemicalInjectionChamberRecipe", tritiumFilling);*/

        // Inter Mod Comms - AE2
        FMLInterModComms.sendMessage("appliedenergistics2", "whitelist-spatial", TileNuclearFurnace.class.getCanonicalName());
        FMLInterModComms.sendMessage("appliedenergistics2", "whitelist-spatial", TileFurnace.class.getCanonicalName());
        FMLInterModComms.sendMessage("appliedenergistics2", "whitelist-spatial", TileCrusher.class.getCanonicalName());
        FMLInterModComms.sendMessage("appliedenergistics2", "whitelist-spatial", TileElectricCrusher.class.getCanonicalName());
        FMLInterModComms.sendMessage("appliedenergistics2", "whitelist-spatial", TileElectricFurnace.class.getCanonicalName());
        FMLInterModComms.sendMessage("appliedenergistics2", "whitelist-spatial", TileReactionGenerator.class.getCanonicalName());
        FMLInterModComms.sendMessage("appliedenergistics2", "whitelist-spatial", TileSeparator.class.getCanonicalName());
        FMLInterModComms.sendMessage("appliedenergistics2", "whitelist-spatial", TileHastener.class.getCanonicalName());
        FMLInterModComms.sendMessage("appliedenergistics2", "whitelist-spatial", TileCollector.class.getCanonicalName());
        FMLInterModComms.sendMessage("appliedenergistics2", "whitelist-spatial", TileFissionReactor.class.getCanonicalName());
        FMLInterModComms.sendMessage("appliedenergistics2", "whitelist-spatial", TileFissionReactorSteam.class.getCanonicalName());
        FMLInterModComms.sendMessage("appliedenergistics2", "whitelist-spatial", TileNuclearWorkspace.class.getCanonicalName());
        FMLInterModComms.sendMessage("appliedenergistics2", "whitelist-spatial", TileFusionReactor.class.getCanonicalName());
        FMLInterModComms.sendMessage("appliedenergistics2", "whitelist-spatial", TileFusionReactorSteam.class.getCanonicalName());
        FMLInterModComms.sendMessage("appliedenergistics2", "whitelist-spatial", TileTubing1.class.getCanonicalName());
        FMLInterModComms.sendMessage("appliedenergistics2", "whitelist-spatial", TileTubing2.class.getCanonicalName());
        FMLInterModComms.sendMessage("appliedenergistics2", "whitelist-spatial", TileRTG.class.getCanonicalName());
        FMLInterModComms.sendMessage("appliedenergistics2", "whitelist-spatial", TileAmRTG.class.getCanonicalName());
        FMLInterModComms.sendMessage("appliedenergistics2", "whitelist-spatial", TileCfRTG.class.getCanonicalName());
        FMLInterModComms.sendMessage("appliedenergistics2", "whitelist-spatial", TileWRTG.class.getCanonicalName());
        FMLInterModComms.sendMessage("appliedenergistics2", "whitelist-spatial", TileSteamGenerator.class.getCanonicalName());
        FMLInterModComms.sendMessage("appliedenergistics2", "whitelist-spatial", TileSteamDecompressor.class.getCanonicalName());
        FMLInterModComms.sendMessage("appliedenergistics2", "whitelist-spatial", TileDenseSteamDecompressor.class.getCanonicalName());
        FMLInterModComms.sendMessage("appliedenergistics2", "whitelist-spatial", TileFusionReactorBlock.class.getCanonicalName());
        FMLInterModComms.sendMessage("appliedenergistics2", "whitelist-spatial", TileFusionReactorBlockTop.class.getCanonicalName());
        FMLInterModComms.sendMessage("appliedenergistics2", "whitelist-spatial", TileFusionReactorSteamBlock.class.getCanonicalName());
        FMLInterModComms.sendMessage("appliedenergistics2", "whitelist-spatial", TileFusionReactorSteamBlockTop.class.getCanonicalName());
        FMLInterModComms.sendMessage("appliedenergistics2", "whitelist-spatial", TileElectrolyser.class.getCanonicalName());
        FMLInterModComms.sendMessage("appliedenergistics2", "whitelist-spatial", TileOxidiser.class.getCanonicalName());
        FMLInterModComms.sendMessage("appliedenergistics2", "whitelist-spatial", TileIoniser.class.getCanonicalName());
        FMLInterModComms.sendMessage("appliedenergistics2", "whitelist-spatial", TileIrradiator.class.getCanonicalName());
        FMLInterModComms.sendMessage("appliedenergistics2", "whitelist-spatial", TileCooler.class.getCanonicalName());
        FMLInterModComms.sendMessage("appliedenergistics2", "whitelist-spatial", TileFactory.class.getCanonicalName());
        FMLInterModComms.sendMessage("appliedenergistics2", "whitelist-spatial", TileAssembler.class.getCanonicalName());
        FMLInterModComms.sendMessage("appliedenergistics2", "whitelist-spatial", TileHeliumExtractor.class.getCanonicalName());
        FMLInterModComms.sendMessage("appliedenergistics2", "whitelist-spatial", TileRecycler.class.getCanonicalName());
        FMLInterModComms.sendMessage("appliedenergistics2", "whitelist-spatial", TileSolarPanel.class.getCanonicalName());

        FMLInterModComms.sendMessage("appliedenergistics2", "whitelist-spatial", TileElectromagnet.class.getCanonicalName());
        FMLInterModComms.sendMessage("appliedenergistics2", "whitelist-spatial", TileSuperElectromagnet.class.getCanonicalName());
        FMLInterModComms.sendMessage("appliedenergistics2", "whitelist-spatial", TileSupercooler.class.getCanonicalName());
        FMLInterModComms.sendMessage("appliedenergistics2", "whitelist-spatial", TileSynchrotron.class.getCanonicalName());

        FMLInterModComms.sendMessage("appliedenergistics2", "whitelist-spatial", TileLithiumIonBattery.class.getCanonicalName());
        FMLInterModComms.sendMessage("appliedenergistics2", "whitelist-spatial", TileVoltaicPile.class.getCanonicalName());

        FMLInterModComms.sendMessage("appliedenergistics2", "whitelist-spatial", TileSimpleQuantum.class.getCanonicalName());
    }
}
