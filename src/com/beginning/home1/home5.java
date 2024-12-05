package com.beginning.home1;

public class home5 {
    public static void main(String[] args) {
        int[] firstArray = new int[]{3,2,1,4,6,4,8,9};
        int[] secondArray = new int[firstArray.length * 2];
        System.out.println("Вывод элементов 1 массива:");
        for (int i = 0; i <= firstArray.length - 1; i++) {
            System.out.print(firstArray[i]);
        }
        System.out.println("\nВывод элементов 2 массива: ");
        for (int i = 0; i < firstArray.length; i++) {
            secondArray[i]= firstArray[i];
            secondArray[i+firstArray.length]= firstArray[i];
        }
        for (int i = 0; i < secondArray.length; i++)
            System.out.print(secondArray[i]);
    }
}
