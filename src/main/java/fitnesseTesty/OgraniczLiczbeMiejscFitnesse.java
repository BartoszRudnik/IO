package fitnesseTesty;

import fit.ColumnFixture;

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

        if(SetUp.aplikacjaPracownik.getWydarzenia().get(i).getTypWydarzenia().equalsIgnoreCase("Online"))
            return Integer.MAX_VALUE;
        else
            return SetUp.aplikacjaPracownik.getWydarzenia().get(i).getLiczbaMiejsc();

    }

}
