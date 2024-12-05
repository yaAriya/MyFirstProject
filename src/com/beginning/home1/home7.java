package com.beginning.home1;

public class home7 {
    public static void main(String[] args) {
        int[] firstArray = new int[]{3,2,1,0};
        int[] secondArray = new int[firstArray.length * 3];
        System.out.println("Вывод элементов 1 массива:");
        for (int i = 0; i < firstArray.length; i++) {
            System.out.print(firstArray[i]);
        }
        System.out.println("\nВывод элементов 2 массива: ");
        for (int i = 0; i < firstArray.length; i++) {
            secondArray[i]= firstArray[i];
            secondArray[i+firstArray.length]= firstArray[firstArray.length-1-i];
            secondArray[i+firstArray.length*2]= firstArray[i];
        }
        for (int i = 0; i < secondArray.length; i++)
            System.out.print(secondArray[i]);
    }
}
