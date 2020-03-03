package co.grim.glasshole.init;

import co.grim.glasshole.Glasshole;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.Item.Properties;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModItems
{
	public static final DeferredRegister<Item> ITEMS = new DeferredRegister<>(ForgeRegistries.ITEMS, Glasshole.MODID);
	
	public static Properties defaultProps = new Properties().group(Glasshole.itemGroup);
	
	public static RegistryObject<BlockItem> glowingGlass = ITEMS.register("glass_glowing", ()->new BlockItem(ModBlocks.glowingGlass.get(),defaultProps));
	public static RegistryObject<BlockItem> glowingGlassPane =ITEMS.register("glass_pane_glowing", () -> new BlockItem(ModBlocks.glowingGlassPane.get(), defaultProps));
	
	public static RegistryObject<BlockItem> glowingGlassWhite = ITEMS.register("white_stained_glass_glowing",()-> new BlockItem(ModBlocks.glowingGlassWhite.get(), defaultProps));
	public static RegistryObject<BlockItem> glowingGlassOrange = ITEMS.register("orange_stained_glass_glowing",()-> new BlockItem(ModBlocks.glowingGlassOrange.get(), defaultProps));
	public static RegistryObject<BlockItem> glowingGlassMagenta = ITEMS.register("magenta_stained_glass_glowing",()-> new BlockItem(ModBlocks.glowingGlassMagenta.get(), defaultProps));
	public static RegistryObject<BlockItem> glowingGlassLightBlue = ITEMS.register("light_blue_stained_glass_glowing",()-> new BlockItem(ModBlocks.glowingGlassLightBlue.get(), defaultProps));
	public static RegistryObject<BlockItem> glowingGlassYelow = ITEMS.register("yellow_stained_glass_glowing",()-> new BlockItem(ModBlocks.glowingGlassYellow.get(), defaultProps));
	public static RegistryObject<BlockItem> glowingGlassLime = ITEMS.register("lime_stained_glass_glowing",()-> new BlockItem(ModBlocks.glowingGlassLime.get(), defaultProps));
	public static RegistryObject<BlockItem> glowingGlassPink = ITEMS.register("pink_stained_glass_glowing",()-> new BlockItem(ModBlocks.glowingGlassPink.get(), defaultProps));
	public static RegistryObject<BlockItem> glowingGlassGray = ITEMS.register("gray_stained_glass_glowing",()-> new BlockItem(ModBlocks.glowingGlassGray.get(), defaultProps));
	public static RegistryObject<BlockItem> glowingGlassLightGray = ITEMS.register("light_gray_stained_glass_glowing",()-> new BlockItem(ModBlocks.glowingGlassLightGray.get(), defaultProps));
	public static RegistryObject<BlockItem> glowingGlassCyan = ITEMS.register("cyan_stained_glass_glowing",()-> new BlockItem(ModBlocks.glowingGlassCyan.get(), defaultProps));
	public static RegistryObject<BlockItem> glowingGlassPurple = ITEMS.register("purple_stained_glass_glowing",()-> new BlockItem(ModBlocks.glowingGlassPurple.get(), defaultProps));
	public static RegistryObject<BlockItem> glowingGlassBlue = ITEMS.register("blue_stained_glass_glowing",()-> new BlockItem(ModBlocks.glowingGlassBlue.get(), defaultProps));
	public static RegistryObject<BlockItem> glowingGlassBrown = ITEMS.register("brown_stained_glass_glowing",()-> new BlockItem(ModBlocks.glowingGlassBrown.get(), defaultProps));
	public static RegistryObject<BlockItem> glowingGlassGreen = ITEMS.register("green_stained_glass_glowing",()-> new BlockItem(ModBlocks.glowingGlassGreen.get(), defaultProps));
	public static RegistryObject<BlockItem> glowingGlassRed = ITEMS.register("red_stained_glass_glowing",()-> new BlockItem(ModBlocks.glowingGlassRed.get(), defaultProps));
	public static RegistryObject<BlockItem> glowingGlassBlack = ITEMS.register("black_stained_glass_glowing",()-> new BlockItem(ModBlocks.glowingGlassBlack.get(), defaultProps));
	
	public static RegistryObject<BlockItem> glowingGlassPaneWhite = ITEMS.register("white_stained_glass_pane_glowing",()-> new BlockItem(ModBlocks.glowingGlassPaneWhite.get(), defaultProps));
	public static RegistryObject<BlockItem> glowingGlassPaneOrange = ITEMS.register("orange_stained_glass_pane_glowing",()-> new BlockItem(ModBlocks.glowingGlassPaneOrange.get(), defaultProps));
	public static RegistryObject<BlockItem> glowingGlassPaneMagenta = ITEMS.register("magenta_stained_glass_pane_glowing",()-> new BlockItem(ModBlocks.glowingGlassPaneMagenta.get(), defaultProps));
	public static RegistryObject<BlockItem> glowingGlassPaneLightBlue = ITEMS.register("light_blue_stained_glass_pane_glowing",()-> new BlockItem(ModBlocks.glowingGlassPaneLightBlue.get(), defaultProps));
	public static RegistryObject<BlockItem> glowingGlassPaneYelow = ITEMS.register("yellow_stained_glass_pane_glowing",()-> new BlockItem(ModBlocks.glowingGlassPaneYellow.get(), defaultProps));
	public static RegistryObject<BlockItem> glowingGlassPaneLime = ITEMS.register("lime_stained_glass_pane_glowing",()-> new BlockItem(ModBlocks.glowingGlassPaneLime.get(), defaultProps));
	public static RegistryObject<BlockItem> glowingGlassPanePink = ITEMS.register("pink_stained_glass_pane_glowing",()-> new BlockItem(ModBlocks.glowingGlassPanePink.get(), defaultProps));
	public static RegistryObject<BlockItem> glowingGlassPaneGray = ITEMS.register("gray_stained_glass_pane_glowing",()-> new BlockItem(ModBlocks.glowingGlassPaneGray.get(), defaultProps));
	public static RegistryObject<BlockItem> glowingGlassPaneLightGray = ITEMS.register("light_gray_stained_glass_pane_glowing",()-> new BlockItem(ModBlocks.glowingGlassPaneLightGray.get(), defaultProps));
	public static RegistryObject<BlockItem> glowingGlassPaneCyan = ITEMS.register("cyan_stained_glass_pane_glowing",()-> new BlockItem(ModBlocks.glowingGlassPaneCyan.get(), defaultProps));
	public static RegistryObject<BlockItem> glowingGlassPanePurple = ITEMS.register("purple_stained_glass_pane_glowing",()-> new BlockItem(ModBlocks.glowingGlassPanePurple.get(), defaultProps));
	public static RegistryObject<BlockItem> glowingGlassPaneBlue = ITEMS.register("blue_stained_glass_pane_glowing",()-> new BlockItem(ModBlocks.glowingGlassPaneBlue.get(), defaultProps));
	public static RegistryObject<BlockItem> glowingGlassPaneBrown = ITEMS.register("brown_stained_glass_pane_glowing",()-> new BlockItem(ModBlocks.glowingGlassPaneBrown.get(), defaultProps));
	public static RegistryObject<BlockItem> glowingGlassPaneGreen = ITEMS.register("green_stained_glass_pane_glowing",()-> new BlockItem(ModBlocks.glowingGlassPaneGreen.get(), defaultProps));
	public static RegistryObject<BlockItem> glowingGlassPaneRed = ITEMS.register("red_stained_glass_pane_glowing",()-> new BlockItem(ModBlocks.glowingGlassPaneRed.get(), defaultProps));
	public static RegistryObject<BlockItem> glowingGlassPaneBlack = ITEMS.register("black_stained_glass_pane_glowing",()-> new BlockItem(ModBlocks.glowingGlassPaneBlack.get(), defaultProps));
}
