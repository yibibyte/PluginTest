package ru.craft.plugintest;

import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.player.PlayerJoinEvent;

import java.net.http.WebSocket;

public class EventHandler implements Listener {
    @org.bukkit.event.EventHandler
    public void onJoin(PlayerJoinEvent eventPlayer) {
        Player player = eventPlayer.getPlayer();
        player.sendMessage("Привет PlugTest");
    }

    @org.bukkit.event.EventHandler
    public void onBreak(BlockBreakEvent eventBreak) {
        Player player = eventBreak.getPlayer();
        player.sendMessage("Ты сломал меня ");
    }

}
