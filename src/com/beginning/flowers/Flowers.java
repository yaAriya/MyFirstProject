package com.beginning.flowers;

import java.util.ArrayList;

public class Flowers {
    public int size;
    public String color;
    //public String humidity;
    public int price;
    //public Flower(int i, String red, int i1) {

    public Flowers (int size, String color, int price){
            this.size = size;
            this.color = color;
            this.price = price;
    }

    public static void main(String[] args) {
      ArrayList <Flowers> firstBunchOfFlowers = new ArrayList <>(3);
      ArrayList <Flowers> secondBunchOfFlowers = new ArrayList<>();
      ArrayList <Flowers> thirdBunchOfAFlowers = new ArrayList<>();
       Flowers rose = new Flowers (10,"red",4);
        System.out.println(rose.color);
       Flowers peony = new Flowers (8, "pink", 3);
       Flowers geranium = new Flowers (9,"green",2);
        // firstBunchOfFlowers.add(rose);
       //firstBunchOfFlowers.add(peony);
       //firstBunchOfFlowers.add(geranium);
        //Collections.sort(firstBunchOfFlowers);
    }


    /*public void print(Flower rose, Flower peony,  Flower geranium, Flower[] firstBunchOfFlowers){ //Или можно сделать через геттер, чтобы он возвращал это массив
        for(int i = 0; i < firstBunchOfFlowers.length; i++)
        System.out.println(ArrayList firstBunchOfFlowers.get(i));
        // System.out.println("В первый букет для цветов вошли: "  + "Во второй букет цветов вошли: " + "В третий букет цветов вошли: ")
    }*/
}
