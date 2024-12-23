package main.java.lesson1;

public class BooleanClass {
    public static void main(String[] args) {
        boolean myBoolean = true;
        boolean myBoolean2 = false;

        System.out.println(myBoolean2);

        System.out.println("===============");
        // ==
        int x = 10;
        int y = 7;
        boolean result = x == y;
        System.out.println(result);

        System.out.println("===============");
        // !=
        int e = 10;
        int r = 7;
        boolean resultE = e != r;
        System.out.println(resultE);
        System.out.println("===============");
        //> < >= <=
        System.out.println(10 > 10);
        System.out.println(10 >= 10);

        System.out.println("===============");
        // || or (или)
        System.out.println(10 < 7 || 12 < 3 || 4 == 4);

        System.out.println("===============");
        // && or (или)
        System.out.println((10 > 7 && 12 > 3 )|| 4 == 4);

    }
}
