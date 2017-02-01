package hw03;

import java.util.Scanner;

public class Test2 {
    public static void main(String args[]) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Хотите узнать, какое из двух чисел ближе к 10?");
        System.out.println("Введите 2 любых числа");

        int a = scanner.nextInt();
        int b = scanner.nextInt();

        int c = (10 - a);
        int d = (10 - b);

        if (c == d) {
            System.out.println("Число " + a + " ближе к 10, чем число " + b);
        } else {
            System.out.println("Число " + b + " ближе к 10, чем число " + a);
        }
    }
}