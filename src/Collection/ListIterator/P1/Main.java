package Collection.ListIterator.P1;

import java.util.*;

/*
Iterator Nedir?

Java'nın koleksiyonlar üzerinde ileri yönde gezinmesini sağlayan bir arayüzdür.
List, Set, Queue gibi koleksiyonlarda kullanılabilir.
Kullanım amacı: koleksiyonu baştan sona doğru taramak ve elemanları güvenli şekilde kaldırmaktır.
ListIterator Nedir?

Sadece List arayüzünü implement eden sınıflarda (ArrayList, LinkedList) kullanılabilir.
Iterator'ın sunduğu tüm özelliklere ek olarak ileri ve geri yönde gezinme, eleman ekleme, silme ve güncelleme gibi işlemleri destekler.
 */
public class Main {
    public static void main(String[] args) {

    //    Set<String> set = new HashSet<String>();
        List<String> list = new ArrayList<String>();
        list.add("Java");
        list.add("Python");
        list.add("C++");
        list.add("JavaScript");
        ListIterator<String> listIterator = list.listIterator();
        while (listIterator.hasNext()) {//ileriye doğru gezinir
            System.out.println(listIterator.next());
        }
        System.out.println("*******************");

        while (listIterator.hasPrevious()) {//geriye doğru gezinir
            System.out.println(listIterator.previous());
        }
        System.out.println("*******************");
        while (listIterator.hasNext()) {// İleriye doğru gezinirken elemanları kontrol eder
            String value= listIterator.next();
            if (value.equals("Python")) {
                listIterator.remove();// Elemanı siler

            }
            System.out.println("********************");
            for (String s: list) {
                System.out.println(s);
            }
        }

        /*
        set.add("Java");
        set.add("Python");
        set.add("C++");
        set.add("JavaScript");

        list.add("Java");
        list.add("Python");
        list.add("C++");
        list.add("JavaScript");

        Iterator<String> iterator1 = set.iterator();
        Iterator<String> iterator2 = list.iterator();

        while (iterator1.hasNext()) {
            System.out.println(iterator1.next());

        }
        System.out.println("*******************");
        while (iterator2.hasNext()) {
            System.out.println(iterator2.next());
        }
        System.out.println("*******************");
        while (iterator2.hasNext()) {
            System.out.println(iterator2.next());// Bİz bunu daha önce bastırmıştık Iterator listenin sonunda olduğu için eleman olmadığından dolayı ekrana bişey basmayacak
        }

         */
    }
}
