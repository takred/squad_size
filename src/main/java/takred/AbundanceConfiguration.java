package takred;

import java.util.List;

public class AbundanceConfiguration {
    private final String title;
    private final int squadSize;

    public AbundanceConfiguration(String title, int squadSize) {
        this.title = title;
        this.squadSize = squadSize;
    }

    public String getTitle() {
        return title;
    }

    public int getSquadSize() {
        return squadSize;
    }

    public String a(int squadSize, List<AbundanceConfiguration> titleList) {
        int index = 0;
        if (squadSize < titleList.get(index).getSquadSize()) {
            return titleList.get(index).getTitle();
        }
        index = index + 1;
        if (squadSize < titleList.get(index).getSquadSize()) {
            return titleList.get(index).getTitle();
        }
        index = index + 1;
        if (squadSize < titleList.get(index).getSquadSize()) {
            return titleList.get(index).getTitle();
        }
        index = index + 1;
        if (squadSize < titleList.get(index).getSquadSize()) {
            return titleList.get(index).getTitle();
        }
        index = index + 1;
        if (squadSize < titleList.get(index).getSquadSize()) {
            return titleList.get(index).getTitle();
        }
        index = index + 1;
        return titleList.get(index).getTitle();
    }
}
