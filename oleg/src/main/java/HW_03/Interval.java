package HW_03;

import java.util.Scanner;

public class Interval {
    public static void main(String args []) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Tapez le chiffre entre 0 et 100");
        int num = scan.nextInt();
        if (num >= 0 && num <= 14)
            System.out.println("Votre chiffre est dans linterval [0..14]");
        else if (num >= 15 && num <= 35)
            System.out.println("Votre chiffre est dans l'interval [15..35]");
        else if (num >= 36 && num <= 50)
            System.out.println("Votre chiffre est dans l'interval [36..50]");
        else if (num >= 51 && num <= 100)
            System.out.println("Votre chiffre est dans l'interval [51..100]");
        else System.out.println("Votre chiffre excede l'interval superpose [0..100]");
    }
}
