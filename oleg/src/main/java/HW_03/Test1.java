package HW_03;

import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        System.out.println("Input any  2 number ");

        Scanner scan = new Scanner(System.in);

        double num1 = 10;
        double num2 = scan.nextDouble();
        double num3 = scan.nextDouble();

        if (Math.abs(num1 - num2) > Math.abs(num1 - num3)) {
            System.out.println(" Число " + num3 + " ближе к 10 чем " + num2);
        } else if (Math.abs(num1 - num2) < Math.abs(num1 - num3)) {
            System.out.println("Число " + num2 + " ближе к 10 чем " + num3);
        } else if (Math.abs(num1 - num2) == (Math.abs(num1 - num3))) {
            System.out.println(" Числа " + num2 + " и " + num3 + " одинаково близки к 10");
        }
    }
}

// выдает ошибку Module not specified