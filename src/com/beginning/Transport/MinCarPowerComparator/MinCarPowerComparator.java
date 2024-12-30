package com.beginning.Transport.MinCarPowerComparator;

import com.beginning.Transport.Car.Car;

import java.util.Comparator;

public class MinCarPowerComparator implements Comparator<Car>{
    @Override
    public int compare (Car car1, Car car2){
        return car1.getPower() - car2.getPower();
    }

}
