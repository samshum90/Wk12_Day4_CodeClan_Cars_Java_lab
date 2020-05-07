import CarComponents.CarTyre;
import CarComponents.CarTyreType;
import CarComponents.Engine;
import CarComponents.EngineType;
import Cars.Car;
import Cars.ElectricCar;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ElectricCarTest {

    ElectricCar electricCar;

    @Before
    public void before(){
        electricCar = new ElectricCar( 10000, "Pink", EngineType.ELECTRIC, CarTyreType.SUMMER);
    }

    @Test
    public void canGetPrice(){
        assertEquals( 10000, electricCar.getPrice());
    }

    @Test
    public void canGetColour(){
        assertEquals( "Pink", electricCar.getColour());
    }

    @Test
    public void canGetEngineType(){
        assertEquals( EngineType.ELECTRIC, electricCar.getEngineType());
    }

    @Test
    public void canGetCarTyreType(){
        assertEquals( CarTyreType.SUMMER, electricCar.getCarTyreType());
    }
}
