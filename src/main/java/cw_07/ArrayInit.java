package cw_07;

import java.util.Arrays;

public class ArrayInit {
    public static void main(String[] args) {
        int[] array = new int[3];
        array[2] = 10;
        System.out.println(Arrays.toString(array));

        int arr[] = {1, 2, 3, 4, 5};
        System.out.println(arr[2]);
    }
}
