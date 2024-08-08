package io.github.randomperson3465.rick_astley_mod.client;

import io.github.randomperson3465.rick_astley_mod.RickAstleyMod;
import io.github.randomperson3465.rick_astley_mod.init.ModItems;
import io.github.randomperson3465.rick_astley_mod.init.ModBlocks;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;

@EventBusSubscriber(value = Side.CLIENT, modid = RickAstleyMod.MODID)
public class ModelRegistrationHandler {

	@SubscribeEvent
	public static void registerModels(ModelRegistryEvent event) {
		
		Item[] itemList = {ModItems.RICKROLL, ModItems.RICKROLL_INGOT, ModItems.RICKROLL_NUGGET, ModItems.RECORD_RICKROLL, ModItems.RICK_ASTLEY, ModItems.RICKROLL_PICKAXE, ModItems.RICKROLL_SWORD, ModItems.RICKROLL_AXE, ModItems.RICKROLL_SHOVEL, ModItems.RICKROLL_HOE};
		
		for (Item item: itemList) {
			registerModel(item, 0);
		}
		
		/*
		registerModel(ModItems.RICKROLL, 0);
		registerModel(ModItems.RICKROLL_INGOT, 0);
		registerModel(ModItems.RICKROLL_NUGGET, 0);
		registerModel(ModItems.RECORD_RICKROLL, 0);
		registerModel(ModItems.RICK_ASTLEY, 0);
		*/
		registerModel(Item.getItemFromBlock(ModBlocks.RICKROLL_BLOCK), 0);
	}

	private static void registerModel(Item item, int meta) {
		ModelLoader.setCustomModelResourceLocation(item, meta, 
				new ModelResourceLocation(item.getRegistryName(), "inventory"));
	}

}