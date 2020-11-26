package prezentacja;

import obsluga.Wydarzenie;

public abstract class WydarzenieEpidemia implements Comparable<WydarzenieEpidemia>{

    protected Wydarzenie wydarzenie;

    public Wydarzenie getWydarzenie() {
        return wydarzenie;
    }

    public void setWydarzenie(Wydarzenie wydarzenie) {
        this.wydarzenie = wydarzenie;
    }

    public int getLiczbaZakazen() {
        return 0;
    }

    public int getIdStrefy() {
        return 0;
    }

}
