package cw_04;

public class BreakExample {
    public static void main(String[] args) {
        int count = 10;

        while (count > 0) {
            if (count == 7) break;
            System.out.println(count);
            count--;
        }
        System.out.println("End");
    }
}
