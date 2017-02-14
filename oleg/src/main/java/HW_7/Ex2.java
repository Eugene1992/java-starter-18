package HW_7;
//2. Вывести все числа одномерного массива в обратном порядке.

public class Ex2 {
    public static void main(String[] args) {
        int[] array = new int[100];
        printRevArray(array);

        for (int i = 0; i < array.length; i++) {
            array[i] = i;
        }
    }
        static void printRevArray(int [] array) {
            for (int i = array.length; i >= 0; i--) {
                System.out.println(i);
            }
    }
}

