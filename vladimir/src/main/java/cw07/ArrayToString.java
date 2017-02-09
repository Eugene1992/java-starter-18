package cw07;

import java.util.Scanner;

public class ArrayToString {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter length of array");
        int l = scan.nextInt();
        int[] arr = new int[l];
        arrayInput(l, arr);
        String result = arrayToString(arr);
        System.out.println(result);

    }

    static int[] arrayInput(int l, int[] arr) {
        Scanner scan = new Scanner(System.in);
        int val;
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("Enter value of %d array element\n", i);
            val = scan.nextInt();
            arr[i] = val;
        }
        return arr;
    }

    static String arrayToString(int[] arr){
        String res = "[";
        for (int i = 0; i < arr.length; i++) {
            String separator = i != arr.length - 1 ? ", " : "";
            res = res + arr[i] + separator;
        }
        return res + "]";
    }
}
