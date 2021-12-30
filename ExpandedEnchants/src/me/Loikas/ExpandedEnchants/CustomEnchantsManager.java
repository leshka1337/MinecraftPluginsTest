package me.Loikas.ExpandedEnchants;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemStack;

import me.Loikas.ExpandedEnchants.Enchants.*;

public class CustomEnchantsManager
{
	public static final Enchantment NOBREAKABLE = new UnbreakableEnchantment("ee_unbreakable", "Unbreakable", 1);
	public static final Enchantment DIRECT = new DirectEnchantment("ee_direct", "Direct", 1);
	public static final Enchantment AUTOSMELT = new AutoSmeltEnchantment("ee_autosmelt", "Autosmelt", 1);
	public static final Enchantment ANTIGRAVITY = new AntiGravityEnchantment("ee_antigravity", "Anti-Gravity", 1);
	public static final Enchantment BEHEADING = new BeheadingEnchantment("ee_beheading", "Beheading", 5);
	public static final Enchantment EXP_BOOST = new ExpBoostEnchantment("ee_expboost", "Experience Boost", 5);
	public static final Enchantment LAVA_WALKER = new LavaWalkerEnchantment("ee_lavawalker", "Lava Walker", 1);
	public static final Enchantment TRAVELER = new TravelerEnchantment("ee_traveler", "Traveler", 3);
	public static final Enchantment HEALTHBOOST = new HealthBoostEnchantment("ee_healthboost", "Health Boost", 5);
	public static final Enchantment STONEFISTS = new StoneFistsEnchantment("ee_stonefists", "Stone Fists", 3);
	public static final Enchantment LEAPING = new LeapingEnchantment("ee_leaping", "Leaping", 3);
	public static final Enchantment OWLEYES = new OwlEyesEnchantment("ee_owleyes", "Eyes of Owl", 1);
	public static final Enchantment HEAVENSLIGHTNESS = new HeavensLightnessEnchantment("ee_heavenslightness", "Heaven's Lightness", 1);
	public static final Enchantment THERMALPLATING = new ThermalPlatingEnchantment("ee_thermalplating", "Thermal Plating", 1);
	public static final Enchantment LIFESTEAL = new LifestealEnchantment("ee_lifesteal", "Lifesteal", 3);
	public static final Enchantment ICY = new IcyEnchantment("ee_icy", "Icy", 5);
	public static final Enchantment DEFLECT = new DeflectEnchantment("ee_deflect", "Deflect", 4);
	public static final Enchantment LUMBERJACK = new LumberjackEnchantment("ee_lumberjack", "Lumberjack", 5);
	public static final Enchantment VEINMINE = new VeinmineEnchantment("ee_veinmine", "Vein Miner", 5);
	public static final Enchantment WIDE = new WideEnchantment("ee_wide", "Wide", 1);
	public static final Enchantment FEEDINGMODULE = new FeedingModuleEnchantment("ee_feedingmodule", "Feeding Module", 1);
	public static final Enchantment STEPPING = new SteppingEnchantment("ee_stepping", "Stepping", 1);
	public static final Enchantment GOURMAND = new GourmandEnchantment("ee_gourmand", "Gourmand", 2);
	public static final Enchantment SHADOWSTEP = new ShadowStepEnchantment("ee_shadowstep", "Shadow Step", 5);
	public static final Enchantment SOULBOUND = new SoulboundEnchantment("ee_soulbound", "Soulbound", 1);
	public static final Enchantment REPLANTING = new ReplantingEnchantment("ee_replanting", "Replanting", 1);
	public static final Enchantment ELEMENTALPROTECTION = new ElementalProtectionEnchantment("ee_elemental", "Elemental Protection", 3);
	
	public static DoubleItemStack[] tradeCosts = new DoubleItemStack[] {
			new DoubleItemStack(new ItemStack(Material.EMERALD, 48), new ItemStack(Material.DIAMOND, 16)), //antigravity
			new DoubleItemStack(new ItemStack(Material.EMERALD, 32), new ItemStack(Material.DIAMOND, 16)), //autosmelt
			new DoubleItemStack(new ItemStack(Material.EMERALD, 48), new ItemStack(Material.WITHER_SKELETON_SKULL, 1)), //beheading
			new DoubleItemStack(new ItemStack(Material.EMERALD, 48), new ItemStack(Material.DIAMOND, 16)), //deflect
			new DoubleItemStack(new ItemStack(Material.EMERALD, 48), new ItemStack(Material.DIAMOND, 16)), //direct
			new DoubleItemStack(new ItemStack(Material.EMERALD, 64), new ItemStack(Material.END_CRYSTAL, 16)), //elementalprotection
			new DoubleItemStack(new ItemStack(Material.EMERALD, 48), new ItemStack(Material.DIAMOND, 16)), //owleyes
			new DoubleItemStack(new ItemStack(Material.EMERALD, 64), new ItemStack(Material.DIAMOND, 32)), //expboost
			new DoubleItemStack(new ItemStack(Material.EMERALD, 32), null), //feedingmodule
			new DoubleItemStack(new ItemStack(Material.EMERALD, 48), new ItemStack(Material.DIAMOND, 16)), //gourmand
			new DoubleItemStack(new ItemStack(Material.EMERALD, 64), new ItemStack(Material.ENCHANTED_GOLDEN_APPLE, 5)), //healthboost
			new DoubleItemStack(new ItemStack(Material.EMERALD, 48), new ItemStack(Material.DIAMOND, 16)), //heavenslightness
			new DoubleItemStack(new ItemStack(Material.EMERALD, 32), new ItemStack(Material.DIAMOND, 32)), //icy
			new DoubleItemStack(new ItemStack(Material.EMERALD, 48), new ItemStack(Material.DIAMOND, 16)), //lavawalker
			new DoubleItemStack(new ItemStack(Material.EMERALD, 48), new ItemStack(Material.DIAMOND, 16)), //leaping
			new DoubleItemStack(new ItemStack(Material.EMERALD, 64), new ItemStack(Material.DIAMOND, 32)), //lifesteal
			new DoubleItemStack(new ItemStack(Material.EMERALD, 48), new ItemStack(Material.NETHERITE_SCRAP, 8)), //lumberjack
			new DoubleItemStack(new ItemStack(Material.EMERALD, 32), null), //replanting
			new DoubleItemStack(new ItemStack(Material.EMERALD, 64), null), //shadowstep
			new DoubleItemStack(new ItemStack(Material.EMERALD, 64), new ItemStack(Material.DIAMOND, 48)), //soulbound
			new DoubleItemStack(new ItemStack(Material.EMERALD, 64), new ItemStack(Material.DIAMOND, 48)), //stepping
			new DoubleItemStack(new ItemStack(Material.EMERALD, 64), new ItemStack(Material.NETHERITE_SCRAP, 16)), //stonefists
			new DoubleItemStack(new ItemStack(Material.EMERALD, 64), new ItemStack(Material.NETHERITE_SCRAP, 8)), //thermalplating
			new DoubleItemStack(new ItemStack(Material.EMERALD, 48), new ItemStack(Material.DIAMOND, 16)), //traveler
			new DoubleItemStack(new ItemStack(Material.EMERALD, 64), new ItemStack(Material.NETHER_STAR, 1)), //unbreakable
			new DoubleItemStack(new ItemStack(Material.EMERALD, 48), new ItemStack(Material.NETHERITE_SCRAP, 8)), //veinmine
			new DoubleItemStack(new ItemStack(Material.EMERALD, 48), new ItemStack(Material.NETHERITE_SCRAP, 16)), //wide			
	};
	
	public static StringList[] descriptions = new StringList[] {
		new StringList(new String[] { "Make your arrows fly true", "Arrows won't be affected by gravity anymore" }),
		new StringList(new String[] { "Automatically smelt all ores you mine", "Compatible with fortune and direct" }),
		new StringList(new String[] { "Higher chance to drop mob heads", "Each level adds + 5% chance", "Max level is 5" }),
		new StringList(new String[] { "Deflect damage every 30 seconds", "Takes an emerald every time", "Each level lowers the cooldown by 1 second"}),
		new StringList(new String[] { "Teleport broken blocks or killed mob items", "directly into your inventory" }),
		new StringList(new String[] { "Protects you against more damage sources", "which add up if you increase the level.", "- Level 1: Poison", "- Level 2: Wither", "- Level 3: Void" }),
		new StringList(new String[] { "No more potions of night vision", "see everything" }),
		new StringList(new String[] { "Chance to double the xp you get", "each level increases the chance by 15%", "Max level is 5" }),
		new StringList(new String[] { "Automatically eat foods for you", "takes the left most food in your inventory.", "Compatible with gourmand" }),
		new StringList(new String[] { "Food becomes more delicious and", "restores more food points when you eat it.", "Compatible with feeding module" }),
		new StringList(new String[] { "Add one heart for each level", "Max level is 5" }),
		new StringList(new String[] { "Permanent slow falling", "never have fall damage again" }),
		new StringList(new String[] { "Add a slowness effect to every", "entity you hit. Cooldown of 10 seconds.", "Makes players unable to jump", "Level increases the slowness level" }),
		new StringList(new String[] { "Places a block of basalt", "under you every time you walk", "over lava" }),
		new StringList(new String[] { "Always have a jump boost effect", "Max level is 3" }),
		new StringList(new String[] { "Steal some of the hearts your enemy had", "Half a heart per level", "Max level is 3"}),
		new StringList(new String[] { "Break the whole tree when you break one block", "Each level decreases the food cost"}),
		new StringList(new String[] { "Whenever you right click a full grown crop", "it automatically replants it" }),
		new StringList(new String[] { "Makes it harder for mobs to hear you", "Decreases follow distance" }),
		new StringList(new String[] { "Preserve your item on death.", "You will keep all items with soulbound", "after you die.", "If you leave without respawning", "your items can still be lost" }),
		new StringList(new String[] { "Makes it easier to walk up", "single blocks" }),
		new StringList(new String[] { "Increase your attack damage significantly", "Max level is 3" }),
		new StringList(new String[] { "Get permanent fire resistance", "BUT ONLY IF EVERY ARMOR PIECE", "HAS THE ENCHANT" }),
		new StringList(new String[] { "Get a permanent speed boost", "Max level is 3" }),
		new StringList(new String[] { "Makes a tool truely unbreakable"}),
		new StringList(new String[] { "When you mine one ore", "it mines all" , "Each level decreases the food cost"}),
		new StringList(new String[] { "Mine 3x3 to make your life easier", "Also works with right clicking on", "hoes, axes and shovels" }),
	};
	
	public static StringList[] enchantableOn = new StringList[] {
		new StringList(new String[] { "- Bows" }),
		new StringList(new String[] { "- Pickaxes"}),
		new StringList(new String[] { "- Axes"}),
		new StringList(new String[] { "- Chestplates"}),
		new StringList(new String[] { "- Pickaxes", "- Axes", "- Swords", "- Hoe's", "- Shears", "- Shovels", "- Tridents", "- Crossbows", "- Bows"}),
		new StringList(new String[] { "- Chestplates"}),
		new StringList(new String[] { "- Helmets"}),
		new StringList(new String[] { "- Chestplates"}),
		new StringList(new String[] { "- Helmets"}),
		new StringList(new String[] { "- Helmets"}),
		new StringList(new String[] { "- Chestplates"}),
		new StringList(new String[] { "- Chestplates"}),
		new StringList(new String[] { "- Swords", "- Axes"}),
		new StringList(new String[] { "- Boots" }),
		new StringList(new String[] { "- Boots"}),
		new StringList(new String[] { "- Swords"}),
		new StringList(new String[] { "- Axes"}),
		new StringList(new String[] { "- Hoe's"}),
		new StringList(new String[] { "- Boots"}),
		new StringList(new String[] { "- All enchantable items"}),
		new StringList(new String[] { "- Boots"}),
		new StringList(new String[] { "- Chestplates", "- Elytra's"}),
		new StringList(new String[] { "- Helmets", "- Chestplates", "- Leggings", "- Boots"}),
		new StringList(new String[] { "- Leggings"}),
		new StringList(new String[] { "- All items with durability"}),
		new StringList(new String[] { "- Pickaxes"}),
		new StringList(new String[] { "- Axes", "- Pickaxes", "- Shovels", "- Hoe's", "- Shears"}),
	};
	
	public static StringList[] conflictsWith = new StringList[] {
			new StringList(new String[] { "- Nothing" }),
			new StringList(new String[] { "- Silk Touch"}),
			new StringList(new String[] { "- Nothing"}),
			new StringList(new String[] { "- Nothing"}),
			new StringList(new String[] { "- Nothing"}),
			new StringList(new String[] { "- Thermal Plating"}),
			new StringList(new String[] { "- Nothing"}),
			new StringList(new String[] { "- Nothing"}),
			new StringList(new String[] { "- Nothing"}),
			new StringList(new String[] { "- Nothing"}),
			new StringList(new String[] { "- Nothing"}),
			new StringList(new String[] { "- Nothing"}),
			new StringList(new String[] { "- Fire Aspect"}),
			new StringList(new String[] { "- Depth Strider", "- Frost Walker" }),
			new StringList(new String[] { "- Stepping"}),
			new StringList(new String[] { "- Nothing"}),
			new StringList(new String[] { "- Wide"}),
			new StringList(new String[] { "- Wide"}),
			new StringList(new String[] { "- Nothing"}),
			new StringList(new String[] { "- Nothing"}),
			new StringList(new String[] { "- Leaping"}),
			new StringList(new String[] { "- Nothing"}),
			new StringList(new String[] { "- Elemental Protection"}),
			new StringList(new String[] { "- Nothing"}),
			new StringList(new String[] { "- Infinity"}),
			new StringList(new String[] { "- Wide"}),
			new StringList(new String[] { "- Lumberjack", "- Veinmine"}),
		};
	
	public static ArrayList<Enchantment> custom_enchants = new ArrayList<Enchantment>();
	
	public static int GetIndex(Enchantment ench) {
		for(int i = 0; i < custom_enchants.size(); i++) if(custom_enchants.get(i).equals(ench)) return i;
		return -1;
	}
	
	public static void Register() 
	{		
		boolean[] registeredEnchs = new boolean[custom_enchants.size()];
		for(int i = 0; i < custom_enchants.size(); i++) {
			if(Arrays.stream(Enchantment.values()).collect(Collectors.toList()).contains(custom_enchants.get(i))) {
				registeredEnchs[i] = true;
			}
		}
		
		for(int i = 0; i < custom_enchants.size(); i++) {
			if(!registeredEnchs[i]) {
				RegisterEnchantment(custom_enchants.get(i));
			}
		}
			
	}
	
	@SuppressWarnings("deprecation")
	public static void RegisterEnchantment(Enchantment enchantment) 
	{
		boolean registered = true;
		try 
		{
			Field f = Enchantment.class.getDeclaredField("acceptingNew");
			f.setAccessible(true);
			f.set(null, true);
			Enchantment.registerEnchantment(enchantment);
		} 
		catch (Exception e)
		{
			registered = false;
			e.printStackTrace();
		}
		if(registered) Bukkit.getServer().getConsoleSender().sendMessage(ChatColor.LIGHT_PURPLE + "ExpandedEnchants" + ChatColor.WHITE + ": '"+ enchantment.getName() + "' was succesfully registered!");
			
	}

	 
}
