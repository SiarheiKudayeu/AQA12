package main.java.lesson3.method_overloading;

public class MethodOverloadingClassLesson3 {
    public static void main(String[] args) {
        doSmth();
        System.out.println("==============");
        doSmth("AQA 12");
        System.out.println("==============");
        doSmth("AQA", 12);
        System.out.println("==============");
        doSmth(12, "AQA");
    }

    public static void doSmth() {
        System.out.println("Without arguments");
    }

    public static void doSmth(String text) {
        System.out.println("Method with \"" + text + "\" text!");
    }

/*    public static String doSmth(String text) {
        System.out.println("Method with \"" + text + "\" text!");
        return "Your text " + text;
    }*/

    public static void doSmth(String text, int number) {
        System.out.println("First method with \"" + text + "\" text! And" + "\"" + number +"\" number.");
    }

    public static void doSmth(int number, String text) {
        System.out.println("Second method with \"" + text + "\" text! And" + "\"" + number +"\" number.");
    }

}
