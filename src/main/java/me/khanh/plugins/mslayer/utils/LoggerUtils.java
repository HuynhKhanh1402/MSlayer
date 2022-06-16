package me.khanh.plugins.mslayer.utils;

import me.khanh.plugins.mslayer.MSlayer;

public class LoggerUtils {
    private static final MSlayer plugin = MSlayer.getPlugin(MSlayer.class);

    public static void info(String message){
        plugin.getLogger().info(StringUtils.color(message));
    }
}
