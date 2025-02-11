package com.beginning.searchEngine;

import com.beginning.entity.Transport;

import java.util.List;

public class FindObjectFromTransport {
    public static Transport findObjectByIDFromTransport(List<Transport> firstTransportShowroom, int IDOfObject){
        for(int i =0; i<firstTransportShowroom.size(); i++){
            if(firstTransportShowroom.get(i).getID() == IDOfObject){
                return firstTransportShowroom.get(i);
            }
        }
        return null;
    }
}
