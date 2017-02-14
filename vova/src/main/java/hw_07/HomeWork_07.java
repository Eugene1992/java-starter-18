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
        int[] array = {1, 2, 3, 4, 5, 9, 7, 6, 8, 10};
        my15Method(array);
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
        int max = array[0];
        int min = array[0];
        for (int i = 0; i < array.length; i++) {

            if (array[i] > max) {
                max = array[i];
            }
            if (array[i] < min) {
                min = array[i];
            }
        }
        System.out.println(max + " - max value");
        System.out.println(min + " - min value ");
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
        int numb = 0;
        int i = 0;
        do {
            i++;
            numb = i;
            System.out.println(i + " ");
        } while (i < array.length);
    }

    static void my10Method(int array[]) {
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

    static void my13Method(int array[]) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0) {
                sum += Math.abs(array[i]);
            }
        }
        System.out.println(sum * (-1));
    }

    static void my14Method(int array[]) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
            if (array[i] == 0) {
                break;
            }
        }
    }

    static void my15Method(int array[]) {
        int sum1 = array[0];
        int sum2 = array[0];
        int value1 = 0;
        int value2 = 0;
        for (int i = 0; i < array.length; i++) {
            if (sum1 < array[i]) {
                value1 = i;
                sum1 = array[i];
            }
            if (sum2 < (array[i] = value1)) {

                sum2 = array[i];

            }
        }
        System.out.println(" " + sum1 + " " + sum2 );
    }

    static void my18Method(int array[]) {
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




