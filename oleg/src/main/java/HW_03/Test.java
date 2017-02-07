package HW_03;

import java.util.Scanner;

public class Test {
    public static void main(String args[]) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите начальное число");
        int num1 = scanner.nextInt();

        System.out.println("Введите конечное число");
        int num2 = scanner.nextInt();
        int summe = 0;
        while (num1 < num2) {
            num1++;
            summe = summe + num1;
                    }
        System.out.println(summe);
    }
}