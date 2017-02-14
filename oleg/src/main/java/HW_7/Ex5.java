package HW_7;
//5. Найти сумму всех элементов в массиве.
public class Ex5 {
    public static void main(String[] args) {
        int [] array = new int[100];
        sumCount(array);

        for (int i = 0; i < array.length; i++) {
            array[i] = i;
        }
    }
    static void sumCount(int[] array) {
        int sum = 0;
        for (int i = 0; i <= array.length; i++) {
            sum += i;
            System.out.println("Total count is " + sum);
        }
    }
}
