package co.grim.glasshole.blocks;

import net.minecraft.block.Block;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.RenderTypeLookup;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

public interface IBlockData
{
	@OnlyIn(Dist.CLIENT)
	default void setRenderLayer()
	{
		RenderTypeLookup.setRenderLayer((Block)this, RenderType.getTranslucent());
	}
	
	Block getBaseBlock();
}
