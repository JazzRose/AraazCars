import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TyresTest {

    Tyres tyres;



    @Before
    public void before(){
        tyres = new Tyres(10,"Goodyear");
    }


    @Test
    public void hasTread(){
        assertEquals(10,tyres.getTread());
    }

    @Test
    public void hasMake(){
        assertEquals("Goodyear",tyres.getMake());
    }

}
