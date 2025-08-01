package Collection.Queue.MiniProje;

public class Hasta implements Comparable<Hasta> {
    private String isim;
    private String sikayet;
    private int oncelik;

    public Hasta(String isim, String sikayet) {
        this.isim = isim;
        this.sikayet = sikayet;
        if (sikayet.equals("Apandisit")) {
            this.oncelik = 3;
        } else if (sikayet.equals("Yanık")) {
            this.oncelik = 2;
        } else {
            this.oncelik = 1;
        }
    }

    @Override
    public String toString() {
        return
                " Hasta isim = '" + isim + '\'' +
                ", sikayet = '" + sikayet + '\'' +
                ", oncelik = " + oncelik +
                '}';
    }
    @Override
    public int compareTo(Hasta hasta) {
        if (this.oncelik > hasta.oncelik) {
            return  -1;
        }else if (this.oncelik < hasta.oncelik) {
            return 1;
        }else {
            return 0;
        }
    }
}
