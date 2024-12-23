package main.java.lesson1;

public class IfElseClass {
    public static void main(String[] args) {
        /*

        if(условие){
     выполнение кода если условие = true
     }

     */

        int x = 200;
        if (x > 0) {
            if(x == 201){
                System.out.println("Yoy are the champion!!!");
            }else {
                System.out.println("Your number is positive");
            }
        } else if(x < 0){
            System.out.println("Your number is negative");
        }else {
            System.out.println("Your number is zero");
        }
    }
}
