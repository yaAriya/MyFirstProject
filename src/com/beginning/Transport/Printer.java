package com.beginning.Transport;

import java.util.List;

public class Printer {

    public static void printFirstCarShowroom(List<Car> firstCarShowroom) {
        for (int i = 0; i < firstCarShowroom.size(); i++) {
            System.out.println("Сортировка по минимальной мощности: " + "Nᵒ" + (i+1) + ": " + firstCarShowroom.get(i));
        }
    }

    public static void printFirstPlaneShowroom(List <Plane> firstPlaneShowroom){
        for (int i=0; i< firstPlaneShowroom.size(); i++){
            System.out.println("Каталог салона самолетов: Nᵒ" + (i+1) + ": " +firstPlaneShowroom.get(i));
        }
    }
}
