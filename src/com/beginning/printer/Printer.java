package com.beginning.printer;

import com.beginning.entity.Plane;

import com.beginning.entity.Car;

import java.util.List;

public class Printer {
    private static final String firstCarShowroomMessage = "Каталог салона машин: Nᵒ%s: %s";
    private static final String firstPlaneShowroomMessage = "Каталог салона самолетов: Nᵒ%s: %s";
    private static final String carsSortingByPowerMessage = "Сортировка машин по минимальной мощности: Nᵒ%s: %s";
    private static final String carsSortingByPassengerSeatsMessage = "Сортирока машин по минимальному количеству сидений: Nᵒ%s: %s";
    private static final String carsFilteredByPassengerSeatsNumberMessage = "Сортировка машин по минимальному количеству сидений с заданным параметром: Nᵒ%s: %s";
    private static final String carsFilteredByPowerMessage = "Сортировка машин по минимальной мощности с заданным параметром: Nᵒ%s: %s";

    public static void printFirstCarShowroom (List<Car> firstCarShowroom){
        printCars(firstCarShowroom, firstCarShowroomMessage);
    }

    public static void printFirstPlaneShowroom(List <Plane> firstPlaneShowroom){
        printPlane(firstPlaneShowroom, firstPlaneShowroomMessage);
    }

    public static void printSortingCarsByPower(List<Car> carsSortingByPower) {
        printCars(carsSortingByPower, carsSortingByPowerMessage);
    }

    public static void printSortingCarsByPassengerSeats(List <Car> carsSortingByPassengerSeats){
        printCars(carsSortingByPassengerSeats, carsSortingByPassengerSeatsMessage);
    }

    public static void printCarFilterByPassengerSeatsNumber(List<Car> carsFilteredByPassengerSeatsNumber){
        printCars(carsFilteredByPassengerSeatsNumber, carsFilteredByPassengerSeatsNumberMessage);
    }

    public static void printCarFilterByPower(List<Car> carsFilteredByPower){
        printCars(carsFilteredByPower, carsFilteredByPowerMessage);
    }

    private static void printCars(List<Car> cars, String message){
        for (int i = 0; i < cars.size(); i++ ){
            System.out.println(String.format(message, i+1, cars.get(i)));
        }
    }

    private static void printPlane(List<Plane> planes, String message){
        for(int i = 0; i < planes.size(); i++){
            System.out.println(String.format(message, i + 1, planes.get(i)));
        }
    }

   /* public static void printFirstCarShowroom (List<Car> firstCarShowroom){
        for (int i = 0; i < firstCarShowroom.size(); i++ ){
            System.out.println("Каталог салона машин: Nᵒ" + (i+1) + ": " +firstCarShowroom.get(i));
        }
    }

    public static void printFirstPlaneShowroom(List <Plane> firstPlaneShowroom){
        for (int i=0; i < firstPlaneShowroom.size(); i++){
            System.out.println("Каталог салона самолетов: Nᵒ" + (i+1) + firstPlaneShowroom.get(i));
        }
    }

    public static void printSortingCarsByPower(List<Car> carsSortingByPower) {
        for (int i = 0; i < carsSortingByPower.size(); i++) {
            System.out.println("Сортировка машин по минимальной мощности: " + "Nᵒ" + (i+1) + ": " + carsSortingByPower.get(i));
        }
    }

    public static void printSortingCarsByPassengerSeats(List <Car> carsSortingByPassengerSeats){
        for(int i = 0; i < carsSortingByPassengerSeats.size(); i++) {
            System.out.println("Сортирока машин по минимальному количеству сидений : Nᵒ" + (i + 1) + ": " + carsSortingByPassengerSeats.get(i));
        }
    }

    public static void printCarFilterByPassengerSeatsNumber(List<Car> carsFilteredByPassengerSeatsNumber){
        for(int i = 0; i < carsFilteredByPassengerSeatsNumber.size(); i++){
            System.out.println("Сортировка машин по минимальному количеству сидений с заданным параметром : Nᵒ" + (i + 1) + ": " + carsFilteredByPassengerSeatsNumber.get(i));
        }
    }

    public static void printCarFilterByPower(List<Car> carsFilteredByPower){
        for (int i = 0; i < carsFilteredByPower.size(); i ++){
            System.out.println("Сортировка машин по минимальной мощности с заданным параметром : Nᵒ" + (i + 1) + ": " + carsFilteredByPower.get(i));
        }
    }*/
}
