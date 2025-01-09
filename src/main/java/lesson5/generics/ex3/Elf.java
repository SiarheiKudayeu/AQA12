package main.java.lesson5.generics.ex3;

public class Elf extends Humanoid {
    public Elf(String name) {
        super(name, TypeHumanoid.ELF);
    }

    @Override
    public void sayWhoAmI() {
        System.out.println("I am " + typeHumanoid + " with name " + name);
    }
}
