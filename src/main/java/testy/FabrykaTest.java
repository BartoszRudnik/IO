package testy;

import obsluga.Fabryka;
import obsluga.FabrykaWydarzen;
import obsluga.Wydarzenie;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.assertEquals;

public class FabrykaTest {

    Dane dane = new Dane();

    @Rule
    public ExpectedException exception = ExpectedException.none();

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

        exception.expect(IllegalArgumentException.class);
        exception.expectMessage("Wydarzenie musi byc Stacjonarne albo Online");
        fabryka.noweWydarzenie(daneWydarzen[2][0]);

    }

}
