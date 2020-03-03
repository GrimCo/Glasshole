package co.grim.glasshole.blocks;

import co.grim.glasshole.init.ModBlocks;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.StainedGlassPaneBlock;
import net.minecraft.block.material.Material;
import net.minecraft.item.DyeColor;

public class IlluminatedStainedPane extends StainedGlassPaneBlock implements IBlockData
{
	private final Block base;
	public IlluminatedStainedPane(DyeColor dyeColor, Block baseBlock)
	{
		super(dyeColor, Block.Properties.create(Material.GLASS, dyeColor).lightValue(15).hardnessAndResistance(0.3f).sound(SoundType.GLASS).notSolid());
		this.base=baseBlock;
		ModBlocks.registeredBlockData.add(this);
		
	}
	
	@Override
	public Block getBaseBlock()
	{
		return base;
	}

}
