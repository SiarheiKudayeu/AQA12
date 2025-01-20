package main.java.lesson7.g_buffer_io_stream;

import java.io.*;

public class BufferInputOutputStream {
    public static void main(String[] args) {
        String testToWrite = "Test text!!!";
        String pathToFile = "C:\\Users\\s.kudaev\\Desktop\\AQA\\text2.txt";

        try (OutputStream outputStream = new BufferedOutputStream(new FileOutputStream(pathToFile))) {
            outputStream.write(testToWrite.getBytes());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }


        StringBuilder resultText = new StringBuilder();
        try (InputStream inputStream = new BufferedInputStream(new FileInputStream(pathToFile))) {
            int count;
            while ((count = inputStream.read()) != -1) {
                resultText.append((char) count);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        System.out.println(resultText);
    }
}
