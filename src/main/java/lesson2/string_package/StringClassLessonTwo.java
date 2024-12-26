package main.java.lesson2.string_package;

public class StringClassLessonTwo {
    public static void main(String[] args) {
        int x = 8;
        StringClassLessonTwo integer = new StringClassLessonTwo();

        //String
        String text = "My text!!!";
        System.out.println(text);

        text = text + " New Text";
        System.out.println(text);

        System.out.println("My number is " + 8);

        System.out.println("==========");
        //==
        // System.out.println(text2==text3); так не нужно
        System.out.println("NewText".equals("NewText"));

        System.out.println("=================");
        System.out.println("One");
        System.out.println("Two");
        System.out.print("Three");
        System.out.print("Four");
        System.out.println("Five");
        System.out.print("Six");
    }
}
