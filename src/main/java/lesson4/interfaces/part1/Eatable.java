package main.java.lesson4.interfaces.part1;

public interface Eatable {
    void eat();
    //void eatMore();
    default void drink() {
        System.out.println("I can drink");
    }
}
