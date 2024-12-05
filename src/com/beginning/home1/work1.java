package com.beginning.home1;

public class work1 {
    public static void main(String[] args) {
        int[] firstArray = new int[]{3, 4, 4};
        int maxNumber = firstArray[0];
        int minNumber = firstArray[0];
        for (int i = 1; i < firstArray.length; i++) {
           if (minNumber>firstArray[i]){
               minNumber=firstArray[i];
           }
        }
        for (int i = 1; i < firstArray.length; i++) {
            if (maxNumber<firstArray[i]){
                maxNumber=firstArray[i];
            }
        }

        for (int element : firstArray){
            System.out.println(element);
        }
        System.out.println("Минимальное число: " + minNumber);
        System.out.println("Максимальное число: " + maxNumber);
    }
}



