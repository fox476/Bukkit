package me.fox476;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerBedLeaveEvent;
import org.bukkit.event.player.PlayerShearEntityEvent;

public class eventHandler implements Listener {
	public eventHandler(Trollster plugin){
		plugin.getServer().getPluginManager().registerEvents(this, plugin);
	}
	
	@EventHandler
	public void sHeep(PlayerShearEntityEvent e){
		e.setCancelled(true);
		Player player = e.getPlayer();
		player.sendMessage(ChatColor.DARK_RED + "NOOOOOOOOOO!!!");
		player.damage(10);
	}
	@EventHandler        //blank is a place holder
	public void blank(PlayerBedLeaveEvent E){
		Player player = E.getPlayer();
		player.isDead();
	}
	
}