package main.java.lesson7.h_serialization;

import java.io.Serializable;

public class PersonSerial implements Serializable {
    private int age;
    private String name;

    public PersonSerial(int age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        return "PersonSerial{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
