package Collection.MapInterface.HashMap.P2;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Main {

    public static void printMap(Map<Integer, String> map) {

    map.put(10, "Java");
    map.put(5, "Python");
    map.put(1, "C#");
    map.put(2, "JavaScript");
    map.put(100, "Go"); // Adding a new key-value pair
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println("Key: " + entry.getKey() + " ---> Value: " + entry.getValue());
        }
    }
    public static void main(String[] args) {

        Map<Integer,String> hashmap = new HashMap<Integer,String>();//Değerler sırasız tutulur
        Map<Integer,String> LinkedHashmap = new LinkedHashMap<Integer,String>();//Değerler eklenme sırasına göre tutulur
        Map<Integer,String> treemap = new TreeMap<Integer,String>();//Değerler sıralı tutulur
        System.out.println("**************************");
        printMap(hashmap);
        System.out.println("**************************");
        printMap(LinkedHashmap);
        System.out.println("**************************");
        printMap(treemap);

    }
}
