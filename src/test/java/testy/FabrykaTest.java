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
    public void noweWydarzenieTest() throws Exception {

        Fabryka fabryka = new FabrykaWydarzen();
        String [][] daneWydarzen = dane.getDaneWydarzen();
        Wydarzenie [] wydarzenia = dane.getWydarzenia();

        for(int i = 0; i < dane.getWydarzenia().length; i++){

            Wydarzenie wydarzenie = fabryka.noweWydarzenie(daneWydarzen[i][0]);
            assertEquals(wydarzenia[i].getClass(), wydarzenie.getClass());

        }

        Throwable exception = assertThrows(
                IllegalArgumentException.class, () -> fabryka.noweWydarzenie(daneWydarzen[2][0]));
        assertEquals("Wydarzenie musi byc Stacjonarne albo Online", exception.getMessage());

    }

}
