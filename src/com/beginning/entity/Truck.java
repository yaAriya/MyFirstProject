package com.beginning.entity;

import com.beginning.entity.Car;

import java.util.Objects;

public class Truck extends Car {
    private int vehicleBody;

    public Truck(int ID, int wheelsNumber, int power, String color, String  brand, String motorType, int passengerSeatsNumber, int stopSignalsNumber, int vehicleBody) {
        super(ID, wheelsNumber, power, color, brand, motorType, passengerSeatsNumber, stopSignalsNumber);
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
    public int hashCode(){
        return Objects.hash(super.hashCode(),vehicleBody);
    }

    @Override
    public boolean equals(Object obj){
        if(!(obj instanceof Truck)) return false;
        Truck truck = (Truck) obj;
        return super.equals(obj) && vehicleBody == truck.vehicleBody;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString(){
        return super.toString() + ", " + vehicleBody;
    }
}
