package hw_06;


import java.util.Scanner;

public class AllHomework {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Choose your task:");
        int taskNum = scan.nextInt();
        switch (taskNum) {
            case 1:
                System.out.println("Enter your number:");
                int num = scan.nextInt();
                boolean res = isEven(num);
                System.out.println("Selected number is " + (res ? "even" : "odd"));
                break;
        }

    }

    static boolean isEven(int num) {
        return num % 2 == 0;
    }

    static void closer() {
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

    static void maximumVariable() {
        Scanner scan = new Scanner(System.in);
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
    }

    static void quadraticEquation() {
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

    static void calculator() {
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

    static void fourDigitNumber() {
        for (int numb = 1000; numb < 10000; numb += 3) {
            System.out.print(numb + " ");
        }
    }

    static void first55Numbers() {
        for (int numb = 1; numb < 57; numb += 2) {
            System.out.print(numb + " ");
        }
    }

    static void positiveelements() {
        for (int value = 90; value >= 0; value -= 5) {
            System.out.print(value + " ");
        }
    }

    static void first20Elements() {
        for (int a = 2; a < Math.pow(2, 21); a *= 2) {
            System.out.print(a + " ");
        }
    }

    static void fibonacciNumbers() {
        int members = 18;
        int firstMember = 0;
        int secondMember = 1;
//        int currentValue = firstMember;
        System.out.println(firstMember);
        System.out.println(secondMember);
        for (int a = 0; a < members; a++) {
            int result = firstMember + secondMember;
            System.out.println(result);
            firstMember = secondMember;
            secondMember = result;
        }
    }

    static void multifunctionCalculator() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите число");
        int value = scan.nextInt();
        System.out.println("Вы можете перевести число в одну из систем счисления: \n 1) в 2-ую \n 2) в 8-ую \n 3) в 16-ую");
        int value2 = scan.nextInt();
        switch (value2) {
            case 1: {
                String sys = "";
                for (; value > 0; value /= 2) {
                    sys = value % 2 + sys;
                }
                System.out.println(sys);
            }
            case 2: {
                String sys = "";
                for (; value > 0; value /= 8) {
                    sys = value % 8 + sys;
                }
                System.out.println(sys);
            }
            case 3: {
                String sys = "";
                for (; value > 0; value /= 15) {
                    int numb = value % 15;
                    if (value <= 15) {

                        if (value == 10) {
                            System.out.println("A");
                            break;
                        }
                        if (value == 11) {
                            System.out.println("B");
                            break;
                        }
                        if (value == 12) {
                            System.out.println("C");
                            break;
                        }
                        if (value == 13) {
                            System.out.println("D");
                            break;
                        }
                        if (value == 14) {
                            System.out.println("E");
                            break;
                        }
                        if (value == 15) {
                            System.out.println("F");
                            break;
                        }
                        sys = value + sys;

                        System.out.println(sys);
                    }
                }
            }
        }
    }

    static void factorial() {
        Scanner scan = new Scanner(System.in);
        int firstNum = scan.nextInt();
        int secondNum = firstNum - 1;
        int result = firstNum * secondNum;
        for (; secondNum > 2; firstNum--) {
            firstNum = result;
            secondNum = secondNum - 1;
            result = firstNum * secondNum;
        }
        System.out.println(result);
    }

    static void positiveDivisors() {
        Scanner scan = new Scanner(System.in);
        int firstNum = scan.nextInt();
        int secondNum = firstNum - 1;
        int result = firstNum % secondNum;
        if (result == 0) {
            System.out.println(secondNum);
        }
        for (; secondNum > 0; secondNum--) {
            secondNum = secondNum--;
            result = firstNum % secondNum;
            if (result == 0) {
                System.out.println(secondNum);
            }
        }
    }

    static void luckyNumbers() {
        int n = 0;
        for (int i = 1; i <= 999999; i++) {
            int n1 = (i / 100000) % 10;
            int n2 = (i / 10000) % 10;
            int n3 = (i / 1000) % 10;
            int n4 = (i / 100) % 10;
            int n5 = (i / 10) % 10;
            int n6 = i % 10;
            if (n1 + n2 + n3 == n4 + n5 + n6) {
                n++;
            }
        }
        System.out.println(" Счастивых билетиков - " + n);
    }

    static void clock() {
        int b = 0;
        for (int i = 0; i <= 23; i++) {
            for (int j = 0; j <= 59; j++) {
                int i1 = i % 10;
                int i2 = i / 10;
                int j1 = j / 10;
                int j2 = j % 10;
                if (i1 == j1 && i2 == j2) {
                    b++;
//                        System.out.printf("\n%1$02d:%2$02d", i, j);
                }
            }
        }
        System.out.println("\n" + b + " раз за сутки случается так, что слева от двоеточия показывается" +
                " симметричная комбинация для той, что справа от двоеточия ");
    }

    static void unluckyNumbers() {
        int b = 0;
        for (int i = 1; i <= 999999; i++) {
            int i1 = i / 100000;
            int i2 = (i / 10000) % 10;
            int i3 = (i / 1000) % 10;
            int i4 = (i / 100) % 10;
            int i5 = (i / 10) % 10;
            int i6 = i % 10;
            if ((i6 == 3 & i5 == 1) || (i5 == 3 & i4 == 1) || (i4 == 3 & i3 == 1) || (i3 == 3 & i2 == 1) || (i2 == 3 & i1 == 3)) {
                b++;
//                System.out.println(i1 + " " + i2 + " " + i3 + " " + i4 + " " + i5 + " " + i6);
            }
        }
        System.out.println(b + " не счастливых номеров");
    }

}




