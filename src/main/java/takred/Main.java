package takred;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static List<Class> graduationTitleSquadSize() {
        List<Class> titleList = new ArrayList<>();
        titleList.add(new Class("Мало", 10));
        titleList.add(new Class("Нормально", 30));
        titleList.add(new Class("Толпа", 50));
        titleList.add(new Class("Свора", 100));
        titleList.add(new Class("Орда", 500));
        titleList.add(new Class("Легион", 2000));
        return titleList;
    }

    public static String a(int squadSize, List<Class> titleList) {
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
        List<Class> titleList = new ArrayList<>(graduationTitleSquadSize());
        int squadSize = 23;
        String titleSquadSize = a(squadSize, titleList);
        System.out.println(titleSquadSize);
    }
}
