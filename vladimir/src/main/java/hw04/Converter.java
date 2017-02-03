package hw04;


import java.util.Scanner;

public class Converter {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String op;
        int sys;
        String res = "";
        String exit = "";
        sys = 0;
        do {
            System.out.println("Enter number");
            int n = scan.nextInt();
            System.out.println("Choose operation: \n2\n8\n16");
            op = scan.next();
            switch (op) {
                case "2": {
                    sys = 2;
                    System.out.printf("In binary number %d = ", n);
                    while (n != 1) {
                        res = n % sys + res;
                        n /= sys;
                    }
                    System.out.println(res);
                    break;
                }
                case "8": {
                    sys = 8;
                    System.out.printf("In octal number %d = ", n);
                    while (n - sys >= -7) {
                        res = n % sys + res;
                        n /= sys;
                    }
                    System.out.println(res);
                    break;
                }
                case "16": {
                    int hex1 = 0;
                    String hex2 = "";
                    sys = 16;
                    System.out.printf("In hexadecimal number %d = ", n);
                    while (n - sys >= -15) {
                        hex1 = n % sys;
                        if(hex1 <= 9)
                            res = hex1 + res;
                        else{
                            switch (hex1){
                                case 10:{
                                    hex2 = "A";
                                    break;
                                }
                                case 11:{
                                    hex2 = "B";
                                    break;
                                }
                                case 12:{
                                    hex2 = "C";
                                    break;
                                }
                                case 13:{
                                    hex2 = "D";
                                    break;
                                }
                                case 14:{
                                    hex2 = "E";
                                    break;
                                }
                                case 15:{
                                    hex2 = "F";
                                    break;
                                }
                            }
                            res = hex2 + res;
                        }
                        n /= sys;
                    }
                    System.out.println(res);
                    break;
                }
                default:
                    System.out.println("You choose wrong operation!");
            }
            System.out.println("Try again?\ny - yes\nn - no");
            exit = scan.next();
            System.out.println("\n\n");
        } while (exit.equals("y"));
    }
}
