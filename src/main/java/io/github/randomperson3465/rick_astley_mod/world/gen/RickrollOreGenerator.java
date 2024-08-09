package io.github.randomperson3465.rick_astley_mod.world.gen;

import java.util.Random;
import io.github.randomperson3465.rick_astley_mod.init.ModBlocks;
import net.minecraft.block.state.pattern.BlockMatcher;
import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.IChunkGenerator;
import net.minecraft.world.gen.feature.WorldGenerator;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraftforge.fml.common.IWorldGenerator;

public class RickrollOreGenerator implements IWorldGenerator {
	
	private final WorldGenMinable rickrollOreGenerator;
	
	public RickrollOreGenerator() {
		rickrollOreGenerator = new WorldGenMinable(ModBlocks.RICKROLL_ORE.getDefaultState(), 5, BlockMatcher.forBlock(Blocks.STONE));
		
	}
	
	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator, IChunkProvider chunkProvider) {
		switch (world.provider.getDimensionType()) {
			case NETHER:
				break;
				
			case OVERWORLD:
				genStandard(rickrollOreGenerator, world, random, chunkX, chunkZ, 5, 0, 64);
				break;
			
			case THE_END:
				break;
				
		}
	}

	private void genStandard(WorldGenerator generator, World world, Random random, int chunkX, int chunkZ, int spawnTries, int minHeight, int maxHeight) {
	
		BlockPos chunkPosAsBlockPos = new BlockPos(chunkX << 4, 0, chunkZ << 4);
	    int heightDiff = maxHeight - minHeight + 1;
	    
	 
	    for (int i = 0; i < spawnTries; i++) {
	    	
	    	int x = random.nextInt(16);
	    	int y = minHeight + random.nextInt(heightDiff);
	    	int z = random.nextInt(16);
	    	
	        generator.generate(world, random, 
	        	chunkPosAsBlockPos.add(
	        		x,
	        		y,
	        		z
	        	)
	        );
	    }
	    
	}
	
}