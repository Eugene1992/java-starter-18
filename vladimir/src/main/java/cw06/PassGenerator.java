package cw06;


import java.util.Random;
import java.util.Scanner;

public class PassGenerator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter length of password");
        int length = scan.nextInt();
        String password = pass(length);
        System.out.println("Your password = "  + password);

    }

    static String pass(int length) {
        String pass = "", a = "";
        Random rand = new Random();
        for (int i = 0; i < length; i++) {
            int r = rand.nextInt(100);
            if (r < 50) {
                a = String.valueOf(rand.nextInt(9));
            }
            if (r > 50) {
                a = randLetter();
                int c = rand.nextInt(2);
                if (c == 1){
                    a = a.toUpperCase();
                }if (c == 2){
                    a = a.toLowerCase();
                }
            }
            pass = pass + a;
        }
        return pass;
    }

    static String randLetter() {
        Random rand = new Random();
        String letter = "";
        int r = rand.nextInt(26);
        switch (r){
            case 1: letter = "a"; break;
            case 2: letter = "b"; break;
            case 3: letter = "c"; break;
            case 4: letter = "d"; break;
            case 5: letter = "e"; break;
            case 6: letter = "f"; break;
            case 7: letter = "g"; break;
            case 8: letter = "h"; break;
            case 9: letter = "i"; break;
            case 10: letter = "j"; break;
            case 11: letter = "k"; break;
            case 12: letter = "l"; break;
            case 13: letter = "m"; break;
            case 14: letter = "n"; break;
            case 15: letter = "o"; break;
            case 16: letter = "p"; break;
            case 17: letter = "q"; break;
            case 18: letter = "r"; break;
            case 19: letter = "s"; break;
            case 20: letter = "t"; break;
            case 21: letter = "u"; break;
            case 22: letter = "v"; break;
            case 23: letter = "w"; break;
            case 24: letter = "x"; break;
            case 25: letter = "y"; break;
            case 26: letter = "z"; break;
            default: letter = "~";
        }
        return letter;
    }
}
