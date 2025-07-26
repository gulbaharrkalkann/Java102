package Collection.ArrayList.ArrayListvsLinkedList;
//Bu projede ArrayList ve LinkedList'in ekleme sürelerini karşılaştıracağız.
//İkisi arasındaki temel fark, ArrayList'in dinamik bir dizi kullanması ve LinkedList'in düğümlerden oluşan bir zincir yapısı kullanmasıdır.
//ArrayList, elemanlara rastgele erişim için daha hızlıdır, ancak ekleme ve silme işlemleri daha yavaştır.
//LinkedList ise ekleme ve silme işlemleri için daha hızlıdır, ancak rastgele erişim için daha yavaştır.


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void zamanHesapla(String veriTipi, List<Integer> list){
        long baslangic;
        long bitis;
        baslangic = System.currentTimeMillis();



        for (int i = 0; i < 1000000; i++) {
            list.add(0,i);
        }
        bitis = System.currentTimeMillis();
        System.out.println(veriTipi + " ekleme süresi: " + (bitis - baslangic) + " ms");
    }
    public static void main(String[] args) {
        LinkedList<Integer> linkedlist =new LinkedList<Integer>();
        ArrayList<Integer> arrayList =new ArrayList<Integer>();

        zamanHesapla("LinkedList", linkedlist);
        zamanHesapla("ArrayList", arrayList);
    }
}
