import java.util.Random;
import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        int i = 1;
        while (true){

            System.out.println("Введите число от 0 - 10");
            int number = scan.nextInt();
            Random random = new Random();
            int rand = random.nextInt(10);
            if (number == rand && number <= 10){
                System.out.println("You won! \n У вас получилось с " + i + " попытки" );
                break;
            }
            else if (number != rand && number <= 10) {
                System.out.println("You lost!");
                System.out.println( "if you want to try again, please - q");
                String again = scan.next();
                if (again.equals("q")){
                }
                else{
                    break;
                }
            }
            else {
                System.out.println(" Your number is greater than 10");
                break;
            }
            i++;
        }

    }
}