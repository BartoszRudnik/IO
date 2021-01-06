package testyJUnit;

import obsluga.*;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runners.MethodSorters;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
@Category({TestControl.class, TestEntity.class})
public class FabrykaTest {

    Dane dane = new Dane();
    Fabryka fabryka = new FabrykaWydarzen();

    @Before
    public void setUp(){
        dane = new Dane();
        fabryka = new FabrykaWydarzen();
    }

    @Test
    public void noweWydarzenieIllegalArgumentException() {

        String [] daneWydarzen = dane.getDaneWydarzenFabrykaStacjonarne();

        Throwable exception = assertThrows(
                IllegalArgumentException.class, () -> fabryka.noweWydarzenie(daneWydarzen[3]));
        assertEquals("Wydarzenie musi byc Stacjonarne albo Online", exception.getMessage());

    }

    @Test
    public void noweWydarzenieStacjonarne() throws Exception {

        String [] daneWydarzen = dane.getDaneWydarzenFabrykaStacjonarne();
        Wydarzenie [] wydarzenia = dane.getWydarzeniaStacjonarne();

        for(int i = 0; i < daneWydarzen.length - 1; i++){

            Wydarzenie wydarzenie = fabryka.noweWydarzenie(daneWydarzen[i]);
            assertEquals(wydarzenia[i].getClass(), wydarzenie.getClass(), "Wydarzenie powinno byc stacjonarne");

        }

    }

    @Test
    public void noweWydarzenieOnline() throws Exception{

        String [] daneWydarzen = dane.getDaneWydarzenFabrykaOnline();
        Wydarzenie [] wydarzenia = dane.getWydarzeniaOnline();

        for(int i = 0; i < daneWydarzen.length; i++){

            Wydarzenie wydarzenie = fabryka.noweWydarzenie(daneWydarzen[i]);
            assertEquals(wydarzenia[i].getClass(), wydarzenie.getClass(), "Wydarzenie powinno byc online");

        }

    }

}