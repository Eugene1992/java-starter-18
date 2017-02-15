package HW_7;
//5. Найти сумму всех элементов в массиве.
public class Ex5 {
    public static void main(String[] args) {
        int [] array = new int[100];

        for (int i = 0; i < array.length; i++) {
            array[i] = i;
        }

        int sum = sumCount(array);
        System.out.println(sum);
    }

    static int sumCount(int[] array) {
        int sum = 0;
        for (int i = 0; i <= array.length; i++) {
            sum += i;
        }
        return sum;
    }
}
