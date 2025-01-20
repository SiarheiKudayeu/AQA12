package main.java.lesson8.comporator;

public class ConsolesCom {
    private Name name;
    public int cost;

    public Name getName() {
        return name;
    }

    public int getCost() {
        return cost;
    }

    public ConsolesCom(Name name, int cost) {
        this.name = name;
        this.cost = cost;
    }

    @Override
    public String toString() {
        return name + " " + cost;
    }

    public enum Name {
        PLAYSTATION("PLAYSTATION"), XBOX("XBOX"), SWITCH("SWITCH");
        private String title;

        public String getTitle() {
            return title;
        }

        Name(String name) {
            this.title = name;
        }
    }
}
