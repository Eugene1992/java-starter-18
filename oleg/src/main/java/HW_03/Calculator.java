package HW_03;

/**
 * Created by Олег on 07.02.2017.
 */
import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        double a, b, c;
        System.out.println("Tapez le premier chiffre");
        a = scan.nextDouble();
        System.out.println("Tapez le deusieme chiffre");
        b = scan.nextDouble();
        System.out.println("Fites votre choix:\n+\n-\n*\n/");
        String oper = scan.next();
        switch (oper) {
            case "+": {
                c = a + b;
                System.out.printf("Ca fait = %.2f", c);
                break;
            }

            case "-": {
                c = a - b;
                System.out.printf("Ca fait = %.2f", c);
                break;
            }

            case "*": {
                c = a * b;
                System.out.printf("Ca fait = %.2f", c);
                break;
            }

            case "/": {
                if (b == 0)
                    System.out.println("Impossible diviser par 0");
                else {
                    c = a / b;
                    System.out.printf("Ca fait = %.2f", c);
                    break;
                }
            }

            default:
                System.out.println("Operation inexistante!");
        }
    }
}
