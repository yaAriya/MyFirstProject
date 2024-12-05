package com.beginning.home2;

public class home1 {
    public static void main(String[] args) {
        int initialNumber = 9;
        if (initialNumber == 0) {
            System.out.println(1);
        } else if (initialNumber < 0) {
            System.out.println("упс, такого факториала нет");
        } else if (initialNumber == 1) {
            System.out.println(1);
        } else {
            int factorial = initialNumber;
            for (int i = (initialNumber - 1); i > 1; i--) {
                factorial = factorial * i;
            }
            System.out.println("Факториал числа = " + factorial);
        }
    }
}
