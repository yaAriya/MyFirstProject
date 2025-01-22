package com.beginning.searchEngine;

import com.beginning.entity.Car;

import com.beginning.entity.Plane;

import com.beginning.entity.Transport;

import java.util.List;

public class SearchEngine {
    private static final String messageForTransport = "Среди транспортов такого объекта нет";
    private static final String messageForCar = "Среди машин такого объекта нет";
    private static final String messageForPlane = "Среди самолетов нет вашего объекта";

    public static Transport findObjectByIDFromTransport(List<Transport> firstTransportShowroom, int IDOfObject){
        for(int i =0; i<firstTransportShowroom.size(); i++){
            if(firstTransportShowroom.get(i).getID() == IDOfObject){
                return firstTransportShowroom.get(i);
            }
        }
        return null;
    }

    public static Car findObjectByIDFromCars(List<Car> firstCarShowroom, int IDOfObject){
        for(int i = 0; i<firstCarShowroom.size(); i++){
            if (firstCarShowroom.get(i).getID() == IDOfObject){
                return firstCarShowroom.get(i);
            }
        }
            return null;
    }

     public static Plane findObjectByIDFromPlanes(List<Plane> firstPlaneShowroom, int IDOfObject){
     if (firstPlaneShowroom == null) return null;
        for(int i = 0; i<firstPlaneShowroom.size(); i++){
            if(firstPlaneShowroom.get(i).getID() == IDOfObject){
                return firstPlaneShowroom.get(i);
            }
        }
        return null;
     }

     public static void checkingPresenceOfFirstObjectByID(List<Transport> firstTransportShowroom, List<Car> firstCarShowroom, List<Plane> firstPlaneShowroom,int[] IDOfObjectsByUser, int IDOfFirstObjectByUser, int IDOfSecondObjectByUser){
        for(int i = 0; i<IDOfObjectsByUser.length; i++) {
            if (checkingPresenceOfObjectByIDFromTransport(firstTransportShowroom, IDOfObjectsByUser[i], messageForTransport) == 1) {
            } else {
                if (checkingPresenceOfObjectByIDFromCar(firstCarShowroom, IDOfObjectsByUser[i], messageForCar) == 1) {
                } else {
                    if (checkingPresenceOfObjectByIDFromPlane(firstPlaneShowroom, IDOfObjectsByUser[i], messageForPlane) == 1) {
                    }
                }
            }
        }
     }

     public static int  checkingPresenceOfObjectByIDFromTransport(List<Transport> transports, int IDOfObjectByUser, String message) {
         Transport firstResultForTransport = findObjectByIDFromTransport(transports, IDOfObjectByUser);
         if (firstResultForTransport != null) {
             System.out.println(firstResultForTransport);
                return 1;
         } else {
             System.out.println(message);
            return -1;
         }
     }
         public static int checkingPresenceOfObjectByIDFromCar(List<Car> cars, int IDOfObjectByUser, String message) {
             Car firstResultForCar = findObjectByIDFromCars(cars, IDOfObjectByUser);
             if (firstResultForCar != null) {
                 System.out.println(firstResultForCar);
                 return 1;
             } else {
                 System.out.println(message);
                return -1;
             }
         }

         public static int checkingPresenceOfObjectByIDFromPlane(List<Plane> planes, int IDOfObjectByUser, String message){
             Plane firstResultForPlanes = SearchEngine.findObjectByIDFromPlanes(planes, IDOfObjectByUser);
             if (firstResultForPlanes != null) {
                 System.out.println(firstResultForPlanes);
                 return 1;
             } else {
                 System.out.println(message);
                 return -1;
             }
         }
     }
