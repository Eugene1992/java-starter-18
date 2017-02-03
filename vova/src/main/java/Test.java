import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
//
//                                          //дз
//
//        //1)Создать четыре целочисленные переменные типов byte, short, int, long
//        byte a;
//        short b;
//        int c;
//        long d;
//
//        //2) Инициализировать переменную типа byte результатом суммы двух любых чисел
//        byte a1 = 4 + 7;
//
//        //3)Инициализировать переменную типа short результатом вычитания двух любых чисел
//        short b1 = 21 - 14;
//
//        //4)Инициализировать переменную типа int результатом деления двух любых чисел
//        int c1 = 68 /2;
//
//        //5)Инициализировать переменную типа long результатом умножения двух любых чисел
//        long d1 = 5 * 7;
//
//        //6)Передать переменной типа byte результат суммы двух переменных типа byte
//        byte a2 = 1;
//        byte a3 = 1;
//
//        //byte a4 = a2 + a3;//ОШИБКА КОМПИЛЯЦИИ (не влазит сумма 2 byte в переменную c типом byte, просит int)
//        int c2 = a2 + a3;
//
//        //7) Передать переменной типа byte результат суммы двух переменных типа short, деленных на третью переменную типа byte
//        short b2 = 75;
//        short b3 = 63;
//        byte a5 = 3;
////        byte a6 = (b2 + b3)/a5;//просит int
//        int c3 = (b2 + b3)/a5;
//
//        //8) Переменной типа int передать результат деления двух short, умноженных на результат деления двух byte
//        short b4 = 40;
//        short b5 = 20;
//        byte a7 = 8;
//        byte a8 = 4;
//        int c4 = (b4/b5)*(a7/a8);
//
//        //9)Поменять значения двух целочисленных переменных используя третью
//        int x = 100;
//        int y = 200;
//        int z ;
//        z = x;
//        x = y;
//        y = z;
//        System.out.println("9) "+"x="+ x + " " + "y="+y );
//
//        //10)Поменять значения двух переменных без использования третей
//
//        int x1 = 5;
//        int y1 = 10;
//
//        x1 = x1 + y1;
//        y1 = x1 - y1;
//        x1 = x1 - y1;
//        System.out.println("10) "+"x1="+x1+" "+"y1="+y1);
//
//        int k = 13;
//
//        System.out.println( Long.toBinaryString(k));
//        System.out.println("int c = "+"13");
//
//        System.out.println();
//
////        int a = 0, b;
////        a = a + b;
////        System.out.print(a);
//
//
//
//

//        int f = 259;
//        int f1 = f % 8;

//        f = f / 8;
//        int f2 = f % 8;
//        f = f / 8;
//        int f3 = f % 8;
//        f = f / 8;
//        int f4 = f % 8;
//        f = f / 8;
//        int f5 = f % 8;
//        f = f/8;
//        int f6 = f % 8;
//        f = f / 8;
//        int f7 = f % 8;
//        f = f / 8;
//        int f8 = f % 8;
//
//        System.out.println(f8+""+f7 +""+f6+""+f5+""+f4+""+f3+""+f2+""+f1);

        int first = 259;
        int second = 259/8;
        int result = first%8;
        System.out.print(result);
        for(; second > 0; second/=8 ){
            first = second;
            System.out.print((second)%8);



        }
    }
}
