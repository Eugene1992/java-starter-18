package hw_04;


import java.util.Scanner;

public class HomeWork_04m {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("  Сделайте выбор:\n  1)fourDigitNumber\n  2)first55Numbers\n  3)positiveElements");
        System.out.println("  4)first20Elements\n  5)fibonacciNumbers\n  6)factorial\n  7)positiveDivisors ");
        int number = scan.nextInt();
        String result = "";
        switch (number) {
            case 1: {
                System.out.println("  Программа, выводящая на экран все четырёхзначные числа последовательности 1000 1003 1006 1009 1012 1015 ...");
                result = fourDigitNumber();
                break;
            }
            case 2: {
                System.out.println("  Программа, выводящая на экран первые 55 элементов последовательности 1 3 5 7 9 11 13 15 17 …");
                result = first55Numbers();
                break;
            }
            case 3: {
                System.out.println("  Программа, выводящая на экран все неотрицательные элементы последовательности 90 85 80 75 70 65 60 …");
                result = positiveElements();
                break;
            }
            case 4: {
                System.out.println("  Программа, выводящая на экран первые 20 элементов последовательности 2 4 8 16 32 64 128 …");
                first20Elements();
                break;
            }
            case 5: {
                System.out.println("  Первые 20 чисел последовательности Фибоначчи");
                fibonacciNumbers();
                break;
            }
            case 6: {
                System.out.println("  Программа, вычисляющая факториал натурального числа n, введенного пользователем");
                System.out.println("  Введите число :");
                int firstNum = scan.nextInt();
                factorial(firstNum);
                break;
            }
            case 7: {
                System.out.println("  Положительные делители натурального числа, введенные пользователем");
                System.out.println("  Введите число");
                int firstNum = scan.nextInt();
                positiveDivisors(firstNum);
                break;
            }
            default: {
                break;
            }

        }
        System.out.println(result);
    }

    static String fourDigitNumber() {
        String save = "";
        for (int numb = 1000; numb < 10000; numb += 3) {
            save += numb + " ";
        }
        return save;
    }

    static String first55Numbers() {
        String save = "";
        for (int numb = 1; numb < 57; numb += 2) {
            save += numb;
        }
        return save;
    }

    static String positiveElements() {
        String save = "";
        for (int value = 90; value >= 0; value -= 5) {
            save += value;
        }
        return save;
    }

    static String first20Elements() {
        String save = "";
        for (int numb = 2; numb < Math.pow(2, 21); numb *= 2) {
            save += numb;
        }
        return save;
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

    static int factorial(int firstNum) {

        int secondNum = firstNum - 1;
        int result = firstNum * secondNum;
        for (; secondNum > 2; firstNum--) {
            firstNum = result;
            secondNum = secondNum - 1;
            result = firstNum * secondNum;
        }
        return result;
    }

    static int positiveDivisors(int firstNum) {
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
        return secondNum;
    }
}