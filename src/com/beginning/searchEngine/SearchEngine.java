package com.beginning.searchEngine;

import com.beginning.entity.Car;

import com.beginning.entity.Plane;

import com.beginning.entity.Transport;

import java.util.List;

import static com.beginning.searchEngine.FindObjectFromCars.findObjectByIDFromCars;
import static com.beginning.searchEngine.FindObjectFromPlanes.findObjectByIDFromPlanes;
import static com.beginning.searchEngine.FindObjectFromTransport.findObjectByIDFromTransport;

public class SearchEngine {
    // private static final String messageForTransport = "Среди транспортов такого объекта нет";
    // private static final String messageForCar = "Среди машин такого объекта нет";
    // private static final String messageForPlane = "Среди самолетов нет вашего объекта";


   /*  public static void checkingPresenceOfFirstObjectByID(List<Transport> firstTransportShowroom, List<Car> firstCarShowroom, List<Plane> firstPlaneShowroom,int[] IDOfObjectsByUser, int IDOfFirstObjectByUser, int IDOfSecondObjectByUser){
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
     } */

     public static Transport checkingPresenceOfObjectByIDFromTransport(List<Transport> transports, int IDOfObjectByUser) {
         Transport firstResultForTransport = findObjectByIDFromTransport(transports, IDOfObjectByUser);
         if (firstResultForTransport != null) {
            // System.out.println(firstResultForTransport);
                return firstResultForTransport;
         } else {
            return null;
         }
     }
         public static Car checkingPresenceOfObjectByIDFromCar(List<Car> cars, int IDOfObjectByUser) {
             Car firstResultForCar = findObjectByIDFromCars(cars, IDOfObjectByUser);
             if (firstResultForCar != null) {
                // System.out.println(firstResultForCar);
                 return firstResultForCar;
             } else {
                return null;
             }
         }

         public static Plane checkingPresenceOfObjectByIDFromPlane(List<Plane> planes, int IDOfObjectByUser){
             Plane firstResultForPlanes = findObjectByIDFromPlanes(planes, IDOfObjectByUser);
             if (firstResultForPlanes != null) {
                // System.out.println(firstResultForPlanes);
                 return firstResultForPlanes;
             } else {
                 return null;
             }
         }
     }
