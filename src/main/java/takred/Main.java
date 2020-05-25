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

    public static List<AbundanceConfiguration> getSortAscending(List<AbundanceConfiguration> titleList) {
        List<AbundanceConfiguration> sortTitleList = new ArrayList<>();
        AbundanceConfiguration firstElement = new AbundanceConfiguration(titleList.get(0));
        for (int i = 0; i < titleList.size(); i++) {
            AbundanceConfiguration abundanceConfiguration = titleList.get(i);
            if (abundanceConfiguration.getSquadSize() < firstElement.getSquadSize()) {
                firstElement = new AbundanceConfiguration(abundanceConfiguration);
            }
        }
        sortTitleList.add(firstElement);

        for (int i = 1; i < titleList.size(); i++) {
            AbundanceConfiguration currentElement = new AbundanceConfiguration(null, Integer.MAX_VALUE);
            for (int j = 0; j < titleList.size(); j++) {
                int squadSize = titleList.get(j).getSquadSize();
                if (squadSize > sortTitleList.get(i - 1).getSquadSize()
                        && squadSize < currentElement.getSquadSize()) {
                    currentElement = new AbundanceConfiguration(titleList.get(j));
                }
            }
            sortTitleList.add(currentElement);
        }
        return sortTitleList;
    }

    public static void main(String[] args) {
        GraduationTitleSquadSize titleList = new GraduationTitleSquadSize();
        int squadSize = 23;
        String title = getTitleBySquadSize(squadSize, getSortAscending(titleList.getAbundanceConfigurations()));
        System.out.println(title);
    }
}
