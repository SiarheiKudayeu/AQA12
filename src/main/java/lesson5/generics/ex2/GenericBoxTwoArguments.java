package main.java.lesson5.generics.ex2;

public class GenericBoxTwoArguments<T1, T2> {

    //Обобщенный класс с двумя обобщенными полями

    public static void main(String[] args) {
        GenericBoxTwoArguments<String, Integer> bothArgs = new GenericBoxTwoArguments<>();
        bothArgs.setFirstType("Test");
        bothArgs.setSecondType(12343);
        bothArgs.printBoth();
    }

    private T1 firstType;
    private T2 secondType;

    public void setFirstType(T1 firstType) {
        this.firstType = firstType;
    }

    public void setSecondType(T2 secondType) {
        this.secondType = secondType;
    }

    public void printBoth(){
        System.out.println("First type: " + firstType.getClass().getName());
        System.out.println("Second type: " + secondType.getClass().getName());
    }
}
