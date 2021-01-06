package prezentacja;

import obsluga.Wydarzenie;

import java.util.ArrayList;
import java.util.List;

public class WyszukiwaczWydarzen {

    private List<Wydarzenie> wydarzenia;

    public List<Wydarzenie> getWydarzenia() {
        return wydarzenia;
    }

    public void setWydarzenia(List<Wydarzenie> wydarzenia) {
        this.wydarzenia = wydarzenia;
    }

    public WyszukiwaczWydarzen(List<Wydarzenie> wydarzenia){
        this.wydarzenia = wydarzenia;
    }

    private boolean wyszukajWydarzenieNazwaWydarzenia(Wydarzenie wydarzenie, String nazwaWydarzenia){

        return wydarzenie.getNazwa().equalsIgnoreCase(nazwaWydarzenia);

    }

    private boolean wyszukajWydarzenieTypWydarzenia(Wydarzenie wydarzenie, String typWydarzenia){

        return wydarzenie.getTypWydarzenia().equalsIgnoreCase(typWydarzenia);

    }

    public boolean wyszukajWydarzenieMiejsceWydarzenia(Wydarzenie wydarzenie, String miejsceWydarzenia){

        if(wydarzenie.getTypWydarzenia().equalsIgnoreCase("Online"))
            return false;

        return wydarzenie.getMiejsce().equalsIgnoreCase(miejsceWydarzenia);

    }

    public boolean wyszukajWydarzenieDataWydarzenia(Wydarzenie wydarzenie, String dataWydarzenia){

        return wydarzenie.getData().equalsIgnoreCase(dataWydarzenia);

    }

    public boolean wyszukajWydarzenie(Wydarzenie wydarzenie){

        for(Wydarzenie wyd : wydarzenia){

            if(wydarzenie.equals(wyd))
                return true;

        }

        return false;

    }

    public int liczAtrybutyWydarzenia(String nazwaWydarzenia, String typWydarzenia, String miejsceWydarzenia, String dataWydarzenia) {

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

    public List<Wydarzenie> czteryAtrybuty(String nazwaWydarzenia, String typWydarzenia, String miejsceWydarzenia, String dataWydarzenia){

        List<Wydarzenie> szukaneWydarzenia = new ArrayList<>();

        for(Wydarzenie wyd : wydarzenia) {

            if (wyszukajWydarzenieNazwaWydarzenia(wyd, nazwaWydarzenia) && wyszukajWydarzenieDataWydarzenia(wyd, dataWydarzenia) && wyszukajWydarzenieMiejsceWydarzenia(wyd, miejsceWydarzenia) && wyszukajWydarzenieTypWydarzenia(wyd, typWydarzenia))
                szukaneWydarzenia.add(wyd);

        }

        return szukaneWydarzenia;

    }

    public List<Wydarzenie> trzyAtrybuty(String nazwaWydarzenia, String typWydarzenia, String miejsceWydarzenia, String dataWydarzenia){

        List<Wydarzenie> szukaneWydarzenia = new ArrayList<>();

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

        return  szukaneWydarzenia;

    }

    public List<Wydarzenie> dwaAtrybuty(String nazwaWydarzenia, String typWydarzenia, String miejsceWydarzenia, String dataWydarzenia){

        List<Wydarzenie> szukaneWydarzenia = new ArrayList<>();

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

        return szukaneWydarzenia;

    }

    public List<Wydarzenie> jedenAtrybut(String nazwaWydarzenia, String typWydarzenia, String miejsceWydarzenia, String dataWydarzenia){

        List<Wydarzenie> szukaneWydarzenia = new ArrayList<>();

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

        return  szukaneWydarzenia;

    }

}
