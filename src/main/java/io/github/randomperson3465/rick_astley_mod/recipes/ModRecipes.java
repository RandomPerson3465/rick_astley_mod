package io.github.randomperson3465.rick_astley_mod.recipes;

import io.github.randomperson3465.rick_astley_mod.init.ModBlocks;
import io.github.randomperson3465.rick_astley_mod.init.ModItems;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModRecipes {
	
	public static void initSmelting() {
		GameRegistry.addSmelting(Item.getItemFromBlock(ModBlocks.RICKROLL_ORE), new ItemStack(ModItems.RICKROLL_INGOT), 1.0f);
	}
	
}