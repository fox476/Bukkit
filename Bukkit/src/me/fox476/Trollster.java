package me.fox476;

import org.bukkit.plugin.java.JavaPlugin;

public class Trollster extends JavaPlugin {
	
	@Override
	public void onEnable() {
		new eventHandler(this);
	}
	@Override
	public void onDisable(){
		
	}

}