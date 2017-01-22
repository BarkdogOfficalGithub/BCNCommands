+package me.xBarkPuppy1.BCNCommands.Commands;
 +
 +import org.bukkit.command.Command;
 +import org.bukkit.command.CommandExecutor;
 +import org.bukkit.command.CommandSender;
 +import org.bukkit.entity.Player;
 +
 +import net.md_5.bungee.api.ChatColor;
 +
 +public class BCNInfo implements CommandExecutor{
 +	
 +    public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args){
 +    	Player player = (Player) sender;
 +    	if(commandLabel.equalsIgnoreCase("bfinfo")){
 +    			player.sendMessage(ChatColor.AQUA + "BarkCraftNetwork's Root Superusers are xBarkpuppy1 and CPacket.");
 +    			player.sendMessage(ChatColor.AQUA + "BarkCraftNetwork's Lead-Developer is ");
 +    			player.sendMessage(ChatColor.AQUA + "Forums page: ");
 +    			player.sendMessage(ChatColor.AQUA + "GitHub: https://github.com/BarkCraftNetwork");
 +    	    return false;
 +    	}
 +        return false;
 +    }
 +}
