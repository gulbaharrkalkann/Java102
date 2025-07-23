package Collection.VectorlerveStackler.Pratik1;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Vector<String> vector = new Vector<String>();
        vector.add("Java");
        vector.add("Python");
        vector.add("Phyton");
        vector.add("C++");
        /*
//1.yol
        for (String s : vector) {
            System.out.println(s);
        }
//2.yol
        ListIterator<String> iterator = vector.listIterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
//3.yol

        Enumeration<String> enumeration = vector.elements();
        while (enumeration.hasMoreElements()) {
            System.out.println(enumeration.nextElement());
        }

         */

        Stack<String> stack = new Stack<String>();
        stack.push("Java");
        stack.push("Python");
        stack.push("C++");
        stack.push("JavaScript");

        System.out.println(stack.peek());// Listedeki en üstteki elemanı gösterir

        System.out.println("****************");
        for (String s : stack) {
            System.out.println(s);
        }
        System.out.println("Son eleman çıkartılıyor : " + stack.pop());//
        System.out.println("****************");
        for (String s : stack) {
            System.out.println(s);
        }
        System.out.println("*****************");
        while (!stack.isEmpty()) {
            System.out.println("Son eleman çıkartılıyor : " + stack.pop());


        }
    }
}
