package Odev;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        //Alfabetik sıraya göre sıralama
        Set<Book> books = new TreeSet<>() ;
        books.add(new Book("Sefiller","Hugo",1990,600));
        books.add(new Book("Masumiyet Müzesi","Orhan Pamuk",1987,435));
        books.add(new Book("Buz ve kış","asdfg",1676,546));
        books.add(new Book("Düşes","Amanda",1785,358));
        books.add(new Book("İstanbul hatırası","Ahmet Ümit",2005,368));

        for (Book book : books) {
            System.out.println(book);
        }
        System.out.println("******************");
        //Sayfa sayısına göre sıralama
        Set<Book> books1 = new TreeSet<>(new Comparator<Book>() {
            @Override
            public int compare(Book o1, Book o2) {
                return Integer.compare(o1.getPages(), o2.getPages());

            }
        });
        books1.add(new Book("Sefiller","Hugo",1990,600));
        books1.add(new Book("Masumiyet Müzesi","Orhan Pamuk",1987,435));
        books1.add(new Book("Buz ve kış","asdfg",1676,546));
        books1.add(new Book("Düşes","Amanda",1785,358));
        books1.add(new Book("İstanbul hatırası","Ahmet Ümit",2005,368));

for (Book book : books1) {
    System.out.println(book);
}
    }
}
