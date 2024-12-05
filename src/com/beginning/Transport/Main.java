package com.beginning.Transport;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
public class Main implements Cloneable {
    public static void main(String[] args) throws CloneNotSupportedException{
        List <Car> firstCarShowroom = new ArrayList();
        List <Plane> firstPlaneShowroom = new ArrayList();
        ArrayList<Car> secondCarShowroom = new ArrayList<>();
        //firstCarShowroom.add(new Car(4, 5, "black", "Audi", "petrol", 5, 4));
        //firstCarShowroom.add(new Car(4, 85, "grey", "BMW", "diesel", 4, 2));
        //firstCarShowroom.add(new Car(4, 300, "White", "Mercedes", "electricity", 5, 4));
        Car firstCar = new Car(4, 5, "black", "Audi", "petrol", 5, 4);
        Car secondCar =  new Car(4, 85, "grey", "BMW", "diesel", 4, 2);
        Car thirdCar = new Car(4, 300, "White", "Mercedes", "electricity", 5, 4);
        firstCarShowroom.add(firstCar);
        firstCarShowroom.add(thirdCar);
        firstCarShowroom.add(secondCar);

        //firstPlaneShowroom.add(new Plane(2, 390, "white", "Belavia", "petrol", 40, 2, 4, 4 ));
        //firstPlaneShowroom.add(new Plane(2, 360, "blue", "Belavia", "petrol", 45, 2, 4, 4 ));
        //firstPlaneShowroom.add(new Plane(2, 420, "yellow", "Belavia", "petrol", 50, 2, 4, 4 ));
        Plane firstPlane = new Plane(2, 390, "white", "Belavia", "petrol", 40, 2, 4, 4 );
        Plane secondPlane =  new Plane(2, 360, "blue", "Belavia", "petrol", 45, 2, 4, 4 );
        Plane thirdPlane = secondPlane.clone();
       // Plane thirdPlane = new Plane(2, 420, "yellow", "Belavia", "petrol", 50, 2, 4, 4 );
        firstPlaneShowroom.add(firstPlane);
        firstPlaneShowroom.add(secondPlane);
        firstPlaneShowroom.add(thirdPlane);


        Comparator <Car> powerComparator = new MaxPowerComparator();
        firstCarShowroom.sort(powerComparator);
        Printer.printFirstCarShowroom(firstCarShowroom);
        Printer.printFirstPlaneShowroom(firstPlaneShowroom);
    }
}
