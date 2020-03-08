package co.grim.glasshole.data;

import co.grim.glasshole.Glasshole;
import co.grim.glasshole.blocks.IBlockData;
import co.grim.glasshole.blocks.IlluminatedStainedGlass;
import co.grim.glasshole.blocks.IlluminatedStainedPane;
import co.grim.glasshole.init.ModBlocks;
import co.grim.glasshole.init.ModItems;
import co.grim.glasshole.items.GlassCutterItem;
import net.minecraft.advancements.criterion.InventoryChangeTrigger;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.IFinishedRecipe;
import net.minecraft.data.RecipeProvider;
import net.minecraft.data.ShapedRecipeBuilder;
import net.minecraft.item.Items;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.common.Tags;
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
	public void registerRecipes(Consumer<IFinishedRecipe> consumer)
	{
		createGlassCutterRecipe(ModItems.WOODEN_GLASSCUTTER.get(), consumer);
		createGlassCutterRecipe(ModItems.STONE_GLASSCUTTER.get(), consumer);
		createGlassCutterRecipe(ModItems.IRON_GLASSCUTTER.get(), consumer);
		createGlassCutterRecipe(ModItems.GOLD_GLASSCUTTER.get(), consumer);
		createGlassCutterRecipe(ModItems.DIAMOND_GLASSCUTTER.get(), consumer);
		
		for(IBlockData data:ModBlocks.registeredBlockData)
		{
			ShapedRecipeBuilder.shapedRecipe((Block)data, 8)
					.patternLine("XXX")
					.patternLine("XGX")
					.patternLine("XXX")
					.key('X', data.getBaseBlock())
					.key('G', Tags.Items.DUSTS_GLOWSTONE)
					.setGroup(data instanceof IlluminatedStainedGlass ? STAINED.toString() : data instanceof IlluminatedStainedPane ? STAINED_PANE.toString() : "")
					.addCriterion("glass", InventoryChangeTrigger.Instance.forItems(Blocks.GLASS))
					.build(consumer);
		}
	}
	
	private void createGlassCutterRecipe(GlassCutterItem itemIn, Consumer<IFinishedRecipe> consumer)
	{
		ShapedRecipeBuilder.shapedRecipe(itemIn)
				.patternLine("  I")
				.patternLine(" SF")
				.patternLine("S  ")
				.key('I', itemIn.getTier().getRepairMaterial())
				.key('F', Items.FLINT)
				.key('S', Tags.Items.RODS_WOODEN)
				.setGroup("glasshole:glasscutter")
				.addCriterion("flint",InventoryChangeTrigger.Instance.forItems(Items.FLINT))
				.build(consumer);
	}
}
