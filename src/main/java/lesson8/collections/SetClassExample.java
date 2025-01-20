package main.java.lesson8.collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetClassExample {

    public static void main(String[] args) {
        //HashSet не гарантирует порядок элементов
        System.out.println("HashSet");
        Set<String> hashSet = new HashSet<>();
        fillSet(hashSet);
        System.out.println(hashSet);
        System.out.println("=================");

        //LinkedHashSet гарантирует порядок
        System.out.println("LinkedHashSet");
        Set<String> linksedHashSet = new LinkedHashSet<>();
        fillSet(linksedHashSet);
        System.out.println(linksedHashSet);
        System.out.println("=================");

        //TreeSet упорядочивает по возрастанию
        System.out.println("TreeSet");
        Set<String> treeSet = new TreeSet<>();
        fillSet(treeSet);
        System.out.println(treeSet);
        System.out.println("=================");
    }

    public static void fillSet(Set<String> set) {
        set.add("plane");
        set.add("bicycle");
        set.add("bus");
        set.add("car");
        set.add("auto");
        set.add("ship");
        set.add("helicopter");
        set.add("boat");
        set.add("shoes");
        //set.add("boat");
    }
}
