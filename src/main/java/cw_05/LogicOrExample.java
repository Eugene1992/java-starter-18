package cw_05;

public class LogicOrExample {
    public static void main(String[] args) {
        int a = 100;

        if (a > 0 || a / 0 == 10) {
            System.out.println(a);
        }
    }
}
