package com.beginning.Transport.MinPassengerSeatsComparator;

import java.util.Comparator;

import com.beginning.Transport.Car.Car;

public class MinPassengerSeatsComparator implements Comparator<Car> {

    public int compare(Car car1, Car car2){
     return car1.getPassengerSeatsNumber()- car2.getPassengerSeatsNumber();
    }
}
