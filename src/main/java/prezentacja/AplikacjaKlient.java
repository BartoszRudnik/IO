package prezentacja;

import obsluga.DaneEpidemiologiczne;
import obsluga.Rezerwacja;
import obsluga.Wydarzenie;

import java.util.ArrayList;
import java.util.List;

public class AplikacjaKlient {
    
    private List<Wydarzenie> wydarzenia = new ArrayList<>();
    private List<Rezerwacja> rezerwacje = new ArrayList<>();
    private List<DaneEpidemiologiczne> daneEpidemiologiczne = new ArrayList<>();
    private List<WydarzenieEpidemia> wydarzenieZakazenia = new ArrayList<>();
    private List<WydarzenieEpidemia> wydarzenieStrefa = new ArrayList<>();
    
    public List<Wydarzenie> getWydarzenia(){
        return this.wydarzenia;
    }
    
    public void setWydarzenia(List<Wydarzenie> wydarzenia){
        this.wydarzenia = wydarzenia;
    }
    
    public List<Rezerwacja> getRezerwacje(){
        return this.rezerwacje;
    }
    
    public void setRezerwacje(List<Rezerwacja> rezerwacje){
        this.rezerwacje = rezerwacje;
    }
    
    public List<DaneEpidemiologiczne> getDaneEpidemiologiczne(){
        return this.daneEpidemiologiczne;
    }
    
    public void setDaneEpidemiologiczne(List<DaneEpidemiologiczne> dane){
        this.daneEpidemiologiczne = dane;
    }
    
    public AplikacjaKlient(List<Wydarzenie> wydarzenia, List<Rezerwacja> rezerwacje, List<DaneEpidemiologiczne> dane){
        
    }

    public AplikacjaKlient(){

    }
    
    public void rezerwujMiejsce(Wydarzenie wydarzenie, int idRezerwacji){

        Rezerwacja nowaRezerwacja = new Rezerwacja();

        nowaRezerwacja.setIdRezerwacji(idRezerwacji);
        nowaRezerwacja.setWydarzenie(wydarzenie);

        if(sprawdzCzyWolneMiejsce(nowaRezerwacja)) {

            rezerwacje.add(nowaRezerwacja);
            aktualizujLiczbeRezerwacji(nowaRezerwacja);

        }
        else
            System.out.println("Brak wolnych miejsc na to wydarzenie");

    }
    
    public List<Wydarzenie> zobaczWydarzenia(String nazwaWydarzenia, String typWydarzenia, String miejsceWydarzenia, String dataWydarzenia){

        WyszukiwaczWydarzen wyszukaj = new WyszukiwaczWydarzen(wydarzenia);
        List<Wydarzenie> szukaneWydarzenia = new ArrayList<>();

        int liczbaAtrybutow;

        liczbaAtrybutow = wyszukaj.liczAtrybutyWydarzenia(nazwaWydarzenia, typWydarzenia, miejsceWydarzenia, dataWydarzenia);

        try{

            if (liczbaAtrybutow > 4 || liczbaAtrybutow == 0)
                throw new Exception();

            if(liczbaAtrybutow == 4)
                szukaneWydarzenia = wyszukaj.czteryAtrybuty(nazwaWydarzenia, typWydarzenia, miejsceWydarzenia, dataWydarzenia);
            if(liczbaAtrybutow == 3)
                szukaneWydarzenia = wyszukaj.trzyAtrybuty(nazwaWydarzenia, typWydarzenia, miejsceWydarzenia, dataWydarzenia);
            if(liczbaAtrybutow == 2)
                szukaneWydarzenia = wyszukaj.dwaAtrybuty(nazwaWydarzenia, typWydarzenia, miejsceWydarzenia, dataWydarzenia);
            if(liczbaAtrybutow == 1)
                szukaneWydarzenia = wyszukaj.jedenAtrybut(nazwaWydarzenia, typWydarzenia, miejsceWydarzenia, dataWydarzenia);

        } catch (Exception e) {
            System.out.println("Podano zla liczbe atrybutów");
        }

        return szukaneWydarzenia;

    }

    public List<WydarzenieEpidemia> filtrujWydarzeniaRosnaco(String typFiltrowania){

        SortowanieWydarzen sortowanie = new SortowanieWydarzen();
        sortowanie.setDaneEpidemiologiczne(daneEpidemiologiczne);
        sortowanie.setWydarzenia(wydarzenia);

        if (typFiltrowania.equalsIgnoreCase("Zakazenia")){

            wydarzenieZakazenia = sortowanie.stworzZakazeniaWydarzenie();
            sortowanie.sortujZakazeniaWydarzenieRosnaco(wydarzenieZakazenia);
            return wydarzenieZakazenia;

        }
        else if(typFiltrowania.equalsIgnoreCase("Strefa")){

            wydarzenieStrefa = sortowanie.stworzStrefyWydarzenie();
            sortowanie.sortujStrefyWydarzenieRosnaco(wydarzenieStrefa);
            return wydarzenieStrefa;

        }
        else
            return null;

    }

    public List<WydarzenieEpidemia> filtrujWydarzeniaMalejaco(String typFiltrowania){

        SortowanieWydarzen sortowanie = new SortowanieWydarzen();
        sortowanie.setDaneEpidemiologiczne(daneEpidemiologiczne);
        sortowanie.setWydarzenia(wydarzenia);

        if (typFiltrowania.equalsIgnoreCase("Zakazenia")){

            wydarzenieZakazenia = sortowanie.stworzZakazeniaWydarzenie();
            sortowanie.sortujZakazeniaWydarzenieMalejaco(wydarzenieZakazenia);
            return wydarzenieZakazenia;

        }
        else if(typFiltrowania.equalsIgnoreCase("Strefa")){

            wydarzenieStrefa = sortowanie.stworzStrefyWydarzenie();
            sortowanie.sortujStrefyWydarzenieMalejaco(wydarzenieStrefa);
            return wydarzenieStrefa;

        }
        else
            return null;

    }
    
    private boolean sprawdzCzyWolneMiejsce(Rezerwacja rezerwacja){

        if(rezerwacja.getWydarzenie().getTypWydarzenia().equalsIgnoreCase("Online"))
            return true;

        int aktualnaLiczbaRezerwacji = rezerwacja.getWydarzenie().getLiczbaRezerwacji();
        int maksymalnaLiczbaRezerwacji = rezerwacja.getWydarzenie().getLiczbaMiejsc();

        return maksymalnaLiczbaRezerwacji - aktualnaLiczbaRezerwacji > 0;

    }

    public int sprawdzIloscWolnychMiejsc(Wydarzenie wydarzenie){

        if(wydarzenie.getTypWydarzenia().equalsIgnoreCase("Online"))
            return -1;
        else
            return wydarzenie.getLiczbaMiejsc() - wydarzenie.getLiczbaRezerwacji();

    }

    private void aktualizujLiczbeRezerwacji(Rezerwacja rezerwacja){

        Wydarzenie aktualizowaneWydarzenie = rezerwacja.getWydarzenie();

        for(Wydarzenie wydarzenie : wydarzenia){

            if(aktualizowaneWydarzenie.equals(wydarzenie)) {

                int nowaLiczbaRezerwacji = wydarzenie.getLiczbaRezerwacji();
                nowaLiczbaRezerwacji++;
                wydarzenie.setLiczbaRezerwacji(nowaLiczbaRezerwacji);

            }

        }

    }
    
}
