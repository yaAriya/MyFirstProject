package com.beginning.Transport;

public class MilitaryAirplane extends Plane {
    private int numberOfGuns;
    private int numberOfMissiles;
    public MilitaryAirplane (int numberOfWheels, int power, String color, String  brand, String motorType, int numberOfPassengerSeats, int numberOfWings, int numberOfPorthole, int numberOfFlaps, int numberOfGuns, int numberOfMissiles){
        super (numberOfWheels, power, color, brand, motorType, numberOfPassengerSeats, numberOfWings, numberOfPorthole, numberOfFlaps);
        this.numberOfGuns = numberOfGuns;
        this.numberOfMissiles = numberOfMissiles;
    }
    public int getNumberOfGuns() {
        return numberOfGuns;
    }
    public void setNumberOfGuns(int numberOfGuns) {
        if (numberOfGuns>=0){
            this.numberOfGuns = numberOfGuns;
        } else{
            System.out.println("Не может быть отрицательное количество пушек!");
        }
    }
    public int getNumberOfMissiles() {
        return numberOfMissiles;
    }
    public void setNumberOfMissiles(int numberOfMissiles) {
        if (numberOfMissiles>=0){
            this.numberOfMissiles = numberOfMissiles;
        } else{
            System.out.println("Не может быть отрицательное количество ракет!");
        }
    }
    @Override
    public String toString(){
        return super.toString() + ", " + getNumberOfGuns() + ", " + getNumberOfMissiles();
    }
}
