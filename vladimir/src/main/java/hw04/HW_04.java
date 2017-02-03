package hw04;


public class HW_04 {
    public static void main(String[] args) {

        int i = 1000;                       //  1)
        while (i < 10000) {
            System.out.print(i + ", ");
            i += 3;
        }
        System.out.println("\n\n");


        for (i = 1; i <= 55; ) {           //  2)
            System.out.print(i + ", ");
            i += 2;
        }
        System.out.println("\n\n");


        i = 90;                             // 3)
        while (i >= 0) {
            System.out.print(i + ", ");
            i -= 5;
        }
        System.out.println("\n\n");


        int j = 2;                          //  4)
        for (i = 0; i < 20; i++) {
            System.out.print(j + ", ");
            j *= 2;
        }
        System.out.println("\n\n");


        i = 1;                              //  5)
        j = 1;
        int o = 0;
        System.out.print(i + ", " + j + ", ");
        for (int k = 0; k < 18; k++) {
            o = i;
            i += j;
            j = o;
            System.out.print(i + ", ");
        }
    }
}
