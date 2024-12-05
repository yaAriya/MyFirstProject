package com.beginning.home2;

public class home2 {
    public static void main(String[] args) {
        int[] firstArray = new int[]{3, 4, 4};
        arrayOutput(0, firstArray);
    }

    public static void arrayOutput(int i, int[] array) {
        if (i < array.length) {
            System.out.println(array[i]);
            arrayOutput(i + 1, array);
            System.out.println(array[i]);
        }
    }
}