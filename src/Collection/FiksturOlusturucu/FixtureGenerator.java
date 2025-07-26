package Collection.FiksturOlusturucu;

import java.util.*;

public class FixtureGenerator {
    private List<String> teams;

    public FixtureGenerator(List<String> teams) {
        this.teams = new ArrayList<>(teams);
        if (this.teams.size() % 2 != 0) {
            this.teams.add("Bay");
        }
    }

    public List<List<String[]>> generateFixtures() {
        List<String> list = new ArrayList<>(teams);
        Collections.shuffle(list); // Rastgele karıştır
        int n = list.size();
        int rounds = n - 1;
        List<List<String[]>> fixtures = new ArrayList<>();

        for (int round = 0; round < rounds; round++) {
            List<String[]> matches = new ArrayList<>();
            for (int i = 0; i < n / 2; i++) {
                String home = list.get(i);
                String away = list.get(n - 1 - i);
                matches.add(new String[]{home, away});
            }
            fixtures.add(matches);

            // Takımları döndür (sabit ilk eleman hariç)
            List<String> newList = new ArrayList<>();
            newList.add(list.get(0));
            newList.add(list.get(n - 1));
            for (int i = 1; i < n - 1; i++) {
                newList.add(list.get(i));
            }
            list = newList;
        }

        // İkinci devre: ev-deplasman yer değiştirir
        int totalRounds = rounds * 2;
        for (int round = 0; round < rounds; round++) {
            List<String[]> matches = new ArrayList<>();
            for (String[] match : fixtures.get(round)) {
                matches.add(new String[]{match[1], match[0]});
            }
            fixtures.add(matches);
        }

        return fixtures;
    }
}

