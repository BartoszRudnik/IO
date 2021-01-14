package fitnesseTesty;

import fit.ColumnFixture;

public class DodajWydarzenieWyjatekFitnesse extends ColumnFixture {

    String [] dane;

    public boolean DodajWydarzenieWyjatek(){

        try {

            int rozmiar1 = rozmiarWydarzenia();

            SetUp.aplikacjaPracownik.dodajWydarzenie(Integer.parseInt(dane[0]), dane[1], dane[2], dane[3], dane[4],
                    Integer.parseInt(dane[5]), Integer.parseInt(dane[6]), dane[7], dane[8]);

            int rozmiar2 = rozmiarWydarzenia();

            return  rozmiar2 > rozmiar1;

        } catch(IllegalArgumentException ex){
            System.out.println(ex.getMessage());
        }

        return  false;

    }

    public int rozmiarWydarzenia(){
        return SetUp.aplikacjaPracownik.getWydarzenia().size();
    }

}
