package com.beginning.Transport;

import java.util.Comparator;

public class MaxPowerComparator implements Comparator<Car>{
    @Override
    public int compare (Car car1, Car car2){
        return car1.getPower() - car2.getPower();
    }

}
