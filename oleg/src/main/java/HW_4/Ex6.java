package HW_4;

import java.util.Scanner;

/**
 * Created by Олег on 07.02.2017.
 */
public class Ex6 {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Tapez un chiffre");

        int num1 = scan.nextInt();
        int num2 = num1 - 1;
        int res = num1 % num2;
        if (res == 0) {
            System.out.println(num2);
        }
        for (; num2 > 0; num2--) {
            num2 = num2--;
            res = num1 % num2;
            if (res == 0) {
                System.out.println(num2);
            }
        }
    }

}
