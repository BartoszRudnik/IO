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
    
    public ArrayList<Wydarzenie> zobaczWydarzenia(String nazwaWydarzenia, String typWydarzenia, String miejsceWydarzenia, String dataWydarzenia){

        ArrayList<Wydarzenie> szukaneWydarzenia = new ArrayList<>();

        int liczbaAtrybutow = 0;

        liczbaAtrybutow = liczAtrybutyWydarzenia(nazwaWydarzenia, typWydarzenia, miejsceWydarzenia, dataWydarzenia);

        if(liczbaAtrybutow == 4)
            czteryAtrybuty(nazwaWydarzenia, typWydarzenia, miejsceWydarzenia, dataWydarzenia, szukaneWydarzenia);
        if(liczbaAtrybutow == 3)
            trzyAtrybuty(nazwaWydarzenia, typWydarzenia, miejsceWydarzenia, dataWydarzenia, szukaneWydarzenia);
        if(liczbaAtrybutow == 2)
            dwaAtrybuty(nazwaWydarzenia, typWydarzenia, miejsceWydarzenia, dataWydarzenia, szukaneWydarzenia);
        if(liczbaAtrybutow == 1)
            jedenAtrybut(nazwaWydarzenia, typWydarzenia, miejsceWydarzenia, dataWydarzenia, szukaneWydarzenia);
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

        int aktualnaLiczbaRezerwacji = rezerwacja.getLiczbaRezerwacji();
        int maksymalnaLiczbaRezerwacji = rezerwacja.getWydarzenie().getLiczbaMiejsc();

        if(maksymalnaLiczbaRezerwacji - aktualnaLiczbaRezerwacji > 0)
            return true;
        else
            return false;

    }
    
    private boolean wyszukajWydarzenieNazwaWydarzenia(Wydarzenie wydarzenie, String nazwaWydarzenia){

        if(wydarzenie.getNazwa().equalsIgnoreCase(nazwaWydarzenia))
            return true;
        else
            return false;

    }

    private boolean wyszukajWydarzenieTypWydarzenia(Wydarzenie wydarzenie, String typWydarzenia){

        if(wydarzenie.getTypWydarzenia().equalsIgnoreCase(typWydarzenia))
            return true;
        else
            return false;

    }

    private boolean wyszukajWydarzenieMiejsceWydarzenia(Wydarzenie wydarzenie, String miejsceWydarzenia){

        if(wydarzenie.getTypWydarzenia().equalsIgnoreCase("Online"))
            return false;

        if(wydarzenie.getMiejsce().equalsIgnoreCase(miejsceWydarzenia))
            return true;
        else
            return false;

    }

    private boolean wyszukajWydarzenieDataWydarzenia(Wydarzenie wydarzenie, String dataWydarzenia){

        if(wydarzenie.getData().equalsIgnoreCase(dataWydarzenia))
            return true;
        else
            return false;

    }

    private int liczAtrybutyWydarzenia(String nazwaWydarzenia, String typWydarzenia, String miejsceWydarzenia, String dataWydarzenia) {

        int licz = 0;

        if(!nazwaWydarzenia.isEmpty()){
            licz++;
        }
        if(!typWydarzenia.isEmpty()){
            licz++;
        }
        if(!miejsceWydarzenia.isEmpty()){
            licz++;
        }
        if(!dataWydarzenia.isEmpty()){
            licz++;
        }

        return  licz;

    }

    private void czteryAtrybuty(String nazwaWydarzenia, String typWydarzenia, String miejsceWydarzenia, String dataWydarzenia, ArrayList<Wydarzenie> szukaneWydarzenia){

        for(Wydarzenie wyd : wydarzenia) {

            if (wyszukajWydarzenieNazwaWydarzenia(wyd, nazwaWydarzenia) && wyszukajWydarzenieDataWydarzenia(wyd, dataWydarzenia) && wyszukajWydarzenieMiejsceWydarzenia(wyd, miejsceWydarzenia) && wyszukajWydarzenieTypWydarzenia(wyd, typWydarzenia))
                szukaneWydarzenia.add(wyd);

        }

    }

    private void trzyAtrybuty(String nazwaWydarzenia, String typWydarzenia, String miejsceWydarzenia, String dataWydarzenia, ArrayList<Wydarzenie> szukaneWydarzenia){

        for(Wydarzenie wyd : wydarzenia){

            if(!nazwaWydarzenia.isEmpty() && !typWydarzenia.isEmpty() && !miejsceWydarzenia.isEmpty()){

                if(wyszukajWydarzenieNazwaWydarzenia(wyd, nazwaWydarzenia) && wyszukajWydarzenieTypWydarzenia(wyd, typWydarzenia) && wyszukajWydarzenieMiejsceWydarzenia(wyd, miejsceWydarzenia))
                    szukaneWydarzenia.add(wyd);

            }
            else if(!nazwaWydarzenia.isEmpty() && !typWydarzenia.isEmpty() && !dataWydarzenia.isEmpty()){

                if(wyszukajWydarzenieNazwaWydarzenia(wyd, nazwaWydarzenia) && wyszukajWydarzenieTypWydarzenia(wyd, typWydarzenia) && wyszukajWydarzenieDataWydarzenia(wyd, dataWydarzenia))
                    szukaneWydarzenia.add(wyd);

            }
            else if(!nazwaWydarzenia.isEmpty() && !miejsceWydarzenia.isEmpty() && !dataWydarzenia.isEmpty()){

                if(wyszukajWydarzenieDataWydarzenia(wyd, dataWydarzenia) && wyszukajWydarzenieNazwaWydarzenia(wyd, nazwaWydarzenia) && wyszukajWydarzenieMiejsceWydarzenia(wyd, miejsceWydarzenia))
                    szukaneWydarzenia.add(wyd);

            }
            else if(!typWydarzenia.isEmpty() && !miejsceWydarzenia.isEmpty() && !dataWydarzenia.isEmpty()){

                if(wyszukajWydarzenieTypWydarzenia(wyd, typWydarzenia) && wyszukajWydarzenieMiejsceWydarzenia(wyd, miejsceWydarzenia) && wyszukajWydarzenieDataWydarzenia(wyd, dataWydarzenia))
                    szukaneWydarzenia.add(wyd);

            }

        }

    }

    private void dwaAtrybuty(String nazwaWydarzenia, String typWydarzenia, String miejsceWydarzenia, String dataWydarzenia, ArrayList<Wydarzenie> szukaneWydarzenia){

        for(Wydarzenie wyd : wydarzenia){

            if(!nazwaWydarzenia.isEmpty() && !typWydarzenia.isEmpty()){

                if(wyszukajWydarzenieNazwaWydarzenia(wyd, nazwaWydarzenia) && wyszukajWydarzenieTypWydarzenia(wyd, typWydarzenia))
                    szukaneWydarzenia.add(wyd);

            }
            else if(!nazwaWydarzenia.isEmpty() && !miejsceWydarzenia.isEmpty()){

                if(wyszukajWydarzenieNazwaWydarzenia(wyd, nazwaWydarzenia) && wyszukajWydarzenieMiejsceWydarzenia(wyd, miejsceWydarzenia))
                    szukaneWydarzenia.add(wyd);

            }
            else if(!nazwaWydarzenia.isEmpty() && !dataWydarzenia.isEmpty()){

                if(wyszukajWydarzenieNazwaWydarzenia(wyd, nazwaWydarzenia) && wyszukajWydarzenieDataWydarzenia(wyd, dataWydarzenia))
                    szukaneWydarzenia.add(wyd);

            }
            else if(!typWydarzenia.isEmpty() && !miejsceWydarzenia.isEmpty()){

                if(wyszukajWydarzenieTypWydarzenia(wyd, typWydarzenia) && wyszukajWydarzenieMiejsceWydarzenia(wyd, miejsceWydarzenia))
                    szukaneWydarzenia.add(wyd);

            }
            else if(!typWydarzenia.isEmpty() && !dataWydarzenia.isEmpty()){

                if(wyszukajWydarzenieTypWydarzenia(wyd, typWydarzenia) && wyszukajWydarzenieDataWydarzenia(wyd, dataWydarzenia))
                    szukaneWydarzenia.add(wyd);

            }
            else if(!miejsceWydarzenia.isEmpty() && !dataWydarzenia.isEmpty()){

                if(wyszukajWydarzenieMiejsceWydarzenia(wyd, miejsceWydarzenia) && wyszukajWydarzenieDataWydarzenia(wyd, dataWydarzenia))
                    szukaneWydarzenia.add(wyd);

            }

        }

    }

    private void jedenAtrybut(String nazwaWydarzenia, String typWydarzenia, String miejsceWydarzenia, String dataWydarzenia, ArrayList<Wydarzenie> szukaneWydarzenia){

        for(Wydarzenie wyd : wydarzenia){

            if(!nazwaWydarzenia.isEmpty()){

                if(wyszukajWydarzenieNazwaWydarzenia(wyd, nazwaWydarzenia))
                    szukaneWydarzenia.add(wyd);

            }
            else if(!typWydarzenia.isEmpty()){

                if(wyszukajWydarzenieTypWydarzenia(wyd, typWydarzenia))
                    szukaneWydarzenia.add(wyd);

            }
            else if(!miejsceWydarzenia.isEmpty()){

                if(wyszukajWydarzenieMiejsceWydarzenia(wyd, miejsceWydarzenia))
                    szukaneWydarzenia.add(wyd);

            }
            else if(!dataWydarzenia.isEmpty()){

                if(wyszukajWydarzenieDataWydarzenia(wyd, dataWydarzenia))
                    szukaneWydarzenia.add(wyd);

            }

        }

    }
    
}
