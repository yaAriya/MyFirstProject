package com.beginning.home1;

public class home3 {
    public static void main(String[] args) {
        int[] randomArray = {10,6,4,8};
        int counter = 0;
        for (int i=1; i<4; i++) {
         if (randomArray[i] > randomArray[i-1]){
            counter++;
        }
        } System.out.println(counter);
    }
}
