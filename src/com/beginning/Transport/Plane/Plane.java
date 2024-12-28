package com.beginning.Transport.Plane;

import com.beginning.Transport.Transport.Transport;

public class Plane extends Transport implements Cloneable {
    private int wingsNumber;
    private int portholeNumber;
    private int flapsNumber;

    public Plane (int wheelsNumber, int power, String color, String  brand, String motorType, int passengerSeatsNumber, int wingsNumber, int portholeNumber, int flapsNumber){
        super(wheelsNumber, power, color, brand, motorType, passengerSeatsNumber);
        this.wingsNumber = wingsNumber;
        this.portholeNumber = portholeNumber;
        this.flapsNumber = flapsNumber;
    }

    public int getWingsNumber() {
        return wingsNumber;
    }

    public void setWingsNumber(int wingsNumber) {
        if (wingsNumber>=0){
            this.wingsNumber = wingsNumber;
        } else {
            System.out.println("Произошла ошибка, крыльев не может быть отрицательное количество");
        }
    }

    public int getPortholeNumber() {
        return portholeNumber;
    }

    public void setPortholeNumber(int portholeNumber) {
        if (portholeNumber>=0){
            this.portholeNumber = portholeNumber;
        } else {
            System.out.println("Произошла ошибка, иллюминаторов не может быть отрицательное количество");
        }
    }

    public int getFlapsNumber() {
        return flapsNumber;
    }

    public void setFlapsNumber(int flapsNumber) {
        if (flapsNumber>=0){
            this.flapsNumber = flapsNumber;
        } else {
            System.out.println("Произошла ошибка, закрылок не может быть отрицательное количество");
        }
    }

    public Plane clone() throws CloneNotSupportedException{
        return (Plane) super.clone();
    }

    public String toString(){
        return super.toString() + ", " + getWingsNumber() + "," + getPortholeNumber() + "," + getFlapsNumber()+ ".";
    }
}