package main.java.lesson4.inheritance;

public class QA extends TeamMember {

    public QA(String name, int age) {
        super(name, age);
    }

    public QA() {
        super();
    }

    public int y = 37;

    @Override
    public void doWork() {
        System.out.println("I am team QA!!!");
    }

    public void doWorkLikeParent() {
        super.doWork();
    }

    public void printParentY() {
        System.out.println(super.y);
    }
}
