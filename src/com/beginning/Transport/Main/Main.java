package com.beginning.Transport.Main;

import com.beginning.Transport.Car.Car;

import com.beginning.Transport.Comparator.MaxPowerComparator;

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
        Comparator <Car> powerComparator = new MaxPowerComparator();
        firstCarShowroom.sort(powerComparator);
        Printer.printSortingCarsByPower(firstCarShowroom);

    }
}
