package HW_03;

// import java.util.Scanner;

public class Test4 {
    public static void main(String args[]) {
        double a = 10.60, b = 26, c = 50, d, x1, x2;
        d = b * b - 4 * a * c;
        if (d < 0)
            System.out.println("Roots does not exist");
        else if (d == 0) {
            x1 = -b / (2 * a);
            System.out.printf("There are only 1 root: x1 = x2 = %f", x1);
        } else {
            x1 = (-b + Math.sqrt(d)) / (2 * a);
            x2 = (-b - Math.sqrt(d)) / (2 * a);
            System.out.printf("There are two roots: x1 = %f, x2 = %f", x1, x2);
        }
    }
}