package Collection.Queue.P2;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

//Pide kuyruğu // FIFO (First In First Out) yapısına sahiptir. Yani ilk eklenen ilk çıkar.
public class Main {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Ramazan Pidesi Uygulaması");
        Random random = new Random();
        Queue<String> pideKuyrugu = new LinkedList<>();
        pideKuyrugu.offer("ali");
        pideKuyrugu.offer("veli");
        pideKuyrugu.offer("mikhail");
        pideKuyrugu.offer("ahmet");
        pideKuyrugu.offer("mehmet");
        pideKuyrugu.offer("ayse");
        pideKuyrugu.offer("fatma");
        pideKuyrugu.offer("zeynep");
        pideKuyrugu.offer("ramazan");
        pideKuyrugu.offer("mustafa");
        int pideSayisi=1+ random.nextInt(10); // 1 ile 10 arasında rastgele pide sayısı
        System.out.println("Pideler Çıkıyor...");
        System.out.println("Çıkan Pide Sayısı: " + pideSayisi);
        Thread.sleep(3000); // 3 saniye bekleme süresi
        while (pideSayisi!=0){
            System.out.println(pideKuyrugu.poll()+" pideyi aldı.");
            pideSayisi--;
            Thread.sleep(1000);


        }
        System.out.println("Pide Bİtti.");




    }
}
