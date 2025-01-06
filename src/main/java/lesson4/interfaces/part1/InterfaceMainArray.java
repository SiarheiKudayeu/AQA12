package main.java.lesson4.interfaces.part1;

public class InterfaceMainArray {
    public static void main(String[] args) {

        Movable plane = new Plane();
        Movable cat = new Cat();
        Movable[] movables = {plane, cat};
        for (Movable object : movables) {
            object.move();
        }

        Cat cat1 = new Cat();
        cat1.sound();

    }
}
