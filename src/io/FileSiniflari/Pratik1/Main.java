package io.FileSiniflari.Pratik1;

import java.io.File;

public class Main {
    public static void main(String[] args) {
/*
Dosya oluşturma işlemi için File sınıfını kullanabilirsiniz. Aşağıdaki örnek, "patika.txt" adlı bir dosya oluşturmayı gösterir:
    File dosya=new File("patika.txt" );
        try {
       if (dosya.createNewFile()) {
           System.out.println("Dosya oluşturuldu: " + dosya.getName());
         } else {
           System.out.println("Dosya zaten mevcut: " + dosya.getName());
       }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

//Dizin oluşturma
        // Aşağıdaki kod, "test" adlı bir dizin oluşturur ve içinde "patika.txt" adlı bir dosya oluşturur.

        File dizin =new File("test");
        dizin.mkdir();
        File dosya = new File("test/patika.txt");
try {
    System.out.println(dosya.createNewFile());
}catch (IOException e){
    System.out.println(e.getMessage());
}
//mkdirs ne işe yarar?
//mkdirs() metodu, belirtilen dizin ve alt dizinleri oluşturur. Eğer dizin zaten varsa, hiçbir şey yapmaz.
  File dizin =new File("patika/dev");
        System.out.println(  dizin.mkdirs());
 */
        //Dizindeki dosyaları listeleme
        File dizin= new File("test");
        dizin.list();
        String[] list=dizin.list();
        for (String s : list) {
            System.out.println(s);
        }





    }
}

