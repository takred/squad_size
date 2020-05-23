package takred;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static String a(int squadSize, List<AbundanceConfiguration> titleList) {
        for (int i = 0; i < titleList.size(); i++) {
            if (squadSize < titleList.get(i).getSquadSize()) {
                return titleList.get(i).getTitle();
            }
        }
        return "Какая-то фигня.";
    }

    public static void main(String[] args) {
        GraduationTitleSquadSize titleList = new GraduationTitleSquadSize();
        int squadSize = 23;
        String title = a(squadSize, titleList.getAbundanceConfigurations());
        System.out.println(title);
    }
}
