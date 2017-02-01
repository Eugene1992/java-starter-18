package cw_04;

public class DoWhile {
    public static void main(String[] args) {
        int count = 10;

        do {
            System.out.println(count);
            count--;
        } while (count < 0);

        while (count < 0) {
            System.out.println(count);
        }
    }
}
