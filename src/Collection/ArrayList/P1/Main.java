package Collection.ArrayList.P1;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
   //  ArrayList<String> Arraylist = new ArrayList<String>();
        List<String> list = new ArrayList<String>();

        list.add("Java");
        list.add("Python");
        list.add("C++");

        //System.out.println(list.get(0)); // Accessing the first element
        //System.out.println(list.get(2)); // Accessing the third element
        System.out.println("*************************************");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        System.out.println("*************************************");
        for (String s : list) {
            System.out.println(s);
        }
    }
}
