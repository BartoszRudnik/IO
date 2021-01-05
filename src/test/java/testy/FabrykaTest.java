package testy;

import obsluga.Fabryka;
import obsluga.FabrykaWydarzen;
import obsluga.Wydarzenie;
import org.junit.Before;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class FabrykaTest {

    Dane dane = new Dane();

    @Before
    public void setUp(){
        dane = new Dane();
    }

    @Test
    public void noweWydarzenieIllegalArgumentException() {

        Fabryka fabryka = new FabrykaWydarzen();
        String [] daneWydarzen = dane.getDaneWydarzenFabrykaStacjonarne();

        Throwable exception = assertThrows(
                IllegalArgumentException.class, () -> fabryka.noweWydarzenie(daneWydarzen[3]));
        assertEquals("Wydarzenie musi byc Stacjonarne albo Online", exception.getMessage());

    }

    @Test
    public void noweWydarzenieStacjonarne() throws Exception {

        Fabryka fabryka = new FabrykaWydarzen();
        String [] daneWydarzen = dane.getDaneWydarzenFabrykaStacjonarne();
        Wydarzenie [] wydarzenia = dane.getWydarzeniaStacjonarne();

        for(int i = 0; i < daneWydarzen.length - 1; i++){

            Wydarzenie wydarzenie = fabryka.noweWydarzenie(daneWydarzen[i]);
            assertEquals(wydarzenia[i].getClass(), wydarzenie.getClass(), "Wydarzenie powinno byc stacjonarne");

        }

    }

    @Test
    public void noweWydarzenieOnline() throws Exception{

        Fabryka fabryka = new FabrykaWydarzen();
        String [] daneWydarzen = dane.getDaneWydarzenFabrykaOnline();
        Wydarzenie [] wydarzenia = dane.getWydarzeniaOnline();

        for(int i = 0; i < daneWydarzen.length - 1; i++){

            Wydarzenie wydarzenie = fabryka.noweWydarzenie(daneWydarzen[i]);
            assertEquals(wydarzenia[i].getClass(), wydarzenie.getClass(), "Wydarzenie powinno byc online");

        }

    }

}
