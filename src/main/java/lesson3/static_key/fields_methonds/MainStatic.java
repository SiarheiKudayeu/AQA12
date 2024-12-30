package main.java.lesson3.static_key.fields_methonds;

public class MainStatic {
    public static void main(String[] args) {
        StaticClass staticClass = new StaticClass();
        System.out.println(staticClass.nonStaticVar);
        staticClass.nonStaticMethod();
        System.out.println("======STATIC======");
        System.out.println(StaticClass.staticVar);
        StaticClass.staticMethod();
    }
}
