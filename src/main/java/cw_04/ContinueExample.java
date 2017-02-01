package cw_04;

public class ContinueExample {
    public static void main(String[] args) {
        int count = 10;

        /*while (count > 0) {
            if (count == 7) continue;
            System.out.println(count);
            count--;
        }*/

        for (int i = 10; i > 0; i--) {
            if (i == 7) continue;
            System.out.println(i);
        }
    }
}
