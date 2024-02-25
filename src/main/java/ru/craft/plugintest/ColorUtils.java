package ru.craft.plugintest;

import org.bukkit.ChatColor;

public class UtilsColor {
    public static String color(String string) {
        return ChatColor.translateAlternateColorCodes('&', string);
    }
}
