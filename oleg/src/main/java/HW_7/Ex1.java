package HW_7;
//1. Вывести в консоль все парные числа одномерного массива.
public class Ex1 {
    public static void main(String[] args) {
        int[] array = new int[100];

        for (int i = 0; i < array.length; i++) {
            array[i] = i;
            System.out.println(i % 2 == 0);
        }
    }
}
