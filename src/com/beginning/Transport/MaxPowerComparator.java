package com.beginning.Transport;

import java.util.Comparator;

public class MaxPowerComparator implements Comparator<Car>{
    @Override
    public int compare (Car o1, Car o2){
        return o1.getPower() - o2.getPower();
    }

}
