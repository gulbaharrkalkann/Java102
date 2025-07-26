package Collection.ArrayList.P2;
import java.util.*;
//Bu projede ArrayList kullanarak, çok boyutlu bir liste oluşturacağız.
// Kullanıcıdan satır sayısını ve her satırdaki elemanları alacağız.
// Daha sonra kullanıcıdan gelen sorgulara göre, belirtilen satır ve sütundaki elemanları ekrana yazdıracağız.
// Eğer belirtilen satır veya sütun geçersizse "ERROR!" mesajı vereceğiz.

public class Main {
    public static <list> void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(); // Kaç satır veri var

        // Tüm satırları tutacak liste
        List<List<Integer>> data = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int d = scanner.nextInt(); // Bu satırdaki eleman sayısı
            List<Integer> line = new ArrayList<>();
            for (int j = 0; j < d; j++) {
                line.add(scanner.nextInt());
            }
            data.add(line);
        }

        int q = scanner.nextInt(); // Sorgu sayısı

        for (int i = 0; i < q; i++) {
            int x = scanner.nextInt(); // satır (1-indexed)
            int y = scanner.nextInt(); // sütun (1-indexed)

            // x ve y 0-index'e çevriliyor
            if (x <= data.size() && x > 0) {
                List<Integer> row = data.get(x - 1);
                if (y <= row.size() && y > 0) {
                    System.out.println(row.get(y - 1));
                } else {
                    System.out.println("ERROR!");
                }
            } else {
                System.out.println("ERROR!");
            }
        }

        scanner.close();
    }
}
