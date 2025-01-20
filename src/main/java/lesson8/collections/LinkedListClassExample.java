package main.java.lesson8.collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListClassExample {
    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();
        for (int i = 0; i < 10000; i++) {
            linkedList.add(10);
        }
        //[10, 10, 10, 10, 10, 10, 10, 10, 10, 10]

        //[10, 10, 10,<== 10 ==>, 10, 10, 10, 10, 10, 10]
        for (int i = 0; i < 10000; i++) {
            arrayList.add(10);
        }

/*        //getElement
        long startL = System.nanoTime();
        for (int i = 0; i < linkedList.size(); i++){
            linkedList.get(i);
        }
        long finishL = System.nanoTime();
        long resultL = finishL - startL;
        System.out.println("Result of getting from LinkedList " + (resultL));


        long startA = System.nanoTime();
        for (int i = 0; i < arrayList.size(); i++){
            arrayList.get(i);
        }
        long finishA = System.nanoTime();
        long resultA = finishA - startA;
        System.out.println("Result of getting from ArrayList " + (resultA));

        System.out.println("Array faster than Linked in get operation in " + (resultL/resultA));*/

        //add Element in the middle
        long startL = System.nanoTime();
        for (int i = 0; i < 10000; i++){
            linkedList.add(15, 20);
        }
        long finishL = System.nanoTime();
        long resultL = finishL - startL;
        System.out.println("Result of set from LinkedList " + (resultL));


        long startA = System.nanoTime();
        for (int i = 0; i < 10000; i++){
            arrayList.add(15, 20);
        }
        long finishA = System.nanoTime();
        long resultA = finishA - startA;
        System.out.println("Result of set from ArrayList " + (resultA));

        System.out.println("Linked faster than Array in get operation in " + (resultA/resultL));
    }

}
