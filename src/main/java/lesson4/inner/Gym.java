package main.java.lesson4.inner;

public class Gym {
    //Внутрений
    public String name;
    private String type;

    static String test;

    public void getCostOfEquipment(Equipment equipment){
        System.out.println("Cost of equipment " + equipment.getCost());
    }

    public Equipment[] equipment;

    public Gym(String name, String type) {
        this.name = name;
        this.type = type;
    }

    public class Equipment {
        public String name;
        private int cost;

        public int getCost() {
            return cost;
        }

        public void tryInnerAccess() {
            System.out.println("Name of outer class " + Gym.this.name);
            System.out.println("Private type of outer class  " + type);
            System.out.println("static default test of outer class  " + test);
            System.out.println("Name of inner class " + name);
            getCostOfEquipment(this);
        }

        public Equipment(String name, int cost) {
            this.name = name;
            this.cost = cost;
        }
    }
}
