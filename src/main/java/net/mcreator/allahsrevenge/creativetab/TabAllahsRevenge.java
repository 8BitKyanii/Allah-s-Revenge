
package net.mcreator.allahsrevenge.creativetab;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;

import net.minecraft.item.ItemStack;
import net.minecraft.init.Blocks;
import net.minecraft.creativetab.CreativeTabs;

import net.mcreator.allahsrevenge.ElementsAllahsRevengeMod;

@ElementsAllahsRevengeMod.ModElement.Tag
public class TabAllahsRevenge extends ElementsAllahsRevengeMod.ModElement {
	public TabAllahsRevenge(ElementsAllahsRevengeMod instance) {
		super(instance, 1);
	}

	@Override
	public void initElements() {
		tab = new CreativeTabs("taballahs_revenge") {
			@SideOnly(Side.CLIENT)
			@Override
			public ItemStack getTabIconItem() {
				return new ItemStack(Blocks.GOLD_BLOCK, (int) (1));
			}

			@SideOnly(Side.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
	public static CreativeTabs tab;
}
