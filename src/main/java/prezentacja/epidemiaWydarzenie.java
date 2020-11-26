package prezentacja;

import obsluga.DaneEpidemiologiczne;
import obsluga.Wydarzenie;

import java.util.*;

public class epidemiaWydarzenie {

    private Map<Wydarzenie, Integer> liczbaZakazenWydarzenie = new TreeMap<>();
    private Map<Wydarzenie, String> strefaWydarzenie = new TreeMap<>();

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

    public void setDaneEpidemiologicznes(List<DaneEpidemiologiczne> daneEpidemiologiczne) {
        this.daneEpidemiologiczne = daneEpidemiologiczne;
    }

    public void stworzLiczbaZakazen(){

        for(Wydarzenie wydarzenie : wydarzenia){

            if(wydarzenie.getTypWydarzenia().equalsIgnoreCase("Online"))
                continue;

            for(DaneEpidemiologiczne dane : daneEpidemiologiczne){

                if (wydarzenie.getMiejsce().equalsIgnoreCase(dane.getMiejsce())) {

                    liczbaZakazenWydarzenie.put(wydarzenie, dane.getLiczbaZakazen());
                    break;

                }

            }

        }

    }

    public void sortujLiczbaZakazenMalejaco(){

        liczbaZakazenWydarzenie.entrySet().stream()
                .sorted((k1, k2) -> -k1.getValue().compareTo(k2.getValue()))
                .forEach(k -> System.out.println(k.getKey() + ": " + k.getValue()));

    }

    public void stworzStrefaZagrozenia(){

        for(Wydarzenie wydarzenie : wydarzenia){

            if(wydarzenie.getTypWydarzenia().equalsIgnoreCase("Online"))
                continue;

            for(DaneEpidemiologiczne dane : daneEpidemiologiczne){

                if (wydarzenie.getMiejsce().equalsIgnoreCase(dane.getMiejsce())) {

                    strefaWydarzenie.put(wydarzenie, dane.getStrefa());
                    break;
                }

            }

        }

    }

    public void sortujStrefaZagrozeniaMalejaco(){
        strefaWydarzenie.entrySet().stream()
                .sorted((k1, k2) -> -k1.getValue().compareTo(k2.getValue()))
                .forEach(k -> System.out.println(k.getKey() + ": " + k.getValue()));
    }

}
