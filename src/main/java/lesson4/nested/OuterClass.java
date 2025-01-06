package main.java.lesson4.nested;

public class OuterClass {
    public String nonStatic = "OuterNonStatic";
    public static String staticString = "OuterStatic";

    public void outerMethod() {
        System.out.println("outerMethod");
    }

    public static void outerStaticMethod() {
        System.out.println("outerStaticMethod");
    }

    public static String static1 = "OuterNonStatic";


    public static class NestedClass {
        static String nestedStaticString = staticString + " new symbols";
        public void method1(){
            outerStaticMethod();
        }

        public static void method2(){
        }
    }
}
