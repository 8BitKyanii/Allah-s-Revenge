package net.mcreator.allahsrevenge.procedure;

import net.minecraft.item.ItemStack;
import net.minecraft.init.Enchantments;

import net.mcreator.allahsrevenge.ElementsAllahsRevengeMod;

import java.util.Map;

@ElementsAllahsRevengeMod.ModElement.Tag
public class ProcedureAllahsDaggerItemIsCraftedsmelted extends ElementsAllahsRevengeMod.ModElement {
	public ProcedureAllahsDaggerItemIsCraftedsmelted(ElementsAllahsRevengeMod instance) {
		super(instance, 25);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("itemstack") == null) {
			System.err.println("Failed to load dependency itemstack for procedure AllahsDaggerItemIsCraftedsmelted!");
			return;
		}
		ItemStack itemstack = (ItemStack) dependencies.get("itemstack");
		((itemstack)).addEnchantment(Enchantments.SHARPNESS, (int) 15);
		((itemstack)).addEnchantment(Enchantments.LOOTING, (int) 25);
		((itemstack)).addEnchantment(Enchantments.UNBREAKING, (int) 5);
		((itemstack)).addEnchantment(Enchantments.MENDING, (int) 1);
	}
}
