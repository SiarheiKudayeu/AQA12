package main.java.lesson4.inheritance;

public class Developer extends TeamMember {

    public Developer(String name, int age) {
        super(name, age);
    }

    public Developer() {
        super();
    }

    public int y = 37;

    @Override
    public void doWork() {
        System.out.println("I am team developer!!!");
    }

    public void doWorkLikeParent() {
        super.doWork();
    }

    public void printParentY() {
        System.out.println(super.y);
    }
}
