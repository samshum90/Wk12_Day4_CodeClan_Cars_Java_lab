package People;

import Cars.Car;

import java.util.ArrayList;

public class Customer {
    private int wallet;
    private ArrayList<Car> ownedCars;

    public Customer(int wallet ) {
        this.wallet = wallet;
        this.ownedCars = new ArrayList<Car>();
    }

    public int getWallet() {
        return wallet;
    }

    public ArrayList<Car> getOwnedCars() {
        return ownedCars;
    }
}
