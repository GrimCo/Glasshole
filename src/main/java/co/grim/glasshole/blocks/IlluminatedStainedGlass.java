package co.grim.glasshole.blocks;

import co.grim.glasshole.init.ModBlocks;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.StainedGlassBlock;
import net.minecraft.block.material.Material;
import net.minecraft.item.DyeColor;

public class IlluminatedStainedGlass extends StainedGlassBlock implements IBlockData
{
	private final Block base;
	
	public IlluminatedStainedGlass(DyeColor dyeColor, Block baseBlock)
	{
		super(dyeColor, Block.Properties.create(Material.GLASS, dyeColor).lightValue(15).hardnessAndResistance(0.3f).sound(SoundType.GLASS).notSolid());
		this.base = baseBlock;
		ModBlocks.registeredBlockData.add(this);
	}
	
	@Override
	public Block getBaseBlock()
	{
		return base;
	}
}
