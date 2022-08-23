package Section5;

public class FunctionalGenericsDemo {
    public static void main(String[] args) {

        FunctionalGenerics<String, String> fun =  s -> "Hello "  +  s  + "!";

        System.out.println(fun.execute("Tom"));

        FunctionalGenerics<String, Integer> fun2 = String::length;

        System.out.println(fun2.execute("Hello"));
    }
}
