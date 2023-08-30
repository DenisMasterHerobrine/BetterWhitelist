# BetterWhitelist
Very simple plugin to help BungeeCord players join `offline-mode` servers easily when UUID is being zeroed and their nickname has changed due to it. If the OfflinePlayer is in whitelist, then it will be possible to join the server. If the player is not in the whitelist, server will stop the player from logging in on the server.

Originally made for a event server, but feel free to use this on any other server. Supports both online and offline players.

Code is licensed under MIT License.

# Commands

`betterwhitelist enable` - enables the BetterWhitelist whitelisting filter, enabled by default, controlled using vanilla `/whitelist` command.
`betterwhitelist disabled` - disables the BetterWhitelist whitelisting filter, brings back vanilla whitelist behaviour.
