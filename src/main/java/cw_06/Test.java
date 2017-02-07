package cw_06;

public class Test {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            System.out.println("Hello");
        }


        for (int i = 0; i < 10; i++) {
            System.out.println("world");
        }


    }

    static void printName(String name){
        System.out.printf("Hello, %s!\n", name);
    }

    static int sum(int a, int b){
        return a + b;
    }

    // написать метод, который будет печатать переданную строку заданное количество раз
    // написать метод, который подсчитывает сумму чисел заданного интервала(начало, конец, шаг)
    // 0 10 2 ->  2 4 6 8 10 -> 30
}
