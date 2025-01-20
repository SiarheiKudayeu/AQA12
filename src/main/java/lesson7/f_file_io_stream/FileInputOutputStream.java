package main.java.lesson7.f_file_io_stream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileInputOutputStream {
    public static void main(String[] args) {
        String testToWrite = "Test text!!!";
        String pathToFile = "C:\\Users\\s.kudaev\\Desktop\\AQA\\test.txt";

        try (FileOutputStream fileOutputStream = new FileOutputStream(pathToFile)) {
            fileOutputStream.write(testToWrite.getBytes());
        }catch (IOException e){
            System.out.println(e.getMessage());
        }
        System.out.println("=================");

        byte[] bufferBytes = new byte[10];
        StringBuilder resultText = new StringBuilder();
        try (FileInputStream fileInputStream = new FileInputStream(pathToFile)) {
            int count;
            while ((count = fileInputStream.read(bufferBytes)) != -1){
                for(int i = 0; i < count; i++){
                    resultText.append((char) bufferBytes[i]);
                }
            }
        }catch (IOException e){
            System.out.println(e.getMessage());
        }

        System.out.println(resultText);
    }
}
