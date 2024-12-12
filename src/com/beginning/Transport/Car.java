package com.beginning.Transport;

public class Car extends Transport {
    private  int numberOfStopSignals;
    public Car (int numberOfWheels,int power, String color, String  brand, String motorType, int numberOfPassengerSeats, int numberOfStopSignals){
        super(numberOfWheels, power, color, brand, motorType, numberOfPassengerSeats);
        this.numberOfStopSignals = numberOfStopSignals;
    }
    public int getNumberOfStopSignals() {
        return numberOfStopSignals;
    }
    public void setNumberOfStopSignals(int numberOfStopSignals) {
        this.numberOfStopSignals = numberOfStopSignals;
    }
    @Override
    public String toString(){
        return super.toString() + "," + getNumberOfStopSignals();
    }
}
