package main.java.lesson3.static_key.blocks;

import java.util.Date;

public class StaticBlockClass {
    public static Date date;

    public StaticBlockClass() {
        System.out.println("I am constructor");
    }

    static {
        date = new Date();
        System.out.println("I am static block");
    }

    static {
        System.out.println("I am static block 2");
    }

    public static void staticMethod(){
        System.out.println("I am static method");
    }
}
