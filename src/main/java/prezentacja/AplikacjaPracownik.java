package prezentacja;

import java.util.ArrayList;
import java.util.List;

import obsluga.Wydarzenie;
import obsluga.DaneEpidemiologiczne;

public class AplikacjaPracownik {
    
    private List<Wydarzenie> wydarzenia = new ArrayList<>(); 
    private List<DaneEpidemiologiczne> daneEpidemiologiczne = new ArrayList<>();
    
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
    
    public AplikacjaPracownik(List<Wydarzenie> wydarzenia, List<DaneEpidemiologiczne> dane){
        
    }
    
    public void archiwizujWydarzenie(Wydarzenie wydarzenie){
        
    }
    
    public void dodajWydarzenie(Wydarzenie wydarzenie){
        
    }
    
    public void ograniczLiczbeUczestnikow(Wydarzenie wydarzenie){
        
    }
    
    public boolean wyszukajWydarzenie(String dane[]){
        return false;
    }
    
    
}
