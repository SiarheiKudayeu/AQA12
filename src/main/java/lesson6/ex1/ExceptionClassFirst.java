package main.java.lesson6.ex1;

import main.java.lesson5.generics.ex1.GenericBox;
import main.java.lesson5.generics.ex1.SimpleBox;
import main.java.lesson5.generics.ex3.HorseMan;

import java.util.Scanner;

public class ExceptionClassFirst {
    public static void main(String[] args) {
/*
        //ArithmeticException
        System.out.println(12/0);*/


/*
        //ArrayIndexOutOfBoundsException
        int[] array = new int[3];
        System.out.println(array[5]);
*/

/*        //ClassCastException
        SimpleBox box2 = new SimpleBox(25);
        SimpleBox box3 = new SimpleBox("28");
        System.out.println((Integer)box3.getObject() + (Integer) box2.getObject());*/


/*        //NullPointerException
        HorseMan horseMan = null;
        horseMan.sayWhoAmI();*/
        int x = 15;
        System.out.println("Введите значение знаменателя:");
        int y = new Scanner(System.in).nextInt();
        try {
            System.out.println("Результат деления:");
            HorseMan horseMan = null;
            horseMan.sayWhoAmI();
            System.out.println(x / y);
        } catch (ArithmeticException exception) {
            System.out.println("Сообщение моего исключения: " + exception.getMessage());
            System.out.println("Next line");
        } finally {
            System.out.println("I am finally!!!!!");
        }
        System.out.println("Продолжаем!!!");
    }
}
