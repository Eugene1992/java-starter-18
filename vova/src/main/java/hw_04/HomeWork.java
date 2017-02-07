package hw_04;


import java.util.Scanner;

public class HomeWork {
    public static void main(String[] args) {
        //1.1
//        for(int numb = 1000; numb < 10000; numb++){
//            System.out.print(numb + " ");
//        }
        //1.2
//        int numb = 1000;
//        while(numb<10000){
//            System.out.print(numb+" ");
//            numb++;
//        }

        //2.1
//        for (int numb = 1; numb < 57; numb+=2){
//            System.out.print(numb + " ");
//        }
        //2.2
//        int value = 1;
//            while(value<57){
//                System.out.print(value + " ");
//                value+=2;
//            }
        //3.1
//        for(int value = 90; value>=0; value-=5){
//            System.out.print(value+" ");
//        }
        //3.2
//        int value = 90;
//        while (value>=0){
//            System.out.print(value+" ");
//            value-=5;

//        }
        //4.1
//        for(int a = 2; a<Math.pow(2,21); a*=2 ){
//            System.out.print(a + " ");
//        }
        //4.2
//        int a = 2;
//        while (a < Math.pow(2,21)){
//            System.out.print(a + " ");
//            a*=2;
//        }

        //5.1

//      *  5. Выведите на экран первые 20 членов последовательности Фибоначчи.

//        int members = 18;
//        int firstMember = 0;
//        int secondMember = 1;
////        int currentValue = firstMember;
//        System.out.println(firstMember);
//        System.out.println(secondMember);
//        for (int a = 0; a < members; a++) {
//            int result = firstMember + secondMember;
//            System.out.println(result);
//            firstMember = secondMember;
//            secondMember = result;
//
//        }
        /**
         *  6. Написать программу, которая реализует следующий функционал:
         * 6.1 Пользователь вводит число в 10-ой системе счисления.
         *6.2 Программа выводит сообщение в котором предлагает пользователю перевести данное число в одну из систем счисления на выбор:
         1) в 2-ую
         2) в 8-ую
         3) в 16-ую
         *6.3 Пользователь выбирает один из предложенных вариантов, программа выполняет соответствующий перевод числа и выводит
         на экран результат.
         */
//        Scanner scan = new Scanner(System.in);
//        System.out.println("Введите число");
//        int value = scan.nextInt();
//        System.out.println("Вы можете перевести число в одну из систем счисления: \n 1) в 2-ую \n 2) в 8-ую \n 3) в 16-ую");
//        int value2 = scan.nextInt();
//        switch (value2) {
//            case 1:
//                int f11 = value % 2;
//                value = value / 2;
//                int f21 = value % 2;
//                value = value / 2;
//                int f31 = value % 2;
//                value = value / 2;
//                int f41 = value % 2;
//                value = value / 2;
//                int f51 = value % 2;
//                value = value / 2;
//                int f61 = value % 2;
//                value = value / 2;
//                int f71 = value % 2;
//                value = value / 2;
//                int f81 = value % 2;
//
//                System.out.println(f81 + "" + f71 + "" + f61 + "" + f51 + " " + f41 + "" + f31 + "" + f21 + "" + f11);
//                System.out.println(value);
//
//                break;
//
//            case 2:
//        int first = 259;
//        String second = "";
//        for (; first > 0; first /= 8) {
//
//            second = first % 8 + second;
//        }
//        System.out.print(second);
//
//                    case 3:


//                }

//        }

//       * 7. Создайте программу, вычисляющую факториал натурального числа n, введенного пользователем.

//        int firstNum = scan.nextInt();
//        int secondNum = firstNum - 1;
//        int result = firstNum * secondNum;
//        for (; secondNum > 2; firstNum--) {
//            firstNum = result;
//            secondNum = secondNum - 1;
//            result = firstNum * secondNum;
//
//        }
//        System.out.println(result);


//       * 8. Выведите на экран все положительные делители натурального числа, введенного пользователем.

//                int firstNum = scan.nextInt();
//                int secondNum = firstNum - 1;
//                int result = firstNum % secondNum;
//                if (result == 0) {
//                    System.out.println(secondNum);
//                }
//                for (; secondNum > 0; secondNum--) {
//                    secondNum = secondNum--;
//                    result = firstNum % secondNum;
//                    if (result == 0) {
//                        System.out.println(secondNum);
//                    }
//
//
//                }
//        }



    }
}






