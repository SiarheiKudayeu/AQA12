package main.java.lesson8.comparable;

public class Consoles implements Comparable<Consoles> {
    private Name name;
    public int cost;

    public Name getName() {
        return name;
    }

    public int getCost() {
        return cost;
    }

    public Consoles(Name name, int cost) {
        this.name = name;
        this.cost = cost;
    }

    @Override
    public String toString() {
        return name + " " + cost;
    }

/*    @Override
    public int compareTo(ConsolesCom o) {
        if (this.cost > o.cost) {
            return 1;
        } else if (this.cost < o.cost) {
            return -1;
        } else {
            return 0;
        }
    }*/

/*    @Override
    public int compareTo(ConsolesCom o) {
        return this.cost - o.cost;
    }*/

    //@Override
   // public int compareTo(ConsolesCom o) {
       // return this.name.getTitle().compareTo(o.name.getTitle());
    //}

    @Override
    public int compareTo(Consoles o) {
        return o.name.getTitle().compareTo(this.name.getTitle());
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
