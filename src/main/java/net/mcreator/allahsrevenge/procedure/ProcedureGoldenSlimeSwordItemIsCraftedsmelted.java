package net.mcreator.allahsrevenge.procedure;

import net.minecraft.item.ItemStack;
import net.minecraft.init.Enchantments;

import net.mcreator.allahsrevenge.ElementsAllahsRevengeMod;

import java.util.Map;

@ElementsAllahsRevengeMod.ModElement.Tag
public class ProcedureGoldenSlimeSwordItemIsCraftedsmelted extends ElementsAllahsRevengeMod.ModElement {
	public ProcedureGoldenSlimeSwordItemIsCraftedsmelted(ElementsAllahsRevengeMod instance) {
		super(instance, 27);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("itemstack") == null) {
			System.err.println("Failed to load dependency itemstack for procedure GoldenSlimeSwordItemIsCraftedsmelted!");
			return;
		}
		ItemStack itemstack = (ItemStack) dependencies.get("itemstack");
		((itemstack)).addEnchantment(Enchantments.SHARPNESS, (int) 7);
		((itemstack)).addEnchantment(Enchantments.FIRE_ASPECT, (int) 2);
		((itemstack)).addEnchantment(Enchantments.SWEEPING, (int) 3);
		((itemstack)).addEnchantment(Enchantments.MENDING, (int) 1);
		((itemstack)).addEnchantment(Enchantments.UNBREAKING, (int) 5);
		((itemstack)).addEnchantment(Enchantments.LOOTING, (int) 10);
	}
}
