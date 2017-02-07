package HW_4;
import java.util.Scanner;
/**
 * Created by Олег on 07.02.2017.
 */
public class Factorial {
    public static void main(String args []) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Tapez un chiffre: ");

        int num1 = scan.nextInt();
        /*int num2 = num1 - 1;
        int result = num1 * num2;
        for (; num2 > 2; num1--) {
            num1 = result;
            num2 -= 1;
            result = num1 * num2;

        }*/
        int sum = 1;
        while (num1 > 0) {
            sum = sum * num1--;
        }
        System.out.println(sum);
    }

}
