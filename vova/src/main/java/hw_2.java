/**
 * Created by Vladimir on 29.01.2017.
 */
public class hw_2 {
    public static void main(String[] args) {

        //дз

        //1)Создать четыре целочисленные переменные типов byte, short, int, long
        byte a;
        short b;
        int c;
        long d;

        //2) Инициализировать переменную типа byte результатом суммы двух любых чисел
        byte a1 = 4 + 7;

        //3)Инициализировать переменную типа short результатом вычитания двух любых чисел
        short b1 = 22 - 14;

        //4)Инициализировать переменную типа int результатом деления двух любых чисел
        int c1 = 68 /2;

        //5)Инициализировать переменную типа long результатом умножения двух любых чисел
        long d1 = 5 * 7;

        //6)Передать переменной типа byte результат суммы двух переменных типа byte
        byte a2 = 1;
        byte a3 = 1;
        //byte a4 = a2 + a3;//ОШИБКА КОМПИЛЯЦИИ (не влазит сумма 2 byte в переменную c типом byte, просит int)
        int c2 = a2 + a3;

        //7) Передать переменной типа byte результат суммы двух переменных типа short, деленных на третью переменную типа byte
        short b2 = 75;
        short b3 = 63;
        byte a5 = 3;
//        byte a6 = (b2 + b3)/a5;//просит int
        int c3 = (b2 + b3)/a5;

        //8) Переменной типа int передать результат деления двух short, умноженных на результат деления двух byte
        short b4 = 40;
        short b5 = 20;
        byte a7 = 8;
        byte a8 = 4;
        int c4 = (b4/b5)*(a7/a8);

        //9)Поменять значения двух целочисленных переменных используя третью
        int x = 100;
        int y = 200;
        int z ;
        z = x;
        x = y;
        y = z;
        System.out.println("9) "+"x="+ x + " " + "y="+y );

        //10)Поменять значения двух переменных без использования третей

        int x1 = 5;
        int y1 = 10;

        x1 = x1 + y1;
        y1 = x1 - y1;
        x1 = x1 - y1;
        System.out.println("10) "+"x1="+x1+" "+"y1="+y1);

        int k = 50;


//11
        System.out.println( Integer.toBinaryString(k));
        System.out.println("int c = "+"13");

        System.out.println();



//11
        int f = 50;
        int f10 = f/2;
        int f11 = f%2;
        int f20 = f10/2;
        int f21 = f10%2;
        int f30 = f20/2;
        int f31 = f20%2;
        int f40 = f30/2;
        int f41 = f30%2;
        int f50 = f40/2;
        int f51 = f40%2;
        int f60 = f50/2;
        int f61 = f50%2;
        int f70 = f60/2;
        int f71 = f60%2;
        int f80 = f70/2;
        int f81 = 70%2;

        System.out.println( f81+""+f71+""+f61+""+f51+" "+ f41+""+f31+""+f21+""+f11);
        System.out.println(f);







    }
}
