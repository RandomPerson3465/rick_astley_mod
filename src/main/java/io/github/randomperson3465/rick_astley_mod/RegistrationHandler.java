package io.github.randomperson3465.rick_astley_mod;

import io.github.randomperson3465.rick_astley_mod.init.ModBlocks;
import io.github.randomperson3465.rick_astley_mod.init.ModSounds;
import io.github.randomperson3465.rick_astley_mod.util.RegistryUtil;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import io.github.randomperson3465.rick_astley_mod.item.RickrollRecord;
import io.github.randomperson3465.rick_astley_mod.item.RickrollPickaxe;
import io.github.randomperson3465.rick_astley_mod.item.RickrollSword;
import io.github.randomperson3465.rick_astley_mod.item.RickrollAxe;
import io.github.randomperson3465.rick_astley_mod.item.RickrollShovel;
import io.github.randomperson3465.rick_astley_mod.item.RickrollHoe;
import io.github.randomperson3465.rick_astley_mod.materials.RickrollMaterial;
import net.minecraft.util.SoundEvent;
import net.minecraftforge.event.RegistryEvent.Register;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@EventBusSubscriber(modid = RickAstleyMod.MODID)
public class RegistrationHandler {

	@SubscribeEvent
	public static void registerItems(Register<Item> event) {
				
		final Item[] items = {
				RegistryUtil.setItemName(new Item(), "rickroll").setCreativeTab(RickAstleyMod.TAB),
				RegistryUtil.setItemName(new Item(), "rickroll_ingot").setCreativeTab(RickAstleyMod.TAB),
				RegistryUtil.setItemName(new Item(), "rickroll_nugget").setCreativeTab(RickAstleyMod.TAB),
				RegistryUtil.setItemName(new RickrollRecord("rick_astley_mod_rickroll", ModSounds.RECORD_RICKROLL), "record_rickroll").setUnlocalizedName("record").setCreativeTab(RickAstleyMod.TAB),
				RegistryUtil.setItemName(new Item(), "rick_astley"),
				RegistryUtil.setItemName(new RickrollPickaxe(RickrollMaterial.RICKROLL_TOOL), "rickroll_pickaxe").setCreativeTab(RickAstleyMod.TAB),
				RegistryUtil.setItemName(new RickrollSword(RickrollMaterial.RICKROLL_TOOL), "rickroll_sword").setCreativeTab(RickAstleyMod.TAB),
				RegistryUtil.setItemName(new RickrollAxe(RickrollMaterial.RICKROLL_TOOL, 9.0f, -2.8f), "rickroll_axe").setCreativeTab(RickAstleyMod.TAB),
				RegistryUtil.setItemName(new RickrollShovel(RickrollMaterial.RICKROLL_TOOL), "rickroll_shovel").setCreativeTab(RickAstleyMod.TAB),
				RegistryUtil.setItemName(new RickrollHoe(RickrollMaterial.RICKROLL_TOOL), "rickroll_hoe").setCreativeTab(RickAstleyMod.TAB),
		};
		
		final Item[] itemBlocks = {
				new ItemBlock(ModBlocks.RICKROLL_BLOCK).setRegistryName(ModBlocks.RICKROLL_BLOCK.getRegistryName())
		};

		event.getRegistry().registerAll(items);
		event.getRegistry().registerAll(itemBlocks);
		
	}
	
	@SubscribeEvent
	public static void registerBlocks(Register<Block> event) {
				
		final Block[] blocks = {
			RegistryUtil.setBlockName(new Block(Material.IRON), "rickroll_block").setHardness(5.0f).setCreativeTab(RickAstleyMod.TAB)
		};
		
		event.getRegistry().registerAll(blocks);
		
	}
	
	@SubscribeEvent
	public static void registerSounds(Register<SoundEvent> event) {
				
		final SoundEvent[] sounds = {
			ModSounds.RECORD_RICKROLL
		};
		
		event.getRegistry().registerAll(sounds);
		
	}
	
}