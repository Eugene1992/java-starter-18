package hw05;


public class UnluckyTickets {
    public static void main(String[] args) {
        int n = 0;
        for (int i = 1000; i < 1000000; i++) {
            int number1 = i / 10000;
            int number2 = (i / 1000) % 100;
            int number3 = (i / 100) % 100;
            int number4 = (i / 10) % 100;
            int number5 = i % 100;
            if (number1 == 13 || number2 == 13 || number3 == 13 ||
                    number4 == 13 || number5 == 13) {
                n++;
                System.out.println(i);
            }
        }
        System.out.print("Number of unlucky tickets = " + n);
    }
}
