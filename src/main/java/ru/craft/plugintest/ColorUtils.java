package ru.craft.plugintest;

import org.bukkit.ChatColor;

public class ColorUtils {
    public static String toColor(String string) {
        return ChatColor.translateAlternateColorCodes('&', string);
    }
}
