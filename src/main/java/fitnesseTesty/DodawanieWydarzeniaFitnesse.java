package fitnesseTesty;

import fit.ColumnFixture;

public class DodawanieWydarzeniaFitnesse extends ColumnFixture {

    String [] dane;

    public boolean dodajWydarzenie(){

        try {

            int list1 = liczbaWydarzen();

            SetUp.aplikacjaPracownik.dodajWydarzenie(Integer.parseInt(dane[0]), dane[1], dane[2], dane[3], dane[4],
                    Integer.parseInt(dane[5]), Integer.parseInt(dane[6]), dane[7], dane[8]);

            int list2 = liczbaWydarzen();

            return list1 != list2;

        } catch (Exception ex){
            ex.printStackTrace();
        }

        return false;

    }

    public int liczbaWydarzen(){
        return  SetUp.aplikacjaPracownik.getWydarzenia().size();
    }

}
