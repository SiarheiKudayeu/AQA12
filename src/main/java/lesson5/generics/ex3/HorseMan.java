package main.java.lesson5.generics.ex3;

public class HorseMan extends Humanoid{
    public HorseMan(String name) {
        super(name, TypeHumanoid.HORSEMAN);
    }

    @Override
    public void sayWhoAmI() {
        System.out.println("I am " + typeHumanoid + " with name " +name);
    }
}
