package cw_04;

public class InnerCyclesBreak {
    public static void main(String[] args) throws InterruptedException {
        outer:
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
            inner:
            for (int j = 0; j < 10; j++) {
                if (i == 5) break outer;
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
