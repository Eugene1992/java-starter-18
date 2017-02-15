package HW_7;

//4. Вывести первую и вторую половину одномерного массива в обратном порядке
public class Ex4 {
    public static void main(String[] args) {
        int[] array = new int[100];

        for (int i = 0; i < array.length; i++) {
            array[i] = i;
        }

        printFHRevArray(array);
        printSHRevArray(array);
    }

    static void printFHRevArray(int[] array) {
        System.out.println("First half revers count");
        for (int i = array.length; i >= array.length / 2; i--) {
            System.out.println(i);
        }
    }

    static void printSHRevArray(int[] array) {
        System.out.println("Second half revers count");
        for (int i = array.length / 2; i >= 0; i--) {
            System.out.println(i);
        }
    }
}
