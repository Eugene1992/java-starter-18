package hw_05;

/**
 * Не счастливые номера. Есть 999999 номерных знаков, подсчитать количество знаков содержащих число 13 и вывести их все в консоль
 */
public class UnluckyNumbers {
    public static void main(String[] args) {

        int b = 0;
        for (int i = 1; i <= 999999; i++) {

            int i1 = i / 100000;
            int i2 = (i / 10000) % 10;
            int i3 = (i / 1000) % 10;
            int i4 = (i / 100) % 10;
            int i5 = (i / 10) % 10;
            int i6 = i % 10;
            if ((i6 == 3 & i5 == 1) || (i5 == 3 & i4 == 1) || (i4 == 3 & i3 == 1) || (i3 == 3 & i2 == 1) || (i2 == 3 & i1 == 3)) {

                b++;

//                System.out.println(i1 + " " + i2 + " " + i3 + " " + i4 + " " + i5 + " " + i6);


            }

        }
        System.out.println(b + " не счастливых номеров");
    }
}
