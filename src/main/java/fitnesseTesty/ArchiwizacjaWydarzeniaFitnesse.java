package fitnesseTesty;

import fit.ColumnFixture;

public class ArchiwizacjaWydarzeniaFitnesse extends ColumnFixture {

    int i;
    int wydarzeniaRozmiar;
    int archiwumRozmiar;

    public boolean archiwizuj(){

        try {

            SetUp.aplikacjaPracownik.archiwizujWydarzenie(SetUp.aplikacjaPracownik.getWydarzenia().get(i));

            return rozmiarArchiwum() == archiwumRozmiar && rozmiarWydarzenia() == wydarzeniaRozmiar;

        } catch (Exception ex){
            ex.printStackTrace();
        }

        return false;

    }

    public int rozmiarArchiwum(){
        return SetUp.aplikacjaPracownik.getArchiwumWydarzen().size();
    }

    public int rozmiarWydarzenia(){
        return SetUp.aplikacjaPracownik.getWydarzenia().size();
    }

}
