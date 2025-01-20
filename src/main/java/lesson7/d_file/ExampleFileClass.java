package main.java.lesson7.d_file;

import java.io.File;

public class ExampleFileClass {
    public static void main(String[] args) {

        File test = new File("C:\\Users\\s.kudaev\\Desktop\\AQA\\test.txt");
        System.out.println(test.length());
        System.out.println(test.getName());
        System.out.println(test.canWrite());
        System.out.println(test.canRead());
        System.out.println(test.isFile());
        System.out.println(test.isDirectory());
        System.out.println("=========");

        File testFolder = new File("C:\\Users\\s.kudaev\\Desktop\\AQA");
        System.out.println(testFolder.isDirectory());

        File[] files = testFolder.listFiles();
        int counter = 1;
        for(File file: files){
            System.out.println(counter + ") " + file.getName());
            counter++;
        }
    }
}
