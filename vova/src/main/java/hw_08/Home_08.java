package hw_08;


import java.util.Scanner;

public class Home_08 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Выберите метод :\n  1)equals\n  2)startsWith\n  3)endWith\n  4)indexOf\n  5)lastIndexOf ");
        int choice = scan.nextInt();
        switch (choice) {
            case 1: {
                System.out.println("  Введите строку");
                String firstLine = scan.next();
                System.out.println("  Введите строку");
                String secondLine = scan.next();
                System.out.println(equals(firstLine, secondLine));
                break;
            }
            case 2: {
                System.out.println("  Введите строку");
                String firstLine = scan.next();
                System.out.println("  Введите строку");
                String secondLine = scan.next();
                System.out.println(startsWith(firstLine, secondLine));
                break;
            }
            case 3: {
                System.out.println("  Введите строку");
                String firstLine = scan.next();
                System.out.println("  Введите строку");
                String secondLine = scan.next();
                System.out.println(endWith(firstLine, secondLine));
                break;
            }
            case 4: {
                System.out.println("  Введите строку");
                String firstLine = scan.next();
                System.out.println("  Введите символ");
                String secondLine = scan.next();
                System.out.println(indexOf(firstLine, secondLine));
                break;
            }
            case 5: {
                System.out.println("  Введите строку");
                String firstLine = scan.next();
                System.out.println("  Введите символ");
                String secondLine = scan.next();
                System.out.println(lastIndexOf(firstLine, secondLine));
                break;
            }
        }

    }

    static boolean equals(String firstLine, String secondLine) {
        boolean res = false;
        char[] firstArray = firstLine.toCharArray();
        char[] secondArray = secondLine.toCharArray();

        for (int i = 0; i < firstArray.length; i++) {
            if (firstArray.length != secondArray.length) {
                res = false;
                break;
            }
            if (firstArray[i] == secondArray[i]) {
                res = true;
            } else if (firstArray[i] != secondArray[i]) {
                res = false;
                break;
            }
        }
        return res;
    }

    static boolean startsWith(String firstLine, String secondLine) {
        boolean res = false;
        char[] firstArray = firstLine.toCharArray();
        char[] secondArray = secondLine.toCharArray();
        for (int i = 0; i < firstArray.length / 2; i++) {
            if (firstArray[i] == secondArray[i]) {
                res = true;
                break;
            } else {
                res = false;
                break;
            }
        }
        return res;
    }

    static boolean endWith(String firstLine, String secondLine) {
        boolean res = false;
        char[] firstArray = firstLine.toCharArray();
        char[] secondArray = secondLine.toCharArray();
        for (int i = 1; i <= secondArray.length; i++) {
            if (firstArray[firstArray.length - i] == secondArray[secondArray.length - i]) {
                res = true;
            } else {
                res = false;
                break;
            }
        }
        return res;
    }

    static int indexOf(String firstLine, String secondLine){
        char[] firstArray = firstLine.toCharArray();
        char[] secondArray = secondLine.toCharArray();
        int res = 0 ;
        for(int i = 0; i <= firstArray.length; i++){
            if(firstArray[i] == secondArray[0]){
                res = i;
                break;
            }
        }
        return res;
    }

    static int lastIndexOf(String firstLine, String secondLine){
        char[] firstArray = firstLine.toCharArray();
        char[] secondArray = secondLine.toCharArray();
        int res = 0 ;
        for (int i = firstArray.length; i > 0 ; i--) {
            if(firstArray[i] == secondArray[0]){
                res = i;
                break;
            }
        }
        return res;
    }
}


