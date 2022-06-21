import Vehicles.Engine;
import Vehicles.Tyres;
import Vehicles.Van;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class VanTest {

    Van van;
    Engine engine;
    Tyres tyres;

    @Before
    public void before() {
        engine = new Engine("Electric", 160);
        tyres = new Tyres(5, "Dunlop");
        van = new Van("Caddy Maxi",65000,"White",7000,engine,tyres,"Long Wheel Base",4 );
    }

    @Test
    public void hasWheelBase() {
        assertEquals("Long Wheel Base", van.getWheelbase());
    }

    @Test
    public void hasStorage() {
        assertEquals(4, van.getStorageCapacity());
    }

}