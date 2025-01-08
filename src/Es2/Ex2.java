package Es2;

public class Ex2 {
    public static String stampaNumero(int num) {
        String result;
        switch (num) {
            case 0: {
                result = "zero";
                break;
            }
            case 1: {
                result = "uno";
                break;
            }
            case 2: {
                result = "due";
                break;
            }
            case 3: {
                result = "tre";
                break;
            }
            default:
                result = "Numero non compreso tra 0 e 3, impossibile convertire";
        }
        return result;
    }
}
