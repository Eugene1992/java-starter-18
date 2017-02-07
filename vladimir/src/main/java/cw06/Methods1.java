package cw06;


import java.util.Scanner;

public class Methods1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter string");
        String str = scan.nextLine();
        System.out.println("Enter number of strings");
        int n = scan.nextInt();
        printStr(str, n);
    }


    static void printStr(String str, int n) {
        for (int i = 1; i <= n; i++) {
            System.out.printf("%s number = %d\n", str, i);

        }
    }
}