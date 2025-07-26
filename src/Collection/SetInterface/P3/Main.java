package Collection.SetInterface.P3;
//Bu projede kullanıcıdan alınan kelime çiftlerinin benzersiz sayısını hesaplayacağız.
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t= scanner.nextInt();
        String[] pairLeft=new String[t];
        String[] pairRight=new String[t];

        for (int i = 0; i < t; i++) {
            pairLeft[i] = scanner.next();
            pairRight[i] = scanner.next();
        }
        Set<String> uniquePairs = new HashSet<>();
        for (int i = 0; i < t; i++) {
            String pair = pairLeft[i] + " " + pairRight[i];
            uniquePairs.add(pair);
            System.out.println(uniquePairs.size());
        }
    }
}
