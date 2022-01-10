package net.mcreator.allahsrevenge.procedure;

import net.minecraft.item.ItemStack;
import net.minecraft.init.Enchantments;

import net.mcreator.allahsrevenge.ElementsAllahsRevengeMod;

import java.util.Map;

@ElementsAllahsRevengeMod.ModElement.Tag
public class ProcedureAllahsSlaveItemIsCraftedsmelted extends ElementsAllahsRevengeMod.ModElement {
	public ProcedureAllahsSlaveItemIsCraftedsmelted(ElementsAllahsRevengeMod instance) {
		super(instance, 24);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("itemstack") == null) {
			System.err.println("Failed to load dependency itemstack for procedure AllahsSlaveItemIsCraftedsmelted!");
			return;
		}
		ItemStack itemstack = (ItemStack) dependencies.get("itemstack");
		((itemstack)).addEnchantment(Enchantments.FORTUNE, (int) 15);
		((itemstack)).addEnchantment(Enchantments.MENDING, (int) 1);
		((itemstack)).addEnchantment(Enchantments.EFFICIENCY, (int) 25);
		((itemstack)).addEnchantment(Enchantments.UNBREAKING, (int) 5);
	}
}
