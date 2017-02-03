package cw_05;

public class LeftShift {
    public static void main(String[] args) {
        int a = 64;
        System.out.println(a << 2);

//       0000 0000 0000 0000 0000 0001 0000 0000

        byte b = (byte)(64 << 2);
//       0100 0000
        System.out.println(b);
    }
}
