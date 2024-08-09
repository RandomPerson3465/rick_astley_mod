package io.github.randomperson3465.rick_astley_mod;

import java.util.ArrayList;
import io.github.randomperson3465.rick_astley_mod.init.ModBlocks;
import io.github.randomperson3465.rick_astley_mod.init.ModSounds;
import io.github.randomperson3465.rick_astley_mod.util.RegistryUtil;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import io.github.randomperson3465.rick_astley_mod.item.RickrollRecord;
import io.github.randomperson3465.rick_astley_mod.item.RickrollPickaxe;
import io.github.randomperson3465.rick_astley_mod.item.RickrollSword;
import io.github.randomperson3465.rick_astley_mod.item.RickrollAxe;
import io.github.randomperson3465.rick_astley_mod.item.RickrollShovel;
import io.github.randomperson3465.rick_astley_mod.item.RickrollHoe;
import io.github.randomperson3465.rick_astley_mod.item.RickrollArmor;
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
				RegistryUtil.setItemName(new Item(), "rickroll_animated").setCreativeTab(RickAstleyMod.TAB),
				RegistryUtil.setItemName(new Item(), "rickroll_ingot").setCreativeTab(RickAstleyMod.TAB),
				RegistryUtil.setItemName(new Item(), "rickroll_nugget").setCreativeTab(RickAstleyMod.TAB),
				RegistryUtil.setItemName(new RickrollRecord("rick_astley_mod_rickroll", ModSounds.RECORD_RICKROLL), "record_rickroll").setUnlocalizedName("record").setCreativeTab(RickAstleyMod.TAB),
				RegistryUtil.setItemName(new Item(), "rick_astley"),
				RegistryUtil.setItemName(new Item(), "rickroll_qr_code").setCreativeTab(RickAstleyMod.TAB),
				RegistryUtil.setItemName(new RickrollPickaxe(RickrollMaterial.RICKROLL_TOOL), "rickroll_pickaxe").setCreativeTab(RickAstleyMod.TAB),
				RegistryUtil.setItemName(new RickrollSword(RickrollMaterial.RICKROLL_TOOL), "rickroll_sword").setCreativeTab(RickAstleyMod.TAB),
				RegistryUtil.setItemName(new RickrollAxe(RickrollMaterial.RICKROLL_TOOL, 9.0f, -2.8f), "rickroll_axe").setCreativeTab(RickAstleyMod.TAB),
				RegistryUtil.setItemName(new RickrollShovel(RickrollMaterial.RICKROLL_TOOL), "rickroll_shovel").setCreativeTab(RickAstleyMod.TAB),
				RegistryUtil.setItemName(new RickrollHoe(RickrollMaterial.RICKROLL_TOOL), "rickroll_hoe").setCreativeTab(RickAstleyMod.TAB),
				RegistryUtil.setItemName(new RickrollArmor(RickrollMaterial.RICKROLL_ARMOR, EntityEquipmentSlot.HEAD), "rickroll_helmet").setCreativeTab(RickAstleyMod.TAB),
				RegistryUtil.setItemName(new RickrollArmor(RickrollMaterial.RICKROLL_ARMOR, EntityEquipmentSlot.CHEST), "rickroll_chestplate").setCreativeTab(RickAstleyMod.TAB),
				RegistryUtil.setItemName(new RickrollArmor(RickrollMaterial.RICKROLL_ARMOR, EntityEquipmentSlot.LEGS), "rickroll_leggings").setCreativeTab(RickAstleyMod.TAB),
				RegistryUtil.setItemName(new RickrollArmor(RickrollMaterial.RICKROLL_ARMOR, EntityEquipmentSlot.FEET), "rickroll_boots").setCreativeTab(RickAstleyMod.TAB)
		};
		
		final Block[] blockList = {ModBlocks.RICKROLL_BLOCK, ModBlocks.RICKROLL_BLOCK_ANIMATED, ModBlocks.RICKROLL_ORE, ModBlocks.RICKROLL_QR_CODE_BLOCK};
		
		Item[] itemBlocks = new Item[blockList.length];
		
		for (int i = 0; i < itemBlocks.length; i++) {
			itemBlocks[i] = RegistryUtil.createItemBlock(blockList[i]);
		}
		
		event.getRegistry().registerAll(items);
		event.getRegistry().registerAll(itemBlocks);
		
	}
	
	@SubscribeEvent
	public static void registerBlocks(Register<Block> event) {
				
		final Block[] blocks = {
			RegistryUtil.setBlockData(new Block(Material.IRON), "rickroll_block", 2, "pickaxe").setHardness(5.0f).setResistance(10.0f).setCreativeTab(RickAstleyMod.TAB),
			RegistryUtil.setBlockData(new Block(Material.IRON), "rickroll_block_animated", 2, "pickaxe").setHardness(5.0f).setResistance(10.0f).setCreativeTab(RickAstleyMod.TAB),
			RegistryUtil.setBlockData(new Block(Material.ROCK), "rickroll_ore", 2, "pickaxe").setHardness(3.0f).setResistance(5.0f).setCreativeTab(RickAstleyMod.TAB),
			RegistryUtil.setBlockData(new Block(Material.ROCK), "rickroll_qr_code_block", 0, "pickaxe").setHardness(1.8f).setCreativeTab(RickAstleyMod.TAB)
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