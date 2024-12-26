package main.java.lesson2.method_creation;

public class MethodCreationClassLessonTwo {

    public static void main(String[] args) {
        printSmthToConsole();
        System.out.println("=======================");
        printSmthToConsoleWithArgument("Argument2");
        printSmthToConsoleWithArguments("Text", 2);
        System.out.println("=======================");
        String returnValue = printSmthToConsoleAndReturnValue();
        System.out.println(returnValue);
        System.out.println("=======================");
        String returnValue2WithArgs = printSmthToConsoleAndReturnValueWithArguments(3, 45);
        System.out.println(returnValue2WithArgs);
    }


    //Не принимает аргументы и ничего не возвращает (void -> ничего не возвращает)
    public static void printSmthToConsole(){
        System.out.println("Метод который не принимает аргументы и ничего не возвращает");
    }

    //Принимает аргумент и ничего не возвращает (void -> ничего не возвращает)
    public static void printSmthToConsoleWithArgument(String text){
        System.out.println("Принимает аргументы и ничего не возвращает");
        System.out.println("Аргумент: " + text);
    }

    //Принимает аргументЫ и ничего не возвращает (void -> ничего не возвращает)
    public static void printSmthToConsoleWithArguments(String argument1, int argument2){
        System.out.println("Принимает аргументы и ничего не возвращает");
        System.out.println("Аргумент1: " + argument1);
        System.out.println("Аргумент2: " + argument2);
    }


    //Не принимает аргументы и возвращает значение
    public static String printSmthToConsoleAndReturnValue(){
        System.out.println("Не принимает аргументы и возвращает значение");
        return "printSmthToConsoleAndReturnValue";
    }

    //Принимает аргументы и возвращает значение
    public static String printSmthToConsoleAndReturnValueWithArguments(int argument1, int argument2){
        System.out.println("Принимает аргументы и возвращает значение");
        return "Summ of argument1 and argument2 = " + (argument1 + argument2);
    }
}
