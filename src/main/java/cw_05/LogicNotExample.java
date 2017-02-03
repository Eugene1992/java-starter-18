package cw_05;

public class LogicNotExample {
    public static void main(String[] args) {
        int a = 10;
        boolean flag = false;

        while (!flag) {
            if (a < 0) flag = true;
            System.out.println(a);
            a--;
        }

        System.out.println(~10 + 1);
    }
}
