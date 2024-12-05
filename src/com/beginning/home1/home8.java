package com.beginning.home1;

public class home8 {
    public static void main(String[] args) {
        int[] firstArray =new int [] {3,4,4};
        double sum = 0;
        double arithmeticMeanr = 0.0;
        for(int i=0;i<firstArray.length; i++){
            sum =sum + firstArray[i];
        }
        arithmeticMeanr= sum/firstArray.length;
        System.out.println(arithmeticMeanr);
    }
}
