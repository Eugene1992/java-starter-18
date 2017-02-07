package cw06;


import java.util.Scanner;

public class Methods1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number of strings");
        int n = scan.nextInt();
        printStr(n);
    }


    static void printStr(int n) {
        for (int i = 1; i <= n; i++) {
            System.out.println("Hello world number = " + i);

        }
    }
}