package main.java.lesson2.conditional_operators;

import java.util.Scanner;

public class SwitchCaseLessonTwo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert profession:");
        String profession = scanner.nextLine();
        switch (profession.toUpperCase()) {
            case ("QA"):
                System.out.println("Are you familiar with mobile testing?");
                String yourAnswer = scanner.nextLine();
                switch (yourAnswer) {
                    case ("yes"):
                        System.out.println("Hello mobile tester");
                        break;
                    case ("no"):
                        System.out.println("Hello non mobile tester");
                        break;
                }
                break;
            case ("DEVELOPER"):
                System.out.println("Hello Developer");
                break;
            case ("DEVOPS"):
                System.out.println("Hello DevOps");
                break;
            default:
                System.out.println("I don't know such profession!!!");
                break;
        }

        String test = scanner.nextLine();

        //enhanced switch case
        switch (test) {
            case "Test" -> System.out.println("You printed test");
            case "Mess" -> System.out.println("You printed mess");
            case "Dress" -> {
                System.out.println("You printed dress");
                System.out.println("You printed dress");
            }
            default -> System.out.println("Default");
        }
    }


}
