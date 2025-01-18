package com.beginning.searchEngine;

import com.beginning.entity.Car;

import com.beginning.entity.Plane;

import com.beginning.entity.Transport;

import java.util.List;

public class SearchEngine {

    public static int findIndexOfObjectFromTransport(List<Transport> firstTransportShowroom, int IDOfObject){
        for(int i =0; i<firstTransportShowroom.size(); i++){
            if(firstTransportShowroom.get(i).getID() == IDOfObject){
                return i;
            }
        }
        return -1;
    }

    public static int findIndexOfObjectFromCars(List<Car> firstCarShowroom, int IDOfObject){
        for(int i = 0; i<firstCarShowroom.size(); i++){
            if (firstCarShowroom.get(i).getID() == IDOfObject){
                return i;
            }
        }
            return -1;
    }

     public static int findIndexOfObjectFromPlanes(List<Plane> firstPlaneShowroom, int IDOfObject){
        for(int i = 0; i<firstPlaneShowroom.size(); i++){
            if(firstPlaneShowroom.get(i).getID() == IDOfObject){
                return i;
            }
        }
        return -1;
     }
}
