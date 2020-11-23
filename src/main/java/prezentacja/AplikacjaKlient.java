package prezentacja;

import java.util.ArrayList;
import java.util.List;
import obsluga.Wydarzenie;
import obsluga.Rezerwacja;
import obsluga.DaneEpidemiologiczne;

public class AplikacjaKlient {
    
    private List<Wydarzenie> wydarzenia = new ArrayList<>();
    private List<Rezerwacja> rezerwacje = new ArrayList<>();
    private List<DaneEpidemiologiczne> daneEpidemiologiczne = new ArrayList<>();
    
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
    
    public Rezerwacja rezerwujMiejsce(Wydarzenie wydarzenie){
        return null;
    }
    
    public ArrayList<Wydarzenie> zobaczWydarzenia(String[] dane){
        return null;
    }
    
    public ArrayList<Wydarzenie> filtrujWydarzenia(String typFiltrowania){
        return null;
    }
    
    public boolean sprawdzWolneMiejsca(Rezerwacja rezerwacja){
        return false;
    }
    
    public Wydarzenie wyszukajWydarzenie(String[] dane){
        return null;        
    }
    
}
