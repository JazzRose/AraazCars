import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TyresTest {

    Tyres tyres;



    @Before
    public void before(){
        tyres = new Tyres(120,1.0,10,"Goodyear");
    }

    @Test
    public void hasCostOfPart(){
        assertEquals(120,tyres.getCostOfPart());
    }

    @Test
    public void hasDamageAmount(){
        assertEquals(1.00,tyres.getDamage(),0.00);
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
