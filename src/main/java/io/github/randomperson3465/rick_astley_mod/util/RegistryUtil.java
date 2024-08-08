package io.github.randomperson3465.rick_astley_mod.util;

import io.github.randomperson3465.rick_astley_mod.RickAstleyMod;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;

public class RegistryUtil {
	
	public static Item setItemName(final Item item, final String name) {
		item.setRegistryName(RickAstleyMod.MODID, name).setUnlocalizedName(RickAstleyMod.MODID + "." + name);
		return item;
	}
	
	public static Block setBlockName(final Block block, final String name) {
		block.setRegistryName(RickAstleyMod.MODID, name).setUnlocalizedName(RickAstleyMod.MODID + "." + name);
		return block;
	}
	
	public static SoundEvent createSoundEvent(final String name) {
		ResourceLocation location = new ResourceLocation(RickAstleyMod.MODID, name);
		SoundEvent soundEvent = new SoundEvent(location);
		soundEvent.setRegistryName(RickAstleyMod.MODID, name);
		return soundEvent;
	}
	
}