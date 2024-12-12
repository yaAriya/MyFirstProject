package com.beginning.Transport;

public class Transport {
    private int numberOfWheels;
    private int power;
    private String color;
    private String  brand;
    //public String motorSize;
    private String motorType;
    private int numberOfPassengerSeats;

    public Transport (int numberOfWheels,int power, String color, String  brand, String motorType, int numberOfPassengerSeats){
        this.numberOfWheels = numberOfWheels;
        //setPower(power);
        this.power = power;
        this.color = color;
        this.brand = brand;
        this.motorType = motorType;
        this.numberOfPassengerSeats = numberOfPassengerSeats;
    }
    public int getNumberOfWheels(){
        return numberOfWheels;
    }
    public void setNumberOfWheels(int numberOfWheels) {
        if (numberOfWheels >= 0) {
            this.numberOfWheels = numberOfWheels;
        } else{
            System.out.println("Упс, произошла ошибка! Не может быть меньше 0 колес");
        }
    }
    public int getPower(){
        return power;
    }
    public void setPower(int power) {
        if (power>0) {
            this.power = power;
        } else {
            System.out.println("Мощность автомобиля не может быть отрицательной");
        }
    }
    public String getColor(){
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public String getBrand() {
        return brand;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }
    public String getMotorType() {
        return motorType;
    }
    public void setMotorType(String motorType) {
        this.motorType = motorType;
    }
    public int getNumberOfPassengerSeats() {
        return numberOfPassengerSeats;
    }
    public void setNumberOfPassengerSeats(int numberOfPassengerSeats) {
        if(numberOfPassengerSeats>= 0){
            this.numberOfPassengerSeats = numberOfPassengerSeats;
        } else{
            System.out.println("Увы, не может быть отрицательное количество поссажирских мест");
        }
    }
    @Override
    public String toString(){
        return getNumberOfWheels() + "," + getPower() + "," + getColor() + "," + getBrand() + "," + getMotorType() + "," + getNumberOfPassengerSeats();
    }
}
