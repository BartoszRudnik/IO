package testy;

import obsluga.*;
import org.junit.Before;
import org.junit.experimental.categories.Category;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

@Category({TestControl.class, TestEntity.class})
public class FabrykaTest {

    private Dane dane = new Dane();

    @Before
    public void setUp(){
        dane = new Dane();
    }

    @Test
    public void testNoweWydarzenieIllegalArgumentException() {

        Fabryka fabryka = new FabrykaWydarzen();
        String [] daneWydarzen = dane.getDaneWydarzenFabrykaStacjonarne();

        Throwable exception = assertThrows(
                IllegalArgumentException.class, () -> fabryka.noweWydarzenie(daneWydarzen[3]));
        assertEquals("Wydarzenie musi byc Stacjonarne albo Online", exception.getMessage());

    }

    @Test
    public void testNoweWydarzenieStacjonarne() throws Exception {

        Fabryka fabryka = new FabrykaWydarzen();
        String [] daneWydarzen = dane.getDaneWydarzenFabrykaStacjonarne();
        Wydarzenie [] wydarzenia = dane.getWydarzeniaStacjonarne();

        for(int i = 0; i < daneWydarzen.length - 1; i++){

            Wydarzenie wydarzenie = fabryka.noweWydarzenie(daneWydarzen[i]);
            assertEquals(wydarzenia[i].getClass(), wydarzenie.getClass(), "Wydarzenie powinno byc stacjonarne");

        }

    }

    @Test
    public void testNoweWydarzenieOnline() throws Exception{

        Fabryka fabryka = new FabrykaWydarzen();
        String [] daneWydarzen = dane.getDaneWydarzenFabrykaOnline();
        Wydarzenie [] wydarzenia = dane.getWydarzeniaOnline();

        for(int i = 0; i < daneWydarzen.length - 1; i++){

            Wydarzenie wydarzenie = fabryka.noweWydarzenie(daneWydarzen[i]);
            assertEquals(wydarzenia[i].getClass(), wydarzenie.getClass(), "Wydarzenie powinno byc online");

        }

    }

}
