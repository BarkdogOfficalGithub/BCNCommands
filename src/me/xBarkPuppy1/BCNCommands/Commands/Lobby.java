package me.xBarkPuppy1.BCNCommands.Commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Hub implements CommandExecutor{
    public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args){
    	Player player = (Player) sender;
    	if(commandLabel.equalsIgnoreCase("lobby")){
    		player.performCommand("server lobby");
    	    return false;
    	}
        return false;
    }

}
