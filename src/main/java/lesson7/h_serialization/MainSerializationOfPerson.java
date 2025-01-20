package main.java.lesson7.h_serialization;

import java.io.*;
import java.util.Arrays;

public class MainSerializationOfPerson {
    public static void main(String[] args) {
        //сериализация
        byte[] byteArrayPerson = null;
        PersonSerial ivan = new PersonSerial(25, "Ivan");
        try (
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                ObjectOutputStream outputStream = new ObjectOutputStream(byteArrayOutputStream)
                ){
            System.out.println("Before serialization: " + ivan);
            outputStream.writeObject(ivan);
            byteArrayPerson = byteArrayOutputStream.toByteArray();
        }catch (IOException e){
            System.out.println(e.getMessage());
        }
        System.out.println("After serialization: " + Arrays.toString(byteArrayPerson));

        System.out.println("===========");
        //десериализация
        PersonSerial ivanBack = null;
        try (
                ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(byteArrayPerson);
                ObjectInputStream objectInputStream = new ObjectInputStream(byteArrayInputStream)
        ){
            ivanBack = (PersonSerial) objectInputStream.readObject();
        }catch (IOException | ClassNotFoundException e){
            System.out.println(e.getMessage());
        }
        System.out.println(ivanBack);
    }
}
