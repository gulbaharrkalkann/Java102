package io.FileSiniflari.FileOutputStream.Pratik1;
import java.io.FileOutputStream;
public class Main {
    public static void main(String[] args) {
        // FileOutputStream kullanarak dosyaya veri(bayt cinsinden) yazma işlemi
        String yazi="Output Stream öğreniyorum.\npatika DEv";

        try {
            FileOutputStream output=new FileOutputStream("patika.txt",true);
            //içindeki verileri silmeden ekleme yapması için true parametresi kullanıldı
            byte[] yaziByte=yazi.getBytes();
            output.write(yaziByte);
            output.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}
