package Collection.SetInterface.P1;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {

        Set<String> set1 = new HashSet<String>();//Karışık bir şekilde ekler
        Set<String> set2 = new LinkedHashSet<String>();// Ekleme sırasına göre ekler
        Set<String> set3 = new TreeSet<String>();//  alfabeye göre Sıralı bir şekilde ekler

        set1.add("java");
        set1.add("python");
        set1.add("c++");
        set1.add("javascript");
        set1.add("php");

        set2.add("java");
        set2.add("python");
        set2.add("c++");
        set2.add("javascript");
        set2.add("php");

        set3.add("java");
        set3.add("python");
        set3.add("c++");
        set3.add("javascript");
        set3.add("php");
        set3.add("php");// Tekrar eden elemanları almaz.
/*
setlerin içeriklerini ekrana yazdırmak için
        System.out.println("******* HashSet *******");
        for (String s : set1) {
            System.out.println(s);
        }
        System.out.println("******* LinkedHashSet *******");
        for (String s : set2) {
            System.out.println(s);
        }
        System.out.println("******* TreeSet *******");
        for (String s : set3) {
            System.out.println(s);
        }


 */
        System.out.println(set1.contains("java"));// true
        System.out.println(set1.contains("Go"));// false

        System.out.println(set1.isEmpty());//false

    }
}
