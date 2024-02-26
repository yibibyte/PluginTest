package ru.craft.plugintest;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.plugin.java.JavaPlugin;
import org.jetbrains.annotations.NotNull;

import static org.bukkit.ChatColor.RED;
import static org.bukkit.ChatColor.YELLOW;

public final class PluginTest extends JavaPlugin {

    @Override
    public void onEnable() {
        getLogger().info(ChatColor.DARK_GREEN + "Plugin testPlug have been started!");
        getServer().getPluginManager().registerEvents(new EventHandler(), this);
        getCommand("message").setExecutor(new MessageCommand());
        getCommand("spawn").setExecutor(new SpawnCommand());

    }

    @Override
    public void onDisable() {
        getServer().getLogger().info(ChatColor.DARK_RED + "I've been started!");
    }
}

// PlayerMoveEvent - вызывается, когда игрок передвигается.
