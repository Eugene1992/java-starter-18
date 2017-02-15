package hw_03;


import java.util.Scanner;

public class Home_03m {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("  Сделайте выбор:\n  1)evenNumber\n  2)closerToTen\n  3)maxValue\n  4)value\n  5)quadraticEquation\n  6)interval");
        int number = scan.nextInt();

        switch (number){
            case 1: {
                System.out.println(" Введите число");
                int number1 = scan.nextInt();
                evenNumber(number1);
                break;
            }
            case 2: {
                System.out.println(" Введите 1 число");
                float number2 = scan.nextFloat();
                System.out.println(" Введите 2 число");
                float number3 = scan.nextFloat();
                closerToTen(number2, number3);
                break;
            }
            case 3: {
                System.out.println(" Введите 1 число ");
                int num4 = scan.nextInt();
                System.out.println(" Введите 2 число");
                int num5 = scan.nextInt();
                System.out.println(" Введите 3 число");
                int num6 = scan.nextInt();
                maxValue(num4,num5,num6);
                break;
            }
            case 4: {
                System.out.println(" Введите 1 число ");
                int num7 = scan.nextInt();
                System.out.println(" Введите 2 число ");
                int num8 = scan.nextInt();
                System.out.println(" Введите 3 число ");
                int num9 = scan.nextInt();
                System.out.println(" Введите 4 число ");
                int num10 = scan.nextInt();
                secondValue(num7, num8, num9, num10);
                break;
            }
            case 5: {
                System.out.println(" Введите 1 член квадратного уравнения ");
                double a = scan.nextFloat();
                System.out.println(" Введите 2 член квадратного уравнения ");
                double b = scan.nextFloat();
                System.out.println(" Введите 3 член квадратного уравнения ");
                double c = scan.nextFloat();
                quadraticEquation(a, b, c );
                break;
            }
            case 6: {
                System.out.println(" Введите число");
                int numb = scan.nextInt();
                interval(number);
                break;
            }
            default: {
                break;
            }
        }
    }

    static int evenNumber(int number1) {
        System.out.println(number1 % 2 == 0 ? "Введенное число четное" : " Введенное число нечетное ");
        return number1 ;
    }

    static float closerToTen(float number2, float number3) {
        float result = 0f;
        float ten = 10f;
        if (Math.abs(ten - number2) > Math.abs(ten - number3)) {
            result = number2;
            System.out.println(" Число " + number3 + " ближе к 10 чем " + number2);
        } else if (Math.abs(ten - number2) < Math.abs(ten - number3)) {
            result = number3;
            System.out.println("Число " + number2 + " ближе к 10 чем " + number3);
        } else if (Math.abs(ten - number2) == (Math.abs(ten - number3))) {
            System.out.println(" Числа " + number2 + " и " + number3 + " одинаково близки к 10");
        }
        return result;
    }

    static void maxValue( int num4, int num5, int num6) {
        int result = 0;
        if ((num4 > num5) && (num4 > num6)) {
            result = num4;
            System.out.println(result  + " - самое большое чило ");
        } else if ((num5 > num4) && (num5 > num6)) {
            result = num5;
            System.out.println(result + " - самое большое чило ");
        } else if ((num6 > num4) && (num6 > num5)) {
            result = num6;
            System.out.println(result + " - самое большое чило ");
        } else if ((num4 == num5) && (num5 == num6)) {
            System.out.println("Введены три одинаковых числа");
        } else if ((num4 == num5) || (num4 == num6) || (num5 == num6)) {
            System.out.println("Введены два одинаковых числа");
        }
    }

    static int secondValue(int num7, int num8, int num9, int num10) {
        int result = 0;
        if ((num7 > num8) && (num7 > num9) && (num7 < num10)) {
            result = num7;
            System.out.println(num7);
        } else if ((num8 > num7) && (num8 > num9) && (num8 < num10)) {
            result = num8;
            System.out.println(num8);
        } else if ((num9 > num7) && (num9 > num8) && (num9 < num10)) {
            result = num9;
            System.out.println(num9);
        } else {
            result = num10;
            System.out.println(num10);
        }
        return result;
    }

    static void quadraticEquation(double a, double b, double c) {
        double result1 = 0;
        double result2 = 0;
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

    static int interval(int numb) {
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
       return numb;
    }

}
