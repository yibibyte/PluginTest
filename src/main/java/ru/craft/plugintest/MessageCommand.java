package ru.craft.plugintest;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

import static ru.craft.plugintest.ColorUtils.toColor;

public class MessageCommand implements CommandExecutor {
    @Override
    public boolean onCommand(@NotNull CommandSender commandSender, @NotNull Command command, @NotNull String s, @NotNull String[] strings) {
        if (!(commandSender instanceof Player)) {
            commandSender.sendMessage(toColor("Команда доступна только игрокам!"));
            return true;
        }
        Player player = (Player) commandSender;
        if (!player.hasPermission("plugintest.message")) {
            commandSender.sendMessage(toColor("&c&lУ Вас не достаточно Прав!"));
            return true;
        }
        String message = String.join(" ", strings);
        player.sendMessage(toColor(message));
        return true;
    }
}
