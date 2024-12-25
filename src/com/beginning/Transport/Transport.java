package com.beginning.Transport;

public class Transport {
    private int wheelsNumber;
    private int power;
    private String color;
    private String  brand;
    private String motorType;
    private int passengerSeatsNumber;

    public Transport (int wheelsNumber,int power, String color, String  brand, String motorType, int passengerSeatsNumber){
        this.wheelsNumber = wheelsNumber;
        this.power = power;
        this.color = color;
        this.brand = brand;
        this.motorType = motorType;
        this.passengerSeatsNumber = passengerSeatsNumber;
    }
    public int getWheelsNumber(){
        return wheelsNumber;
    }
    public void setWheelsNumber(int wheelsNumber) {
        if (wheelsNumber >= 0) {
            this.wheelsNumber = wheelsNumber;
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
    public int getPassengerSeatsNumber() {
        return passengerSeatsNumber;
    }
    public void setPassengerSeatsNumber (int passengerSeatsNumber) {
        if(passengerSeatsNumber>= 0){
            this.passengerSeatsNumber = passengerSeatsNumber;
        } else{
            System.out.println("Увы, не может быть отрицательное количество поссажирских мест");
        }
    }
    @Override
    public String toString(){
        return getWheelsNumber()+ "," + getPower() + "," + getColor() + "," + getBrand() + "," + getMotorType() + "," + getPassengerSeatsNumber();
    }
}
