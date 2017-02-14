package HW_7;
//1. Вывести в консоль все парные числа одномерного массива.
public class Ex1 {
    public static void main(String[] args) {
        int[] array = new int[]{1, 4, 10, -2, 0, 3};

        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                System.out.println(array[i]);
            }
        }
    }
}
