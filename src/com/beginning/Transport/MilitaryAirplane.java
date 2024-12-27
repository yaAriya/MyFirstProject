package com.beginning.Transport;

public class MilitaryAirplane extends Plane {
    private int gunsNumber;
    private int missilesNumber;

    public MilitaryAirplane (int wheelsNumber,int power, String color, String  brand, String motorType, int passengerSeatsNumber, int wingsNumber, int portholeNumber, int flapsNumber, int gunsNumber, int missilesNumber){
        super (wheelsNumber, power, color, brand, motorType, passengerSeatsNumber, wingsNumber, portholeNumber, flapsNumber);
        this.gunsNumber = gunsNumber;
        this.missilesNumber = missilesNumber;
    }

    public int getGunsNumber() {
        return gunsNumber;
    }

    public void setGunsNumber(int gunsNumber) {
        if (gunsNumber>=0){
            this.gunsNumber = gunsNumber;
        } else{
            System.out.println("Не может быть отрицательное количество пушек!");
        }
    }

    public int getMissilesNumber() {
        return missilesNumber;
    }

    public void setMissilesNumber(int missilesNumber) {
        if (missilesNumber>=0){
            this.missilesNumber = missilesNumber;
        } else{
            System.out.println("Не может быть отрицательное количество ракет!");
        }
    }

    @Override
    public String toString(){
        return super.toString() + ", " + getGunsNumber() + ", " + getMissilesNumber();
    }
}
