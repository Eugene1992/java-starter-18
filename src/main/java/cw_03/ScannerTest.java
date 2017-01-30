package cw_03;

import java.util.Scanner;

public class ScannerTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = scanner.nextInt();
        System.out.println(num);

        String str = scanner.next();
        System.out.println(str);

    }
}
