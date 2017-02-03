package cw_05;

public class LogicAndExample {
    public static void main(String[] args) {
        int a = 100;
        /*if (a > 0) {
            if (a != 5) {
                System.out.println(a);
            }
        }

        if (a > 0 && a != 5 && a != 11) {
            System.out.println(a);
        }*/

        /*if (a < 0 && a / 0 == 10) {
            System.out.println(a);
        }*/

        if (a > 0 || a != 5 && a + 10 > 0) {
            System.out.println(a);
        }
    }
}
