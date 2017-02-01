package cw04;


import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a, b, a1, a2, b1, b2;
        System.out.println("Enter number a");
        a = scan.nextInt();
        System.out.println("Enter number b");
        b = scan.nextInt();
        a1 = a;
        a2 = a;
        b1 = b;
        b2 = b;
        while (a <= b) {
            a += a;
            a++;
        }
        System.out.println(a);
        do {
            a1 += a1;
            a1++;
        } while (a1 <= b1);
        System.out.println(a1);

        for (; a2 <= b2; a2++) {
            a2 += a2;
        }
        System.out.println(a2);
    }
}

