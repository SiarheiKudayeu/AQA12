package main.java.lesson4.inner;

public class GymMainExample {
    public static void main(String[] args) {
        Gym gym = new Gym("Kanban", "Functional");
        Gym.Equipment bar = gym.new Equipment("Bar", 3000);

        System.out.println("Cost of bar = " + bar.getCost());
        System.out.println("===============");
        bar.tryInnerAccess();
    }
}
