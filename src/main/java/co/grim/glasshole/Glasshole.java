package co.grim.glasshole;

import co.grim.glasshole.blocks.IBlockData;
import co.grim.glasshole.init.ModBlocks;
import co.grim.glasshole.init.ModItems;
import co.grim.glasshole.items.GlassCutterItem;
import com.google.gson.JsonObject;
import net.minecraft.block.Blocks;
import net.minecraft.block.material.Material;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.storage.loot.LootContext;
import net.minecraft.world.storage.loot.LootContext.Builder;
import net.minecraft.world.storage.loot.LootParameterSets;
import net.minecraft.world.storage.loot.LootParameters;
import net.minecraft.world.storage.loot.LootTable;
import net.minecraft.world.storage.loot.conditions.ILootCondition;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.common.loot.GlobalLootModifierSerializer;
import net.minecraftforge.common.loot.LootModifier;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.annotation.Nonnull;
import java.util.List;

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
		
		bus.addListener(this::clientSetup);
		
		bus.addGenericListener(GlobalLootModifierSerializer.class,this::registerModifiers);
	}
	
	private void clientSetup(final FMLClientSetupEvent event)
	{
		ModBlocks.registeredBlockData.forEach(IBlockData::setRenderLayer);
	}
	
	public void registerModifiers(@Nonnull final RegistryEvent.Register<GlobalLootModifierSerializer<?>> event)
	{
		
		event.getRegistry().register(new GlasscutterModifier.Serializer().setRegistryName(Glasshole.MODID,"glasscutter_silktouch"));
	}
	
	public static class GlasscutterModifier extends LootModifier
	{
		public GlasscutterModifier(ILootCondition[] conditionsIn)
		{
			super(conditionsIn);
		}
		
		@Nonnull
		@Override
		protected List<ItemStack> doApply(List<ItemStack> generatedLoot, LootContext context)
		{
			ItemStack ctxTool = context.get(LootParameters.TOOL);
			
			Material blockMaterial = context.get(LootParameters.BLOCK_STATE).getMaterial();
			
			boolean valid = blockMaterial == Material.ICE || blockMaterial == Material.GLASS || blockMaterial == Material.PACKED_ICE;
			
			if(context.get(LootParameters.BLOCK_STATE).getMaterial() == Material.GLASS && !EnchantmentHelper.getEnchantments(ctxTool).containsKey(Enchantments.SILK_TOUCH))
			{
				ItemStack fakeTool = ctxTool.copy();
				fakeTool.addEnchantment(Enchantments.SILK_TOUCH,1);
				LootContext.Builder builder = new Builder(context);
				
				builder.withParameter(LootParameters.TOOL, fakeTool);
				LootContext ctx = builder.build(LootParameterSets.BLOCK);
				LootTable lootTable = context.getWorld().getServer().getLootTableManager().getLootTableFromLocation(context.get(LootParameters.BLOCK_STATE).getBlock().getLootTable());
				return lootTable.generate(ctx);
			}
			
			return generatedLoot;
			
		}
		
		private static class Serializer extends GlobalLootModifierSerializer<GlasscutterModifier>
		{
			
			@Override
			public GlasscutterModifier read(ResourceLocation location, JsonObject object, ILootCondition[] ailootcondition)
			{
				return new GlasscutterModifier(ailootcondition);
			}
		}
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
