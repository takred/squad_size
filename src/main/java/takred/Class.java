package takred;

public class Class {
    private final String titleSquadSize;
    private final int squadSize;

    public Class(String titleSquadSize, int squadSize) {
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
