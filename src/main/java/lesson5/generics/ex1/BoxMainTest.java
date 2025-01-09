package main.java.lesson5.generics.ex1;

import main.java.lesson5.enums.ex2.GroupPerson;

import java.util.ArrayList;
import java.util.List;

public class BoxMainTest {
    public static void main(String[] args) {
        //В данной реализации в параметры конструктора может быть помещен объект любого типа
        SimpleBox box1 = new SimpleBox(new GroupPerson(123, "Sam"));
        Object o = new GroupPerson(123, "Sam");
        //метод instance of возвращает true если объект принадлежит классу
        System.out.println(o instanceof Object);
        System.out.println(o instanceof GroupPerson);

        SimpleBox box2 = new SimpleBox(25);
        SimpleBox box3 = new SimpleBox(40);

        System.out.println(box2.getObject() instanceof Integer);

        box2.setObject("10203");
        if(box2.getObject() instanceof Integer && box3.getObject() instanceof Integer){
            System.out.println((Integer) box2.getObject() + (Integer) box3.getObject());
        }else {
            System.out.println("Wrong format");
        }

        System.out.println("===========================");

        GenericBox<Integer> genBox1 = new GenericBox<>(30);
        GenericBox<Integer> genBox2 = new GenericBox<>(25);
        GenericBox<String> genBox3 = new GenericBox<>("Text");

        System.out.println(genBox1.getObject() + genBox2.getObject());
        System.out.println(genBox2.getObject() + " " +  genBox3.getObject());

        //List<String> list = new ArrayList<>();
    }
}
