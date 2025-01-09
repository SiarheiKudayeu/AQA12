package main.java.lesson5.generics.ex3;

public class Human extends Humanoid{
    public Human(String name) {
        super(name, TypeHumanoid.HUMAN);
    }

    @Override
    public void sayWhoAmI() {
        System.out.println("I am " + typeHumanoid + " with name " +name);
    }
}
