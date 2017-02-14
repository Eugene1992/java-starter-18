package HW_7;
//6. Найти среднеарифметическое всех чисел массива.
public class Ex6 {
    public static void main(String[] args) {
        int [] array = new int[100];
      /*  arithSumm(array);

        for (int i = 0; i < array.length; i++) {
            array[i] = i;
        }
    }
    static void arithSumm(int[] array) { */
        int sum = 0;
        for (int i = 0; i < array.length; i++) sum += array[i];
        int ave = sum / array.length;
        System.out.println(ave);
    }
}
