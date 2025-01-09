package main.java.lesson5.generics.ex4;

import main.java.lesson5.enums.ex3.CardGenerator;
import main.java.lesson5.generics.ex3.*;

public class GenericsMethodClass {

    public static void main(String[] args) {
        printValue(new CardGenerator.Card(CardGenerator.CardValues.TEN, CardGenerator.CardsTypes.DIAMOND));
        printValue(12);

        Human maria = new Human("Maria");
        sayHumanoid(maria);
        printHumanoidBox(new HumanoidBox<>(new HorseMan("Horseman")));
        printHumanoidBoxElf(new HumanoidBox<>(new Elf("Humanoid")));
    }

    //метод с одним обобщенным типом
    public static <T> void printValue(T variable){
        System.out.println(variable);
    }

    //метод с несколькими обобщенными типами
    public static <T, M> void printValue(T variable1, M variable2){
        System.out.println("variable1" + variable1);
        System.out.println("variable2" + variable2);
    }

    //метод с обобщенным типом ограниченным классами наследуемыми от класса Humanoid
    public static <T extends Humanoid> void sayHumanoid(T humanoid){
        humanoid.sayWhoAmI();
    }

    //метод с использующий в аргументах обобщенный класс с незаданным типом
    public static void printHumanoidBox(HumanoidBox<?> humanoidBox){
        humanoidBox.getHumanoid().sayWhoAmI();
    }

    //метод с использующий в аргументах обобщенный класс с заданным типом
    public static void printHumanoidBoxElf(HumanoidBox<Elf> humanoidBox){
        humanoidBox.getHumanoid().sayWhoAmI();
    }


}
