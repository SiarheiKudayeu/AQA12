package main.java.lesson2.conditional_operators;

import java.util.Scanner;

public class TernaryOperatorLessonTwo {
    public static void main(String[] args) {
        // условие ? выражение1 : выражение2
        Scanner scanner = new Scanner(System.in);
        System.out.println("How old are you?");
        int age = scanner.nextInt();
        String finalMessage = age < 18  ? "You are young" : age > 18 ? "You are adult" : "Who are you?";
        System.out.println(finalMessage);
        scanner.close();
    }
}
