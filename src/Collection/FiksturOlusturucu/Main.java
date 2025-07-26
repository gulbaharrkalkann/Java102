
package Collection.FiksturOlusturucu;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<String> teams = Arrays.asList(
            "Galatasaray", "Bursaspor", "Fenerbahçe",
            "Beşiktaş", "Başakşehir", "Trabzonspor","Barcelona"
        );

        FixtureGenerator generator = new FixtureGenerator(teams);
        List<List<String[]>> fixtures = generator.generateFixtures();

        for (int i = 0; i < fixtures.size(); i++) {
            System.out.println("Round " + (i + 1));
            for (String[] match : fixtures.get(i)) {
                if (match[0].equals("Bay") || match[1].equals("Bay")) {
                    System.out.println(match[0] + " vs " + match[1] + " (Bay)");
                } else {
                    System.out.println(match[0] + " vs " + match[1]);
                }
            }
            System.out.println();
        }
    }
}

