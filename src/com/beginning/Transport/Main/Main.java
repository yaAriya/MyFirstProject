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

        List <Plane> firstPlaneShowroom = transportInitializer.initializerPlane();
        for(int i =0; i<firstPlaneShowroom.size(); i++) {
            System.out.println("Первый массив самолетов " + (i+1) + ": " +  transportInitializer.initializerPlane() );
        }

        List <Car> firstCarShowroom = transportInitializer.initializerCar();
        for (int i=0; i<firstPlaneShowroom.size(); i ++) {
            System.out.println("Первый массив машин "+(i+1)+ ": "+ transportInitializer.initializerCar());
        }

        Comparator <Car> powerComparator = new MaxPowerComparator();
        firstCarShowroom.sort(powerComparator);
        Printer.printFirstCarShowroom(firstCarShowroom);
        Printer.printFirstPlaneShowroom(firstPlaneShowroom);
    }
}
