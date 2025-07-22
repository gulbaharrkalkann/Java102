package Collection.MapInterface.HashMap.P1;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        HashMap<Integer, String> hashMap=new HashMap<Integer,String>();
        hashMap.put(10,"Java");
        hashMap.put(20,"Python");
        hashMap.put(30,"C++");
        hashMap.put(40,"JavaScript");
        hashMap.put(40,"Go"); // Duplicate key, will not be added
        System.out.println(hashMap);
        System.out.println(hashMap.get(20));
        System.out.println(hashMap.get(70)); // Returns null since key 70 does not exist


        for (Map.Entry<Integer, String> entry : hashMap.entrySet()) {
            System.out.println("Key:    " + entry.getKey() + "--------->  Value: " + entry.getValue());
        }
    }
}
