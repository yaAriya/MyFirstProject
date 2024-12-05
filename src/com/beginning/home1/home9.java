package com.beginning.home1;

public class home9 {
    public static void main(String[] args) {
        int[] firstArray = new int[]{3, 4, 4};
        int maxNumber = firstArray[0];
        int minNumber = firstArray[0];
        for (int i = 1; i < firstArray.length; i++) {
            if (minNumber>firstArray[i]){
                minNumber=firstArray[i];
            }
            if (maxNumber<firstArray[i]){
                maxNumber=firstArray[i];
            }
        }
        System.out.println("Минимальное число: " + minNumber);
        System.out.println("Максимальное число: " + maxNumber);
    }
}
