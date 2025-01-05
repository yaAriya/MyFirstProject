package com.beginning.filter;

import com.beginning.entity.Car;

import java.util.ArrayList;

import java.util.List;

public class CarFilter {
    public static List<Car> filterCarByPassengerSeatsNumber(List<Car> carsFilteredByPassengerSeatsNumber) {

        List<Car> filteredByPassengerSeatsNumberFirstCarShowroom= new ArrayList<>();
        for (int i = 0; i < carsFilteredByPassengerSeatsNumber.size(); i++) {
            Car counter = carsFilteredByPassengerSeatsNumber.get(i);
           if (counter.getPassengerSeatsNumber()>3){
               filteredByPassengerSeatsNumberFirstCarShowroom.add(counter);
           }
        }
        return filteredByPassengerSeatsNumberFirstCarShowroom;
    }
}
