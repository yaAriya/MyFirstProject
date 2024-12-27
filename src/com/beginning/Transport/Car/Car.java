package com.beginning.Transport.Car;

import com.beginning.Transport.Transport.Transport;

public class Car extends Transport {
    private  int stopSignalsNumber;

    public Car (int wheelsNumber,int power, String color, String  brand, String motorType, int passengerSeatsNumber, int stopSignalsNumber){
        super(wheelsNumber, power, color, brand, motorType, passengerSeatsNumber);
        this.stopSignalsNumber = stopSignalsNumber;
    }

    public int getStopSignalsNumber() {
        return stopSignalsNumber;
    }

    public void setStopSignalsNumber(int stopSignalsNumber) {
        this.stopSignalsNumber = stopSignalsNumber;
    }

    @Override
    public String toString(){
        return super.toString() + "," + getStopSignalsNumber();
    }
}
