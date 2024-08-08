package io.github.randomperson3465.rick_astley_mod.init;

import io.github.randomperson3465.rick_astley_mod.RickAstleyMod;
import io.github.randomperson3465.rick_astley_mod.util.RegistryUtil;
import net.minecraft.util.SoundEvent;
import net.minecraftforge.fml.common.registry.GameRegistry.ObjectHolder;

@ObjectHolder(RickAstleyMod.MODID)
public class ModSounds {

	public static final SoundEvent RECORD_RICKROLL = RegistryUtil.createSoundEvent("record_rickroll");

}