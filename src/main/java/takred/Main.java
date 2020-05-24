package takred;

import java.util.List;

public class Main {
    public static String getTitleBySquadSize(int squadSize, List<AbundanceConfiguration> titleList) {
        for (int i = 0; i < titleList.size(); i++) {
            AbundanceConfiguration abundanceConfiguration = titleList.get(i);
            if (squadSize < abundanceConfiguration.getSquadSize()) {
                return abundanceConfiguration.getTitle();
            }
        }
        return "Какая-то фигня.";
    }

    public static void main(String[] args) {
        GraduationTitleSquadSize titleList = new GraduationTitleSquadSize();
        int squadSize = 23;
        String title = getTitleBySquadSize(squadSize, titleList.getAbundanceConfigurations());
        System.out.println(title);
    }
}
