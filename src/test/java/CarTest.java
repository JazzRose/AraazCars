import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class CarTest {

    Car car;
    Engine engine;
    Tyres tyres;

    @Before
    public void before(){
        engine = new Engine("Electric",160);
        tyres = new Tyres(5,"Dunlop");
        car = new Car("Hyundai",60000,"Pink",2600,engine,tyres,5);
    }

   @Test
    public void hasModel(){
        assertEquals("Hyundai",car.getModel());
   }

    @Test
    public void hasMileage(){
        assertEquals(60000,car.getMileage());
    }

    @Test
    public void hasColour(){
        assertEquals("Pink",car.getColour());
    }

    @Test
    public void hasPrice(){
        assertEquals(2600,car.getPrice());
    }
    @Test
    public void hasDoors(){
        assertEquals(5,car.getNumberOfDoors());
    }

    @Test
    public void hasEngine(){
        assertNotNull(engine);
    }
    @Test
    public void hasTyres(){
        assertNotNull(tyres);
    }


}
