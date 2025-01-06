package main.java.lesson4.interfaces.part1;

public class Cat implements Movable, Eatable {
    @Override
    public void move() {
        System.out.println("Cat move");
    }

    @Override
    public void eat() {
        System.out.println("Cat eat");
    }

    public void sound(){
        System.out.println("Meew!!!");
    }
}
