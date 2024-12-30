package main.java.lesson3.classes;

public class Main {
    public static void main(String[] args) {
  /*      Recipe myFirstRecipe = new Recipe();
        myFirstRecipe.orderMe();
        System.out.println("===========");
        new Recipe().orderMe();
        System.out.println("===========");
        myFirstRecipe.getInfoAboutRecipe();
        System.out.println("===========");
        System.out.println(myFirstRecipe.title + " - title of my dish");
        System.out.println("===========");
        myFirstRecipe.title = "Pancake";
        myFirstRecipe.price = 200;
        myFirstRecipe.ingredients = new String[]{"Milk", "Pouder", "Sugar", "Egg"};
        System.out.println(myFirstRecipe.title + " - title of my dish");
        System.out.println("===========");
        myFirstRecipe.getInfoAboutRecipe();*/

 /*       Recipe mySecondRecipe = new Recipe();
        mySecondRecipe.getInfoAboutRecipe();
        mySecondRecipe.setTitle("Water");
        mySecondRecipe.getInfoAboutRecipe();
        System.out.println("=============");
        System.out.println("My recipe title is " + mySecondRecipe.getTitle());*/

        Recipe myThirdRecipe = new Recipe("Salt water", 7, new String[]{"Water", "Salt"});
        myThirdRecipe.getInfoAboutRecipe();
        System.out.println("=======");
        Recipe myFourthRecipe = new Recipe("Bread", new String[]{"Flover", "Water"});
        myFourthRecipe.getInfoAboutRecipe();
        System.out.println("=======");
        Recipe myFifthRecipe = new Recipe(15);
        myFifthRecipe.getInfoAboutRecipe();
        System.out.println("=======");
        System.out.println(myFifthRecipe);
    }
}
