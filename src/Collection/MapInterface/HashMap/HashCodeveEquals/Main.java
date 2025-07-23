package Collection.MapInterface.HashMap.HashCodeveEquals;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
//Hashset ve equals metotları ile nesnelerin karşılaştırılması

//Eğer aynı id'ye sahip iki nesne varsa, bu nesneler hashset'e sadece bir kez eklenir.bu şu şekilde çalışır:
//1. Nesne eklenirken, hashCode() metodu çağrılır ve nesnenin hash kodu hesaplanır.
//2. Eğer hash kodu zaten hashset içinde varsa, equals() metodu çağrılır.
//3. Eğer equals() metodu true dönerse, yani nesneler eşitse, yeni nesne eklenmez.

 class Player {

     String name;
     String id;

     public Player(String name, String id) {
         this.name = name;
         this.id = id;
     }

     @Override
     public String toString() {
         return "Player{" +
                 "name='" + name + '\'' +
                 ", id='" + id + '\'' +
                 '}';
     }

     @Override
     public boolean equals(Object o) {
         if (o == null || getClass() != o.getClass()) return false;
         Player player = (Player) o;
         return Objects.equals(name, player.name) && Objects.equals(id, player.id);
     }

     @Override
     public int hashCode() {
         return Objects.hash(name, id);
     }
 }


public class Main {


    public static void main(String[] args) {

        Set<Player> hashset = new HashSet<Player>();
        Player p1 = new Player("<UNK>", "1");
        Player p2 = new Player("<gul>", "10");
        Player p3 = new Player("<sey>", "11");
        Player p4 = new Player("<UNK>", "1");
        hashset.add(p1);
        hashset.add(p2);
        hashset.add(p3);
        hashset.add(p4); // This will not be added because p1 and p4 are considered equal based on their id
        for (Player p : hashset) {
            System.out.println(p);
        }

    }
}
