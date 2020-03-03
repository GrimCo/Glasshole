package co.grim.glasshole;

import co.grim.glasshole.blocks.IBlockData;
import co.grim.glasshole.init.ModBlocks;
import co.grim.glasshole.init.ModItems;
import net.minecraft.block.Blocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(Glasshole.MODID)
public class Glasshole
{
	public static final String MODID = "glasshole";
	private static final Logger LOGGER =LogManager.getLogger(Glasshole.MODID);
	
	public Glasshole()
	{
		IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
		ModBlocks.BLOCKS.register(bus);
		ModItems.ITEMS.register(bus);
		
		FMLJavaModLoadingContext.get().getModEventBus().addListener(this::clientSetup);
	}
	
	private void clientSetup(final FMLClientSetupEvent event)
	{
		ModBlocks.registeredBlockData.forEach(IBlockData::setRenderLayer);
	}
	
	public static ItemGroup itemGroup = new ItemGroup(Glasshole.MODID)
	{
		@Override
		public ItemStack createIcon()
		{
			return new ItemStack(Blocks.GLASS);
		}
	};
}
