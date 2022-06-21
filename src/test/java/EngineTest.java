import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class EngineTest {

    Engine engine;



    @Before
    public void before(){
        engine = new Engine("Motor",200);
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
