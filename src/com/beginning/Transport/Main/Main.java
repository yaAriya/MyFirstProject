package com.beginning.Transport.Main;

import com.beginning.Transport.Car.Car;

import com.beginning.Transport.CarFilter.CarFilter;

import com.beginning.Transport.MinCarPowerComparator.MinCarPowerComparator;

import com.beginning.Transport.MinCarPassengerSeatsComparator.MinCarPassengerSeatsComparator;

import com.beginning.Transport.Plane.Plane;

import com.beginning.Transport.Printer.Printer;

import com.beginning.Transport.TransportInitializer.TransportInitializer;

import java.util.Comparator;

import java.util.List;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException{
        TransportInitializer transportInitializer = new TransportInitializer();

        List <Car> firstCarShowroom = transportInitializer.initializerCar();
        List <Plane> firstPlaneShowroom = transportInitializer.initializerPlane();

        Printer.printFirstCarShowroom(firstCarShowroom);
        Printer.printFirstPlaneShowroom(firstPlaneShowroom);

        Comparator <Car> minCarPowerComparator = new MinCarPowerComparator();
        firstCarShowroom.sort(minCarPowerComparator);
        Printer.printSortingCarsByPower(firstCarShowroom);

        Comparator <Car> minCarPassegerSeatsNumberComparator = new MinCarPassengerSeatsComparator();
        firstCarShowroom.sort(minCarPassegerSeatsNumberComparator);
        Printer.printSortingCarsByPassengerSeats(firstCarShowroom);

        List <Car> filteredByPassengerSeatsNumberFirstCarShowroom = CarFilter.CarFilterByPassengerSeatsNumber(firstCarShowroom);
        Printer.printCarFilterByPassengerSeatsNumber(filteredByPassengerSeatsNumberFirstCarShowroom);

    }
}
