package com.beginning.entity;

import com.beginning.entity.Car;

import java.util.Objects;

public class PassengerCar extends Car implements Cloneable{
        private int backRowsNumber;

    public PassengerCar (int ID, int wheelsNumber,int power, String color, String  brand, String motorType, int passengerSeatsNumber, int stopSignalsNumber, int backRowsNumber){
        super(ID, wheelsNumber, power, color, brand, motorType, passengerSeatsNumber, stopSignalsNumber);
            this.backRowsNumber = backRowsNumber;
    }

    public int getBackRowsNumber() {
        return backRowsNumber;
    }

    public void setBackRowsNumber(int backRowsNumber) {
        this.backRowsNumber = backRowsNumber;
    }

    @Override
    public int hashCode(){
        return Objects.hash(super.hashCode(),backRowsNumber);
    }

    @Override
    public boolean equals(Object obj){
        if(!(obj instanceof PassengerCar)) return false;
        PassengerCar passengerCar = (PassengerCar) obj;
        return super.equals(obj) && backRowsNumber == passengerCar.backRowsNumber;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString(){
        return super.toString() + ", " + backRowsNumber;
    }
}
