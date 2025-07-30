package io.ByteArraySiniflari;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        // ByteArrayInputStream sınıfı, byte dizisinden veri okumak için kullanılır.

        byte[] dizi={1,2,3,4,54,66};
        ByteArrayInputStream input = new ByteArrayInputStream(dizi);
        /*
        System.out.println(input.read());
        System.out.println(input.read());
        System.out.println(input.read());
        System.out.println(input.read());
        System.out.println(input.read());

         */
        System.out.println("****************************************");

        System.out.println("Kullanılabilen  byte sayısı: " + input.available());
        int i=input.read();
        while(i!=-1){
            System.out.println(i);
            i=input.read();
        }
        System.out.println("****************************************");

        //byte array output sınıfı
        String data ="Java 102 dersleri";
        ByteArrayOutputStream output = new ByteArrayOutputStream();
        byte[] dataByte = data.getBytes();
        try {
            output.write(dataByte);
            String newData =output.toString();
            System.out.println("ByteArrayOutputStream ile yazılan veri: " + newData);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }
}
