package com.beginning.printer;

import com.beginning.entity.Plane;

import com.beginning.entity.Car;

import java.util.List;

public class Printer {

    public static void printFirstCarShowroom (List<Car> firstCarShowroom){
        for (int i = 0; i < firstCarShowroom.size(); i++ ){
            System.out.println("Каталог салона машин: Nᵒ" + (i+1) + ": " +firstCarShowroom.get(i));
        }
    }

    public static void printFirstPlaneShowroom(List <Plane> firstPlaneShowroom){
        for (int i=0; i < firstPlaneShowroom.size(); i++){
            System.out.println("Каталог салона самолетов: Nᵒ" + (i+1) + firstPlaneShowroom.get(i));
        }
    }

    public static void printSortingCarsByPower(List<Car> firstCarShowroom) {
        for (int i = 0; i < firstCarShowroom.size(); i++) {
            System.out.println("Сортировка машин по минимальной мощности: " + "Nᵒ" + (i+1) + ": " + firstCarShowroom.get(i));
        }
    }

    public static void printSortingCarsByPassengerSeats(List <Car> firstCarShowroom){
        for(int i = 0; i < firstCarShowroom.size(); i++) {
            System.out.println("Сортирока машин по минимальному количеству сидений : Nᵒ" + (i + 1) + ": " + firstCarShowroom.get(i));
        }
    }

    public static void  printCarFilterByPassengerSeatsNumber(List<Car> carsFilteredByPassengerSeatsNumber){
        for(int i = 0; i < carsFilteredByPassengerSeatsNumber.size(); i++){
            System.out.println("Сортировка машин по минимальному количеству сидений с заданным параметром : Nᵒ" + (i + 1) + ": " + carsFilteredByPassengerSeatsNumber.get(i));
        }
    }
}
