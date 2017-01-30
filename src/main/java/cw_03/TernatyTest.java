package cw_03;

public class TernatyTest {
    public static void main(String[] args) {
//        condition ? <if true> : <if false>;
        int a = 10;
        int b;

        if (a > 5) {
            if (a == 10) {
                b = 1000;
            } else {
                b = 100;
            }
        } else {
            b = 0;
        }

        int c = a > 5 ? a == 10 ? 1000 : 100 : 0;

        System.out.println(b);
        System.out.println(c);

        int age = 22;
        String ageStatus = age > 18 ? "18+" : "18-";
    }
}
