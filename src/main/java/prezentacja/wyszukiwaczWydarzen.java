package prezentacja;

import obsluga.Wydarzenie;

import java.util.ArrayList;
import java.util.List;

public class wyszukiwaczWydarzen {

    private List<Wydarzenie> wydarzenia;

    public List<Wydarzenie> getWydarzenia() {
        return wydarzenia;
    }

    public void setWydarzenia(List<Wydarzenie> wydarzenia) {
        this.wydarzenia = wydarzenia;
    }

    public wyszukiwaczWydarzen(List<Wydarzenie> wydarzenia){
        this.wydarzenia = wydarzenia;
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

    public void czteryAtrybuty(String nazwaWydarzenia, String typWydarzenia, String miejsceWydarzenia, String dataWydarzenia, ArrayList<Wydarzenie> szukaneWydarzenia){

        for(Wydarzenie wyd : wydarzenia) {

            if (wyszukajWydarzenieNazwaWydarzenia(wyd, nazwaWydarzenia) && wyszukajWydarzenieDataWydarzenia(wyd, dataWydarzenia) && wyszukajWydarzenieMiejsceWydarzenia(wyd, miejsceWydarzenia) && wyszukajWydarzenieTypWydarzenia(wyd, typWydarzenia))
                szukaneWydarzenia.add(wyd);

        }

    }

    public void trzyAtrybuty(String nazwaWydarzenia, String typWydarzenia, String miejsceWydarzenia, String dataWydarzenia, ArrayList<Wydarzenie> szukaneWydarzenia){

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

    public void dwaAtrybuty(String nazwaWydarzenia, String typWydarzenia, String miejsceWydarzenia, String dataWydarzenia, ArrayList<Wydarzenie> szukaneWydarzenia){

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

    public void jedenAtrybut(String nazwaWydarzenia, String typWydarzenia, String miejsceWydarzenia, String dataWydarzenia, ArrayList<Wydarzenie> szukaneWydarzenia){

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
