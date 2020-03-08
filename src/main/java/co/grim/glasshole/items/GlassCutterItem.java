package co.grim.glasshole.items;

import co.grim.glasshole.Glasshole;
import com.google.common.collect.Sets;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.material.Material;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentType;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.item.IItemTier;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ToolItem;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.ToolType;

import java.util.Set;

public class GlassCutterItem extends ToolItem
{
	private static final Set<Block> EFFECTIVE_ON =Sets.newHashSet(Blocks.GLASS, Blocks.GLASS_PANE);
	public static final ToolType TOOL_GLASSCUTTER = ToolType.get("glasscutter");
	
	public GlassCutterItem(IItemTier tier, float attackDamageIn, float attackSpeedIn)
	{
		super(attackDamageIn, attackSpeedIn, tier, EFFECTIVE_ON, new Item.Properties().group(Glasshole.itemGroup).addToolType(TOOL_GLASSCUTTER,tier.getHarvestLevel()));
	}
	
	@Override
	public boolean canHarvestBlock(BlockState blockIn)
	{
		return blockIn.getMaterial() == Material.GLASS || blockIn.getMaterial() == Material.ICE;
	}
	
	@Override
	public boolean canApplyAtEnchantingTable(ItemStack stack, Enchantment enchantment)
	{
		return  (enchantment.type == EnchantmentType.DIGGER || enchantment.type == EnchantmentType.BREAKABLE)  && enchantment != Enchantments.SILK_TOUCH;
	}
}
