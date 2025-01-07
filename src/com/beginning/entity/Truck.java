package com.beginning.entity;

import com.beginning.entity.Car;

public class Truck extends Car {
    private int vehicleBody;

    public Truck(int wheelsNumber, int power, String color, String  brand, String motorType, int passengerSeatsNumber, int stopSignalsNumber, int vehicleBody) {
        super(wheelsNumber, power, color, brand, motorType, passengerSeatsNumber, stopSignalsNumber);
            this.vehicleBody = vehicleBody;
    }

    public int getVehicleBody() {
        return vehicleBody;
    }

    public void setVehicleBody(int vehicleBody) {
        if (vehicleBody>= 0){
            this.vehicleBody = vehicleBody;
        } else {
            System.out.println("Упс, Кузовов не может быть меньше 0");
        }
    }

    @Override
    public String toString(){
        return super.toString() + ", " + getVehicleBody();
    }
}
