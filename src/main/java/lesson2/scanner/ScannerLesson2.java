package main.java.lesson2.scanner;

import java.util.Scanner;

public class ScannerLesson2 {
    public static void main(String[] args) {

/*        //input int
        Scanner myFirstScanner = new Scanner(System.in);
        System.out.println("Please, enter your number:");
        int x = myFirstScanner.nextInt();
        System.out.println("Your number is " + x);*/

/*        //input String nextLine()
        Scanner myFirstScanner = new Scanner(System.in);
        System.out.println("Please, enter your text:");
        String text = myFirstScanner.nextLine();
        System.out.println("Your text is: " + text);*/

        //input String next()
        Scanner myFirstScanner = new Scanner(System.in);
        System.out.println("Please, enter your text:");
        String text = myFirstScanner.next();
        System.out.println("Your text is: " + text);
        String nextText = myFirstScanner.next();
        System.out.println("Your next text is: " + nextText);
        String allRestText = myFirstScanner.nextLine();
        System.out.println("Your all Rest Text text is: " + allRestText);

        myFirstScanner.close();
    }
}
