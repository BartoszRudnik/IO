package testyJMockit;

import mockit.Expectations;
import mockit.Injectable;
import mockit.Tested;
import obsluga.Wydarzenie;
import org.junit.Test;
import prezentacja.WyszukiwaczWydarzen;

import static org.junit.Assert.assertTrue;

public class WyszukiwaczWydarzenMock {

    @Tested
    WyszukiwaczWydarzen wyszukiwacz;

    @Injectable
    Wydarzenie wydarzenie;

    @Injectable
    String dataWydarzenia = "30.01.2021";

    @Test
    public void wyszukajWydarzenieDataWydarzeniaTest(){

        new Expectations(){
            {
                wydarzenie.getData(); result = "30.01.2021";
            }
        };

        assertTrue(wyszukiwacz.wyszukajWydarzenieDataWydarzenia(wydarzenie, dataWydarzenia));

    }
}
