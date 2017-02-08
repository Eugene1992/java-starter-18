package hw_06;

/**
 * написать метод, который будет печатать переданную строку заданное количество раз
 */
public class MyLine {
    public static void main(String[] args) {
        printLine(3);
    }
    static void printLine(int value ){
        for (; value > 0; value--){
            System.out.println("Hello");
        }

    }
}
