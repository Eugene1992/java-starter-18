package cw06;


import java.util.Scanner;

public class Methods1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter string");
        String str = scan.nextLine();
        printStr(str);
    }


    static void printStr(String str) {
        for (int i = 1; i <= 5; i++) {
            System.out.printf("%s number = %d\n",str,i);

        }
    }
}