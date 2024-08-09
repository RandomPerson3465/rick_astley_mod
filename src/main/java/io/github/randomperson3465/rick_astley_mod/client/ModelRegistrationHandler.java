package io.github.randomperson3465.rick_astley_mod.client;

import io.github.randomperson3465.rick_astley_mod.RickAstleyMod;
import io.github.randomperson3465.rick_astley_mod.init.ModItems;
import io.github.randomperson3465.rick_astley_mod.init.ModBlocks;
import net.minecraft.block.Block;
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
		
		final Item[] itemList = {ModItems.RICKROLL, ModItems.RICKROLL_ANIMATED, ModItems.RICKROLL_INGOT, ModItems.RICKROLL_NUGGET, ModItems.RECORD_RICKROLL, ModItems.RICK_ASTLEY, ModItems.RICKROLL_QR_CODE, ModItems.RICKROLL_PICKAXE, ModItems.RICKROLL_SWORD, ModItems.RICKROLL_AXE, ModItems.RICKROLL_SHOVEL, ModItems.RICKROLL_HOE, ModItems.RICKROLL_HELMET, ModItems.RICKROLL_CHESTPLATE, ModItems.RICKROLL_LEGGINGS, ModItems.RICKROLL_BOOTS};
		
		for (Item item: itemList) {
			registerModel(item, 0);
		}
		
		final Block[] blockList = {ModBlocks.RICKROLL_BLOCK, ModBlocks.RICKROLL_BLOCK_ANIMATED, ModBlocks.RICKROLL_ORE, ModBlocks.RICKROLL_QR_CODE_BLOCK};
		
		for (Block block: blockList) {
			registerModel(Item.getItemFromBlock(block), 0);
		}
		
		//registerModel(Item.getItemFromBlock(ModBlocks.RICKROLL_BLOCK), 0);
	}

	private static void registerModel(Item item, int meta) {
		ModelLoader.setCustomModelResourceLocation(item, meta, 
				new ModelResourceLocation(item.getRegistryName(), "inventory"));
	}

}