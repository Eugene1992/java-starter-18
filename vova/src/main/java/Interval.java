import java.util.Scanner;

/**
 * Задание 8
 * Используя IntelliJ IDEA, создайте класс Interval.
 * Напишите программу определения, попадает ли введенное пользователем число от 0 до 100 в числовой
 * промежуток [0 - 14] [15 - 35] [36 - 50] [50 - 100]. Если да, то укажите, в какой именно промежуток.
 * Если пользователь указывает число не входящее ни в один из имеющихся числовых промежутков, то
 * выводится соответствующее сообщение
 */
public class Interval {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int numb = scan.nextInt();
        if ((numb >= 0) && (numb <= 14)) {
            System.out.println("Число попадает в промежуток [0 - 14] ");
        } else if ((numb >= 15) && (numb <= 35)) {
            System.out.println("Число попадает в промежуток [15 - 35] ");
        } else if ((numb >= 36) && (numb <= 50)) {
            System.out.println("Число попадает в промежуток [36 - 50] ");
        } else if ((numb >= 50) && (numb <= 100)) {
            System.out.println("Число попадает в промежуток [50 - 100] ");
        } else {
            System.out.println("Число не входящее ни в один из имеющихся числовых промежутков");
        }
    }
}
