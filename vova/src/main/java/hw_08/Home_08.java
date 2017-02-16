package hw_08;


import java.util.Scanner;

public class Home_08 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Выберите метод :\n  1)equals\n  2)startsWith\n  3)endWith\n  4)indexOf\n  5)lastIndexOf ");
        int choice = scan.nextInt();
        switch (choice){
            case 1:{
                System.out.println("  Введите строку");
                String firstLine = scan.next();
                System.out.println("  Введите строку");
                String secondLine = scan.next();
                System.out.println(equals(firstLine, secondLine));
                break;
            }
        }

    }

    static String equals(String firstLine, String secondLine) {
        String res = "";
        char[] firstArray = firstLine.toCharArray();
        char[] secondArray = secondLine.toCharArray();
        int number1 = firstArray[0];
        int number2 = secondArray[0];
        for (int i = 0; i < firstArray.length; i++) {
            number1 = firstArray[i];
            for (int j = 0; j < secondArray.length; j++) {
                number2 = secondArray[j];
                if(firstArray.length!=secondArray.length){
                    res = "false";
                    break;
                }
                if (number1 == number2) {
                    res = "true";
                    return res;

                } else {
                    res = "false";
                    return res;
                }
            }
        }
        return res;
    }
}


