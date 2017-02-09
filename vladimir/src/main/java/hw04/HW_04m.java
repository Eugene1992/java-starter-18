package hw04;


import java.util.Scanner;

public class HW_04m {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int exit;
        do {
            System.out.println("\nChoose task:\n1) Factorial\n2) Dividers\n3) Converter\n4) Simple cycles\n0) Exit");
            int task = scan.nextInt();
            switch (task) {
                case 1: {
                    System.out.println("Enter the number");
                    int n = scan.nextInt();
                    System.out.println(factorial(n));
                    ;
                    exit = 1;
                    break;
                }
                case 2: {
                    System.out.println("Enter the number");
                    int n = scan.nextInt();
                    System.out.println(dividers(n));
                    ;
                    exit = 1;
                    break;
                }
                case 3: {
                    System.out.println("Enter number");
                    int n = scan.nextInt();
                    System.out.println("Choose operation: \n2\n8\n16");
                    int op = scan.nextInt();
                    System.out.println(converter(n, op));
                    exit = 1;
                    break;
                }
                case 4: {
                    simpleCycles();
                    exit = 1;
                    break;
                }
                default:
                    exit = 0;
            }
        }
        while (exit != 0);
    }

    static int factorial(int n) {
        int res = 1;
        for (int i = 1; i <= n; i++) {
            res *= i;
        }
        return res;
    }

    static String dividers(int n) {
        String res = "";
        for (int i = 1; i <= n; i++) {
            if (n % i == 0)
                res += i + " ";
        }
        return res;
    }

    static String converter(int n, int op) {
        int sys;
        String res = "";
        switch (op) {
            case 2: {
                sys = 2;
                System.out.printf("In binary number %d = ", n);
                while (n != 1) {
                    res = n % sys + res;
                    n /= sys;
                }
                break;
            }
            case 8: {
                sys = 8;
                System.out.printf("In octal number %d = ", n);
                while (n - sys >= -7) {
                    res = n % sys + res;
                    n /= sys;
                }
                break;
            }
            case 16: {
                int hex1 = 0;
                String hex2 = "";
                sys = 16;
                System.out.printf("In hexadecimal number %d = ", n);
                while (n - sys >= -15) {
                    hex1 = n % sys;
                    if (hex1 <= 9)
                        res = hex1 + res;
                    else {
                        switch (hex1) {
                            case 10: {
                                hex2 = "A";
                                break;
                            }
                            case 11: {
                                hex2 = "B";
                                break;
                            }
                            case 12: {
                                hex2 = "C";
                                break;
                            }
                            case 13: {
                                hex2 = "D";
                                break;
                            }
                            case 14: {
                                hex2 = "E";
                                break;
                            }
                            case 15: {
                                hex2 = "F";
                                break;
                            }
                        }
                        res = hex2 + res;
                    }
                    n /= sys;
                }

                break;
            }
            default:
                System.out.println("You choose wrong operation!");
        }
        return res;
    }

    static void simpleCycles() {
        int i = 1000;                       //  1)
        while (i < 10000) {
            System.out.print(i + ", ");
            i += 3;
        }
        System.out.println("\n\n");


        for (i = 1; i <= 55; ) {           //  2)
            System.out.print(i + ", ");
            i += 2;
        }
        System.out.println("\n\n");


        i = 90;                             // 3)
        while (i >= 0) {
            System.out.print(i + ", ");
            i -= 5;
        }
        System.out.println("\n\n");


        int j = 2;                          //  4)
        for (i = 0; i < 20; i++) {
            System.out.print(j + ", ");
            j *= 2;
        }
        System.out.println("\n\n");


        i = 1;                              //  5)
        j = 1;
        int o = 0;
        System.out.print(i + ", " + j + ", ");
        for (int k = 0; k < 18; k++) {
            o = i;
            i += j;
            j = o;
            System.out.print(i + ", ");
        }
    }
}
