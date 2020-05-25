package takred;

import java.util.List;

public class AbundanceConfiguration {
    private final String title;
    private final int squadSize;

    public AbundanceConfiguration(String title, int squadSize) {
        this.title = title;
        this.squadSize = squadSize;
    }

    public AbundanceConfiguration(AbundanceConfiguration abundanceConfiguration) {
        this.title = abundanceConfiguration.getTitle();
        this.squadSize = abundanceConfiguration.getSquadSize();
    }

    public String getTitle() {
        return title;
    }

    public int getSquadSize() {
        return squadSize;
    }

    public boolean equals(AbundanceConfiguration abundanceConfiguration) {
        if (!abundanceConfiguration.getTitle().equals(this.title)) {
            return false;
        }
        if (abundanceConfiguration.getSquadSize() != this.getSquadSize()) {
            return false;
        }
        return true;
    }
}
