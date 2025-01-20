package main.java.lesson8.iterator;

import java.util.*;

public class IteratorExample {
    public static void main(String[] args) {
        //next(), hasNext(), remove()
        List<String> strings = new ArrayList<>(Arrays.asList("One", "Two", "Three"));
        Iterator<String> iterator = strings.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        Iterator<String> iterator2 = strings.iterator();
        while (iterator2.hasNext()) {
            if (iterator2.next().equals("Two")) {
                iterator2.remove();
            }
        }

        System.out.println(strings);

        ListIterator<String> listIterator = strings.listIterator();
        //listIterator.add("LIST!!!");
        while (listIterator.hasNext()) {
            if (listIterator.next().equals("One")) {
                listIterator.add("LIST!!!");
            }
        }
        System.out.println(strings);
    }
}
