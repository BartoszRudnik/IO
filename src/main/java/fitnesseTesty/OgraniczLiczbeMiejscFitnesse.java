package fitnesseTesty;

import fit.ColumnFixture;
import obsluga.Wydarzenie;

public class OgraniczLiczbeMiejscFitnesse extends ColumnFixture {

    int i;
    int nowyLimit;

    public boolean ograniczLiczbeMiejsc() {

        try {

            SetUp.aplikacjaPracownik.ograniczLiczbeMiejsc(nowyLimit, SetUp.aplikacjaPracownik.getWydarzenia().get(i));
            return liczbaMiejsc() == nowyLimit;

        } catch (IllegalArgumentException ex){
            System.out.println(ex.getMessage());
        }

        return false;

    }

    public int liczbaMiejsc(){
        return SetUp.aplikacjaPracownik.getWydarzenia().get(i).getLiczbaMiejsc();
    }

}
