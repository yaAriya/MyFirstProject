package com.beginning.Transport;

public class PassengerCar extends Car {
        private int backRowsNumber;

    public PassengerCar (int wheelsNumber,int power, String color, String  brand, String motorType, int passengerSeatsNumber, int stopSignalsNumber, int backRowsNumber){
        super(wheelsNumber, power, color, brand, motorType, passengerSeatsNumber, stopSignalsNumber);
            this.backRowsNumber = backRowsNumber;
    }

    public int getBackRowsNumber() {
        return backRowsNumber;
    }

    public void setBackRowsNumber(int backRowsNumber) {
        this.backRowsNumber = backRowsNumber;
    }

    @Override
    public String toString(){
        return super.toString() + ", " + getBackRowsNumber();
    }
}
