package main.java.lesson3.classes;

import java.util.Arrays;

public class Recipe {


    public Recipe(String title, int price, String[] ingredients) {
        this.title = title;
        this.price = price;
        this.ingredients = ingredients;
    }

    public Recipe(String title, String[] ingredients) {
        this.title = title;
        this.ingredients = ingredients;
    }

    public Recipe(int price) {
        this("Salat", new String[]{"Carrot", "Tomato"});
        this.price = price;
    }

    private String title;
    private int price;
    private double timeToCook;
    private String[] ingredients;

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }


    public void orderMe() {
        System.out.println("Please order me!!!");
    }

    public void getInfoAboutRecipe() {
        System.out.println("Title of Dish is " + title);
        System.out.println("Price of Dish is " + price);
        System.out.println("Ingredients of Dish are " + Arrays.toString(ingredients));
    }

/*    @Override
    public String toString() {
        return "\"Title of Dish is \"" + title + "\n"
                + "\"Price of Dish is \"" + price + "\n"
                + "\"Ingredients of Dish are \"" + Arrays.toString(ingredients) + ".";

    }*/

    @Override
    public String toString() {
        return "title = '" + title + '\'' +
                ", price = " + price +
                ", ingredients = " + Arrays.toString(ingredients);
    }
}
