package me.xBarkPuppy1.BCNCommands.Commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Survival implements CommandExecutor{
    public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args){
    	Player player = (Player) sender;
    	if(commandLabel.equalsIgnoreCase("survival")){
    		player.performCommand("server survival");
    	    return false;
    	}
        return false;
    }

}
