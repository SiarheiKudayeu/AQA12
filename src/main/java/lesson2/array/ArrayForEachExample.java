package main.java.lesson2.array;

import java.util.Arrays;
import java.util.Random;

public class ArrayForEachExample {
    public static void main(String[] args) {
        //Инициализация массива
        int[] randomArray = new int[10];
        System.out.println("=============RANDOM INT==============");
        Random random = new Random();
        for (int i = 0; i < randomArray.length; i++){
            int randomInt = random.nextInt(-100, 100);
            randomArray[i] = randomInt;
        }


        //Вывод массива в консоль при помощи for-each
        for (int number: randomArray){
            System.out.print(number + " ");
        }

        System.out.println("\nИнициализация массива forEach");
        //Инициализация массива forEach
        int[] randomArray2 = new int[10];
        System.out.println("=============RANDOM INT==============");

        for (int number: randomArray2){
            number = random.nextInt(-100, 100);
            System.out.print(number + " ");
        }

        System.out.println("\n"+Arrays.toString(randomArray2));

    }
}
