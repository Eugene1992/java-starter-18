package cw_07;

import java.util.Arrays;

/**
 * 1. Создать массив и заполнить его 10 элементами
 * 2. Вывести массив в консоль в прямом порядке
 * 3. Вывести массив в консоль в обратном порядке
 * 4. Вывести в консоль первую половину массива
 * 5. Вывести в консоль вторую половину массива
 * 6. Вывести в консоль первую половину массива в обратном порядке
 * 7. Подсчитать сумму элементов массива
 */
public class Test {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        my6Array(array);
    }

    static void my2Array(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

    }

    static void my3Array(int[] array) {
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i] + " ");
        }
    }

    static void my4Array(int[] array) {
        for (int i = 0; i < array.length / 2; i++) {
            System.out.print(array[i] + " ");
        }
    }

    static void my5Array(int[] array) {
        for (int i = array.length / 2; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

    static void my6Array(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        System.out.print(sum);
    }
}
