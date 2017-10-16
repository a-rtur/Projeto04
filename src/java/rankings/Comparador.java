package rankings;

import java.util.Comparator;

class Comparador implements Comparator<Ranking> {
    public int compare(Ranking o1, Ranking o2) {
        if (o1.getResultado() < o2.getResultado()) {
            return -1;
        } 
        else if (o1.getResultado() > o2.getResultado()) {
            return +1;
        } 
        else {
            return 0;
        }
    }
}
