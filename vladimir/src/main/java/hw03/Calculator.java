package hw03;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double a, b, c;
        System.out.println("Enter number a");
        a = scan.nextDouble();
        System.out.println("Enter number b");
        b = scan.nextDouble();
        System.out.println("Choose the operation:\n+\n-\n*\n/");
        String op = scan.next();
        switch (op) {
            case "+": {
                c = a + b;
                System.out.printf("Result of a + b = %.3f", c);
                break;
            }

            case "-": {
                c = a - b;
                System.out.printf("Result of a - b = %.3f", c);
                break;
            }

            case "*": {
                c = a * b;
                System.out.printf("Result of a * b = %.3f", c);
                break;
            }

            case "/": {
                if (b == 0)
                    System.out.println("Division by zero");
                else {
                    c = a / b;
                    System.out.printf("Result of a / b = %.3f", c);
                    break;
                }
            }

            default:
                System.out.println("You choose wrong operation");
        }
    }
}
