package com.beginning.filter;

import com.beginning.entity.Car;

import java.util.ArrayList;

import java.util.List;

public class CarFilter {
    public static List<Car> filterCarByPassengerSeatsNumber(List<Car> carsFilteredByPassengerSeatsNumber) {

        List<Car> filteredByPassengerSeatsNumberFirstCarShowroom= new ArrayList<>();
        for (int i = 0; i < carsFilteredByPassengerSeatsNumber.size(); i++) {
            Car car = carsFilteredByPassengerSeatsNumber.get(i);
           if (car.getPassengerSeatsNumber()>3){
               filteredByPassengerSeatsNumberFirstCarShowroom.add(car);
           }
        }
        return filteredByPassengerSeatsNumberFirstCarShowroom;
    }
    public static List<Car> filterCarByPower(List<Car> carsFilteredByPower){
        List<Car> filteredByPowerCar = new ArrayList<>();
        for (int i = 0; i < carsFilteredByPower.size(); i ++){
            Car car = carsFilteredByPower.get(i);
            if (car.getPower() < 380) {
                filteredByPowerCar.add(car);
            }
        }
        return filteredByPowerCar;
    }
}
