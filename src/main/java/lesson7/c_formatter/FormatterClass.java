package main.java.lesson7.c_formatter;

public class FormatterClass {
    public static void main(String[] args) {
        String change = "_TEST_";
        String change2 = "_TEST2_";
        System.out.printf("This is string with formatter %s\n", change);
        System.out.printf("This is string with formatter %s, %s\n", change, change2);
        System.out.printf("This is string with formatter %2$s, %1$s\n", change, change2);

        //%c - char
        //%d - byte, short, int, long
        //%f - float, double

        //%b
        System.out.printf("This is string with formatter %b\n", change);
        System.out.printf("This is string with formatter %b\n", 33);
        System.out.printf("This is string with formatter %b\n", null);
        System.out.printf("This is string with formatter %b\n", false);
    }
}
