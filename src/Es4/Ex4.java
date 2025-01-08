package Es4;

import java.util.Scanner;

public class Ex4 {

    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Scrivi un numero e premi invio");
        int test = scan.nextInt();
        countdown(test);
        scan.close();
    }

    public static void countdown(int num) {
        System.out.println("Conto alla rovescia" + num + " a 0");

        for (int i = num; i >= 0; i--) {
            System.out.println(i);
        }
    }

}

