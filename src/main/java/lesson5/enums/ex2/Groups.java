package main.java.lesson5.enums.ex2;

public enum Groups {
    //Перечислительный тип данных с полями, методами и конструктором
    METALLICA("METALLICA", 4000), ACDC("ACDC", 6000), QUEEN("QUEEN", 10000);

    private String name;
    private int cost;

    public String getName() {
        return name;
    }

    public enum Albums {
        FIRST, SECOND, THIRD
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCost() {
        return cost;
    }

    Groups(String name, int cost) {
        this.name = name;
        this.cost = cost;
    }
}
