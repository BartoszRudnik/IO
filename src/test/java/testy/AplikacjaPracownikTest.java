package testy;

import obsluga.TestControl;
import obsluga.TestEntity;
import obsluga.Wydarzenie;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runners.MethodSorters;
import prezentacja.AplikacjaPracownik;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

@Category({TestEntity.class, TestControl.class})
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class AplikacjaPracownikTest {

    private Dane dane;
    private List<Wydarzenie> listaWydarzen;
    private AplikacjaPracownik aplikacja;
    private Wydarzenie [] wydarzenia;
    private String [][] daneString;
    private int [][] daneInt;

    @Before
    public void setUp(){

        dane = new Dane();
        aplikacja = new AplikacjaPracownik();
        listaWydarzen = new ArrayList<>();
        daneInt = dane.getDaneWydarzenInt();

    }

    @Test
    public void dodajWydarzenieStacjonarne(){

        daneString = dane.getDaneWydarzenString();
        wydarzenia = dane.getWydarzeniaStacjonarne();

        Collections.addAll(listaWydarzen, wydarzenia);

        for(int i = 0; i < daneString.length; i++)
            aplikacja.dodajWydarzenie(daneInt[i][2], daneString[i][1], daneString[i][2], daneString[i][3],
                    daneString[i][0], daneInt[i][0], daneInt[i][1], daneString[i][4], daneString[i][5]);

        assertEquals(listaWydarzen, aplikacja.getWydarzenia());

    }

    @Test
    public void dodajWydarzenieOnline(){

        daneString = dane.getDaneWydarzenOnlineString();
        wydarzenia = dane.getWydarzeniaOnline();

        Collections.addAll(listaWydarzen, wydarzenia);

        for(int i = 0; i < daneString.length; i++)
            aplikacja.dodajWydarzenie(daneInt[i][2], daneString[i][1], daneString[i][2], daneString[i][3],
                    daneString[i][0], daneInt[i][0], daneInt[i][1], daneString[i][4], daneString[i][5]);

        assertEquals(listaWydarzen, aplikacja.getWydarzenia());

    }

    @Test
    public void archiwizujWydarzenie(){

        List<Wydarzenie> archiwumWydarzen = new ArrayList<>();
        listaWydarzen = new ArrayList<>();

        wydarzenia = dane.getWydarzeniaStacjonarne();
        Wydarzenie[] wydarzenia2 = dane.getWydarzeniaOnline();

        Collections.addAll(listaWydarzen, wydarzenia);
        Collections.addAll(listaWydarzen, wydarzenia2);

        List<Wydarzenie> tmp = new ArrayList<>(listaWydarzen);

        aplikacja.setWydarzenia(tmp);

        int len = listaWydarzen.size();

        for(int i = 0; i < len; i++){

            archiwumWydarzen.add(listaWydarzen.get(0));
            aplikacja.archiwizujWydarzenie(listaWydarzen.get(0));
            listaWydarzen.remove(0);

            assertEquals(listaWydarzen, aplikacja.getWydarzenia());
            assertEquals(archiwumWydarzen, aplikacja.getArchiwumWydarzen());

        }

    }

    @Test
    public void ograniczLiczbeUczestnikow(){

        int [] nowaLiczbaMiejsc = dane.getNowaLiczbaMiejsc();
        wydarzenia = dane.getWydarzeniaStacjonarne();

        Collections.addAll(listaWydarzen, wydarzenia);

        for(int i = 0; i < nowaLiczbaMiejsc.length; i++){

            aplikacja.ograniczLiczbeMiejsc(nowaLiczbaMiejsc[i], listaWydarzen.get(i));
            assertEquals(nowaLiczbaMiejsc[i], listaWydarzen.get(i).getLiczbaMiejsc());

        }

    }

    @Test
    public void ograniczLiczbeUczestnikowWyjatek(){

        int [] nowaLiczbaMiejsc = dane.getNowaLiczbaMiejsc();
        wydarzenia = dane.getWydarzeniaOnline();

        Collections.addAll(listaWydarzen, wydarzenia);

        for(int i = 0; i < nowaLiczbaMiejsc.length; i++){

            int finalI = i;
            Throwable exception = assertThrows(IllegalArgumentException.class, () -> aplikacja.ograniczLiczbeMiejsc(nowaLiczbaMiejsc[finalI], listaWydarzen.get(finalI)));
            assertEquals("Wydarzenie musi byc stacjonarne", exception.getMessage());

        }

    }

}
