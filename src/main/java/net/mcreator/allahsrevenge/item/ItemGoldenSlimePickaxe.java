
package net.mcreator.allahsrevenge.item;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.client.event.ModelRegistryEvent;

import net.minecraft.world.World;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.Item;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;

import net.mcreator.allahsrevenge.procedure.ProcedureGoldenSlimePickaxeItemIsCraftedsmelted;
import net.mcreator.allahsrevenge.creativetab.TabAllahsRevenge;
import net.mcreator.allahsrevenge.ElementsAllahsRevengeMod;

import java.util.Set;
import java.util.Map;
import java.util.HashMap;

@ElementsAllahsRevengeMod.ModElement.Tag
public class ItemGoldenSlimePickaxe extends ElementsAllahsRevengeMod.ModElement {
	@GameRegistry.ObjectHolder("allahs_revenge:golden_slime_pickaxe")
	public static final Item block = null;
	public ItemGoldenSlimePickaxe(ElementsAllahsRevengeMod instance) {
		super(instance, 26);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemPickaxe(EnumHelper.addToolMaterial("GOLDEN_SLIME_PICKAXE", 1, 1893, 4f, 0f, 2)) {
			{
				this.attackSpeed = -3f;
			}
			public Set<String> getToolClasses(ItemStack stack) {
				HashMap<String, Integer> ret = new HashMap<String, Integer>();
				ret.put("pickaxe", 1);
				return ret.keySet();
			}

			@Override
			public void onCreated(ItemStack itemstack, World world, EntityPlayer entity) {
				super.onCreated(itemstack, world, entity);
				int x = (int) entity.posX;
				int y = (int) entity.posY;
				int z = (int) entity.posZ;
				{
					Map<String, Object> $_dependencies = new HashMap<>();
					$_dependencies.put("itemstack", itemstack);
					ProcedureGoldenSlimePickaxeItemIsCraftedsmelted.executeProcedure($_dependencies);
				}
			}
		}.setUnlocalizedName("golden_slime_pickaxe").setRegistryName("golden_slime_pickaxe").setCreativeTab(TabAllahsRevenge.tab));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(block, 0, new ModelResourceLocation("allahs_revenge:golden_slime_pickaxe", "inventory"));
	}
}
