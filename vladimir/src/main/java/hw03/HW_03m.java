package hw03;


import java.util.Scanner;

public class HW_03m {
    public static void main(String[] args) {
        //// TODO: 09.02.2017 Refactor repetitve code in some methods

        Scanner scan = new Scanner(System.in);
        int exit;
        do {
            System.out.println("\nChoose task:\n1) Calculator\n2) Interval\n3) Even or odd");
            System.out.println("4) Closer to 10\n5) Large number of 3\n6) Large number o4\n7) Quadrantic \n0) Exit");
            int task = scan.nextInt();
            switch (task) {
                case 1: {
                    double a, b, res;
                    System.out.println("Enter number a");
                    a = scan.nextDouble();
                    System.out.println("Enter number b");
                    b = scan.nextDouble();
                    System.out.println("Choose the operation:\n+\n-\n*\n/");
                    String op = scan.next();
                    calculator(a, b, op);
                    exit = 1;
                    break;
                }
                case 2: {
                    System.out.println("Enter the number from 0 to 100");
                    int n = scan.nextInt();
                    interval(n);
                    exit = 1;
                    break;
                }
                case 3: {
                    System.out.println("Enter the number");             //  2)
                    int ch = scan.nextInt();
                    evenOrOdd(ch);
                    exit = 1;
                    break;
                }
                case 4: {
                    System.out.println("Enter first number");           //  3)
                    double num1 = scan.nextDouble();
                    System.out.println("Enter second number");
                    double num2 = scan.nextDouble();
                    int res = closerTo10(num1, num2);
                    if (res == 0) {
                        System.out.println("The numbers are equal");
                    }
                    if (res == 1) {
                        System.out.printf("The %f is closer to 10 then %f", num1, num2);
                    }
                    System.out.printf("The %f is closer to 10 then %f", num2, num1);
                    exit = 1;
                    break;
                }
                case 5: {
                    System.out.println("Enter first number");           //  3)
                    double n1 = scan.nextDouble();
                    System.out.println("Enter second number");
                    double n2 = scan.nextDouble();
                    System.out.println("Enter third number");
                    double n3 = scan.nextDouble();
                    System.out.printf("The second largest number is %f", largeNumberOf3(n1, n2, n3));
                    exit = 1;
                    break;
                }
                case 6: {
                    System.out.println("Enter first number");           //  3)
                    double n4 = scan.nextDouble();
                    System.out.println("Enter second number");
                    double n5 = scan.nextDouble();
                    System.out.println("Enter third number");
                    double n6 = scan.nextDouble();
                    System.out.println("Enter fourth number");
                    double n7 = scan.nextDouble();
                    System.out.printf("The second largest number is %f", secondLargeOf4(n4, n5, n6, n7));
                    exit = 1;
                    break;
                }
                case 7: {
                    System.out.println("Program for solving a*x*x + b*x + c = 0");
                    System.out.println("Enter a ");           //  3)
                    double a = scan.nextDouble();
                    System.out.println("Enter b");
                    double b = scan.nextDouble();
                    System.out.println("Enter c");
                    double c = scan.nextDouble();
                    quadratic(a, b, c);
                    exit = 1;
                    break;
                }
                default:
                    exit = 0;
            }
        }
        while (exit != 0);
    }

    static void calculator(double a, double b, String op) {
        double res = 0;
        switch (op) {
            case "+": {
                res = a + b;
                System.out.printf("Result of a + b = %.3f", res);
                break;
            }

            case "-": {
                res = a - b;
                System.out.printf("Result of a - b = %.3f", res);
                break;
            }

            case "*": {
                res = a * b;
                System.out.printf("Result of a * b = %.3f", res);
                break;
            }

            case "/": {
                if (b == 0)
                    System.out.println("Division by zero");
                else {
                    res = a / b;
                    System.out.printf("Result of a / b = %.3f", res);
                    break;
                }
            }

            default:
                System.out.println("You choose wrong operation");
        }
    }

    static void interval(int n) {
        if (n >= 0 && n <= 14)
            System.out.println("Your number is in interval [0..14]");
        else if (n >= 15 && n <= 35)
            System.out.println("Your number is in interval [15..35]");
        else if (n >= 36 && n <= 50)
            System.out.println("Your number is in interval [36..50]");
        else if (n >= 51 && n <= 100)
            System.out.println("Your number is in interval [51..100]");
        else System.out.println("Your number isnt in interval [0..100]");
    }

    static void evenOrOdd(int ch) {
        if (ch % 2 == 0)
            System.out.println("The number is even");
        else System.out.println("The number is odd");
    }

    static int closerTo10(double num1, double num2) {
        int res = 0;
        if (Math.abs(10 - num1) == Math.abs(10 - num2))
            res = 0;
        else if (Math.abs(10 - num1) < Math.abs(10 - num2))
            res = 1;

        else res = 2;
        return res;
    }

    static double largeNumberOf3(double n1, double n2, double n3) {
        double num = 0;
        if (n1 > n2 && n1 > n3)
            num = n1;
        else if (n2 > n1 && n2 > n3)
            num = n2;
        else num = n3;
        return num;
    }

    static double secondLargeOf4(double n4, double n5, double n6, double n7) {
        double num = 0;
        if (n4 > n5 && n4 > n6 && n4 < n7)
            num = n4;
        else if (n5 > n4 && n5 > n6 && n5 < n7)
            num = n5;
        else if (n6 > n4 && n6 > n5 && n6 < n7)
            num = n6;
        else num = n7;
        return num;
    }

    static void quadratic(double a, double b, double c) {
        double d, x1, x2;
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

