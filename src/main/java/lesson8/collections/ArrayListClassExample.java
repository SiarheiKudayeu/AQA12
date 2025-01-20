package main.java.lesson8.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListClassExample {
    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<>(); //capacity ~ 10 (capacity * 1.5 + 1)
        System.out.println(arrayList);
        //int[] array = new int[5];    {1, 3, 5, 12, 5} ==> {1, 3, 12, 5}

        //add
        arrayList.add(4);
        arrayList.add(42);
        arrayList.add(7);
        arrayList.add(4);

        //toArray()
        Object[] integers = arrayList.toArray();
        System.out.println("After conversion:");
        System.out.println(Arrays.toString(integers));

        //size()
        System.out.println("size: " + arrayList.size());
        System.out.println("Second element is: " + arrayList.get(1));

        //for
        int counter = 1;
        for (Integer number: arrayList){
            System.out.println(counter + ") " + number);
            counter++;
        }

        //remove()
        arrayList.remove(2);
        System.out.println("After remove: " + arrayList);

        //init as array
        List<String> strings = new ArrayList<>(Arrays.asList("One", "Two", "Three"));
        System.out.println(strings);

        //contains
        System.out.println("Contains of Three: " + strings.contains("Three"));
        System.out.println("Contains of Three2: " + strings.contains("Three2"));

        //ArrayList
        ArrayList<Integer> arrayListCapacity = new ArrayList<>(5);
        arrayListCapacity.add(43);
        arrayListCapacity.add(43);
        arrayListCapacity.add(43);

        arrayListCapacity.ensureCapacity(3);
        System.out.println(arrayListCapacity);
        arrayListCapacity.ensureCapacity(1);
        System.out.println(arrayListCapacity);


        //trimToSize
        arrayListCapacity.trimToSize();

        //set
        arrayListCapacity.set(1, 100500);
        System.out.println(arrayListCapacity);
    }
}
