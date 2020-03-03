package co.grim.glasshole.data;

import co.grim.glasshole.Glasshole;
import co.grim.glasshole.blocks.IBlockData;
import co.grim.glasshole.blocks.IlluminatedStainedGlass;
import co.grim.glasshole.blocks.IlluminatedStainedPane;
import co.grim.glasshole.init.ModBlocks;
import net.minecraft.advancements.criterion.InventoryChangeTrigger;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.IFinishedRecipe;
import net.minecraft.data.RecipeProvider;
import net.minecraft.data.ShapedRecipeBuilder;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.common.Tags.Items;
import java.util.function.Consumer;

public class Recipes extends RecipeProvider
{
	protected ResourceLocation STAINED = new ResourceLocation(Glasshole.MODID, "stained");
	protected ResourceLocation STAINED_PANE = new ResourceLocation(Glasshole.MODID, "stained_pane");
	
	public Recipes(DataGenerator generatorIn)
	{
		super(generatorIn);
	}
	
	@Override
	protected void registerRecipes(Consumer<IFinishedRecipe> consumer)
	{
		for(IBlockData data:ModBlocks.registeredBlockData)
		{
			ShapedRecipeBuilder.shapedRecipe((Block)data, 8)
					.patternLine("XXX")
					.patternLine("XGX")
					.patternLine("XXX")
					.key('X', data.getBaseBlock())
					.key('#', Items.DUSTS_GLOWSTONE)
					.setGroup(data instanceof IlluminatedStainedGlass ? STAINED.toString() : data instanceof IlluminatedStainedPane ? STAINED_PANE.toString() : "")
					.addCriterion("glass", InventoryChangeTrigger.Instance.forItems(Blocks.GLASS))
					.build(consumer);
		}
	}
}
