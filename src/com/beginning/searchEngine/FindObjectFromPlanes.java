package com.beginning.searchEngine;

import com.beginning.entity.Plane;

import java.util.List;

public class FindObjectFromPlanes {
    public static Plane findObjectByIDFromPlanes(List<Plane> firstPlaneShowroom, int IDOfObject){
        if (firstPlaneShowroom == null) return null;
        for(int i = 0; i<firstPlaneShowroom.size(); i++){
            if(firstPlaneShowroom.get(i).getID() == IDOfObject){
                return firstPlaneShowroom.get(i);
            }
        }
        return null;
    }
}
