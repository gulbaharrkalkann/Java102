package Collection.ListIterator.IterableClass;
/*
Iterable class nedir?
Java'da Iterable arayüzü, bir koleksiyonun üzerinde yineleme yapabilmeyi sağlayan bir arayüzdür.
Iterable arayüzü, bir koleksiyonun elemanlarını döngü ile gezebilmek için kullanılır.
Iterable arayüzü, Java'nın koleksiyon framework'ünün temel bir parçasıdır ve genellikle for-each döngüsü ile kullanılır.

 */
public class Main {
    public static void main(String[] args) {
String[] kanallar={"Kanal1","Kanal2","Kanal3","Kanal4","Kanal5"};
        Radyo radyo=new Radyo(kanallar);
        for (String s: radyo) {
            System.out.println(s);
        }
    }
}
