
package net.mcreator.allahsrevenge.item;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.client.event.ModelRegistryEvent;

import net.minecraft.util.ResourceLocation;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.Item;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;

import net.mcreator.allahsrevenge.creativetab.TabAllahsRevenge;
import net.mcreator.allahsrevenge.ElementsAllahsRevengeMod;

@ElementsAllahsRevengeMod.ModElement.Tag
public class ItemEssenceOfAllah extends ElementsAllahsRevengeMod.ModElement {
	@GameRegistry.ObjectHolder("allahs_revenge:essence_of_allahhelmet")
	public static final Item helmet = null;
	@GameRegistry.ObjectHolder("allahs_revenge:essence_of_allahbody")
	public static final Item body = null;
	@GameRegistry.ObjectHolder("allahs_revenge:essence_of_allahlegs")
	public static final Item legs = null;
	@GameRegistry.ObjectHolder("allahs_revenge:essence_of_allahboots")
	public static final Item boots = null;
	public ItemEssenceOfAllah(ElementsAllahsRevengeMod instance) {
		super(instance, 12);
	}

	@Override
	public void initElements() {
		ItemArmor.ArmorMaterial enuma = EnumHelper.addArmorMaterial("ESSENCE_OF_ALLAH", "allahs_revenge:allah_", 40, new int[]{2, 8, 9, 5}, 36,
				(net.minecraft.util.SoundEvent) net.minecraft.util.SoundEvent.REGISTRY.getObject(new ResourceLocation("")), 4f);
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.HEAD).setUnlocalizedName("essence_of_allahhelmet")
				.setRegistryName("essence_of_allahhelmet").setCreativeTab(TabAllahsRevenge.tab));
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.CHEST).setUnlocalizedName("essence_of_allahbody")
				.setRegistryName("essence_of_allahbody").setCreativeTab(TabAllahsRevenge.tab));
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.LEGS).setUnlocalizedName("essence_of_allahlegs")
				.setRegistryName("essence_of_allahlegs").setCreativeTab(TabAllahsRevenge.tab));
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.FEET).setUnlocalizedName("essence_of_allahboots")
				.setRegistryName("essence_of_allahboots").setCreativeTab(TabAllahsRevenge.tab));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(helmet, 0, new ModelResourceLocation("allahs_revenge:essence_of_allahhelmet", "inventory"));
		ModelLoader.setCustomModelResourceLocation(body, 0, new ModelResourceLocation("allahs_revenge:essence_of_allahbody", "inventory"));
		ModelLoader.setCustomModelResourceLocation(legs, 0, new ModelResourceLocation("allahs_revenge:essence_of_allahlegs", "inventory"));
		ModelLoader.setCustomModelResourceLocation(boots, 0, new ModelResourceLocation("allahs_revenge:essence_of_allahboots", "inventory"));
	}
}
