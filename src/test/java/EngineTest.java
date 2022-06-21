import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class EngineTest {

    Engine engine;



    @Before
    public void before(){
        engine = new Engine(400,0.5,"Motor",200);
    }

    @Test
    public void hasCostOfPart(){
        assertEquals(400,engine.getCostOfPart());
    }

    @Test
    public void hasDamageAmount(){
        assertEquals(0.5,engine.getDamage(),0.00);
    }

    @Test
    public void hasType(){
        assertEquals("Motor",engine.getType());
    }

    @Test
    public void hasHorsePower(){
        assertEquals(200,engine.getHorsePower());
    }
}
