package com.beginning.Transport;

public class Trucks extends Car {
    private int vehicleBody;
    public Trucks (int numberOfWheels,int power, String color, String  brand, String motorType, int numberOfPassengerSeats, int numberOfStopSignals, int vehicleBody) {
        super(numberOfWheels, power, color, brand, motorType, numberOfPassengerSeats, numberOfStopSignals);
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
