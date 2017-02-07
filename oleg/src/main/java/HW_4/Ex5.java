package HW_4;

/**
 * Created by Олег on 07.02.2017.
 */
public class Ex5 {
    public static void main(String args []) {

        int a = 1;
        int b = 1;
        int c = 0;
        System.out.print(a + ", " + b + ", ");
        for (int k = 0; k < 18; k++) {
            c = a;
            a += b;
            b = c;
            System.out.print(a + ", ");
        }
    }

}
