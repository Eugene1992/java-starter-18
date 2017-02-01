package cw04;

import java.util.Scanner;

public class Binar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt(), b;
        String c = "";
        while (a != 1) {
            b = a % 2;
            c = b + c;
            a /= 2;
        }
        System.out.println(c);
    }
}
