package me.khanh.plugins.mslayer.compatibility.provided;

import me.khanh.plugins.mslayer.compatibility.MythicMobsFactory;

import java.util.ArrayList;
import java.util.List;

public class MythicMobsLegacy implements MythicMobsFactory {
    @Override
    public List<String> getMythicMobs() {
        return new ArrayList<>(io.lumine.xikage.mythicmobs.MythicMobs.inst().getMobManager().getMobNames());
    }
}
