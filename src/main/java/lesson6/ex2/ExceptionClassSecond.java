package main.java.lesson6.ex2;

import main.java.lesson5.generics.ex3.HorseMan;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionClassSecond {
    public static void main(String[] args) {
        int[] array = {12, 4, 98, -4, 0};
        System.out.println("Insert array index:");

        try {
            HorseMan horseMan = null;
            horseMan.sayWhoAmI();
            System.out.println(100 / array[new Scanner(System.in).nextInt()]);
        } catch (ArithmeticException e) {
            System.out.println("You entered index 4");
        } catch (InputMismatchException e) {
            System.out.println("You entered non valid int");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Index out of bound");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
