package testyJMockit;

import mockit.Expectations;
import mockit.Injectable;
import mockit.Tested;
import mockit.integration.junit4.JMockit;
import obsluga.Wydarzenie;
import obsluga.WydarzenieStacjonarne;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import prezentacja.WyszukiwaczWydarzen;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

@RunWith(JMockit.class)
public class WyszukiwaczWydarzenMock {

    private final Wydarzenie [] tmp = new Wydarzenie[]{new WydarzenieStacjonarne("Wroclaw","kurs tanca", "30.01.2021", "15:30", 60, 1, 25),
            new WydarzenieStacjonarne("Warszawa","szycie na maszynie", "24.03.2021", "17:45", 45, 2, 10)};

    @Tested
    WyszukiwaczWydarzen wyszukiwacz;

    @Injectable
    Wydarzenie wydarzenie;

    @Injectable
    String dataWydarzenia = "30.01.2021";

    @Injectable
    String miejsceWydarzenia = "Wroclaw";

    @Injectable
    List<Wydarzenie> wydarzenia = Arrays.asList(tmp);

    @Before
    public void setUp(){
        wyszukiwacz = new WyszukiwaczWydarzen();
    }

    @Test
    public void wyszukajWydarzenieDataWydarzeniaTest(){

        new Expectations(){
            {
                wydarzenie.getData(); result = "30.01.2021";
            }
        };

        assertTrue(wyszukiwacz.wyszukajWydarzenieDataWydarzenia(wydarzenie, dataWydarzenia));

    }

    @Test
    public void wyszukajWydarzenieMiejsceWydarzenia(){

        new Expectations(){
            {
                wydarzenie.getMiejsce(); result = "Wroclaw";
                wydarzenie.getTypWydarzenia(); result = "Stacjonarne";
            }
        };

        assertTrue(wyszukiwacz.wyszukajWydarzenieMiejsceWydarzenia(wydarzenie, miejsceWydarzenia));

    }

    @Test
    public void dwaAtrybuty(){

        List<Wydarzenie> resultList =
                wyszukiwacz.dwaAtrybuty(" ", " ", miejsceWydarzenia, dataWydarzenia);

        for(Wydarzenie wyd : resultList){

            assertEquals(wyd.getMiejsce(), miejsceWydarzenia);
            assertEquals(wyd.getData(), dataWydarzenia);

        }

    }

    @Test
    public void wyszukajWydarzenie(){

        for(Wydarzenie wyd : tmp){
            assertTrue(wyszukiwacz.wyszukajWydarzenie(wyd));
        }

    }

}
