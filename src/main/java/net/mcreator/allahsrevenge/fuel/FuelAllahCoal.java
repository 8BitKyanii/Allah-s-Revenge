
package net.mcreator.allahsrevenge.fuel;

import net.minecraft.item.ItemStack;

import net.mcreator.allahsrevenge.item.ItemAllahsCoal;
import net.mcreator.allahsrevenge.ElementsAllahsRevengeMod;

@ElementsAllahsRevengeMod.ModElement.Tag
public class FuelAllahCoal extends ElementsAllahsRevengeMod.ModElement {
	public FuelAllahCoal(ElementsAllahsRevengeMod instance) {
		super(instance, 5);
	}

	@Override
	public int addFuel(ItemStack fuel) {
		if (fuel.getItem() == new ItemStack(ItemAllahsCoal.block, (int) (1)).getItem())
			return 9800;
		return 0;
	}
}
