package Es1;

public class Ex1 {

    public static boolean stringaPariDispari(String str) {
        if (str.length() % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean annoBisestile(int anno) {
        if (anno % 400 == 0) {
            return true;
        } else if (anno % 4 == 0 && anno % 100 != 0) {
            return true;
        } else {
            return false;
        }
    }
}
