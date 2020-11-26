package prezentacja;

import obsluga.Wydarzenie;

import java.util.Objects;

public class WydarzenieZakazenia extends WydarzenieEpidemia{

    private int liczbaZakazen;

    @Override
    public int getLiczbaZakazen() {
        return liczbaZakazen;
    }

    public void setLiczbaZakazen(int liczbaZakazen) {
        this.liczbaZakazen = liczbaZakazen;
    }

    @Override
    public String toString() {
        return "WydarzenieZakazenia{" +
                "wydarzenie=" + wydarzenie +
                ", liczbaZakazen=" + liczbaZakazen +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof WydarzenieZakazenia)) return false;
        WydarzenieZakazenia test = (WydarzenieZakazenia) o;
        return getLiczbaZakazen() == test.getLiczbaZakazen();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getLiczbaZakazen());
    }

    @Override
    public int compareTo(WydarzenieEpidemia o) {
        if(this.getLiczbaZakazen() - o.getLiczbaZakazen() == 0)
            return this.getWydarzenie().getId() - o.getWydarzenie().getId();
        else
            return this.getLiczbaZakazen() - o.getLiczbaZakazen();
    }

}
