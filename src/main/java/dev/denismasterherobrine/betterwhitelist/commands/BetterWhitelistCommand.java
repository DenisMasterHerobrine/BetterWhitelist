package dev.denismasterherobrine.betterwhitelist.commands;

import dev.denismasterherobrine.betterwhitelist.listener.WhitelistListener;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.jetbrains.annotations.NotNull;

public class BetterWhitelistCommand implements CommandExecutor {
    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label, @NotNull String[] args) {
        // Enable or disable whitelist listener
        if (args.length == 0) {
            return false;
        }

        if (args[0].equalsIgnoreCase("enable")) {
            sender.sendMessage("BetterWhitelist enabled! Now whitelisted players can join.");
            WhitelistListener.state = true;

            return true;
        }

        if (args[0].equalsIgnoreCase("disable")) {
            sender.sendMessage("BetterWhitelist disabled. Now vanilla whitelist system is working.");
            WhitelistListener.state = false;

            return true;
        }

        return true;
    }
}
