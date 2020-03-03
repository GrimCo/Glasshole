package co.grim.glasshole.blocks;

import co.grim.glasshole.init.ModBlocks;
import net.minecraft.block.AbstractGlassBlock;
import net.minecraft.block.Block;
import net.minecraft.block.GlassBlock;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.util.ResourceLocation;

public class IlluminatedGlass extends GlassBlock implements IBlockData
{
	private final Block base;
	
	public IlluminatedGlass(Block baseBlock)
	{
		super(Block.Properties.create(Material.GLASS).lightValue(15).hardnessAndResistance(0.3f).sound(SoundType.GLASS).notSolid());
		this.base = baseBlock;
		ModBlocks.registeredBlockData.add(this);
	}
	
	@Override
	public Block getBaseBlock()
	{
		return base;
	}
}
