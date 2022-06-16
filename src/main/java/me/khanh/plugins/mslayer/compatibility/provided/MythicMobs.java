package me.khanh.plugins.mslayer.compatibility.provided;

import io.lumine.mythic.api.MythicProvider;
import me.khanh.plugins.mslayer.compatibility.MythicMobsFactory;

import java.util.ArrayList;
import java.util.List;

public class MythicMobs implements MythicMobsFactory {
    @Override
    public List<String> getMythicMobs() {
        return new ArrayList<>(MythicProvider.get().getMobManager().getMobNames());
    }
}
