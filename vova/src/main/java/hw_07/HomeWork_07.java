package hw_07;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 1. Вывести в консоль все парные числа одномерного массива.
 * 2. Вывести все числа одномерного массива в обратном порядке.
 * 3. Вывести первую и вторую половину одномерного массива.
 * 4. Вывести первую и вторую половину одномерного массива в обратном порядке.
 * 5. Найти сумму всех элементов в массиве.
 * 6. Найти среднеарифметическое всех чисел массива.
 * 7. Найти минимальное и максимальное число в массиве.
 * 8. Заменить все отрицательные числа в массиве на 0.
 * 9*. Подсчитать одинаковые числа в одномерном массиве.
 * 10. Поменять минимальное и максимальное числа в массиве местами.
 * 11. Инвертировать массив.
 * 12. Вывести в консоль половину массива, среднеарифметическое которых является большим.
 * 13. Найти сумму отрицательных чисел в одномерном массиве.
 * 14. Дан массив чисел, среди которых имеется один ноль. Вывести на печать все числа до нуля включительно.
 * 15. Написать программу, меняющую местами два наибольших элемента одномерного массива с первым и последним.
 * 16. Написать программу, которая выводит на экран элементы одномерного массива, которые расположены до минимального элемента всего массива.
 * 17. Найти сумму всех чисел находящихся между минимальным и максимальным числом в массиве.
 * 18. Вывести в консоль половину массива в которой находиться наименьшее число массива.
 * 19. Написать программу, которая перемещает в конец массива все элементы, значения которых находится в отрезке [a,b].
 */
public class HomeWork_07 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] array = {13, 15, 19, 5, -14, 21, 9, 11, -2, 5, 0, 2, 0};
        System.out.println("   Выберите метод который вы хотите запустить ");
        System.out.println("   1)pairNumbers   2)inverseNumbers   3)outputArraysParts\n   4)inverseOutputArraysParts   5)outputSumElements   6)outputAverage");
        System.out.println("   7)minimumAndMaximumValues   8)replacedZero   9)sameNumbers\n   10)placesReplacement   11)invert   12)arithmeticMeanHalf ");
        System.out.println("   13)sumNegativeNumbers   14)numberToZero   15)replacingFirstAndSecond\n   16)partWithMinimumNumbers");
        int number = scan.nextInt();

        switch (number) {
            case 1: {
                pairNumbers(array);
                break;
            }
            case 2: {
                inverseNumbers(array);
                break;
            }
            case 3: {
                outputArraysParts(array);
                break;
            }
            case 4: {
                inverseOutputArraysParts(array);
                break;
            }
            case 5: {
                System.out.print(outputSumElements(array));
                break;
            }
            case 6: {
                System.out.println(outputAverage(array));
                break;
            }
            case 7: {
                System.out.println("   Минимальное значение - " + minimumValue(array) + "\n   Максимальное значение - " + maximumValue(array));
                break;

            }
            case 8: {
                replacedZero(array);
                break;
            }
            case 9: {
                sameNumbers(array);
                break;
            }
            case 10: {
                placesReplacement(array);
                break;
            }
            case 11: {
                invert(array);
                break;
            }
            case 12: {
                arithmeticMeanHalf(array);
                break;
            }
            case 13: {
                sumNegativeNumbers(array);
                break;
            }
            case 14: {
                numberToZero(array);
                break;
            }
            case 15: {
                replacingFirstAndSecond(array);
                break;
            }
            case 16: {
                partWithMinimumNumbers(array);
                break;
            }
        }


    }

    static void pairNumbers(int array[]) {
        for (int i = 0; i < array.length; i++)
            if (array[i] % 2 == 0) {
                System.out.println(array[i]);
            }
    }

    static void inverseNumbers(int array[]) {
        for (int i = array.length; i > 0; i--) {
            System.out.print(array[i] + " ");
        }
    }

    static void outputArraysParts(int array[]) {
        for (int i = 1; i <= array.length / 2; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i = array.length / 2 + 1; i <= array.length; i++) {
            System.out.print(i + " ");
        }
    }

    static void inverseOutputArraysParts(int array[]) {
        for (int i = array.length / 2; i >= 1; i--) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i = array.length; i > array.length / 2; i--) {
            System.out.print(i + " ");
        }
    }

    static int outputSumElements(int array[]) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += i;
        }
        return sum;
    }

    static float outputAverage(int array[]) {
        float sum = 0;
        float summ = 0;
        for (int i = 0; i <= array.length; i++) {
            sum += i;
            summ = sum / array.length;
        }
        return sum;
    }

    static int maximumValue(int array[]) {
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }

    static int minimumValue(int array[]) {
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }

    static void replacedZero(int array[]) {
        for (int i = 0; i < array.length; i++) {
            if (0 > array[i]) {
                array[i] = 0;
            }
            }
        System.out.println(Arrays.toString(array));
    }

    static void sameNumbers(int array[]) {////не решил пока
        int numb = 0;
        int i = 0;
        do {
            i++;
            numb = i;
            System.out.println(i + " ");
        } while (i < array.length);
    }

    static void placesReplacement(int array[]) {
        int value1 = 0;
        int value2 = 0;
        int max = array[0];
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                value1 = i;
                max = array[i];
            } else if (array[i] <= min) {
                value2 = i;
                min = array[i];
            }
        }
        for (int i = 0; i < array.length; i++) {
            if (i == value1) {
                array[i] = min;
            } else if (i == value2) {
                array[i] = max;
            }
        }
        System.out.print(Arrays.toString(array));
    }

    static void invert(int array[]) {
        int variable = 0;
        for (int i = 0; i < array.length; i++) {
            array[i] = variable;
            array[i] = array.length - i;
            variable = array.length - i;
        }
        System.out.println(Arrays.toString(array));
    }

    static void arithmeticMeanHalf(int array[]) {
        int firstHalf = 0;
        int secondHalf = 0;
        for (int i = 0; i < array.length / 2; i++) {
            firstHalf += array[i];
        }
        for (int i = (array.length / 2); i < array.length; i++) {
            secondHalf += array[i];
        }
        int firstHalfresult = (firstHalf) / (array.length / 2);
        int secondHalfresult = (secondHalf) / (array.length / 2);
        if (firstHalfresult > secondHalfresult) {
            System.out.println(firstHalfresult + " - first Half ");
        } else if (firstHalfresult < secondHalfresult) {
            System.out.println(secondHalf + " - second Half ");
        } else {
            System.out.println(" first Half = second Half ");
        }
    }

    static void sumNegativeNumbers(int array[]) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0) {
                sum += Math.abs(array[i]);
            }
        }
        System.out.println(sum * (-1));
    }

    static void numberToZero(int array[]) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
            if (array[i] == 0) {
                break;
            }
        }
    }

    static void replacingFirstAndSecond(int array[]) {
        int sum1 = array[0];
        int sum2 = array[0];
        int value1 = 0;
        int value2 = 0;
        for (int i = 0; i < array.length; i++) {
            if (sum1 < array[i]) {
                value1 = i;
                sum1 = array[i];
            }
        }
        for (int i = 0; i < value1; i++)
            if (sum2 < array[i]) {
                sum2 = array[i];
                value2 = i;
            }
        System.out.println(value1 + " " + sum1 + " " + sum2 + "  " + value2);

    }


    static void partWithMinimumNumbers(int array[]) {
        int firstFor = 0;
        int secondFor = 0;
        for (int i = 0; i <= array.length / 2; i++) {
            if (array[i] > firstFor) {
                firstFor = array[i];
            }
        }
        for (int j = (array.length / 2); j < array.length; j++) {
            if (array[j] > secondFor) {
                secondFor = array[j];
            }
        }
        if (firstFor > secondFor) {
            for (int i = 0; i < array.length / 2; i++) {
                System.out.print(array[i] + " ");
            }
        } else if (firstFor < secondFor) {
            for (int i = (array.length / 2); i < array.length; i++) {
                System.out.print(array[i] + " ");
            }
        } else {
            System.out.println("firstFor = secondFor");
        }
    }

//    static int my19Method(int array[],int a, int b){
//
//        for (int i = 0; i < array.length; i++){
//            if()
//
//        }
//    }
}




