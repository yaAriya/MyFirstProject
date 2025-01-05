package com.beginning.initializer;

import com.beginning.entity.Plane;

import com.beginning.entity.Car;

import java.util.ArrayList;

import java.util.List;

public class TransportInitializer implements Cloneable {
    public List <Car> initializerCar(){
        List<Car> firstCarShowroom = new ArrayList();

        Car firstCar = new Car(4, 5, "black", "Audi", "petrol", 5, 4);
        Car secondCar =  new Car(4, 85, "grey", "BMW", "diesel", 4, 2);
        Car thirdCar = new Car(4, 300, "White", "Mercedes", "electricity", 5, 4);

        firstCarShowroom.add(firstCar);
        firstCarShowroom.add(thirdCar);
        firstCarShowroom.add(secondCar);

        return firstCarShowroom;
    }
    public List <Plane> initializerPlane() throws CloneNotSupportedException{
        List <Plane> firstPlaneShowroom = new ArrayList();

        Plane firstPlane = new Plane(2, 390, "white", "Belavia", "petrol", 40, 2, 4, 4 );
        Plane secondPlane =  new Plane(2, 360, "blue", "Belavia", "petrol", 45, 2, 4, 4 );
        Plane thirdPlane = secondPlane.clone();

        firstPlaneShowroom.add(firstPlane);
        firstPlaneShowroom.add(secondPlane);
        firstPlaneShowroom.add(thirdPlane);

            return firstPlaneShowroom;
    }
    protected Object clone() throws CloneNotSupportedException{
        return super.clone();
    }
}
