package main.java.lesson7.b_builder;

public class StringBuilderClass {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder("builderStart");
        System.out.println(builder);

        //append()
        builder.append("new word");
        System.out.println(builder);

        //insert
        System.out.println(builder.insert(5,  " NEW_INSERT "));

        //reverse
        System.out.println(builder.reverse());
        System.out.println(builder);

        //delete
        System.out.println(builder.delete(4, 16));
        String string = String.valueOf(builder);
        System.out.println(string);

        //StringBuffer
        StringBuffer stringBuffer = new StringBuffer("stringBuffer");
        stringBuffer.toString();
    }
}
