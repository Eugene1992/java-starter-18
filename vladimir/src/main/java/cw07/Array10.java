package cw07;


import java.util.Scanner;

public class Array10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter length of array");
        int l = scan.nextInt();
        int val;
        int[] arr = new int[l];
        arrayInput(l, arr);
        int op = 0, exit = 0;
        do {
            System.out.println("Choose operation:\n1) Print array\n2) Reverse print\n3) Half print\n4) Reverse half print\n5) Half reverse print\n6) Summary elements of array\n0) Exit");
            op = scan.nextInt();
            switch (op) {
                case 1: {
                    arrayPrint(arr);
                    break;
                }
                case 2: {
                    arrayReversePrint(arr);
                    break;
                }
                case 3: {
                    arrayHalfPrint(arr);
                    break;
                }
                case 4: {
                    arrayReverseHalfPrint(arr);
                    break;
                }
                case 5: {
                    arrayHalfReversePrint(arr);
                    break;
                }
                case 6: {
                    System.out.println("Sum = " + arraySum(arr));
                    break;
                }
                default: {
                    System.out.println("You chose wrong operation");
                    exit = 1;
                }
            }
        } while (exit != 1);
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

    static void arrayPrint(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("Element %d = %d\n", i, arr[i]);
        }
    }

    static void arrayReversePrint(int[] arr) {
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.printf("Element %d  = %d\n", i, arr[i]);
        }
    }

    static void arrayHalfPrint(int[] arr) {
        for (int i = 0; i <= ((arr.length - 1) / 2); i++) {
            System.out.printf("Element %d  = %d\n", i, arr[i]);
        }
    }

    static void arrayReverseHalfPrint(int[] arr) {
        for (int i = ((arr.length - 1) / 2); i >= 0; i--) {
            System.out.printf("Element %d  = %d\n", i, arr[i]);
        }
    }

    static void arrayHalfReversePrint(int[] arr) {
        for (int i = arr.length - 1; i >= (arr.length / 2); i--) {
            System.out.printf("Element %d  = %d\n", i, arr[i]);
        }
    }

    static int arraySum(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }
}
