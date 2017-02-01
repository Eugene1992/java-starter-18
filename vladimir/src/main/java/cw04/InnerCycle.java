package cw04;

public class InnerCycle {
    public static void main(String[] args) {
        for (int i =0; i < 10; i++){
            System.out.println("*");
            for (int j = 0; j <= i; j++){
                System.out.print("*");
            }
        }
        System.out.println("*");
    }
}
