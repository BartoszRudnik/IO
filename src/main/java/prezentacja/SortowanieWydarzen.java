package prezentacja;

import obsluga.DaneEpidemiologiczne;
import obsluga.Wydarzenie;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortowanieWydarzen {

    private List<Wydarzenie> wydarzenia = new ArrayList<>();
    private List<DaneEpidemiologiczne> daneEpidemiologiczne = new ArrayList<>();

    public List<Wydarzenie> getWydarzenia() {
        return wydarzenia;
    }

    public void setWydarzenia(List<Wydarzenie> wydarzenia) {
        this.wydarzenia = wydarzenia;
    }

    public List<DaneEpidemiologiczne> getDaneEpidemiologiczne() {
        return daneEpidemiologiczne;
    }

    public void setDaneEpidemiologiczne(List<DaneEpidemiologiczne> daneEpidemiologiczne) {
        this.daneEpidemiologiczne = daneEpidemiologiczne;
    }

    public List<WydarzenieZakazenia> stworzZakazeniaWydarzenie(){

        List<WydarzenieZakazenia> wydarzeniaZakazenia = new ArrayList<>();

        for(Wydarzenie wydarzenie : wydarzenia){

            if(wydarzenie.getTypWydarzenia().equalsIgnoreCase("Online"))
                continue;

            for(DaneEpidemiologiczne dane : daneEpidemiologiczne){

                if (wydarzenie.getMiejsce().equalsIgnoreCase(dane.getMiejsce())) {

                    WydarzenieZakazenia test = new WydarzenieZakazenia();
                    test.setLiczbaZakazen(dane.getLiczbaZakazen());
                    test.setWydarzenie(wydarzenie);
                    wydarzeniaZakazenia.add(test);
                    break;

                }

            }

        }

        return wydarzeniaZakazenia;

    }

    public void sortujZakazeniaWydarzenie(List<WydarzenieZakazenia> wydarzeniaZakazenia){

        Collections.sort(wydarzeniaZakazenia);

    }

}
