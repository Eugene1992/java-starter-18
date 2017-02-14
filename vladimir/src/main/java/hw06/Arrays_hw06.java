package hw06;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;


public class Arrays_hw06 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("1) Enter array\n2) Use default");
        int exit = 0, op = scan.nextInt();
        int[] arr;
        do {
            switch (op) {
                case 1: {
                    System.out.println("Enter length of array");
                    int l = scan.nextInt();
                    arr = new int[l];
                    arrayInput(l, arr);
                    break;
                }
                case 2: {
                    arr = new int[]{1, 4, 68, -38, 485, 1, 75, -2, 3, 1};
                    break;
                }
                default: {
                    System.out.println("You chose wrong operation");
                    arr = new int[10];
                    exit = 1;
                }
            }
        } while (exit != 0);
        do {
            System.out.println("Choose operation:\n1) Print odd elements\n2) Reverse print\n3) Half print\n4) Reverse half print\n5) Half reverse print\n6) Summary elements of array");
            System.out.print("7) Arithmetical mean\n8) Min Max elements\n9) Change negative elements to zero\n10) Count quantity of equal elements\n11) Change min and max\n12) Sum of negative elements\n");
            System.out.println("13) Sum of elements between min and max\n14) Inversion\n15) Min element gap\n16) Gap with higher arithmetical mean\n17) Before zero\n18) Before min\n0) Exit");
            op = scan.nextInt();
            switch (op) {
                case 1: {
                    System.out.println(oddNumbersPrint(arr));
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
                case 7: {
                    System.out.println("Arithmetical mean = " + arraySum(arr) / arr.length);
                    break;
                }
                case 8: {
                    System.out.printf("Min = %d  Max = %d\n", min(arr), max(arr));
                    break;
                }
                case 9: {
                    zeroChange(arr);
                    System.out.println(Arrays.toString(arr));
                    break;
                }
                case 10: {
                    System.out.println("Amount of equal elements = " + countEqualElements(arr));
                    break;

                }
                case 11: {
                    minChangeMax(arr);
                    System.out.println(Arrays.toString(arr));
                    break;
                }
                case 12: {
                    System.out.println("Sum of negative elements = " + negativeSum(arr));
                    break;
                }
                case 13: {
                    System.out.println("Sum of elements between min and max = " + sumBeetwen(arr));
                    break;
                }
                case 14: {
                    System.out.println(Arrays.toString(arr));
                    System.out.println(Arrays.toString(arrayInvertion(arr)));
                    break;
                }
                case 15: {
                    System.out.println(minGap(arr));
                    break;
                }
                case 16: {
                    System.out.println(higherArithmeticalGap(arr));
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

    static String oddNumbersPrint(int[] arr) {
        String res = "", separator = "";
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                separator = i != arr.length - 1 ? ", " : "";
                res = res + arr[i] + separator;
            }
        }
        return res;
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

    static double arraySum(int[] arr) {
        double sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }

    static int min(int[] arr) {
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }

    static int max(int[] arr) {
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    static int countEqualElements(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j] && i != j) {
                    count += 1;
                }
            }
        }
        return count;
    }

    static void zeroChange(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] < 0 ? 0 : arr[i];
        }
    }

    static void minChangeMax(int[] arr) {
        int max = arr[0], min = arr[0], maxI = 0, minI = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
                maxI = i;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
                minI = i;
            }
        }
        arr[minI] = max;
        arr[maxI] = min;
    }

    static int negativeSum(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                sum += arr[i];
            }
        }
        return sum;
    }

    static int sumBeetwen(int[] arr) {
        int sum = 0;
        int max = arr[0], min = arr[0], maxI = 0, minI = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
                maxI = i;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
                minI = i;
            }
        }
        arr[minI] = max;
        arr[maxI] = min;
        if (min < max) {
            for (int i = minI; i <= maxI; i++) {
                sum += arr[i];
            }
        } else {
            for (int i = maxI; i <= minI; i++) {
                sum += arr[i];
            }
        }
        return sum;
    }

    static int[] arrayInvertion(int[] arr) {
        int[] arrInv = new int[arr.length];
        int j = 0;
        for (int i = arr.length - 1; i >= 0; i--) {
            arrInv[j] = arr[i];
            j++;
        }
        return arrInv;
    }

    static String minGap(int[] arr) {
        String res = "";
        int minI = 0, min = arr[1];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
                minI = i;
            }
        }
        if (minI >= arr.length / 2) {
            for (int i = arr.length / 2; i < arr.length; i++) {
                res = arr[i] + " " + res;
            }
        } else {
            for (int i = 0; i < arr.length / 2; i++) {
                res = arr[i] + " " + res;
            }
        }
        return res;
    }

    static String higherArithmeticalGap(int[] arr){
        String res = "", res1 = "", res2 = "";
        int sum1 = 0, sum2 = 0;
        for (int i = 0; i < arr.length / 2; i++) {
            sum1 += arr[i];
            res1 = arr[i] + " " + res1;
        }
        for (int i = arr.length / 2; i < arr.length; i++) {
            sum2 += arr[i];
            res2 = arr[i] + " " + res2;
        }
        res = sum1 > sum2 ? res1 : res2;
        return res;
    }

    static String beforeZero(int[] arr){
        String res = "";
        int indx = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == 0){
                indx = i;
            }
        }
        if(indx != 0){
            for (int i = 0; i < indx; i++) {
                res = arr[i] + " " + res;
            }
        }else{
            System.out.println(res = "There no elements before 0 or no zero elments!");
        }
        return res;
    }

    static String beforeMin(int[] arr){
        String res = "";
        int minI = 0, min = arr[1];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
                minI = i;
            }
        }
        if(minI == 0){
            for (int i = 0; i < minI; i++) {
                res = arr[i] + " " + res;
            }
        }else{
            System.out.println(res = "Min element stay on the first position!");
        }
        return res;
    }
}
