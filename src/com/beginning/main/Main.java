package com.beginning.main;

import com.beginning.entity.Transport;

import com.beginning.filter.CarFilter;

import com.beginning.comporator.MinCarPassengerSeatsComparator;

import com.beginning.comporator.MinCarPowerComparator;

import com.beginning.entity.Plane;

import com.beginning.printer.Printer;

import com.beginning.entity.Car;

import com.beginning.initializer.TransportInitializer;

import java.util.Comparator;

import java.util.List;

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

        //Car theFirstCar = new Car(4, 200,"Blue","Lada","petrol",4, 2);
        //Transport theFirstTransport = new Transport(4,400,"White","Lada", "petrol", 8);

        /*if(firstCar.equals(firstTransport)){
            System.out.println("Equal");
        } else{
            System.out.println("Not equal");
        }
        System.out.println((firstCar.equals(firstTransport)));
    }
        //Printer.printComparingFirstCarAndFirstTransport(firstCarShowroom,firstTransportShowroom);
        firstTransport.equals(firstCar);
    }*/
    }
}
