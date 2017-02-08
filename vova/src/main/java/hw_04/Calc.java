package hw_04;


import java.util.Scanner;

public class Calc {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите число");
        int value = scan.nextInt();
        System.out.println("Вы можете перевести число в одну из систем счисления: \n 1) в 2-ую \n 2) в 8-ую \n 3) в 16-ую");
        int value2 = scan.nextInt();
        switch (value2) {
            case 1: {
                String sys = "";
                for (; value > 0; value /= 2) {
                    sys = value % 2 + sys;
                }
                System.out.println(sys);
            }
            case 2: {
                String sys = "";
                for (; value > 0; value /= 8) {
                    sys = value % 8 + sys;
                }
                System.out.println(sys);
            }
            case 3: {
                String sys = "";
                for (; value > 0; value /= 15) {
                    int numb = value % 15;
                    if (value <= 15) {

                        if (value == 10) {
                            System.out.println("A");
                            break;
                        }
                        if (value == 11) {
                            System.out.println("B");
                            break;
                        }
                        if (value == 12) {
                            System.out.println("C");
                            break;
                        }
                        if (value == 13) {
                            System.out.println("D");
                            break;
                        }
                        if (value == 14) {
                            System.out.println("E");
                            break;
                        }
                        if (value == 15) {
                            System.out.println("F");
                            break;
                        }
                        sys = value + sys;

                        System.out.println(sys);
                    }
                }
            }
        }
    }
}


