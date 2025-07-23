package Collection.Queue.PriorityQueue;
//PriorityQueue, Java'da öncelik sıralaması yapan bir kuyruk yapısıdır.
import InnerSiniflar.Pratik1.Out;

import java.util.PriorityQueue;
import java.util.Queue;
class Player implements Comparable<Player> {
    private String name;
    private int id;

    public Player(String name, int id) {
        this.name = name;
        this.id = id;
    }
    @Override
    public int compareTo(Player player) {
        // Öncelik sıralaması, id'ye göre yapılır
        if (this.id<player.id){
            return -1;
        }else if(this.id>player.id){
return 1;
        }
return 0;
    }

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }
}
public class Main {
    public static void main(String[] args) {
        Queue<Player> queue = new PriorityQueue<Player>();
        queue.offer(new Player("Ali", 5));
        queue.offer(new Player("Bob", 1));
        queue.offer(new Player("Charlie", 100));

        while (!queue.isEmpty()) {
            System.out.println("Eleman çıkarılıyor: " + queue.poll());
        }
        /*
        queue.offer(5);
        queue.offer(1);
        queue.offer(2);
        queue.offer(100);
        /*
        for (Integer i:queue){
            System.out.println(i);
        }


//for döngüsü, PriorityQueue'da elemanlar doğal sıralama düzenine göre sıralanır.Bizim istediğimiz gibi öncelik sıralaması olmaz for döngüsünde
// Öncelik sıralaması için peek() ve poll() metodlarını kullanabiliriz.
        System.out.println(queue.peek());// En yüksek öncelikli elemanı gösterir, ancak silmez
        while (!queue.isEmpty()){
            System.out.println("Eleman çıkarılıyor: " + queue.poll());
        }
        */
    }
}
