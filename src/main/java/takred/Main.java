package takred;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static List<String> graduationTitleSquadSize() {
        List<String> titleList = new ArrayList<>();
        titleList.add("Мало");
        titleList.add("Нормально");
        titleList.add("Толпа");
        titleList.add("Орда");
        titleList.add("Легион");
        return titleList;
    }

    public static String a(int squadSize, List<String> titleList) {
        int index = 0;
        if (squadSize < 10) {
            return titleList.get(index);
        }
        index = index + 1;
        if (squadSize < 30) {
            return titleList.get(index);
        }
        index = index + 1;
        if (squadSize < 50) {
            return titleList.get(index);
        }
        index = index + 1;
        if (squadSize < 100) {
            return titleList.get(index);
        }
        index = index + 1;
        if (squadSize < 500) {
            return titleList.get(index);
        }
        index = index + 1;
        return titleList.get(index);
    }

    public static void main(String[] args) {
        List<String> titleList = new ArrayList<>(graduationTitleSquadSize());
        int squadSize = 23;
        String titleSquadSize = a(squadSize, titleList);
        System.out.println(titleSquadSize);
    }
}
