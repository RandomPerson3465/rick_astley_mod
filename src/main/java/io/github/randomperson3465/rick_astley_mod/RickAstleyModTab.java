package io.github.randomperson3465.rick_astley_mod;

import io.github.randomperson3465.rick_astley_mod.init.ModItems;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class RickAstleyModTab extends CreativeTabs {
	
	public RickAstleyModTab() {
		super(RickAstleyMod.MODID);
	}
	
	@SideOnly(Side.CLIENT)
	@Override
	public ItemStack getTabIconItem() {
		return new ItemStack(ModItems.RICK_ASTLEY);
	}
	
}