package cw_03;

public class StringSwitchTest {
    public static void main(String[] args) {
        String someStringNumber = "Ten";

        if (someStringNumber.equals("Ten")) {
            System.out.println(10);
        } else if (someStringNumber.equals("Eleven")) {
            System.out.println(11);
        } else if (someStringNumber.equals("Twelfth")) {
            System.out.println(12);
        } else {
            System.out.println("Some other number...");
        }

        switch (someStringNumber){
            case "Ten":
                System.out.println(10);
                break;

            case "Eleven":
                System.out.println(11);
                break;

            case "Twelfth":
                System.out.println(12);
                break;

            default:
                System.out.println("Some other number...");
        }
    }
}
