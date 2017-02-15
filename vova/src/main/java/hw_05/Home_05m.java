package hw_05;

import java.util.Scanner;


public class Home_05m {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("  Сделайте свой выбор : \n  1)luckyNumbers  \n  2)unluckyNumbers  \n  3)clock");
        int task = scan.nextInt();
        switch (task) {
            case 1: {
                System.out.println(" Счастливых билетиков " + luckyNumbers());
                break;
            }
            case 2: {
                System.out.println(unluckyNumbers() + " не счастливых номеров");
                break;
            }
            case 3: {
                System.out.println(clock() + " раз за сутки случается так, что слева от двоеточия показывается " +
                        "симметричная комбинация для той, что справа от двоеточия ");
                break;
            }
        }
    }

    static int luckyNumbers() {
        int n = 0;
        for (int i = 1; i <= 999999; i++) {
            int n1 = (i / 100000) % 10;
            int n2 = (i / 10000) % 10;
            int n3 = (i / 1000) % 10;
            int n4 = (i / 100) % 10;
            int n5 = (i / 10) % 10;
            int n6 = i % 10;
            if (n1 + n2 + n3 == n4 + n5 + n6) {
                n++;
            }
        }
//        System.out.println(" Счастивых билетиков - " + n);
        return n;
    }

    static int clock() {
        int n = 0;
        for (int i = 0; i <= 23; i++) {
            for (int j = 0; j <= 59; j++) {
                int i1 = i % 10;
                int i2 = i / 10;
                int j1 = j / 10;
                int j2 = j % 10;
                if (i1 == j1 && i2 == j2) {
                    n++;
//                        System.out.printf("\n%1$02d:%2$02d", i, j);
                }
            }
        }
        return n;
//        System.out.println("\n" + b + " раз за сутки случается так, что слева от двоеточия показывается" +
//                " симметричная комбинация для той, что справа от двоеточия ");
    }

    static int unluckyNumbers() {
        int n = 0;
        for (int i = 1; i <= 999999; i++) {
            int i1 = i / 100000;
            int i2 = (i / 10000) % 10;
            int i3 = (i / 1000) % 10;
            int i4 = (i / 100) % 10;
            int i5 = (i / 10) % 10;
            int i6 = i % 10;
            if ((i6 == 3 & i5 == 1) || (i5 == 3 & i4 == 1) || (i4 == 3 & i3 == 1) || (i3 == 3 & i2 == 1) || (i2 == 3 & i1 == 3)) {
                n++;
//                System.out.println(i1 + " " + i2 + " " + i3 + " " + i4 + " " + i5 + " " + i6);
            }
        }
//        System.out.println(b + " не счастливых номеров");
        return n;
    }
}
