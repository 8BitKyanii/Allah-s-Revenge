
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
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;

import net.mcreator.allahsrevenge.ElementsAllahsRevengeMod;

@ElementsAllahsRevengeMod.ModElement.Tag
public class ItemGoldenSlimeArmor extends ElementsAllahsRevengeMod.ModElement {
	@GameRegistry.ObjectHolder("allahs_revenge:golden_slime_armorhelmet")
	public static final Item helmet = null;
	@GameRegistry.ObjectHolder("allahs_revenge:golden_slime_armorbody")
	public static final Item body = null;
	@GameRegistry.ObjectHolder("allahs_revenge:golden_slime_armorlegs")
	public static final Item legs = null;
	@GameRegistry.ObjectHolder("allahs_revenge:golden_slime_armorboots")
	public static final Item boots = null;
	public ItemGoldenSlimeArmor(ElementsAllahsRevengeMod instance) {
		super(instance, 19);
	}

	@Override
	public void initElements() {
		ItemArmor.ArmorMaterial enuma = EnumHelper.addArmorMaterial("GOLDEN_SLIME_ARMOR", "allahs_revenge:gold_", 35, new int[]{2, 7, 8, 4}, 9,
				(net.minecraft.util.SoundEvent) net.minecraft.util.SoundEvent.REGISTRY.getObject(new ResourceLocation("")), 0f);
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.HEAD).setUnlocalizedName("golden_slime_armorhelmet")
				.setRegistryName("golden_slime_armorhelmet").setCreativeTab(CreativeTabs.COMBAT));
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.CHEST).setUnlocalizedName("golden_slime_armorbody")
				.setRegistryName("golden_slime_armorbody").setCreativeTab(CreativeTabs.COMBAT));
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.LEGS).setUnlocalizedName("golden_slime_armorlegs")
				.setRegistryName("golden_slime_armorlegs").setCreativeTab(CreativeTabs.COMBAT));
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.FEET).setUnlocalizedName("golden_slime_armorboots")
				.setRegistryName("golden_slime_armorboots").setCreativeTab(CreativeTabs.COMBAT));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(helmet, 0, new ModelResourceLocation("allahs_revenge:golden_slime_armorhelmet", "inventory"));
		ModelLoader.setCustomModelResourceLocation(body, 0, new ModelResourceLocation("allahs_revenge:golden_slime_armorbody", "inventory"));
		ModelLoader.setCustomModelResourceLocation(legs, 0, new ModelResourceLocation("allahs_revenge:golden_slime_armorlegs", "inventory"));
		ModelLoader.setCustomModelResourceLocation(boots, 0, new ModelResourceLocation("allahs_revenge:golden_slime_armorboots", "inventory"));
	}
}
