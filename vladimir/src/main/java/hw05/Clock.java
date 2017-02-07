package hw05;

public class Clock {
    public static void main(String[] args) {
//        h1h2:m1m2
        int hour, minute, n = 0;
        for (hour = 0; hour < 24; hour++) {
            for (minute = 0; minute < 60; minute++) {
                int a, b; String c = "";
                a = minute / 10;
                b = minute % 10;
                c = b + c + a;
                if(hour == Integer.valueOf(c)){
                    System.out.print(hour + ":" + a + b + "\n");
                    n++;
                }
            }
        }
        System.out.println(n);
    }
}
