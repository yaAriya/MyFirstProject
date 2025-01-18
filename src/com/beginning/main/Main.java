package com.beginning.main;

import com.beginning.entity.Transport;

import com.beginning.filter.CarFilter;

import com.beginning.comporator.MinCarPassengerSeatsComparator;

import com.beginning.comporator.MinCarPowerComparator;

import com.beginning.entity.Plane;

import com.beginning.searchEngine.SearchEngine;

import com.beginning.printer.Printer;

import com.beginning.entity.Car;

import com.beginning.initializer.TransportInitializer;

import java.util.Comparator;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        TransportInitializer transportInitializer = new TransportInitializer();

        List<Car> firstCarShowroom = transportInitializer.initializerCar();
        List<Plane> firstPlaneShowroom = transportInitializer.initializerPlane();

        Printer.printFirstCarShowroom(firstCarShowroom);
        Printer.printFirstPlaneShowroom(firstPlaneShowroom);

        Comparator<Car> minCarPowerComparator = new MinCarPowerComparator();
        firstCarShowroom.sort(minCarPowerComparator);
        Printer.printSortingCarsByPower(firstCarShowroom);

        Comparator<Car> minCarPassegerSeatsNumberComparator = new MinCarPassengerSeatsComparator();
        firstCarShowroom.sort(minCarPassegerSeatsNumberComparator);
        Printer.printSortingCarsByPassengerSeats(firstCarShowroom);

        List<Car> carsFilteredByPassengerSeatsNumber = CarFilter.filterCarByPassengerSeatsNumber(firstCarShowroom);
        Printer.printCarFilterByPassengerSeatsNumber(carsFilteredByPassengerSeatsNumber);

        List<Car> carsFilteredByPower = CarFilter.filterCarByPower(firstCarShowroom);
        Printer.printCarFilterByPower(carsFilteredByPower);

        List<Transport> firstTransportShowroom = transportInitializer.initializerTransport();
        Printer.printFirstTransportShowroom(firstTransportShowroom);

        int IDOfObject = 134;
        int resultForTransport = SearchEngine.findIndexOfObjectFromTransport(firstTransportShowroom, IDOfObject);
        if(resultForTransport>-1){
            System.out.println(firstTransportShowroom.get(resultForTransport));
        } else {
            System.out.println("Среди транспортов такого объекта нет");
            int resultForCars = SearchEngine.findIndexOfObjectFromCars(firstCarShowroom, IDOfObject);
            if (resultForCars > -1) {
                System.out.println(firstCarShowroom.get(resultForCars));
            } else {
                System.out.println("Среди машин такого объекта нет");
                int resultForPlanes = SearchEngine.findIndexOfObjectFromPlanes(firstPlaneShowroom, IDOfObject);
                if (resultForPlanes > -1) {
                    System.out.println(firstPlaneShowroom.get(resultForPlanes));
                } else {
                    System.out.println("Среди самолетов такого объекта нет");
                }
            }
        }
    }
}
