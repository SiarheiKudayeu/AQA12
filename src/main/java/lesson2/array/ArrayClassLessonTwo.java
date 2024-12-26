package main.java.lesson2.array;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayClassLessonTwo {
    public static void main(String[] args) {
        int[] arrayInt = new int[6];
        System.out.println(Arrays.toString(arrayInt));
        arrayInt[1] = 12;
        System.out.println(Arrays.toString(arrayInt));

        int[] arrayInt2 = {12, 43, 55, 3};
        System.out.println(Arrays.toString(arrayInt2));

        Scanner[] scanners = {new Scanner(System.in), new Scanner(System.in)};

        String[] strings = new String[2];
        strings[0] = "Test";
        strings[1] = "Testo";
        System.out.println(Arrays.toString(strings));

        String[] strings2 = {"Test1","Test2","Test3"};
        System.out.println(Arrays.toString(strings2));
    }
}
