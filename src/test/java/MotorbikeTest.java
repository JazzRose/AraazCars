import Vehicles.BikeClassification;
import Vehicles.Engine;
import Vehicles.Motorbike;
import Vehicles.Tyres;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class MotorbikeTest {

    Motorbike motorbike;
    Engine engine;
    Tyres tyres;

    @Before
    public void before() {
        engine = new Engine("Electric", 160);
        tyres = new Tyres(5, "Dunlop");
        motorbike = new Motorbike("Yamaha", 70000, "White", 200, engine, tyres, BikeClassification.SCOOTER);
    }

    @Test
    public void hasBikeClassification() {
        assertEquals(BikeClassification.SCOOTER, motorbike.getBikeClassification());
    }

}