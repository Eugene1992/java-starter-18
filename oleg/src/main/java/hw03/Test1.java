package hw03;

import java.util.Scanner;

public class Test1 {
    public static void main(String args[]) {

        Scanner scanner = new Scanner(System.in);

        int num = scanner.nextInt();

        if(num % 2 == 0) {
            System.out.println("Число " + num + " четное");
        } else {
            System.out.println("Число " + num + " нечетное");
        }
    }
}