package obsluga;

import prezentacja.AplikacjaKlient;
import prezentacja.AplikacjaPracownik;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String [] args){

        AplikacjaPracownik pracownik = new AplikacjaPracownik();
        AplikacjaKlient klient = new AplikacjaKlient();

        List<Wydarzenie> wydarzenia = new ArrayList<>();
        List<Rezerwacja> rezerwacje = new ArrayList<>();

        pracownik.setWydarzenia(wydarzenia);
        klient.setWydarzenia(wydarzenia);
        klient.setRezerwacje(rezerwacje);

        pracownik.dodajWydarzenie(4, "taniec", "20.10.2021", "19:30", "Stacjonarne", 90,1, "-", "Wroclaw");
        pracownik.dodajWydarzenie(4, "taniec", "23.10.2021", "10:00", "Online", 120,2, "www.taniec.pl", "");
        pracownik.dodajWydarzenie(25, "koszykowka", "05.11.2021", "11:15", "Online", 60,3, "www.link.pl", "");
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

    }

}
