package main.java.lesson8.comporator;

import java.util.Comparator;

public class ComporatorConsoles implements Comparator<ConsolesCom> {
    @Override
    public int compare(ConsolesCom o1, ConsolesCom o2) {
        return  o1.cost - o2.cost;
    }
}
