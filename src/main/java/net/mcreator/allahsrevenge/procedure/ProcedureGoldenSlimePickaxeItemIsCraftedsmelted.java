package net.mcreator.allahsrevenge.procedure;

import net.minecraft.item.ItemStack;
import net.minecraft.init.Enchantments;

import net.mcreator.allahsrevenge.ElementsAllahsRevengeMod;

import java.util.Map;

@ElementsAllahsRevengeMod.ModElement.Tag
public class ProcedureGoldenSlimePickaxeItemIsCraftedsmelted extends ElementsAllahsRevengeMod.ModElement {
	public ProcedureGoldenSlimePickaxeItemIsCraftedsmelted(ElementsAllahsRevengeMod instance) {
		super(instance, 26);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("itemstack") == null) {
			System.err.println("Failed to load dependency itemstack for procedure GoldenSlimePickaxeItemIsCraftedsmelted!");
			return;
		}
		ItemStack itemstack = (ItemStack) dependencies.get("itemstack");
		((itemstack)).addEnchantment(Enchantments.EFFICIENCY, (int) 90);
		((itemstack)).addEnchantment(Enchantments.MENDING, (int) 1);
		((itemstack)).addEnchantment(Enchantments.SILK_TOUCH, (int) 1);
		((itemstack)).addEnchantment(Enchantments.UNBREAKING, (int) 5);
	}
}
