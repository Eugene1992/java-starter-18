package cw_08;

public class Main {
    public static void main(String[] args) {
//      Literal pool, String pool
//      http://javadevblog.com/chto-takoe-pul-strok-v-java.html
        String s1 = "Hello world!"; // literal
        String s2 = new String("Hello world!");
        String s3 = "Hello world" + "!" + true + 10 + 10.0 + new Object();
        String s4 = s1.toUpperCase() + s2;
        System.out.println(s4);
    }
}
