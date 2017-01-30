
public class hw02_10 {
    public static void main(String[] args){
        byte a = 21;                      // 1)
        short b = 23345;
        int c = 1232133122;
        long d = 1999999999;

        byte e = 23 + 10;                 // 2)

        short f = 32435 - 21312;          // 3)

        int g = 3240 / 15;                // 4)

        long j = 2321 * 2143;             // 5)

        byte a1 = 43, a2 = 14;            // 6)
        a = (byte)(a1 + a2);

        short b1 = 12, b2 = 32;           // 7)
        byte a3 = (byte)((b1 * b2) / a1);

        int c1 = (b1 / b2) * (a1 / a2);   // 8)

        int c2 = 1548, c3 = 47856, c4;    // 9)
        c4 = c2;
        c2 = c3;
        c3 = c4;

        int c5 = 324, c6 = 645675;        // 10)
        c5 += c6;
        c6 = c5 - c6;
        c5 = c5 - c6;
    }
}
