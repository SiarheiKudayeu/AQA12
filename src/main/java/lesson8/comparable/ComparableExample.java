package main.java.lesson8.comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparableExample {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(3);
        list.add(24);
        list.add(-8);

        Collections.sort(list);
        System.out.println(list);

        List<Consoles> consoles = new ArrayList<>();
        consoles.add(new Consoles(Consoles.Name.PLAYSTATION, 20093));
        consoles.add(new Consoles(Consoles.Name.PLAYSTATION, 2442));
        consoles.add(new Consoles(Consoles.Name.XBOX, 23234));
        consoles.add(new Consoles(Consoles.Name.SWITCH, 232));
        consoles.add(new Consoles(Consoles.Name.SWITCH, 6898));

        Collections.sort(consoles);
        System.out.println(consoles);
    }
}
