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

    public List<WydarzenieEpidemia> stworzZakazeniaWydarzenie(){

        List<WydarzenieEpidemia> wydarzeniaZakazenia = new ArrayList<>();

        for(Wydarzenie wydarzenie : wydarzenia){

            if(wydarzenie.getTypWydarzenia().equalsIgnoreCase("Online"))
                continue;

            for(DaneEpidemiologiczne dane : daneEpidemiologiczne){

                if (wydarzenie.getMiejsce().equalsIgnoreCase(dane.getMiejsce())) {

                    WydarzenieZakazenia noweWydarzenie = new WydarzenieZakazenia();
                    noweWydarzenie.setLiczbaZakazen(dane.getLiczbaZakazen());
                    noweWydarzenie.setWydarzenie(wydarzenie);
                    wydarzeniaZakazenia.add(noweWydarzenie);
                    break;

                }

            }

        }

        return wydarzeniaZakazenia;

    }

    public void sortujZakazeniaWydarzenieRosnaco(List<WydarzenieEpidemia> wydarzeniaZakazenia){

        Collections.sort(wydarzeniaZakazenia);

    }

    public void sortujZakazeniaWydarzenieMalejaco(List<WydarzenieEpidemia> wydarzeniaZakazenia){

        Collections.sort(wydarzeniaZakazenia, Collections.reverseOrder());

    }

    public List<WydarzenieEpidemia> stworzStrefyWydarzenie(){

        List<WydarzenieEpidemia> wydarzeniaStrefy = new ArrayList<>();

        for(Wydarzenie wydarzenie : wydarzenia){

            if(wydarzenie.getTypWydarzenia().equalsIgnoreCase("Online"))
                continue;

            for(DaneEpidemiologiczne dane : daneEpidemiologiczne){

                if (wydarzenie.getMiejsce().equalsIgnoreCase(dane.getMiejsce())) {

                    WydarzenieStrefa noweWydarzenie = new WydarzenieStrefa();
                    noweWydarzenie.setWydarzenie(wydarzenie);
                    noweWydarzenie.setIdStrefy(dane.getIdStrefy());
                    noweWydarzenie.setStrefa(dane.getStrefa());
                    wydarzeniaStrefy.add(noweWydarzenie);
                    break;

                }

            }

        }

        return wydarzeniaStrefy;

    }

    public void sortujStrefyWydarzenieRosnaco(List<WydarzenieEpidemia> wydarzeniaStrefy){

        Collections.sort(wydarzeniaStrefy);

    }

    public void sortujStrefyWydarzenieMalejaco(List<WydarzenieEpidemia> wydarzeniaStrefy){

        Collections.sort(wydarzeniaStrefy, Collections.reverseOrder());

    }


}
