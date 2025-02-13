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

        Scanner scanner = new Scanner(System.in);
      // int[] IDOfObjectsByUser = new int[2];// Подумать как вписать кол-во вызовов nextInt
        System.out.println("Введите ID первого объекта, который Вы бы хотели сравнить");
        int IDOfFirstObjectByUser = scanner.nextInt();
       // IDOfObjectsByUser[0] = IDOfFirstObjectByUser;
        System.out.println("Введите ID второго объекта, который Вы бы хотели сравнить");
        int IDOfSecondObjectByUser = scanner.nextInt();
       // IDOfObjectsByUser[1] = IDOfSecondObjectByUser;
        scanner.close();


        if (SearchEngine.checkingPresenceOfObjectByIDFromTransport(firstTransportShowroom, IDOfFirstObjectByUser) != null) {
            Printer.printFirstObjectByIDFromTransport(SearchEngine.checkingPresenceOfObjectByIDFromTransport(firstTransportShowroom, IDOfFirstObjectByUser));// вызываем печатник и передаем туда объект найденный нами + сообщение из поисковика
        } else {
            if (SearchEngine.checkingPresenceOfObjectByIDFromCar(firstCarShowroom, IDOfFirstObjectByUser) != null) {
                Printer.printFirstObjectByIDFromCar(SearchEngine.checkingPresenceOfObjectByIDFromCar(firstCarShowroom, IDOfFirstObjectByUser));
            } else {
                if (SearchEngine.checkingPresenceOfObjectByIDFromPlane(firstPlaneShowroom, IDOfFirstObjectByUser) != null) {
                    Printer.printFirstObjectByIDFromPlane(SearchEngine.checkingPresenceOfObjectByIDFromPlane(firstPlaneShowroom, IDOfFirstObjectByUser));
                } else {
                    System.out.println("Увы объект по вашему ID не найден");
                }
            }
        }
    }
}
