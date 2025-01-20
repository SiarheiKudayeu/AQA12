package main.java.lesson7.e_byte_io_stream;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.util.Arrays;

public class ByteInputOutputStream {
    public static void main(String[] args) {
        //OutputStream для записи в поток
        //-128 till 127
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byteArrayOutputStream.write(24);
        byteArrayOutputStream.write(2431);
        byteArrayOutputStream.write(2);

        byte[] arrayFromOutput = byteArrayOutputStream.toByteArray();
        System.out.println(Arrays.toString(arrayFromOutput));


        //InputStream для чтения
        byte[] array = {22, 13, 120};
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(array);
        int count;
        while ((count = byteArrayInputStream.read()) != -1){
            System.out.print(count + " ");
        }
    }
}
