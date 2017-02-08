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
        char symb;
        int exit;
        for (int i = 0; i < length; i++) {
            exit = 0;
            do{
                symb = (char) (rand.nextInt(123));
                if(symb >47 && symb < 58 | symb > 64 && symb <91 | symb > 96 && symb < 123){
                    pass = pass + symb;
                    exit = 1;
                }else exit = 0;

            }while(exit == 0);
        }
        return pass;
    }
}
