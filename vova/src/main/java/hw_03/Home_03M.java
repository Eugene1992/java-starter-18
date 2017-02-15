package hw_03;

import java.util.Scanner;

public class Home_03M {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("  Сделайте выбор:\n  1)evenNumber\n  2)closerToTen\n  3)maxValue\n  4)value\n  5)quadraticEquation\n  6)interval");
        int number = scan.nextInt();

        switch (number){
            case 1: {
                System.out.println(" Введите два числа");
                evenNumber();
                break;
            }
            case 2: {
                System.out.println(" Введите два числа");
                closerToTen();
                break;
            }
            case 3: {
                System.out.println(" Введите три числа ");
                maxValue();
                break;
            }
            case 4: {
                System.out.println(" Введите четыре числа ");
                secondValue();
                break;
            }
            case 5: {
                System.out.println(" Введите три числа для условия квадратного уравнения ");
                quadraticEquation();
                break;
            }
            case 6: {
                System.out.println(" Введите число");
                interval();
                break;
            }
            default: {
                break;
            }
        }
    }

    static void evenNumber() {
        Scanner scan = new Scanner(System.in);
        int number1 = scan.nextInt();
        System.out.println(number1 % 2 == 0 ? "Введенное число четное" : " Введенное число нечетное ");
    }

    static void closerToTen() {
        Scanner scan = new Scanner(System.in);
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
    }

    static void maxValue() {
        Scanner scan = new Scanner(System.in);
        int num4 = scan.nextInt();
        int num5 = scan.nextInt();
        int num6 = scan.nextInt();
        if ((num4 > num5) && (num4 > num6)) {
            System.out.println(num4  + " - самое большое чило ");
        } else if ((num5 > num4) && (num5 > num6)) {
            System.out.println(num5 + " - самое большое чило ");
        } else if ((num6 > num4) && (num6 > num5)) {
            System.out.println(num6 + " - самое большое чило ");
        } else if ((num4 == num5) && (num5 == num6)) {
            System.out.println("Введены три одинаковых числа");
        } else if ((num4 == num5) || (num4 == num6) || (num5 == num6)) {
            System.out.println("Введены два одинаковых числа");
        }
    }

    static void secondValue() {
        Scanner scan = new Scanner(System.in);
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
    }

    static void quadraticEquation() {
        Scanner scan = new Scanner(System.in);
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

    static void interval() {
        Scanner scan = new Scanner(System.in);
        int numb = scan.nextInt();
        if ((numb >= 0) && (numb <= 14)) {
            System.out.println("Число попадает в промежуток [0 - 14] ");
        } else if ((numb >= 15) && (numb <= 35)) {
            System.out.println("Число попадает в промежуток [15 - 35] ");
        } else if ((numb >= 36) && (numb <= 50)) {
            System.out.println("Число попадает в промежуток [36 - 50] ");
        } else if ((numb >= 50) && (numb <= 100)) {
            System.out.println("Число попадает в промежуток [50 - 100] ");
        } else {
            System.out.println("Число не входящее ни в один из имеющихся числовых промежутков");
        }
    }
}
