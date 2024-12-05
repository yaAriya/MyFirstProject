package com.beginning.Transport;

public class PassengerCar extends Car {
        private int numberOfBackRows;
    public PassengerCar (int numberOfWheels,int power, String color, String  brand, String motorType, int numberOfPassengerSeats, int numberOfStopSignals, int numberOfBackRows){
        super(numberOfWheels, power, color, brand, motorType, numberOfPassengerSeats, numberOfStopSignals);
            this.numberOfBackRows = numberOfBackRows;
    }

    public int getNumberOfBackRows() {
        return numberOfBackRows;
    }

    public void setNumberOfBackRows(int numberOfBackRows) {
        this.numberOfBackRows = numberOfBackRows;
    }
}
