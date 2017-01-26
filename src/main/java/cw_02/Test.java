package cw_02;

public class Test {
    public static void main(String[] args) {

        boolean flag1 = true;  //  Ctrl + /
        boolean flag2 = false; /*  Ctrl + Shift + / */

        char symb1 = 'h';
        char symb2 = 104;
        char symb3 = '\u2343'; // Unicode

        System.out.println(symb2);

        byte b = 100; // 0000 0000
        short s = 32000;
        int i = 2_000_000_000;
        long l = 2_000_000_000_000_000_000L;

        float f = 100.0F;
        double d1 = 100.0;
        double d2 = 100;

        System.out.println(d2);
    }
}
