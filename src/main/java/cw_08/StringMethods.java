package cw_08;

import java.util.Arrays;

public class StringMethods {
    public static void main(String[] args) {
        String str = "Hello world!";
        char[] chars = str.toCharArray();
        byte[] bytes = str.getBytes();

        System.out.println(str.toUpperCase());
        System.out.println(str.toLowerCase());

        String another = "Hello world!";
        System.out.println(str.equals(another));
        System.out.println(str.compareTo("Abba"));

        String info = "Hello! My names is Evgeniy.";
        String[] splitedStrings = info.split(" |!"); // regex, regular expressions
        System.out.println(Arrays.toString(splitedStrings));

        String password = "Qwerty10";
        System.out.println(password.matches("[a-zA-Z0-9]{2,10}"));

        System.out.println(str.isEmpty());
        System.out.println(str.length());

        System.out.println(str.indexOf('l'));
        System.out.println(str.indexOf('l', 5));
        System.out.println(str.lastIndexOf('l'));
    }

    static int length(String str) {
        char[] chars = str.toCharArray();
        return chars.length;
    }

    static boolean equals(String first, String second) {
        char[] chars1 = first.toCharArray();
        char[] chars2 = second.toCharArray();

        return false;
    }
}
