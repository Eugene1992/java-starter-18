package cw_03;

public class SwitchTest {
    public static void main(String[] args) {
        int num = 13;
        Integer i = 10;

        if (num == 10) {
            System.out.println("Ten");
        } else if (num == 11) {
            System.out.println("Eleven");
        } else if (num == 12) {
            System.out.println("Twelfth");
        } else {
            System.out.println("Some other number..");
        }

        /*
        *  - primitives
        *  - wrappers
        *  - String // since 1.7
        *  - ENUM   // since 1.7
        */
        switch (num){
            default:
                System.out.println("Some other number..");
                break;

            case 10:
                System.out.println("Ten");
                break;

            case 11:
                System.out.println("Eleven");
                break;

            case 12:
                System.out.println("Twelfth");
                break;

            case 13:
                switch (num) {
                    case 13:
                        System.out.println("You are really unlucky...");
                        break;
                }
                System.out.println("Totally unlucky...");
                break;
        }
    }
}
