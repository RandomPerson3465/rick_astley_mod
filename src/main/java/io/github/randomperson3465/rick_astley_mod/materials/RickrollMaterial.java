package io.github.randomperson3465.rick_astley_mod.materials;

import io.github.randomperson3465.rick_astley_mod.RickAstleyMod;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.init.SoundEvents;
import net.minecraftforge.common.util.EnumHelper;

public class RickrollMaterial {
	
	// Name, Harvest Level, Durability, Efficiency, Damage, Enchantability
	public static final ToolMaterial RICKROLL_TOOL = EnumHelper.addToolMaterial(RickAstleyMod.MODID + ":rickroll_tool", 3, 696, 10.0f, 3.5f, 12);
	
	// Name, Texture Name, Base Durability, Reduction Amounts, Enchantability, Sound on Equip, Toughness
	public static final ArmorMaterial RICKROLL_ARMOR = EnumHelper.addArmorMaterial(RickAstleyMod.MODID + ":rickroll_armor", RickAstleyMod.MODID + ":rickroll", 25, new int[]{3,6,8,3}, 12, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 3.0f);
	
}