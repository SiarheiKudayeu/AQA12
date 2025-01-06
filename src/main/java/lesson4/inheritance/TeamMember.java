package main.java.lesson4.inheritance;

public class TeamMember {
    public String name;
    public int age;
    public String profession;

    public void doWork() {
        System.out.println("I am team member!!!");
    }

    public TeamMember(){}

    public TeamMember(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public int y = 33;
}
