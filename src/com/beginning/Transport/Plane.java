package com.beginning.Transport;

public class Plane extends Transport implements Cloneable{
    private int numberOfWings;
    private int numberOfPorthole;
    private int numberOfFlaps;
    public Plane (int numberOfWheels, int power, String color, String  brand, String motorType, int numberOfPassengerSeats, int numberOfWings, int numberOfPorthole, int numberOfFlaps){
        super(numberOfWheels, power, color, brand, motorType, numberOfPassengerSeats);
        this.numberOfWings = numberOfWings;
        this.numberOfPorthole = numberOfPorthole;
        this.numberOfFlaps = numberOfFlaps;
    }
    public int getNumberOfWings() {
        return numberOfWings;
    }
    public void setNumberOfWings(int numberOfWings) {
        if (numberOfWings>=0){
            this.numberOfWings = numberOfWings;
        } else {
            System.out.println("Произошла ошибка, крыльев не может быть отрицательное количество");
        }
    }
    public int getNumberOfPorthole() {
        return numberOfPorthole;
    }
    public void setNumberOfPorthole(int numberOfPorthole) {
        if (numberOfPorthole>=0){
            this.numberOfPorthole = numberOfPorthole;
        } else {
            System.out.println("Произошла ошибка, иллюминаторов не может быть отрицательное количество");
        }
    }
    public int getNumberOfFlaps() {
        return numberOfFlaps;
    }
    public void setNumberOfFlaps(int numberOfFlaps) {
        if (numberOfFlaps>=0){
            this.numberOfFlaps = numberOfFlaps;
        } else {
            System.out.println("Произошла ошибка, закрылок не может быть отрицательное количество");
        }
    }
    public Plane clone() throws CloneNotSupportedException{
        return (Plane) super.clone();
    }
    public String toString(){
        return getNumberOfWheels() + "," + getPower() + "," + getColor() + "," + getBrand() + "," + getMotorType() + "," + getNumberOfPassengerSeats() + "," + getNumberOfWings() + "," + getNumberOfPorthole() + "," + getNumberOfFlaps()+ ".";
    }
}
