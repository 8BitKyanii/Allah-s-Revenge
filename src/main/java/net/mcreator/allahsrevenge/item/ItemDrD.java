
package net.mcreator.allahsrevenge.item;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.client.event.ModelRegistryEvent;

import net.minecraft.util.ResourceLocation;
import net.minecraft.item.ItemRecord;
import net.minecraft.item.Item;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;

import net.mcreator.allahsrevenge.creativetab.TabAllahsRevenge;
import net.mcreator.allahsrevenge.ElementsAllahsRevengeMod;

@ElementsAllahsRevengeMod.ModElement.Tag
public class ItemDrD extends ElementsAllahsRevengeMod.ModElement {
	@GameRegistry.ObjectHolder("allahs_revenge:dr_d")
	public static final Item block = null;
	public ItemDrD(ElementsAllahsRevengeMod instance) {
		super(instance, 10);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new MusicDiscItemCustom());
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(block, 0, new ModelResourceLocation("allahs_revenge:dr_d", "inventory"));
	}
	public static class MusicDiscItemCustom extends ItemRecord {
		public MusicDiscItemCustom() {
			super("dr_d", ElementsAllahsRevengeMod.sounds.get(new ResourceLocation("allahs_revenge:drheinzdoofenshmirtz")));
			setUnlocalizedName("dr_d");
			setRegistryName("dr_d");
			setCreativeTab(TabAllahsRevenge.tab);
		}
	}
}
