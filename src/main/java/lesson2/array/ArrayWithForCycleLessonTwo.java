package main.java.lesson2.array;

import java.util.Arrays;
import java.util.Random;

public class ArrayWithForCycleLessonTwo {
    public static void main(String[] args) {
        int[] arrayInt2 = {12, 43, 55, 3};
        System.out.println("Размерность массива " +arrayInt2.length + " элемента");


        for(int i = 0; i < arrayInt2.length; i++){
            System.out.print(arrayInt2[i] + ", ");
        }
        System.out.println("\b\b");


        //Инициализация массива
        int[] randomArray = new int[10];
        System.out.println("=============RANDOM INT==============");
        Random random = new Random();
        for (int i = 0; i < randomArray.length; i++){
            int randomInt = random.nextInt(-100, 100);
            randomArray[i] = randomInt;
        }

        System.out.println(Arrays.toString(randomArray));


    }
}
