package Cars;

import CarComponents.CarTyreType;
import CarComponents.EngineType;

public abstract class Car {

    private int price;
    private String colour;
    private EngineType engineType;
    private CarTyreType carTyreType;

    public Car(int price, String colour, EngineType engineType, CarTyreType carTyreType) {
        this.price = price;
        this.colour = colour;
        this.engineType = engineType;
        this.carTyreType = carTyreType;
    }

    public int getPrice() {
        return price;
    }

    public String getColour() {
        return colour;
    }

    public EngineType getEngineType() {
        return engineType;
    }

    public CarTyreType getCarTyreType() {
        return carTyreType;
    }


}
