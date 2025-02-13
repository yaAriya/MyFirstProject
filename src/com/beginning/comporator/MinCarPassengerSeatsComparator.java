package com.beginning.comporator;

import java.util.Comparator;

import com.beginning.entity.Car;

public class MinCarPassengerSeatsComparator implements Comparator<Car> {

    public int compare(Car car1, Car car2){
     return car1.getPassengerSeatsNumber()- car2.getPassengerSeatsNumber();
    }
}
