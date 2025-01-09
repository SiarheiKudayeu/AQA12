package main.java.lesson5.generics.ex3;

public class Hobbit extends Humanoid{
    public Hobbit(String name) {
        super(name, TypeHumanoid.HOBBIT);
    }

    @Override
    public void sayWhoAmI() {
        System.out.println("I am " + typeHumanoid + " with name " +name);
    }
}
