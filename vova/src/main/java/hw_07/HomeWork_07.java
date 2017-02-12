package hw_07;

import java.util.Arrays;

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
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        my11Method(array);
    }

    static void my1Method(int array[]) {

        for (int i = 0; i < array.length + 1; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
    }

    static void my2Method(int array[]) {
        for (int i = array.length; i > 0; i--) {
            System.out.print(i + " ");
        }
    }

    static void my3Method(int array[]) {
        for (int i = 1; i <= array.length / 2; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i = array.length / 2 + 1; i <= array.length; i++) {
            System.out.print(i + " ");
        }
    }

    static void my4Method(int array[]) {
        for (int i = array.length / 2; i >= 1; i--) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i = array.length; i > array.length / 2; i--) {
            System.out.print(i + " ");
        }
    }

    static void my5Method(int array[]) {
        int sum = 0;
        for (int i = 1; i <= array.length; i++) {
            sum += i;
        }
        System.out.print(sum);
    }

    static void my6Method(int array[]) {
        float sum = 0;
        float summ = 0;
        for (int i = 0; i <= array.length; i++) {
            sum += i;
            summ = sum / array.length;
        }
        System.out.println(summ);


    }

    static void my7Method(int array[]) {
        int max = 0;
        int min = 0;
//        int min = Integer.MIN_VALUE;
        for (int i = 0; i < array.length; ++i) {

            if (array[i] < max) {
                continue;
            } else {
                max = array[i];
            }
            if (array[i] < min) {
                min = array[i];
            } else {
                continue;
            }
            System.out.println(max + " - max value");
            System.out.println(min + " - min value ");
        }


    }

    static void my8Method(int array[]) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0) {
                array[i] = 0;
            } else {
                continue;
            }
        }
        System.out.println(Arrays.toString(array));
    }

    static void my9Method(int array[]) {////не решил пока
        int firstNum = array[0];
        int secondNum = array[1];
        for (int i = 0; i < array.length; i++) {
            firstNum = array[0];
            secondNum = array[i + 1];

        }
    }

    static void my11Method(int array[]) {
        int variable = 0;
        for (int i = 0; i < array.length; i++) {
            array[i] = variable;
            array[i] = array.length - i;
            variable = array.length - i;
        }
        System.out.println(Arrays.toString(array));
    }

    static void my12Method(int array[]) {
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
}




