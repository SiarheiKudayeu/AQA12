package main.java.lesson7.a_string;

import java.util.Arrays;

public class StringClass {
    public static void main(String[] args) {

        //concat() == +
        String textConcat1 = "text1";
        String textConcat2 = "text2";
        System.out.println(textConcat1 + textConcat2);
        System.out.println(textConcat1.concat(textConcat2));
        System.out.println(textConcat1);
        System.out.println(textConcat2);
        textConcat2 = textConcat1.concat(textConcat2);
        System.out.println(textConcat2);
        System.out.println("==============");

        //equals
        System.out.println("text1".equals("text1"));
        System.out.println("==============");

        //символы экранирования \", \n \b
        System.out.println("My random text is \"TEXT\"\nnew lines\b");
        System.out.println("==============");

        //valueOf()
        boolean boo = true;
        String resultOfBoo = String.valueOf(boo);
        System.out.println(resultOfBoo);
        System.out.println("==============");

        //charAt()
        String symbols = "0123456A8";
        System.out.println(symbols.charAt(7));
        System.out.println("==============");

        //indexOf(), lastIndexOf()
        String symbolsIndexOf = "0123456A8A2435";
        System.out.println(symbolsIndexOf.indexOf("A"));
        System.out.println(symbolsIndexOf.lastIndexOf("A"));
        System.out.println(symbolsIndexOf.lastIndexOf("X"));
        System.out.println("==============");

        //replace()
        System.out.println("Text for replace \"YOU TEXT\"".replace("YOU TEXT", "testing"));
        System.out.println("Text for replace \"YOU TEXT\"".replace("YOU TEXT", ""));
        System.out.println("==============");

        //startsWith,
        System.out.println("Good morning, Siarhei!!!".startsWith("Good morning"));
        System.out.println("Siarhei, goodbuy!!!".endsWith("goodbuy!!!"));
        System.out.println("==============");

        //split()
        String textForSplit = "My random test for split!!!";
        String[] splitArray = textForSplit.split("\\s");
        String[] splitArray2 = textForSplit.split(" test ");
        System.out.println(Arrays.toString(splitArray));
        System.out.println(Arrays.toString(splitArray2));
        System.out.println(splitArray2[1]);
    }
}
