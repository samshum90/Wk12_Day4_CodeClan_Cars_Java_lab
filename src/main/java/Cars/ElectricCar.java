package Cars;

import CarComponents.CarTyre;
import CarComponents.CarTyreType;
import CarComponents.Engine;
import CarComponents.EngineType;

public class ElectricCar extends Car{
    public ElectricCar(int price, String colour, EngineType engineType, CarTyreType carTyreType) {
        super(price, colour, engineType, carTyreType);
    }
}
