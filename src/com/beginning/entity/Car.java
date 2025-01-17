package com.beginning.entity;

import java.util.Objects;

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
    public int hashCode(){
        return Objects.hash(super.hashCode(),stopSignalsNumber);
    }

    public boolean equals(Object obj){
        if (!(obj instanceof Car)) return false;
        Car car = (Car) obj;
        return super.equals(obj) && stopSignalsNumber == car.stopSignalsNumber;
    }

    @Override
    public String toString(){
        return super.toString() + "," + stopSignalsNumber;
    }
}
