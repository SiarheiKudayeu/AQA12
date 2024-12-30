package main.java.lesson3.final_key;

public class FinalField {
    public static final String group = "AQA12";
    public static  String nonFinalGroup = "AQA12";
    public final String test;

    public FinalField(String test) {
        this.test = test;
    }

    public static void main(String[] args) {
        System.out.println(group);
        nonFinalGroup = "AQA13";
        System.out.println(nonFinalGroup);

        FinalField finalField = new FinalField("test");
    }
}
