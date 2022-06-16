package me.khanh.plugins.mslayer.compatibility;

import me.blackvein.quests.Quests;
import me.blackvein.quests.quests.IQuest;

import java.util.List;
import java.util.stream.Collectors;

public class QuestsFactory {
    public List<String> getQuests() {
        return Quests.getPlugin(Quests.class).getLoadedQuests().stream().map(IQuest::getId).collect(Collectors.toList());
    }
}
