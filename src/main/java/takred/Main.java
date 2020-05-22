package takred;

public class Main {

    public static String a(int squadSize) {
        if (squadSize < 10) {
            return "Мало";
        }
        if (squadSize < 30) {
            return "Нормально";
        }
        if (squadSize < 50) {
            return "Много";
        }
        if (squadSize < 100) {
            return "Толпа";
        }
        if (squadSize < 500) {
            return "Орда";
        }
        return "Легион";
    }

    public static void main(String[] args) {
        int squadSize = 23;
        String titleSquadSize = a(squadSize);
        System.out.println(titleSquadSize);
    }
}
