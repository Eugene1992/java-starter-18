package CW_6;

/**
 * Created by Олег on 07.02.2017.
 */
public class MethodTest {

    public static void main(String args[]) {

        System.out.println(sum(10, 100, 5));
    }

    static int sum(int start, int end, int step) {
        int sum = 0;
        for (int i = start; i <= end; i = i + step) {
            sum += i;
        }
        return sum;
    }
}




