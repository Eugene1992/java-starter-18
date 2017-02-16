package hw07;

import java.util.Scanner;

public class StringMethods {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int exit = 0;
        boolean res = false;
        String answ ="";
        do {
            System.out.println("Choose operation:\n1) Equals\n2) StartsWith\n3) EndsWith\n4) IndexOf\n5) LastIndexOf0\n0) Exit");
            int op = scan.nextInt();
            switch (op) {
                case 1: {
                    System.out.println("Enter first string");
                    String str1 = scan.next();
                    System.out.println("Enter second string");
                    String str2 = scan.next();
                    res = equals(str1, str2);
                    answ = res == false ? "not equal": "equal";
                    System.out.println("This two string are " + answ);
                    System.out.println("Checker = " + str1.equals(str2));
                    break;
                }
                case 2: {
                    System.out.println("Enter string");
                    String str = scan.next();
                    System.out.println("Enter star symbol or string");
                    String symbol = scan.next();
                    res = startsWith(str, symbol);
                    answ = res == false ? "not with " + symbol: "with " + symbol;
                    System.out.println("This string starts " + answ);
                    System.out.println("Checker = " + str.startsWith(symbol));
                    break;
                }
                case 3: {
                    System.out.println("Enter string");
                    String str = scan.next();
                    System.out.println("Enter end symbol or string");
                    String symbol = scan.next();
                    res = endWith(str, symbol);
                    answ = res == false ? "not with " + symbol: "with " + symbol;
                    System.out.println("This string ends " + answ);
                    System.out.println("Checker = " + str.endsWith(symbol));
                    break;
                }
                case 4: {
                    System.out.println("Enter string");
                    String str = scan.next();
                    System.out.println("Enter symbol which you wanna find");
                    String symbol = scan.next();
                    System.out.println("Symbol " + symbol + " is on the " + indexOf(str,symbol) + " place");
                    System.out.println("Checker = " + str.indexOf(symbol));
                    break;
                }
                case 5: {
                    System.out.println("Enter string");
                    String str = scan.next();
                    System.out.println("Enter symbol which you wanna find");
                    String symbol = scan.next();
                    System.out.println("Symbol " + symbol + " is on the " + lastIndexOf(str,symbol) + " place");
                    System.out.println("Checker = " + str.lastIndexOf(symbol));
                    break;
                }
                case 0: {
                    exit = 1;
                    break;
                }
                default: {
                    System.out.println("You choose wrong operation");
                }
            }
        }while(exit != 1);
    }

    static boolean equals(String str1, String str2){
        boolean res = false;
        char[] chars1 = str1.toCharArray();
        char[] chars2 = str2.toCharArray();
        if (chars1.length != chars2.length){
            res = false;
        }else {
            for (int i = 0; i < chars1.length; i++) {
                if(chars1[i] != chars2[i]){
                    res = false;
                    break;
                }else{
                    res = true;
                }
            }
        }
        return res;
    }

    static boolean startsWith(String str, String symbol){
        boolean res = false;
        char[] chars1 = str.toCharArray();
        char[] chars2 = symbol.toCharArray();
        for (int i = 0; i < chars2.length; i++) {
            if(chars1[i] != chars2[i]){
                res = false;
                break;
            }else {
                res = true;
            }
        }
        return res;
    }
    static boolean endWith(String str, String symbol){
        boolean res = false;
        char[] chars1 = str.toCharArray();
        char[] chars2 = symbol.toCharArray();
        int j = chars1.length - 1;
        for (int i = chars2.length - 1; i >= 0 ; i--) {
            if(chars1[j] != chars2[i]){
                res = false;
                break;
            }else {
                res = true;
            }
            j--;
        }
        return res;
    }

    static int indexOf(String str, String symbol){
        int index = 0;
        char[] chars1 = str.toCharArray();
        char[] chars2 = symbol.toCharArray();
        for (int i = 0; i < chars1.length; i++) {
            if(chars1[i] == chars2[0]){
                index = i;
                break;
            }
        }
        return index;
    }

    static int lastIndexOf(String str, String symbol){
        int index = 0;
        char[] chars1 = str.toCharArray();
        char[] chars2 = symbol.toCharArray();
        for (int i = chars1.length - 1; i >= 0; i--) {
            if(chars1[i] == chars2[0]){
                index = i;
                break;
            }
        }
        return index;
    }
}
