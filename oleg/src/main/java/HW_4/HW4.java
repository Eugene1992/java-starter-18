package HW_4;

import java.util.Scanner;

public class HW4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        switch (num){
            case 1:
                int start = scanner.nextInt();
                int end = scanner.nextInt();
                int step = scanner.nextInt();
                firstSequence(start, end, step);
                break;

            case 2:
                String name = scanner.next();
                printName(name);
                break;
        }
    }

    /*

     */
    static void firstSequence(int start, int end, int step) {
        for (int i = start; i < end; i += step) {
            System.out.print(i);
        }
    }

    static void printName(String name) {
        System.out.println(name);
    }
}
