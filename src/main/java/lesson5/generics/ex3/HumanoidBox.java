package main.java.lesson5.generics.ex3;

import java.util.ArrayList;
import java.util.List;

public class HumanoidBox <T extends Humanoid>{
    public static void main(String[] args) {

        //создание объекта класса HumanoidBox с указанием, что его поле humanoid должно быть представителем класса Hobbit
        HumanoidBox<Hobbit> box1 = new HumanoidBox<>();
        box1.setHumanoid(new Hobbit("Feofan"));
        box1.getHumanoid().sayWhoAmI();


        //создание объекта класса HumanoidBox с указанием, что его поле humanoid должно быть представителем класса Elf
        HumanoidBox<Elf> box2 = new HumanoidBox<>();
        box2.setHumanoid(new Elf("Elf"));
        box2.getHumanoid().sayWhoAmI();

        //создание списка в котором могут храниться различные наследники класса Humanoid
        List<Humanoid> humanoids = new ArrayList<>();
        humanoids.add(new Elf("Elf"));
        humanoids.add(new Hobbit("Feofan"));
        for (Humanoid humanoid1: humanoids){
            System.out.println(humanoid1.typeHumanoid);
        }
    }

    private T humanoid;

    public HumanoidBox(T humanoid) {
        this.humanoid = humanoid;
    }

    public HumanoidBox() {
    }

    public T getHumanoid() {
        return humanoid;
    }

    public void setHumanoid(T humanoid) {
        this.humanoid = humanoid;
    }
}
