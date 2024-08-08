package io.github.randomperson3465.rick_astley_mod;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = RickAstleyMod.MODID, name = RickAstleyMod.NAME, version = RickAstleyMod.VERSION, acceptedMinecraftVersions = RickAstleyMod.MC_VERSION)
public class RickAstleyMod {

	public static final String MODID = "rick_astley_mod";
	public static final String NAME = "Rick Astley Mod";
	public static final String VERSION = "0.0.1";
	public static final String MC_VERSION = "[1.12.2]";

	public static final Logger LOGGER = LogManager.getLogger(RickAstleyMod.MODID);

	public static final CreativeTabs TAB = new RickAstleyModTab();
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
        
	}

	@EventHandler
	public void init(FMLInitializationEvent event) {
		LOGGER.info(RickAstleyMod.NAME + " says hi!");
	}

	@EventHandler
	public void postInit(FMLPostInitializationEvent event) {
        
	}

}