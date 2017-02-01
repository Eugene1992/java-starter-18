
import java.util.Scanner;

public class Home_03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

//        Задание 2
//        Создать программу, проверяющую и сообщающую на экран, является ли введенное с
//        консоли целое число, чётным либо нечётным.

        int number = scan.nextInt();
        if (number % 2 == 0) {
            System.out.println(" Введеное число четное ");
        } else {
            System.out.println(" Введенное число нечетное ");
        }

        // 2.2
        int number1 = scan.nextInt();
        System.out.println(number1 % 2 == 0 ? "Введенное число четное" : " Введенное число нечетное ");

//        Задание 3
//        Создать программу, выводящую на экран ближайшее к 10 из двух чисел, введенных с консоли.
//        Например, среди чисел 8.5 и 11.45 ближайшее к десяти 11.45.

        float ten = 10f;
        float number2 = scan.nextFloat();
        float number3 = scan.nextFloat();

        if (Math.abs(ten - number2) > Math.abs(ten - number3)) {
            System.out.println(" Число " + number3 + " ближе к 10 чем " + number2);
        } else if (Math.abs(ten - number2) < Math.abs(ten - number3)) {
            System.out.println("Число " + number2 + " ближе к 10 чем " + number3);
        } else if (Math.abs(ten - number2) == (Math.abs(ten - number3))) {
            System.out.println(" Числа " + number2 + " и " + number3 + " одинаково близки к 10");
        }

//        Задание 4
//        Задано три переменных, найти и вывести на экран переменную с максимальным значением
//        (значения всех переменных разные).

        int num4 = scan.nextInt();
        int num5 = scan.nextInt();
        int num6 = scan.nextInt();
        if ((num4 > num5) && (num4 > num6)) {
            System.out.println(num4);
        } else if ((num5 > num4) && (num5 > num6)) {
            System.out.println(num5);
        } else if ((num6 > num4) && (num6 > num5)) {
            System.out.println(num6);
        } else if ((num4 == num5) && (num5 == num6)) {
            System.out.println("Введены три одинаковых числа");

        } else if ((num4 == num5) || (num4 == num6) || (num5 == num6)) {
            System.out.println("Введены два одинаковых числа");
        }

//        Задание 5
//        Задано четыре переменных, найти и вывести на экран вторую по величине
//        (значения всех переменных разные)

        int num7 = scan.nextInt();
        int num8 = scan.nextInt();
        int num9 = scan.nextInt();
        int num10 = scan.nextInt();
        if ((num7 > num8) && (num7 > num9) && (num7 < num10)) {
            System.out.println(num7);
        } else if ((num8 > num7) && (num8 > num9) && (num8 < num10)) {
            System.out.println(num8);
        } else if ((num9 > num7) && (num9 > num8) && (num9 < num10)) {
            System.out.println(num9);
        } else {
            System.out.println(num10);
        }

//        Задание 6
//        В три переменные a, b и c записаны три вещественных числа. Создать программу, которая
//        будет находить и выводить на экран вещественные корни квадратного уравнения ax²+bx+c=0,
//                либо сообщать, что корней нет

        double a = scan.nextFloat();
        double b = scan.nextFloat();
        double c = scan.nextFloat();

        final double D = b * b - (4 * a * c);

        if (D < 0) {
            System.out.println("Квадратное уравнение не имеет корней");
        } else if (D == 0) {
            double x = -b / 2 * a;
            System.out.println(" x " + x);
        } else {
            double x1 = (-b + (Math.sqrt(D))) / (2 * a);
            double x2 = (-b - (Math.sqrt(D))) / (2 * a);
            System.out.println("x1 = " + x1 + " x2 = " + x2);
        }
    }
}


