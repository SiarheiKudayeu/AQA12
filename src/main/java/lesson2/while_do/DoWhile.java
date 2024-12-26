package main.java.lesson2.while_do;

import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert number:");
        int i = scanner.nextInt();

        while (i < 0) {
            System.out.println("While loop");
        }


        do {
            System.out.println("Do while loop");
        } while (i < 0);
    }
}
