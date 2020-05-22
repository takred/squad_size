package takred;

public class AbundanceConfiguration {
    private final String titleSquadSize;
    private final int squadSize;

    public AbundanceConfiguration(String titleSquadSize, int squadSize) {
        this.titleSquadSize = titleSquadSize;
        this.squadSize = squadSize;
    }

    public String getTitleSquadSize() {
        return titleSquadSize;
    }

    public int getSquadSize() {
        return squadSize;
    }
}
