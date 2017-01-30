package cw_03;

public class CastingTest {
    public static void main(String[] args) {
        byte a = 100;
        byte b = 100;
        byte c = (byte)(a + 200); // -128 .. 127

        System.out.println(c);

        int i; // 4 bytes
        i = a; // 1 byte

        long l1 = 50;
        long l2 = 70;

        int sum = (int) (l1 + l2);

        int k = (int) (1000.00 + 1212.00);
        double d = 1000 + 1212;

        short s = 257;
        byte t = (byte) s;
        System.out.println(t);


    }
}
