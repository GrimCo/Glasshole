package co.grim.glasshole.init;

import co.grim.glasshole.Glasshole;
import co.grim.glasshole.blocks.IBlockData;
import co.grim.glasshole.blocks.IlluminatedGlass;
import co.grim.glasshole.blocks.IlluminatedPane;
import co.grim.glasshole.blocks.IlluminatedStainedGlass;
import co.grim.glasshole.blocks.IlluminatedStainedPane;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.DyeColor;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.ArrayList;

public class ModBlocks
{
	public static final DeferredRegister<Block> BLOCKS = new DeferredRegister<>(ForgeRegistries.BLOCKS, Glasshole.MODID);
	public static ArrayList<IBlockData> registeredBlockData= new ArrayList<>();
	
	public static RegistryObject<IlluminatedGlass> glowingGlass = BLOCKS.register("glass_glowing", () -> new IlluminatedGlass(Blocks.GLASS));
	public static RegistryObject<IlluminatedPane> glowingGlassPane = BLOCKS.register("glass_pane_glowing", () -> new IlluminatedPane(Blocks.GLASS_PANE));
	public static RegistryObject<IlluminatedStainedGlass> glowingGlassWhite =BLOCKS.register("white_stained_glass_glowing", ()->new IlluminatedStainedGlass(DyeColor.WHITE, Blocks.WHITE_STAINED_GLASS));
	public static RegistryObject<IlluminatedStainedGlass> glowingGlassOrange = BLOCKS.register("orange_stained_glass_glowing", () -> new IlluminatedStainedGlass(DyeColor.ORANGE, Blocks.ORANGE_STAINED_GLASS));
	public static RegistryObject<IlluminatedStainedGlass> glowingGlassMagenta = BLOCKS.register("magenta_stained_glass_glowing", () -> new IlluminatedStainedGlass(DyeColor.MAGENTA, Blocks.MAGENTA_STAINED_GLASS));
	public static RegistryObject<IlluminatedStainedGlass> glowingGlassLightBlue = BLOCKS.register("light_blue_stained_glass_glowing", () -> new IlluminatedStainedGlass(DyeColor.LIGHT_BLUE, Blocks.LIGHT_BLUE_STAINED_GLASS));
	public static RegistryObject<IlluminatedStainedGlass> glowingGlassYellow = BLOCKS.register("yellow_stained_glass_glowing", () -> new IlluminatedStainedGlass(DyeColor.YELLOW, Blocks.YELLOW_STAINED_GLASS));
	public static RegistryObject<IlluminatedStainedGlass> glowingGlassLime = BLOCKS.register("lime_stained_glass_glowing", () -> new IlluminatedStainedGlass(DyeColor.LIME, Blocks.LIME_STAINED_GLASS));
	public static RegistryObject<IlluminatedStainedGlass> glowingGlassPink = BLOCKS.register("pink_stained_glass_glowing", () -> new IlluminatedStainedGlass(DyeColor.PINK, Blocks.PINK_STAINED_GLASS));
	public static RegistryObject<IlluminatedStainedGlass> glowingGlassGray = BLOCKS.register("gray_stained_glass_glowing", () -> new IlluminatedStainedGlass(DyeColor.GRAY, Blocks.GRAY_STAINED_GLASS));
	public static RegistryObject<IlluminatedStainedGlass> glowingGlassLightGray = BLOCKS.register("light_gray_stained_glass_glowing", () -> new IlluminatedStainedGlass(DyeColor.LIGHT_GRAY, Blocks.LIGHT_GRAY_STAINED_GLASS));
	public static RegistryObject<IlluminatedStainedGlass> glowingGlassCyan = BLOCKS.register("cyan_stained_glass_glowing", () -> new IlluminatedStainedGlass(DyeColor.CYAN, Blocks.CYAN_STAINED_GLASS));
	public static RegistryObject<IlluminatedStainedGlass> glowingGlassPurple = BLOCKS.register("purple_stained_glass_glowing", () -> new IlluminatedStainedGlass(DyeColor.PURPLE, Blocks.PURPLE_STAINED_GLASS));
	public static RegistryObject<IlluminatedStainedGlass> glowingGlassBlue = BLOCKS.register("blue_stained_glass_glowing", () -> new IlluminatedStainedGlass(DyeColor.BLUE, Blocks.BLUE_STAINED_GLASS));
	public static RegistryObject<IlluminatedStainedGlass> glowingGlassBrown = BLOCKS.register("brown_stained_glass_glowing", () -> new IlluminatedStainedGlass(DyeColor.BROWN, Blocks.BROWN_STAINED_GLASS));
	public static RegistryObject<IlluminatedStainedGlass> glowingGlassGreen = BLOCKS.register("green_stained_glass_glowing", () -> new IlluminatedStainedGlass(DyeColor.GREEN, Blocks.GREEN_STAINED_GLASS));
	public static RegistryObject<IlluminatedStainedGlass> glowingGlassRed = BLOCKS.register("red_stained_glass_glowing", () -> new IlluminatedStainedGlass(DyeColor.RED, Blocks.RED_STAINED_GLASS));
	public static RegistryObject<IlluminatedStainedGlass> glowingGlassBlack = BLOCKS.register("black_stained_glass_glowing", () -> new IlluminatedStainedGlass(DyeColor.BLACK, Blocks.BLACK_STAINED_GLASS));
	
	public static RegistryObject<IlluminatedStainedPane> glowingGlassPaneWhite =BLOCKS.register("white_stained_glass_pane_glowing", ()->new IlluminatedStainedPane(DyeColor.WHITE, Blocks.WHITE_STAINED_GLASS_PANE));
	public static RegistryObject<IlluminatedStainedPane> glowingGlassPaneOrange = BLOCKS.register("orange_stained_glass_pane_glowing", () -> new IlluminatedStainedPane(DyeColor.ORANGE, Blocks.ORANGE_STAINED_GLASS_PANE));
	public static RegistryObject<IlluminatedStainedPane> glowingGlassPaneMagenta = BLOCKS.register("magenta_stained_glass_pane_glowing", () -> new IlluminatedStainedPane(DyeColor.MAGENTA, Blocks.MAGENTA_STAINED_GLASS_PANE));
	public static RegistryObject<IlluminatedStainedPane> glowingGlassPaneLightBlue = BLOCKS.register("light_blue_stained_glass_pane_glowing", () -> new IlluminatedStainedPane(DyeColor.LIGHT_BLUE, Blocks.LIGHT_BLUE_STAINED_GLASS_PANE));
	public static RegistryObject<IlluminatedStainedPane> glowingGlassPaneYellow = BLOCKS.register("yellow_stained_glass_pane_glowing", () -> new IlluminatedStainedPane(DyeColor.YELLOW, Blocks.YELLOW_STAINED_GLASS_PANE));
	public static RegistryObject<IlluminatedStainedPane> glowingGlassPaneLime = BLOCKS.register("lime_stained_glass_pane_glowing", () -> new IlluminatedStainedPane(DyeColor.LIME, Blocks.LIME_STAINED_GLASS_PANE));
	public static RegistryObject<IlluminatedStainedPane> glowingGlassPanePink = BLOCKS.register("pink_stained_glass_pane_glowing", () -> new IlluminatedStainedPane(DyeColor.PINK, Blocks.PINK_STAINED_GLASS_PANE));
	public static RegistryObject<IlluminatedStainedPane> glowingGlassPaneGray = BLOCKS.register("gray_stained_glass_pane_glowing", () -> new IlluminatedStainedPane(DyeColor.GRAY, Blocks.GRAY_STAINED_GLASS_PANE));
	public static RegistryObject<IlluminatedStainedPane> glowingGlassPaneLightGray = BLOCKS.register("light_gray_stained_glass_pane_glowing", () -> new IlluminatedStainedPane(DyeColor.LIGHT_GRAY, Blocks.LIGHT_GRAY_STAINED_GLASS_PANE));
	public static RegistryObject<IlluminatedStainedPane> glowingGlassPaneCyan = BLOCKS.register("cyan_stained_glass_pane_glowing", () -> new IlluminatedStainedPane(DyeColor.CYAN, Blocks.CYAN_STAINED_GLASS_PANE));
	public static RegistryObject<IlluminatedStainedPane> glowingGlassPanePurple = BLOCKS.register("purple_stained_glass_pane_glowing", () -> new IlluminatedStainedPane(DyeColor.PURPLE, Blocks.PURPLE_STAINED_GLASS_PANE));
	public static RegistryObject<IlluminatedStainedPane> glowingGlassPaneBlue = BLOCKS.register("blue_stained_glass_pane_glowing", () -> new IlluminatedStainedPane(DyeColor.BLUE, Blocks.BLUE_STAINED_GLASS_PANE));
	public static RegistryObject<IlluminatedStainedPane> glowingGlassPaneBrown = BLOCKS.register("brown_stained_glass_pane_glowing", () -> new IlluminatedStainedPane(DyeColor.BROWN, Blocks.BROWN_STAINED_GLASS_PANE));
	public static RegistryObject<IlluminatedStainedPane> glowingGlassPaneGreen = BLOCKS.register("green_stained_glass_pane_glowing", () -> new IlluminatedStainedPane(DyeColor.GREEN, Blocks.GREEN_STAINED_GLASS_PANE));
	public static RegistryObject<IlluminatedStainedPane> glowingGlassPaneRed = BLOCKS.register("red_stained_glass_pane_glowing", () -> new IlluminatedStainedPane(DyeColor.RED, Blocks.RED_STAINED_GLASS_PANE));
	public static RegistryObject<IlluminatedStainedPane> glowingGlassPaneBlack = BLOCKS.register("black_stained_glass_pane_glowing", () -> new IlluminatedStainedPane(DyeColor.BLACK, Blocks.BLACK_STAINED_GLASS_PANE));
}
