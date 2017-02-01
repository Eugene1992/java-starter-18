package cw04;

import java.util.Scanner;

public class Binar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt(), b;
        String res = "";
        while (a != 1) {
            res = a % 2 + res;
            a /= 2;
        }
        System.out.println(res);
    }
}
