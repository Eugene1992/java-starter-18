package HW_7;
//3. Вывести первую и вторую половину одномерного массива.
public class Ex3 {
    public static void main(String[] args) {
        int[] array = new int[100];
        printFirstHalfArray(array);
        printSecondHalfArray(array);

        for (int i = 0; i < array.length; i++) {
            array[i] = i;
        }
    }
    static void printFirstHalfArray(int[] array){
        System.out.println("First half of the massive");
        for (int i = 0; i <= array.length/2; i++) {
            System.out.println(i);
        }
    }
    static void printSecondHalfArray(int[] array){
        System.out.println("Second half of the massive");
        for (int i = array.length/2; i <= array.length; i++) {
            System.out.println(i);
        }
    }
}
