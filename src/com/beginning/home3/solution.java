package com.beginning.home3;

public class solution {
    public static void main(String[] args) {
            Point[] data = new Point[100];
            for(int i = 0; i < data.length; i++){
                data[i]= new Point();
                printPoints(data);
            }


    } public static void printPoints(Point[] points){
                for(int i = 0; i< points.length; i++)
                    points[i].print();
                
            }
    }



