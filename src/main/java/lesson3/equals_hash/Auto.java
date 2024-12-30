package main.java.lesson3.equals_hash;

import java.util.Objects;

public class Auto {
    private String name;
    private int price;
    private boolean isNew;

    public Auto(String name, int price, boolean isNew) {
        this.name = name;
        this.price = price;
        this.isNew = isNew;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Auto{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", isNew=" + isNew +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Auto auto = (Auto) o;
        return price == auto.price && Objects.equals(name, auto.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, price);
    }
}
