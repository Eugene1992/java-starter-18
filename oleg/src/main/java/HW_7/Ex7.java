package HW_7;
// Найти минимальное и максимальное число в массив
public class Ex7 {
    public static void main(String[] args) {
        int [] arr = new int[100];
        findMinNum(arr);

        for(int i = 0; i < arr.length; i++) {
           arr[i] = i;
        }
    }

    static void findMinNum(int[] arr) {
        int max = 0;
        for(int i = 0; i < arr.length; i ++) {
            if (arr[i] > max);
            max = arr[i];
            System.out.println(max);
        }
    }
}
