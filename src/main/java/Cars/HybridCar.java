package Cars;

import CarComponents.CarTyre;
import CarComponents.CarTyreType;
import CarComponents.Engine;
import CarComponents.EngineType;

public class HybridCar extends Car{
    public HybridCar(int price, String colour, EngineType engineType, CarTyreType carTyreType) {
        super(price, colour, engineType, carTyreType);
    }
}
