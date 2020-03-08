package co.grim.glasshole.data;

import co.grim.glasshole.Glasshole;
import co.grim.glasshole.init.ModItems;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.ItemTagsProvider;
import net.minecraft.item.Item;
import net.minecraft.tags.Tag;
import net.minecraft.util.ResourceLocation;

public class ItemTags extends ItemTagsProvider
{
	public static Tag<Item> GLASSCUTTER = new Tag<>(new ResourceLocation(Glasshole.MODID,"glass_cutter"));
	
	public ItemTags(DataGenerator generatorIn)
	{
		super(generatorIn);
	}
	
	@Override
	protected void registerTags()
	{
		this.getBuilder(GLASSCUTTER).add(ModItems.WOODEN_GLASSCUTTER.get(), ModItems.STONE_GLASSCUTTER.get(), ModItems.IRON_GLASSCUTTER.get(), ModItems.GOLD_GLASSCUTTER.get(), ModItems.DIAMOND_GLASSCUTTER.get());
	}
}
