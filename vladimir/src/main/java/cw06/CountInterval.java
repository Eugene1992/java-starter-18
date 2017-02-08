package cw06;


import java.util.Scanner;

public class CountInterval {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter start point");
        int a = scan.nextInt();
        System.out.println("Enter end point");
        int b = scan.nextInt();
        System.out.println("Enter step");
        int step = scan.nextInt();
        System.out.println("Sum = " + summary(a, b, step));

    }

    static int summary(int a, int b, int step) {
        int sum = 0;
        for (; a <= b; a += step) {
            sum += a;
        }
        return sum;
    }
}
