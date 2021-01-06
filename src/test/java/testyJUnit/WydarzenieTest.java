package testyJUnit;

import obsluga.TestEntity;
import obsluga.Wydarzenie;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
@Category({TestEntity.class})
@RunWith(Parameterized.class)
public class WydarzenieTest {

    private Dane dane;

    @Parameterized.Parameter
    public int numer;

    @Parameterized.Parameters
    public static Collection<Object []> data(){

        Object[][] data1 = new Object[][]{{0}, {1}, {2}};
        return  Arrays.asList(data1);
    }

    @Before
    public void setUp(){
        dane = new Dane();
    }

    @Test
    public void testEqualsWydarzenieOnline(){

        Wydarzenie [] wydarzeniaOnline = dane.getWydarzeniaOnline();

        for(int i = numer; i < wydarzeniaOnline.length; i++){

            if(i == numer)
                assertEquals(wydarzeniaOnline[numer], wydarzeniaOnline[i]);
            else
                assertNotEquals(wydarzeniaOnline[numer], wydarzeniaOnline[i]);

        }

    }

    @Test
    public void testEqualsWydarzenieStacjonarne(){

        Wydarzenie [] wydarzeniaStacjonarne = dane.getWydarzeniaStacjonarne();

        for(int i = numer; i < wydarzeniaStacjonarne.length - 1; i++){

            if(i == numer)
                assertEquals(wydarzeniaStacjonarne[numer], wydarzeniaStacjonarne[i]);
            else
                assertNotEquals(wydarzeniaStacjonarne[numer], wydarzeniaStacjonarne[i]);

        }

    }

    @Test
    public void testEqualsWydarzeniaStacjonarneOnline(){

        Wydarzenie [] wydarzeniaStacjonarne = dane.getWydarzeniaStacjonarne();
        Wydarzenie [] wydarzeniaOnline = dane.getWydarzeniaOnline();

        for(int i = 0; i < wydarzeniaStacjonarne.length - 1; i++){

            for (Wydarzenie wydarzenie : wydarzeniaOnline)
                assertNotEquals(wydarzeniaStacjonarne[i], wydarzenie);

        }

    }

}
