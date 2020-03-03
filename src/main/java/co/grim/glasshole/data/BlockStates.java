package co.grim.glasshole.data;

import co.grim.glasshole.Glasshole;
import co.grim.glasshole.init.ModBlocks;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.client.model.generators.ExistingFileHelper;

public class BlockStates extends BlockStateProvider
{
	public BlockStates(DataGenerator gen, ExistingFileHelper helper)
	{
		super(gen, Glasshole.MODID, helper);
	}
	
	@Override
	protected void registerStatesAndModels()
	{
		simpleBlock(ModBlocks.glowingGlass.get());
	}
}
