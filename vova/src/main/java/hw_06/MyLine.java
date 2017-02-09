package hw_06;

/**
 * написать метод, который будет печатать переданную строку заданное количество раз
 */
public class MyLine {

    public static void main(String[] args) {
        printLine(3, "Hello");
        printLine(5, "Hello world");
    }

    static void printLine(int count, String line){
        for (; count > 0; count--){
            System.out.println(line);
        }
    }
}
