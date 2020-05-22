package takred;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static List<AbundanceConfiguration> graduationTitleSquadSize() {
        List<AbundanceConfiguration> titleList = new ArrayList<>();
        titleList.add(new AbundanceConfiguration("Мало", 10));
        titleList.add(new AbundanceConfiguration("Нормально", 30));
        titleList.add(new AbundanceConfiguration("Толпа", 50));
        titleList.add(new AbundanceConfiguration("Свора", 100));
        titleList.add(new AbundanceConfiguration("Орда", 500));
        titleList.add(new AbundanceConfiguration("Легион", 2000));
        return titleList;
    }

    public static String a(int squadSize, List<AbundanceConfiguration> titleList) {
        int index = 0;
        if (squadSize < 10) {
            return titleList.get(index).getTitleSquadSize();
        }
        index = index + 1;
        if (squadSize < 30) {
            return titleList.get(index).getTitleSquadSize();
        }
        index = index + 1;
        if (squadSize < 50) {
            return titleList.get(index).getTitleSquadSize();
        }
        index = index + 1;
        if (squadSize < 100) {
            return titleList.get(index).getTitleSquadSize();
        }
        index = index + 1;
        if (squadSize < 500) {
            return titleList.get(index).getTitleSquadSize();
        }
        index = index + 1;
        return titleList.get(index).getTitleSquadSize();
    }

    public static void main(String[] args) {
        List<AbundanceConfiguration> titleList = new ArrayList<>(graduationTitleSquadSize());
        int squadSize = 23;
        String titleSquadSize = a(squadSize, titleList);
        System.out.println(titleSquadSize);
    }
}
