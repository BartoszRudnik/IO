package obsluga;

import prezentacja.AplikacjaPracownik;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String [] args){

        AplikacjaPracownik aplikacja = new AplikacjaPracownik();
        List<Wydarzenie> wydarzenia = new ArrayList<>();

        aplikacja.setWydarzenia(wydarzenia);

        aplikacja.dodajWydarzenie(4, "taniec", "20.10.2021", "19:30", "Stacjonarne", 90,1, "-");
        aplikacja.dodajWydarzenie(4, "taniec", "20.10.2021", "19:30", "Online", 90,1, "-");

        for(Wydarzenie wyd : wydarzenia){
            System.out.println(wyd);
        }

        aplikacja.ograniczLiczbeUczestnikow(20, wydarzenia.get(0));
        System.out.println();

        for(Wydarzenie wyd : wydarzenia){
            System.out.println(wyd);
        }

        aplikacja.archiwizujWydarzenie(wydarzenia.get(0));
        System.out.println();

        for(Wydarzenie wyd : wydarzenia){
            System.out.println(wyd);
        }

    }

}
