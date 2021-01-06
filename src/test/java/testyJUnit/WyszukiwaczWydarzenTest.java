package testyJUnit;

import obsluga.TestControl;
import obsluga.Wydarzenie;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runners.MethodSorters;
import prezentacja.WyszukiwaczWydarzen;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.*;

@Category({TestControl.class})
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class WyszukiwaczWydarzenTest {

    private Dane dane;
    private WyszukiwaczWydarzen wyszukiwacz;

    @Before
    public void setUp(){

        dane = new Dane();

        List<Wydarzenie> daneWydarzenia = new ArrayList<>();
        Wydarzenie [] tmp1 = dane.getWszystkieWydarzenia();
        Collections.addAll(daneWydarzenia, tmp1);

        wyszukiwacz = new WyszukiwaczWydarzen(daneWydarzenia);

    }

    @Test
    public void wyszukajWydarzenieTrue(){

        Wydarzenie[] wyszukiwaneWydarzeniaTrue = dane.getWyszukajWydarzenieTrue();

        for (Wydarzenie wydarzenie : wyszukiwaneWydarzeniaTrue)
            assertTrue(wyszukiwacz.wyszukajWydarzenie(wydarzenie));

    }

    @Test
    public void wyszukajWydarzenieFalse(){

        Wydarzenie[] wyszukiwaneWydarzeniaFalse = dane.getWyszukajWydarzenieFalse();

        for(Wydarzenie wydarzenie : wyszukiwaneWydarzeniaFalse)
            assertFalse(wyszukiwacz.wyszukajWydarzenie(wydarzenie));

    }

    @Test
    public void jedenAtrybutEquals(){

        Wydarzenie [] tmp = dane.getWydarzeniaStacjonarne();
        List<Wydarzenie> expected = new ArrayList<>();

        Collections.addAll(expected, tmp);

        assertEquals(expected, wyszukiwacz.jedenAtrybut("", "Stacjonarne", "", ""));

    }

    @Test
    public void jedenAtrybutNotEquals(){

        Wydarzenie [] tmp = dane.getWydarzeniaStacjonarne();
        List<Wydarzenie> expected = new ArrayList<>();

        Collections.addAll(expected, tmp);

        assertNotEquals(expected, wyszukiwacz.jedenAtrybut("", "Online", "", ""));

    }

}
