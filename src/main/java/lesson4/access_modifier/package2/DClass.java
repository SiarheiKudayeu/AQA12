package main.java.lesson4.access_modifier.package2;

import main.java.lesson4.access_modifier.package1.AClass;

public class DClass extends AClass {


    public void printProtectedA(){
        System.out.println(protectedString);
    }

    public static void main(String[] args) {
        AClass aClass = new AClass();
        System.out.println(aClass.publicString);
/*      System.out.println(aClass.privateString);
        System.out.println(aClass.protectedString);
        System.out.println(aClass.defaultString);*/

        DClass dClass = new DClass();
        System.out.println(dClass.protectedString);
    }

}
