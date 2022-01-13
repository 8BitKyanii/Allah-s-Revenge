
package net.mcreator.allahsrevenge.item.crafting;

import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.item.ItemStack;

import net.mcreator.allahsrevenge.block.BlockResistantAllahIngot;
import net.mcreator.allahsrevenge.block.BlockImpureResistantAllahIngot;
import net.mcreator.allahsrevenge.ElementsAllahsRevengeMod;

@ElementsAllahsRevengeMod.ModElement.Tag
public class RecipeResistantAllahAlloy extends ElementsAllahsRevengeMod.ModElement {
	public RecipeResistantAllahAlloy(ElementsAllahsRevengeMod instance) {
		super(instance, 44);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		GameRegistry.addSmelting(new ItemStack(BlockImpureResistantAllahIngot.block, (int) (1)),
				new ItemStack(BlockResistantAllahIngot.block, (int) (1)), 100F);
	}
}
