package dev.denismasterherobrine.betterwhitelist;

import dev.denismasterherobrine.betterwhitelist.commands.BetterWhitelistCommand;
import dev.denismasterherobrine.betterwhitelist.listener.WhitelistListener;
import org.bukkit.plugin.java.JavaPlugin;

public final class BetterWhitelist extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        this.getServer().getPluginManager().registerEvents(new WhitelistListener(), this);
        // Register command
        this.getCommand("betterwhitelist").setExecutor(new BetterWhitelistCommand());
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
