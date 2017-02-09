package HW_05;



/* Электронные часы показывают время в формате от 00:00 до 23:59. Подсчитать сколько раз за сутки случается так, что
слева от двоеточия показывается симметричная комбинация для той, что справа от двоеточия (например, 02:20, 11:11 или 15:51)
*/
public class HW5_1 {

    public static void main(String args[]) {

        int h, m, n = 0;
        for (h = 0; h < 24; h++) {
            for (m = 0; m < 60; m++) {
                int l, k; String j = "";
                l = m / 10;
                k = m % 10;
                j = k + j + l;
                if(h == Integer.valueOf(j)){
                    System.out.print(h + ":" + l + k + "\n");
                    n++;
                }
            }
        }
        System.out.println("Total count " + n);
    }
}
