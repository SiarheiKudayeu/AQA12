package main.java.lesson3.static_key.fields_methonds;

public class StaticClass {
    public String nonStaticVar = "nonStaticVar";
    public static String staticVar = "staticVar";

    public void nonStaticMethod(){
        System.out.println("nonStaticMethod");
    }

    public static void staticMethod(){
        System.out.println("staticMethod");
    }

    public void print(){
        nonStaticMethod();
        staticMethod();
        System.out.println(nonStaticVar);
        System.out.println(staticVar);
    }

    public static void printStatic(){
        //nonStaticMethod();
        staticMethod();
        //System.out.println(nonStaticVar);
        System.out.println(staticVar);
    }

}
