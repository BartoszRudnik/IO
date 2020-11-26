package obsluga;

import prezentacja.AplikacjaKlient;
import prezentacja.AplikacjaPracownik;
import prezentacja.epidemiaWydarzenie;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String [] args){

        AplikacjaPracownik pracownik = new AplikacjaPracownik();
        AplikacjaKlient klient = new AplikacjaKlient();
        epidemiaWydarzenie test = new epidemiaWydarzenie();

        List<DaneEpidemiologiczne> daneEpidemiologiczne = new ArrayList<>();
        List<Wydarzenie> wydarzenia = new ArrayList<>();
        List<Rezerwacja> rezerwacje = new ArrayList<>();

        pracownik.setWydarzenia(wydarzenia);
        klient.setWydarzenia(wydarzenia);
        klient.setRezerwacje(rezerwacje);
        test.setWydarzenia(wydarzenia);
        test.setDaneEpidemiologicznes(daneEpidemiologiczne);

        pracownik.dodajWydarzenie(4, "taniec", "20.10.2021", "19:30", "Stacjonarne", 90,1, "-", "Wroclaw");
        pracownik.dodajWydarzenie(4, "taniec", "23.10.2021", "10:00", "Online", 120,2, "www.taniec.pl", "");
        pracownik.dodajWydarzenie(25, "koszykowka", "05.11.2021", "11:15", "Stacjonarne", 60,3, "www.link.pl", "Szczecin");
        pracownik.dodajWydarzenie(31, "siatkowka", "30.12.2021", "16:35", "Stacjonarne", 45,4, "-", "Warszawa");

        for(Wydarzenie wyd : wydarzenia){
            System.out.println(wyd);
        }

        System.out.println();
        System.out.println(klient.zobaczWydarzenia("taniec","", "", "").toString());

        klient.rezerwujMiejsce(wydarzenia.get(0), 1);

        System.out.println();
        System.out.println(klient.zobaczWydarzenia("taniec","", "", "").toString());

        System.out.println(klient.sprawdzIloscWolnychMiejsc(wydarzenia.get(0)));

        System.out.println();

        DaneEpidemiologiczne dane = new DaneEpidemiologiczne();
        dane.setLiczbaZakazen(55);
        dane.setMiejsce("Wroclaw");
        dane.setStrefa("Zielona");

        DaneEpidemiologiczne noweDane = new DaneEpidemiologiczne();
        noweDane.setLiczbaZakazen(25);
        noweDane.setMiejsce("Warszawa");
        noweDane.setStrefa("Zielona");

        DaneEpidemiologiczne najnowszeDane= new DaneEpidemiologiczne();
        najnowszeDane.setLiczbaZakazen(10);
        najnowszeDane.setMiejsce("Szczecin");
        najnowszeDane.setStrefa("Zolta");

        daneEpidemiologiczne.add(noweDane);
        daneEpidemiologiczne.add(dane);
        daneEpidemiologiczne.add(najnowszeDane);

        test.stworzLiczbaZakazen();
        test.sortujLiczbaZakazenMalejaco();

    }

}
