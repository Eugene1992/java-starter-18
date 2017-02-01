import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

//        Задание 7
//        Используя IntelliJ IDEA, создайте класс Calculator.
//        Напишите программу - консольный калькулятор.
//        Введите с консоли две переменные. Предложите пользователю ввести знак арифметической операции.
//        Для организации выбора алгоритма вычислительного процесса, используйте оператор switch.
//        Выведите на экран результат выполнения арифметической операции.
//        В случае использования операции деления, организуйте проверку попытки деления на ноль.
//        И если таковая имеется, то отмените выполнение арифметической операции и уведомите об ошибке
//        пользователя.

        System.out.println("Консольный калькулятор");
        System.out.println("\nВведите число и нажмите кнопку Enter");
        double firstnum = scan.nextDouble();
        System.out.println("введите знак арифметической операции и нажмите кнопку Enter");
        String symbol = scan.next();
        System.out.println("введите число и нажмите кнопку Enter");
        double secondnum = scan.nextDouble();

        switch (symbol) {
            case "+":
                System.out.println(firstnum + secondnum);
                break;
            case "-":
                System.out.println(firstnum - secondnum);
                break;
            case "*":
                System.out.println(firstnum * secondnum);
                break;
            case "/":
                System.out.println(firstnum / secondnum);
                if (secondnum == 0) {
                    System.out.println("Ошибка, попытка делить на ноль");
                    break;
                }

        }
    }
}
