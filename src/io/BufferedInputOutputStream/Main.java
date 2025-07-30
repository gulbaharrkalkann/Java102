package io.BufferedInputOutputStream;
//BufferedInputStream nedir
//
import java.io.*;

public class Main {
    public static void main(String[] args) {
//BufferedInputStream
        try {
            FileInputStream fileInput=new FileInputStream("patika.txt");
            BufferedInputStream buffInput=new BufferedInputStream(fileInput);
            int i=buffInput.read();
            while (i != -1){
                System.out.print((char) i);
                i=buffInput.read();
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.println("***********************************");
        //BufferedOutputStream
        String data="Java 102 Patikası";
        try {
            FileOutputStream fileOutput=new FileOutputStream("patika.txt");
            BufferedOutputStream buffOutput=new BufferedOutputStream(fileOutput);
            byte[] byteArray=data.getBytes();
            buffOutput.write(byteArray);
            buffOutput.close();
            fileOutput.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
