package com.beginning.searchEngine;

import com.beginning.entity.Car;

import java.util.List;

public class FindObjectFromCars {
    public static Car findObjectByIDFromCars(List<Car> firstCarShowroom, int IDOfObject){
        for(int i = 0; i<firstCarShowroom.size(); i++){
            if (firstCarShowroom.get(i).getID() == IDOfObject){
                return firstCarShowroom.get(i);
            }
        }
        return null;
    }
}
