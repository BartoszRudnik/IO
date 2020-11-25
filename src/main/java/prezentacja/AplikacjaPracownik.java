package prezentacja;

import java.util.ArrayList;
import java.util.List;
import obsluga.Wydarzenie;
import obsluga.DaneEpidemiologiczne;
import obsluga.FabrykaWydarzen;
import obsluga.WydarzenieStacjonarne;

public class AplikacjaPracownik {
    
    private List<Wydarzenie> wydarzenia;
    private List<Wydarzenie> archiwumWydarzen = new ArrayList<>();
    private List<DaneEpidemiologiczne> daneEpidemiologiczne;
    private FabrykaWydarzen fabryka = new FabrykaWydarzen();
    
    public List<Wydarzenie> getWydarzenia(){
        return this.wydarzenia;
    }
    
    public void setWydarzenia(List<Wydarzenie> wydarzenia){
        this.wydarzenia = wydarzenia;
    }
    
    public List<DaneEpidemiologiczne> getDaneEpidemiologiczne(){
        return this.daneEpidemiologiczne;
    }
    
    public void setDaneEpidemiologiczne(List<DaneEpidemiologiczne> dane){
        this.daneEpidemiologiczne = dane;
    }

    public List<Wydarzenie> getArchiwumWydarzen(){
        return this.archiwumWydarzen;
    }

    public void setArchiwumWydarzen(List<Wydarzenie> archiwumWydarzen){
        this.archiwumWydarzen = archiwumWydarzen;
    }

    public AplikacjaPracownik(List<Wydarzenie> wydarzenia, List<DaneEpidemiologiczne> dane){
        
    }

    public AplikacjaPracownik(){

    }
    
    public void archiwizujWydarzenie(Wydarzenie wydarzenie){

        wyszukiwaczWydarzen wyszukiwacz = new wyszukiwaczWydarzen(wydarzenia);

        if(wyszukiwacz.wyszukajWydarzenie(wydarzenie)) {

            archiwumWydarzen.add(wydarzenie);
            wydarzenia.remove(wydarzenie);

        }

    }

    private void inicjalizujWydarzenie(Wydarzenie wydarzenie, int liczbaMiejsc, String nazwa, String data, String godzinaStart, String typWydarzenia, int czasTrwania, int id, String linkDoWydarzenia, String miejsce) {

        wydarzenie.setNazwa(nazwa);
        wydarzenie.setData(data);
        wydarzenie.setGodzinaStart(godzinaStart);
        wydarzenie.setCzasTrwania(czasTrwania);
        wydarzenie.setId(id);
        wydarzenie.setTypWydarzenia(typWydarzenia);

        if(typWydarzenia.equalsIgnoreCase("Stacjonarne")){
            wydarzenie.setLiczbaMiejsc(liczbaMiejsc);
            wydarzenie.setMiejsce(miejsce);
        }

        if(typWydarzenia.equalsIgnoreCase("Online")){
            wydarzenie.setLinkDoWydarzenia(linkDoWydarzenia);
        }

    }
    
    public void dodajWydarzenie(int liczbaMiejsc, String nazwa, String data, String godzinaStart, String typWydarzenia, int czasTrwania, int id, String linkDoWydarzenia, String miejsce){

        wyszukiwaczWydarzen wyszukiwacz = new wyszukiwaczWydarzen(wydarzenia);
        Wydarzenie wydarzenie = fabryka.noweWydarzenie(typWydarzenia);
        inicjalizujWydarzenie(wydarzenie, liczbaMiejsc, nazwa, data, godzinaStart, typWydarzenia, czasTrwania, id, linkDoWydarzenia, miejsce);

        if(wyszukiwacz.wyszukajWydarzenie(wydarzenie) == true){
            System.out.println("Wydarzenie o podanych atrybutach juz istnieje!");
        }
        else
            wydarzenia.add(wydarzenie);

    }
    
    public void ograniczLiczbeUczestnikow(int nowyLimit, Wydarzenie wydarzenie){

        if(wydarzenie.getTypWydarzenia().equalsIgnoreCase("Stacjonarne")){
            wydarzenie.setLiczbaMiejsc(nowyLimit);
        }
        else
            System.out.println("Liczbe miejsc mozna ograniczyc wylacznie dla wydarzen stacjonarnych!");

    }

    public void aktualizujDaneEpidemiologiczne(){

    }

}
