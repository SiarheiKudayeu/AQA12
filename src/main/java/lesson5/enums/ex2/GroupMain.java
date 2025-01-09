package main.java.lesson5.enums.ex2;

public class GroupMain {
    public static void main(String[] args) {
        GroupPerson ivan = new GroupPerson(12000, "Ivan");
        ivan.whichGroupVisit();

        //получение массива всех значений перечисления
        Groups[] groups = Groups.values();
        for (Groups group: groups){
            System.out.println("Name is " + group.getName() + ". Cost is " + group.getCost());
        }
    }
}
