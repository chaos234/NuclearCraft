package com.nr.mod.crafting.nei;

import java.awt.Rectangle;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import com.nr.mod.crafting.OxidiserRecipes;
import com.nr.mod.gui.GuiOxidiser;
import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.item.ItemStack;
import codechicken.nei.PositionedStack;
import codechicken.nei.recipe.TemplateRecipeHandler;

public class OxidiserRecipeHandler extends TemplateRecipeHandler {
	public class SmeltingPair extends TemplateRecipeHandler.CachedRecipe {
		PositionedStack input;
		PositionedStack input2;
		PositionedStack result;
		PositionedStack result2;

		public SmeltingPair(Object input, Object input2, Object result, Object result2) {
			super();
			// input.stackSize = 1;
			this.input = new PositionedStack(input, 36, 14);
			this.input2 = new PositionedStack(input2, 36, 34);
			this.result = new PositionedStack(result, 125, 14);
			this.result2 = new PositionedStack(result2, 125, 34);
		}

		public List<PositionedStack> getIngredients() {
			return getCycledIngredients(
					OxidiserRecipeHandler.this.cycleticks / 24,
					Arrays.asList(new PositionedStack[] { this.input, this.input2 }));
		}

		public PositionedStack getResult() {
			return this.result;
		}

		public PositionedStack getOtherStack() {
			return this.result2;
		}
	}

	public void loadTransferRects() {
		this.transferRects.add(new TemplateRecipeHandler.RecipeTransferRect(new Rectangle(54, 23, 69, 41), "oxidising", new Object[0]));
	}

	public Class<? extends GuiContainer> getGuiClass() {
		return GuiOxidiser.class;
	}

	public String getRecipeName() {
		return "Oxidiser";
	}

	public void loadCraftingRecipes(String outputId, Object... results) {
		if ((outputId.equals("oxidising"))	&& (getClass() == OxidiserRecipeHandler.class)) {
			Map<Object[], Object[]> recipes = OxidiserRecipes.instance().getRecipes();
			for (Map.Entry<Object[], Object[]> recipe : recipes.entrySet()) {
				this.arecipes.add(new SmeltingPair(recipe.getKey()[0], recipe.getKey()[1], recipe.getValue()[0], recipe.getValue()[1]));
			}
		} else {
			super.loadCraftingRecipes(outputId, results);
		}
	}

	public void loadCraftingRecipes(ItemStack result) {
		Map<Object[], Object[]> recipes = OxidiserRecipes.instance().getRecipes();
		for (Map.Entry<Object[], Object[]> recipe : recipes.entrySet()) {
			int pos = OxidiserRecipes.instance().containsStack(result, recipe.getValue(), false);
			if (pos!=-1) {
			this.arecipes.add(new SmeltingPair(recipe.getKey()[0], recipe.getKey()[1], recipe.getValue()[0], recipe.getValue()[1]));				
			}
		}
	}

	public void loadUsageRecipes(String inputId, Object... ingredients) {
		if ((inputId.equals("oxidising"))&& (getClass() == OxidiserRecipeHandler.class)) {
			loadCraftingRecipes("oxidising", new Object[0]);
		} else {
			super.loadUsageRecipes(inputId, ingredients);
		}
	}

	public void loadUsageRecipes(ItemStack ingredient) {
		Map<Object[], Object[]> recipes = OxidiserRecipes.instance().getRecipes();
		for (Map.Entry<Object[], Object[]> recipe : recipes.entrySet()) {
			int pos = OxidiserRecipes.instance().containsStack(ingredient, recipe.getKey(), false);
			if (pos!=-1) {
			this.arecipes.add(new SmeltingPair(recipe.getKey()[0], recipe.getKey()[1], recipe.getValue()[0], recipe.getValue()[1]));				
			}
		}
	}

	public String getGuiTexture() {
		return "nr:textures/gui/oxidiserNEI.png";
	}

	public void drawExtras(int recipe) {
		drawProgressBar(3, 15, 176, 31, 16, 34, 240, 7); //energy
		drawProgressBar(54, 23, 176, 65, 71, 17, 40, 0);
	}
}