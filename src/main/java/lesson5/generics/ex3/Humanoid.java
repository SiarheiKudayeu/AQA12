package main.java.lesson5.generics.ex3;

public abstract class Humanoid {
    public abstract void sayWhoAmI();

    protected String name;
    protected TypeHumanoid typeHumanoid;

    public Humanoid(String name, TypeHumanoid typeHumanoid) {
        this.name = name;
        this.typeHumanoid = typeHumanoid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
