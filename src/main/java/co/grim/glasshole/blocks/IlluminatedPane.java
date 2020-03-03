package co.grim.glasshole.blocks;

import co.grim.glasshole.init.ModBlocks;
import net.minecraft.block.Block;
import net.minecraft.block.PaneBlock;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class IlluminatedPane extends PaneBlock implements IBlockData
{
	private final Block base;
	
	public IlluminatedPane(Block base)
	{
		super(Block.Properties.create(Material.GLASS).lightValue(15).hardnessAndResistance(0.3f).sound(SoundType.GLASS).notSolid());
		this.base = base;
		ModBlocks.registeredBlockData.add(this);
	}
	
	@Override
	public Block getBaseBlock()
	{
		return base;
	}
}
