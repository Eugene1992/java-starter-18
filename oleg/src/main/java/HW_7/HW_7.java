package HW_7;

//Created by Олег on 17.02.2017.
 import java.util.Scanner;
 import java.util.Arrays;


public class HW_7 {

    static void pairNumbers (int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                System.out.print(arr[i] + ", ");
            }
        }
    }

    static void printRevArray(int[] arr) {
        for (int i = arr.length - 1; i > 0; i--) {
            System.out.print(arr[i] + ", ");
        }
    }

    static void printHalfArray(int[] arr){
        System.out.println("First half of the massive");
        for (int i = 0; i <= arr.length / 2; i++) {
            System.out.print(arr[i] + ", ");
        }
        System.out.println();
        System.out.println("Second half of the massive");
        for (int i = arr.length / 2; i < arr.length; i++) {
            System.out.print(arr[i] + ", ");
        }
    }

    static void printHalfRevArray(int[] arr) { //не понимаю, почему не обращается к массиву
        System.out.println("First half revers count");
        for (int i = arr.length; i > arr.length / 2; i--) {
            System.out.print(arr[i] + ", ");
        }
        System.out.println();
        System.out.println("Second half revers count");
        for (int i = arr.length / 2; i >= 1; i--) {
            System.out.print(arr[i] + ", ");
        }
    }

    static int printTotArrayElnts(int[] arr) {
        int tot = 0;
        for (int i = 0; i < arr.length; i++) {
            tot += i;
        }
        return tot;
    }

    static double printAveMathArrayElnts(int[] arr) {
        double tot = 0;
        double sum = 0;
        for (int i = 0; i <= arr.length; i++) {
            tot += i;
            sum = tot / arr.length;
        }
        return tot;
    }

    static int valueMax(int arr[]) {
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    static int valueMin(int[] arr) {
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }

    static void minusChangeToZero (int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (0 > arr[i]) {
                arr[i] = 0;
                System.out.print(arr[i] + ", ");
            }
        }
    }

    static int equalTotElnts (int[] arr) {  //не работает
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

    static void changeMinToMax (int[] arr) {
        int tempMax = 0;
        int tempMin = 0;
        int valueMax = 0;
        int valueMin = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < tempMin) {
                tempMin = arr[i];
                valueMin = i;
            }
            if (arr[i] > tempMax) {
                tempMax = arr[i];
                valueMax = i;
            }
        }
        System.out.println("\nMin index = " + valueMin + "\nMax index = " + valueMax);
        for (int i = 0; i < arr.length; i++) {
                if(i == valueMin) arr[i] = tempMax;
                else if (i == valueMax) arr[i] = tempMin;
            }
        System.out.println("Max value is " + tempMax);
        System.out.println("Min vlaue is " + tempMin);
        for (int a: arr) {
            System.out.print(a + " ");
        }
    }

    /*static int[] invertArray (int[] arr) {  //не работает
        int[] arrRev = 0;
        int j = 0;
        for (int i = arr.length - 1; i >= 0; i--) {
            arrRev[j] = arr[i];
            j++;
        }
        return arrRev;
    } */

    static String printBiggerHalf (int[] arr) {
        String result1 = "", result2 = "", result3 = "";
        int tot = 0, tot1 = 0;
        for (int i = 0; i < arr.length / 2; i++) {
            tot += arr[i];
            result2 = arr[i] + " " + result2;
        }
        for (int i = arr.length / 2; i < arr.length; i++) {
            tot1 += arr[i];
            result3 = arr[i] + " " + result3;
        }
        result1 = tot > tot1 ? result2 : result3;
        return result1;
    }

    static int totalElntsBelowZero (int[] arr) {
        int tot = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                tot += arr[i];
            }
        }
        return tot;
    }

    static int printTotMinusElnts (int[] arr) {
        int tot = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                tot += Math.abs(arr[i]);
            }
        }
        System.out.println(tot * (-1));
        return tot;
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Please, choose desired method");
        System.out.println(" 1 = pairNumbers,\n 2 = printRevArray,\n 3 = printHalfArray,\n 4 = printHalfRevArray,\n 5 = printTotArrayElnts,");
        System.out.println(" 6 = printAveMathArrayElnts,\n 7 = valueMax,\n 8 = valueMin,\n 9 = minusChangeToZero,\n 10 = equalTotElnts,");
        System.out.println(" 11 = changeMinToMax,\n 12 = invertArray,\n 13 = printBiggerHalf,\n 14 = totalElntsBelowZero,\n 15 = printTotMinusElnts");
        System.out.print("Random array elements are ");
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) ((Math.random() * 20) - 5);
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ", ");
        }
        System.out.println();

        int operation = scan.nextInt();

        switch (operation){
            case 1:{
                pairNumbers(arr);
                break;
            }
            case 2:{
                printRevArray(arr);
                break;
            }
            case 3:{
                printHalfArray(arr);
                break;
            }
            case 4:{
                printHalfRevArray(arr);
                break;
            }
            case 5:{
                System.out.println(printTotArrayElnts(arr));
                break;
            }
            case 6:{
                System.out.println(printAveMathArrayElnts(arr));
                break;
            }
            case 7:{
                System.out.println(valueMax(arr));
                break;
            }
            case 8:{
                System.out.println(valueMin(arr));
                break;
            }
            case 9:{
                minusChangeToZero(arr);
                break;
            }
            case 10:{
                System.out.println(equalTotElnts(arr));
                break;
            }
            case 11:{
                changeMinToMax(arr);
            }
            /*case 12:{
                System.out.println(invertArray(arr));
            } */
            case 13: {
                System.out.println(printBiggerHalf(arr));
            }
            case 14:{
                System.out.println(totalElntsBelowZero(arr));
            }
            case 15:{
                System.out.println(printTotMinusElnts(arr));
            }
        }
    }
}
