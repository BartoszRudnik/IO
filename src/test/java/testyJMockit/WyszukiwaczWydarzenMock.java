package testyJMockit;

import mockit.Expectations;
import mockit.Injectable;
import mockit.Tested;
import mockit.integration.junit4.JMockit;
import obsluga.Wydarzenie;
import org.junit.Test;
import org.junit.runner.RunWith;
import prezentacja.WyszukiwaczWydarzen;

import static org.junit.Assert.assertTrue;

@RunWith(JMockit.class)
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
