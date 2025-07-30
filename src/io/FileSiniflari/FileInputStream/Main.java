package io.FileSiniflari.FileInputStream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) {
//java input stream oluşturma
        //byte byte okumak  için

        try {
            FileInputStream input =new FileInputStream("patika.txt");
           while (input.read()!=-1){
               System.out.println(input.read());
           }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        //karakter karakter okumak için
        try {
            FileInputStream input =new FileInputStream("patika.txt");
      int i= input.read();
      while (i!=-1){
          System.out.print((char)i);
          i=input.read();
      }
      input.close();
            }
         catch (Exception e) {
            System.out.println(e.getMessage());
        }
        //Available metodu :

        try {
            FileInputStream input =new FileInputStream("patika.txt");
            System.out.println("Kullanılabilir byte sayısı : "+input.available());
            input.read();
            input.read();
            input.read();
            input.read();
            System.out.println("Kullanılabilir byte sayısı : "+input.available());
            input.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        /*
        skip();


Belirtilen bayt sayısını atmak ve atlamak için skip () yöntemini kullanabiliriz. Örneğin,


         */


    }
}
