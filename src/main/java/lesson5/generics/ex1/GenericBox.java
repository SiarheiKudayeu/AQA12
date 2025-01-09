package main.java.lesson5.generics.ex1;

public class GenericBox <T> {
    //Обобщенный класс с одним обобщенным полем

    private T object;

    public T getObject() {
        return object;
    }

    public GenericBox(T object) {
        this.object = object;
    }
}
