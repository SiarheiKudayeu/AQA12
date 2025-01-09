package main.java.lesson5.enums.ex2;

public class GroupPerson {
    private int money;
    private String name;

    public void whichGroupVisit() {
        if (money < Groups.METALLICA.getCost()) {
            System.out.println("Please stay at home");
        } else if (money < Groups.ACDC.getCost() && money > Groups.METALLICA.getCost()) {
            System.out.println("You can go " + Groups.METALLICA.getName());
        } else if (money < Groups.QUEEN.getCost() && money > Groups.ACDC.getCost()) {
            System.out.println("You can go " + Groups.ACDC.getName());
        } else {
            System.out.println("You can go anywhere!!!");
        }
    }


    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public GroupPerson(int money, String name) {
        this.money = money;
        this.name = name;
    }
}
