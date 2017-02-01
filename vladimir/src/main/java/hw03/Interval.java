package hw03;


import java.util.Scanner;

public class Interval {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number from 0 to 100");
        int n = scan.nextInt();
        if (n >= 0 && n <= 14)
            System.out.println("Your number is in interval [0..14]");
        else if (n >= 15 && n <= 35)
            System.out.println("Your number is in interval [15..35]");
        else if (n >= 36 && n <= 50)
            System.out.println("Your number is in interval [36..50]");
        else if (n >= 51 && n <= 100)
            System.out.println("Your number is in interval [51..100]");
        else System.out.println("Your number isnt in interval [0..100]");
    }
}
