package hw05;


import java.util.Scanner;

public class HW_05m {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int exit;
        do {
            System.out.println("\nChoose task:\n1) Clock\n2) Lucky tickets\n3) Unlucky tickets\n0) Exit");
            int task = scan.nextInt();
            switch (task) {
                case 1: {
                    System.out.println("Number of mirror time= " + clock());
                    exit = 1;
                    break;
                }
                case 2:{
                    System.out.println("\nNumber of lucky tickets = " + luckyTickets());
                    exit = 1;
                    break;
                }
                case 3:{
                    System.out.println("\nNumber of unlucky tickets = " + unluckyTickets());
                    exit = 1;
                    break;
                }
                default: exit = 0;
            }
        }while(exit != 0);
    }

    static int clock() {
        int hour, minute, n = 0;
        for (hour = 0; hour < 24; hour++) {
            for (minute = 0; minute < 60; minute++) {
                int a, b;
                String c = "";
                a = minute / 10;
                b = minute % 10;
                c = b + c + a;
                if (hour == Integer.valueOf(c)) {
                    System.out.print(hour + ":" + a + b + "\n");
                    n++;
                }
            }
        }
        return n;
    }

    static int luckyTickets(){
        int n = 0;
        for (int i = 1000; i < 1000000; i++) {
            int number1 = i / 100000;
            int number2 = (i / 10000) % 10;
            int number3 = (i / 1000) % 10;
            int number4 = (i / 100) % 10;
            int number5 = (i / 10) % 10;
            int number6 = i % 10;
            if (number1 + number2 + number3 == number4 + number5 + number6) {
                n++;
                //System.out.print(i + " ");
            }
        }
        return n;
    }

    static int unluckyTickets(){
        int n = 0;
        for (int i = 1000; i < 1000000; i++) {
            int number1 = i / 10000;
            int number2 = (i / 1000) % 100;
            int number3 = (i / 100) % 100;
            int number4 = (i / 10) % 100;
            int number5 = i % 100;
            if (number1 == 13 || number2 == 13 || number3 == 13 ||
                    number4 == 13 || number5 == 13) {
                n++;
                //System.out.print(i + " ");
            }
        }
        return n;
    }
}
