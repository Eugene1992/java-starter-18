package hw03;

import java.util.Scanner;

public class HW03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the number");             //  2)
        int ch = scan.nextInt();
        if (ch % 2 == 0)
            System.out.println("The number is even\n\n");
        else System.out.println("The number is odd\n\n");


        System.out.println("Enter first number");           //  3)
        double num1 = scan.nextDouble();
        System.out.println("Enter second number");
        double num2 = scan.nextDouble();
        if (Math.abs(10 - num1) == Math.abs(10 - num2))
            System.out.println("The numbers are equal");
        else if (Math.abs(10 - num1) < Math.abs(10 - num2))
            System.out.printf("The %f is closer to 10 then %f\n\n", num1, num2);
        else System.out.printf("The %f is closer to 10 then %f\n\n", num2, num1);


        double n1 = 158.785, n2 = 1400.85, n3 = 968.1;      //  4)
        if (n1 > n2 && n1 > n3)
            System.out.printf("The %f is the largest number\n\n", n1);
        else if (n2 > n1 && n2 > n3)
            System.out.printf("The %f is the largest number\n\n", n2);
        else System.out.printf("The %f is the largest number\n\n", n3);


        double n4 = 15.89, n5 = 67.25, n6 = 4.85, n7 = 37.11;         //  5)
        if (n4 > n5 && n4 > n6 && n4 < n7)
            System.out.printf("The second largest number is %f\n\n", n4);
        else if (n5 > n4 && n5 > n6 && n5 < n7)
            System.out.printf("The second largest number is %f\n\n", n4);
        else if (n6 > n4 && n6 > n5 && n6 < n7)
            System.out.printf("The second largest number is %f\n\n", n4);
        else System.out.printf("The second largest number is %f\n\n", n7);


        double a = 23.85, b = 68.47, c = 10.33, d, x1, x2;        //  6)
        d = b * b - 4 * a * c;
        if (d < 0)
            System.out.println("Roots does not exist");
        else if (d == 0) {
            x1 = -b / (2 * a);
            System.out.printf("There are only 1 root: x1 = x2 = %f", x1);
        } else {
            x1 = (-b + Math.sqrt(d)) / (2 * a);
            x2 = (-b - Math.sqrt(d)) / (2 * a);
            System.out.printf("There are two roots: x1 = %f, x2 = %f", x1, x2);

        }
    }
}

