package dev.denismasterherobrine.betterwhitelist.listener;

import net.kyori.adventure.text.Component;
import org.bukkit.Bukkit;
import org.bukkit.OfflinePlayer;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerLoginEvent;

import java.util.Set;
import java.util.UUID;

public class WhitelistListener implements Listener {
    public static boolean state = true;

    @EventHandler(ignoreCancelled = true)
    public void onJoin(PlayerLoginEvent event) {
        if (!state) return;

        Player player = event.getPlayer();
        String playerName = player.getName();

        if (playerName.contains("-")) {
            String raw = "00000000-0000-0000-0000-000000000";
            String prefix = playerName.substring(player.getName().length() - 3, player.getName().length());

            UUID id = UUID.fromString(raw + prefix);

            Set<UUID> uuids = Bukkit.getServer().getWhitelistedPlayers().stream().map(OfflinePlayer::getUniqueId).collect(java.util.stream.Collectors.toSet());

            if (!(uuids.contains(id))) event.disallow(PlayerLoginEvent.Result.KICK_WHITELIST, "Not whitelisted!");

            player.setCustomName(playerName.substring(0, playerName.length() - 4));
        } else {
            Set<OfflinePlayer> whitelistedPlayers = Bukkit.getServer().getWhitelistedPlayers();

            if (!(whitelistedPlayers.contains(player))) event.disallow(PlayerLoginEvent.Result.KICK_WHITELIST, "Not whitelisted!");
        }
    }
}
