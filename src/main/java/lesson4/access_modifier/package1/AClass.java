package main.java.lesson4.access_modifier.package1;

import main.java.lesson4.inheritance.task.ClassA;

public class AClass {
    public static void main(String[] args) {
        AClass aClass = new AClass();
        System.out.println(aClass.publicString);
        System.out.println(aClass.privateString);
        System.out.println(aClass.protectedString);
        System.out.println(aClass.defaultString);
    }

    public String publicString = "publicString";
    private String privateString = "privateString";
    protected String protectedString = "protectedString";
    String defaultString = "defaultString";
}
