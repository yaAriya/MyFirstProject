package com.beginning.printer;

import com.beginning.entity.Plane;

import com.beginning.entity.Car;

import com.beginning.entity.Transport;
import org.w3c.dom.ls.LSOutput;

import java.util.List;

public class Printer {
    private static final String firstCarShowroomMessage = "Каталог салона машин: Nᵒ%s: %s";
    private static final String firstPlaneShowroomMessage = "Каталог салона самолетов: Nᵒ%s: %s";
    private static final String carsSortingByPowerMessage = "Сортировка машин по минимальной мощности: Nᵒ%s: %s";
    private static final String carsSortingByPassengerSeatsMessage = "Сортирока машин по минимальному количеству сидений: Nᵒ%s: %s";
    private static final String carsFilteredByPassengerSeatsNumberMessage = "Сортировка машин по минимальному количеству сидений с заданным параметром: Nᵒ%s: %s";
    private static final String carsFilteredByPowerMessage = "Сортировка машин по минимальной мощности с заданным параметром: Nᵒ%s: %s";
    private static final String firstTransportShowroomMessage = "Каталог салона транспортов: Nᵒ%s: %s";
    private static final String messageForFirstObjectByIDFromTransport = "Первый объект для сравнения - транспорт";
    private static final String messageForFirstObjectByIDFromCar = "Первый объект для сравнения - машина";
    private static final String messageForFirstObjectByIDFromPlane = "Первый объект для сравнения - самолет";

    /*public static void printComparingCarAndTransport(List<Car> firstCarShowroom, List<Transport> firstTransportShowroom) {
        for (int i= 0; i<){
            if (firstCar.equals(firstTransport)) {
                System.out.println("Equal");
            } else {
                System.out.println("Not equal");
            }
        }
        System.out.println((firstCar.equals(firstTransport)));
    }
*/
    public static void printFirstCarShowroom (List<Car> firstCarShowroom){
        printCars(firstCarShowroom, firstCarShowroomMessage);
    }

    public static void printFirstPlaneShowroom(List <Plane> firstPlaneShowroom){
        printPlane(firstPlaneShowroom, firstPlaneShowroomMessage);
    }

    public static void printFirstTransportShowroom(List<Transport> firstTransportShowroom){
        printTransport(firstTransportShowroom, firstTransportShowroomMessage);
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

    public static void printFirstObjectByIDFromTransport(Transport searchResult){
        printObjectFromTransport(searchResult,messageForFirstObjectByIDFromTransport);
    }

    public static void printFirstObjectByIDFromCar(Car searchResult){
        printObjectFromCar(searchResult,messageForFirstObjectByIDFromCar);
    }

    public static void printFirstObjectByIDFromPlane(Plane searchResult){
        printObjectFromPlane(searchResult,messageForFirstObjectByIDFromPlane);
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
    private static void printTransport(List<Transport> transports, String message){
        for (int i = 0; i < transports.size(); i++){
            System.out.println(String.format(message, i+1, transports.get(i)));
        }
    }

    private static void printObjectFromTransport(Transport searchResult, String messageForFirstObjectByIDFromTransport){
        System.out.println(messageForFirstObjectByIDFromTransport + ": " + searchResult);
    }

    private static void printObjectFromCar(Car searchResult, String messageForFirstObjectByIDFromCar){
        System.out.println(messageForFirstObjectByIDFromCar + ": " + searchResult);
    }

    private static void printObjectFromPlane(Plane searchResult, String messageForFirstObjectByIDFromPlane){
        System.out.println(messageForFirstObjectByIDFromPlane + ": " + searchResult);
    }

}