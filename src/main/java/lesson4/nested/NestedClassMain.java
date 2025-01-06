package main.java.lesson4.nested;

public class NestedClassMain {
    public static void main(String[] args) {
        OuterClass.NestedClass nestedClass = new OuterClass.NestedClass();
        nestedClass.method1();
        //обращение к статическому методу статического вложенного класса
        OuterClass.NestedClass.method2();
    }
}
