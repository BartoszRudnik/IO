package prezentacja;

import java.util.ArrayList;
import java.util.List;
import obsluga.Wydarzenie;
import obsluga.Rezerwacja;
import obsluga.DaneEpidemiologiczne;

public class AplikacjaKlient {
    
    private ArrayList<Wydarzenie> wydarzenia = new ArrayList<>();
    private ArrayList<Rezerwacja> rezerwacje = new ArrayList<>();
    private ArrayList<DaneEpidemiologiczne> daneEpidemiologiczne = new ArrayList<>();
    
    public List<Wydarzenie> getWydarzenia(){
        return this.wydarzenia;
    }
    
    public void setWydarzenia(ArrayList<Wydarzenie> wydarzenia){
        this.wydarzenia = wydarzenia;
    }
    
    public List<Rezerwacja> getRezerwacje(){
        return this.rezerwacje;
    }
    
    public void setRezerwacje(ArrayList<Rezerwacja> rezerwacje){
        this.rezerwacje = rezerwacje;
    }
    
    public List<DaneEpidemiologiczne> getDaneEpidemiologiczne(){
        return this.daneEpidemiologiczne;
    }
    
    public void setDaneEpidemiologiczne(ArrayList<DaneEpidemiologiczne> dane){
        this.daneEpidemiologiczne = dane;
    }
    
    public AplikacjaKlient(List<Wydarzenie> wydarzenia, List<Rezerwacja> rezerwacje, List<DaneEpidemiologiczne> dane){
        
    }

    public AplikacjaKlient(){

    }
    
    public void rezerwujMiejsce(Wydarzenie wydarzenie, int idRezerwacji){

        Rezerwacja nowaRezerwacja = null;

        nowaRezerwacja.setIdRezerwacji(idRezerwacji);
        nowaRezerwacja.setWydarzenie(wydarzenie);

        if(sprawdzWolneMiejsca(nowaRezerwacja))
            rezerwacje.add(nowaRezerwacja);
        else
            System.out.println("Brak wolnych miejsc na to wydarzenie");

        aktualizujLiczbeRezerwacji(nowaRezerwacja);

    }
    
    public ArrayList<Wydarzenie> zobaczWydarzenia(String nazwaWydarzenia, String typWydarzenia, String miejsceWydarzenia, String dataWydarzenia){

        wyszukiwaczWydarzen wyszukaj = new wyszukiwaczWydarzen(wydarzenia);

        ArrayList<Wydarzenie> szukaneWydarzenia = new ArrayList<>();

        int liczbaAtrybutow = 0;

        liczbaAtrybutow = wyszukaj.liczAtrybutyWydarzenia(nazwaWydarzenia, typWydarzenia, miejsceWydarzenia, dataWydarzenia);

        if(liczbaAtrybutow == 4)
            wyszukaj.czteryAtrybuty(nazwaWydarzenia, typWydarzenia, miejsceWydarzenia, dataWydarzenia, szukaneWydarzenia);
        if(liczbaAtrybutow == 3)
            wyszukaj.trzyAtrybuty(nazwaWydarzenia, typWydarzenia, miejsceWydarzenia, dataWydarzenia, szukaneWydarzenia);
        if(liczbaAtrybutow == 2)
            wyszukaj.dwaAtrybuty(nazwaWydarzenia, typWydarzenia, miejsceWydarzenia, dataWydarzenia, szukaneWydarzenia);
        if(liczbaAtrybutow == 1)
            wyszukaj.jedenAtrybut(nazwaWydarzenia, typWydarzenia, miejsceWydarzenia, dataWydarzenia, szukaneWydarzenia);
        else
            System.out.println("Podano zle atrybuty");

        return szukaneWydarzenia;

    }

    public ArrayList<Wydarzenie> filtrujWydarzenia(String typFiltrowania){
        return null;
    }
    
    public boolean sprawdzWolneMiejsca(Rezerwacja rezerwacja){

        if(rezerwacja.getWydarzenie().getTypWydarzenia().equalsIgnoreCase("Online"))
            return true;

        int aktualnaLiczbaRezerwacji = rezerwacja.getWydarzenie().getLiczbaRezerwacji();
        int maksymalnaLiczbaRezerwacji = rezerwacja.getWydarzenie().getLiczbaMiejsc();

        if(maksymalnaLiczbaRezerwacji - aktualnaLiczbaRezerwacji > 0)
            return true;
        else
            return false;

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
