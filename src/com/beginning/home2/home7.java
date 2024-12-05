package com.beginning.home2;

public class home7 { // сумма последовательных чисел через цикл
    public static void main(String[] args) {
        int firsNumber = 6;
        int sum = 0;
        for (int i = 0; i <= firsNumber; i++) {
            sum = sum + i;
        }
        System.out.println(sum);
    }

}
