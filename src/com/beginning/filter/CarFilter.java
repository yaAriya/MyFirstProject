package com.beginning.filter;

import com.beginning.entity.Car;

import java.util.ArrayList;

import java.util.List;

public class CarFilter {
    public static List<Car> CarFilterByPassengerSeatsNumber(List<Car> firstCarShowroom) {

        List<Car> filteredByPassengerSeatsNumberFirstCarShowroom = new ArrayList<>();

        for (int i = 0; i < firstCarShowroom.size(); i++) {
            Car counter = firstCarShowroom.get(i);
           if (counter.getPassengerSeatsNumber()>4){
               filteredByPassengerSeatsNumberFirstCarShowroom.add(firstCarShowroom.get(i));
           }
        }
        return filteredByPassengerSeatsNumberFirstCarShowroom;
    }
}
