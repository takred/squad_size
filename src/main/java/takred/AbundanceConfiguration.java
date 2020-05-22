package takred;

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
}
