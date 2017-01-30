package cw_03;

public class StringFormatExample {
    public static void main(String[] args) {
        int age = 24;
        String name = "Evgeniy";
        System.out.println("My name is " + name + ". I'm " + age + " years old.");
        System.out.printf("My name is %s. I'm %d years old.", name, age);
//        %s - some string
//        %d - some digit
//        %f - some float or double
    }
}
