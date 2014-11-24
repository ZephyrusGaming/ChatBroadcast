package com.zephyrusgaming.chatbroadcast;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.plugin.java.JavaPlugin;

public final class Main extends JavaPlugin {
	@Override
	public void onEnable() {
		getLogger().info("ChatBroadcast has been enabled!");
	}
	
	@Override
	public void onDisable(){
		
	}
	
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args ){
		if(cmd.getName().equalsIgnoreCase("test")){
			sender.sendMessage(ChatColor.AQUA + "It's Working guiz!");
			return true;
		}
		
		return false;
	}
}
