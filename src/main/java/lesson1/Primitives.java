package main.java.lesson1;

public class Primitives {
    public static void main(String[] args) {
  /*      //Целочисленные

        //byte -128 till 127
        byte myByte = 10;
        System.out.println(myByte);

        //short -32768 till 32767
        short myShort = 332;
        System.out.println(myShort);

        // int -2^31 till 2^31-1
        // long -2^63 till 2^63 -1

        int x1;
        System.out.println("Hello");
        x1 = 13;
        System.out.println(x1);

        int x2, x3, x4;
        x2 = 10;
        x3 = x4 = 17;

        long myLong = 13L;
        System.out.println(myLong);*/

/*        //числа с плавающей точкой
        float myFloat = 6.07F;
        System.out.println(myFloat);

        double myDouble = 14.34;
        System.out.println("My double");
        System.out.println(myDouble);*/

        //= - * /
        int x = 10;
        int y = 5;
        int z = x / y;
        System.out.println(z);
        System.out.println(13 + 5);

        int a = 3;
        System.out.println((double) x / a);

        double b = 10;
        double c = 3;
        System.out.println(b / c);


        System.out.println("=======================");
        //%
        //12%5  ---- 2 целых 2/5   => 2
        //3%12  ---- 3/12          => 3
        System.out.println(12 % 5);
        System.out.println(3 % 12);
        System.out.println("=======================");
        System.out.println(12 % 5);
        System.out.println(-12 % 5);
        System.out.println(12 % -5);
        System.out.println(-12 % -5);

    }
}
