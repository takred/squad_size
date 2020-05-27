package takred;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static String getTitleBySquadSize(int squadSize, List<AbundanceConfiguration> titleList) {
        for (int i = 0; i < titleList.size(); i++) {
            System.out.print("Title = " + titleList.get(i).getTitle() + " ");
            System.out.println("SquadSize = " + titleList.get(i).getSquadSize());
        }

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
        titleList.sort();
        int squadSize = 23;
        String title = getTitleBySquadSize(squadSize, titleList.getAbundanceConfigurations());
        System.out.println(title);
    }
}
