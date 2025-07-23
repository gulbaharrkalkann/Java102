package Collection.MapInterface.TreeMap;
//TreeMap kullanarak bir stringin içinde aynı harften kaç tane olduğunu bulan program

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Cumleyi Giriniz");
        String cumle = scanner.nextLine();

        Map<Character, Integer> frekans = new TreeMap<Character,Integer>();
        for (int i=0;i<cumle.length();i++) {
            char karakter = cumle.charAt(i);
            if (frekans.containsKey(karakter)) {
                frekans.replace(karakter, frekans.get(karakter)+1);
            }else
            {
                frekans.put(karakter, 1);
            }
        }
        for (Map.Entry<Character, Integer> entry : frekans.entrySet()) {
            System.out.println("Karakter: " + entry.getKey() + "  Frekans: " + entry.getValue()+ " adet geçiyor");
        }

    }
}
