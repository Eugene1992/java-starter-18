import java.util.Random;
import java.util.Scanner;

public class Game_cw05 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String exit;
        do {
            System.out.println("Input number");
            exit = scan.next();
            if (!exit.equals("exit")) {
                if (exit.matches("[0-9]*")) {
                    int n = Integer.parseInt(exit);
                    Random rand = new Random();
                    int r = rand.nextInt(10);
                    if (n == r)
                        System.out.println("You win!");
                    else System.out.println("You wrong.");
                    System.out.println("Try again?\ny - yes\nn - no");
                    exit = scan.next();
                } else System.out.println("Wrong input");
            }else System.out.println("You too weak!!!");
        } while (exit.equals("y"));
    }

}
