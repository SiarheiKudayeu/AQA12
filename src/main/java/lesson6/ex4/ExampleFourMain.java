package main.java.lesson6.ex4;

public class ExampleFourMain {
    public static void main(String[] args) throws ExampleFour.OddCountOfCharsException {
        try {
            new ExampleFour().checkString4("tw yt yt uy4 exception");
        }catch ( ExampleFour.AmountOfWordsLessThanThreeException | ExampleFour.StringContainsException  e ){
            System.out.println(e.getMessage());
        }

        try {
            Thread.sleep(1000);
        }catch (InterruptedException ignored){}


        System.out.println("Final");

        new ExampleFour().test();
    }


}
