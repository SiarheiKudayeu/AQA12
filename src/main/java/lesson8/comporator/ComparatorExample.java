package main.java.lesson8.comporator;

import main.java.lesson8.comparable.Consoles;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorExample {
    public static void main(String[] args) {

        List<ConsolesCom> consoles = new ArrayList<>();
        consoles.add(new ConsolesCom(ConsolesCom.Name.PLAYSTATION, 20093));
        consoles.add(new ConsolesCom(ConsolesCom.Name.XBOX, 24142));
        consoles.add(new ConsolesCom(ConsolesCom.Name.PLAYSTATION, 3));
        consoles.add(new ConsolesCom(ConsolesCom.Name.SWITCH, 123));
        consoles.add(new ConsolesCom(ConsolesCom.Name.XBOX, 7));

        ComporatorConsoles comparator = new ComporatorConsoles();
        consoles.sort(comparator);

        System.out.println(consoles);

        Comparator<ConsolesCom> comparator2 = new Comparator<ConsolesCom>() {
            @Override
            public int compare(ConsolesCom o1, ConsolesCom o2) {
               return o1.getName().getTitle().compareTo(o2.getName().getTitle());
            }
        };

        Comparator<ConsolesCom> comparator3 = Comparator.comparing(o -> o.getName().getTitle());

        consoles.sort(comparator3);

        System.out.println(consoles);
    }
}
