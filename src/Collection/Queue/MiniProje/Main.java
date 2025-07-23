package Collection.Queue.MiniProje;

import java.util.PriorityQueue;
import java.util.Queue;

//Acil servis uygulaması
public class Main {
    public static void main(String[] args) {

        Queue<Hasta> acilServis = new PriorityQueue<Hasta>();
        acilServis.offer(new Hasta("Ali", "Yanık"));
        acilServis.offer(new Hasta("Okan","Bas agrisi"));
        acilServis.offer(new Hasta("Elif","Apandisit"));
        acilServis.offer(new Hasta("Oğuz","Yanık"));
        acilServis.offer(new Hasta("merve","Yanık"));
        acilServis.offer(new Hasta("Gizem","Apandisit"));

        int i=1;
        while (!acilServis.isEmpty()) {
            System.out.println("*******************");
            System.out.println(i+" .sıradaki hasta");
            System.out.println(acilServis.poll());
            System.out.println("*******************");
            i++;
        }

    }
}
