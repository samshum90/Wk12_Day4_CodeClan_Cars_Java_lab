package Dealership;

import Cars.Car;

import java.util.ArrayList;

public class Dealership {

        private int till;
        private ArrayList<Car> carsForSale;

        public Dealership(int till ) {
            this.till = till;
            this.carsForSale = new ArrayList<Car>();
        }

        public int getTill() {
            return till;
        }

        public ArrayList<Car> getCarsForSale() {
            return carsForSale;
        }
}
