package HW_05;


// UNlucky tickets

public class HW5_2 {
    public static void main(String args []) {
        // TODO: 09.02.2017 refactor this task for method call
        int tickets = 0;
        for (int a = 1; a <= 999999; a++) {
            int a1 = a / 100000;
            int a2 = (a / 10000) % 10;
            int a3 = (a / 1000) % 10;
            int a4 = (a / 100) % 10;
            int a5 = (a / 10) % 10;
            int a6 = a % 10;
            if ((a6 == 3 & a5 == 1) || (a5 == 3 & a4 == 1) || (a4 == 3 & a3 == 1) || (a3 == 3 & a2 == 1) || (a2 == 3 & a1 == 3)) {
                tickets++;
            }
        }
        System.out.println(tickets + " unlucky tickets in total");
    }
}
