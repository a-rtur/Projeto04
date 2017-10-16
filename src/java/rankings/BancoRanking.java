package rankings;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BancoRanking {
    private static ArrayList<Ranking> ranking;

    public static ArrayList<Ranking> getRankingGeral() {
        if (ranking == null) {
            ranking = new ArrayList<>();
            return ranking;
        }
        else {
            Collections.sort(ranking, new Comparador());
            return ranking;
        }
    }
}
