package me.khanh.plugins.mslayer;

import me.khanh.plugins.mslayer.compatibility.MythicMobsFactory;
import me.khanh.plugins.mslayer.compatibility.provided.MythicMobs;
import me.khanh.plugins.mslayer.compatibility.provided.MythicMobsLegacy;
import me.khanh.plugins.mslayer.utils.LoggerUtils;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;

public final class MSlayer extends JavaPlugin {

    private MythicMobsFactory mythicMobsFactory;

    @Override
    public void onEnable() {
        loadMythicMobs();
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }

    private void loadMythicMobs(){
        Plugin mythicMobsPlugin = getServer().getPluginManager().getPlugin("MythicMobs");
        assert mythicMobsPlugin != null;
        int version = Integer.parseInt(mythicMobsPlugin.getDescription().getVersion().split("\\.")[0]);
        LoggerUtils.info(String.valueOf(version));
        if (version > 4){
            mythicMobsFactory = new MythicMobs();
        } else {
            mythicMobsFactory = new MythicMobsLegacy();
        }
        for (String name : mythicMobsFactory.getMythicMobs()){
            LoggerUtils.info(name);
        }
    }
}
