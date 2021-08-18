package me.sfiguz7.transcendence.lists;

import me.mrCookieSlime.Slimefun.Lists.RecipeType;
import me.mrCookieSlime.Slimefun.cscorelib2.item.CustomItem;
import me.sfiguz7.transcendence.TranscEndence;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;

public class TERecipeType {

    static final TranscEndence instance = TranscEndence.getInstance();

    public static final RecipeType QUIRP_OSCILLATOR = new RecipeType(new NamespacedKey(instance, "quirp_oscillator"),
        new CustomItem(Material.PURPUR_BLOCK, "&9粒子生产机", "&a&o需要用粒子生产机来获得此物品")
    );
    public static final RecipeType QUIRP_ANNIHILATOR = new RecipeType(new NamespacedKey(instance, "quirp_annihilator"),
        new CustomItem(Material.YELLOW_CONCRETE, "&9粒子冷凝机", "&a&o需要用粒子冷凝机来获得此物品" +
            "")
    );
    public static final RecipeType STABILIZER = new RecipeType(new NamespacedKey(instance, "stabilizer"),
        new CustomItem(Material.BLACK_CONCRETE, "&9稳定器", "&a&o需要用稳定器来获得此物品")
    );
    public static final RecipeType NANOBOT_CRAFTER = new RecipeType(new NamespacedKey(instance, "nanobot_crafter"),
        TEItems.NANOBOT_CRAFTER, new String[0]
    );
    public static final RecipeType ZOT_OVERLOADER = new RecipeType(new NamespacedKey(instance, "zot_overloader"),
        new CustomItem(Material.WHITE_CONCRETE, "&9粒子过载机", "需要用粒子过载机来获得此物品", "" +
            "")
    );
}
