package takred;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        GraduationTitleSquadSize titleList = new GraduationTitleSquadSize();
        titleList.sort();
        int squadSize = 23;
        String title = titleList.getTitleBySquadSize(squadSize);
        System.out.println(title);
    }
}
