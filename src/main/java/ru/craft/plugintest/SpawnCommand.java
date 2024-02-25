package ru.craft.plugintest;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

import static ru.craft.plugintest.ColorUtils.toColor;

public class SpawnCommand implements CommandExecutor {
    private final Location spawn = new Location(Bukkit.getWorld("world"), 0, 90, 0);
    @Override
    public boolean onCommand(@NotNull CommandSender commandSender, @NotNull Command command, @NotNull String s, @NotNull String[] strings) {
        if (!(commandSender instanceof Player)) {
            commandSender.sendMessage(toColor("Команда доступна только игрокам!"));
            return true;
        }
        Player player = (Player) commandSender;
        if (!player.hasPermission("plugintest.spawn")) {
            commandSender.sendMessage(toColor("&c&lУ Вас не достаточно Прав!"));
            return true;
        }
        player.teleport(spawn);
        player.sendMessage("&d&lТелепортирован на Spawn");
        return true;
    }
}
