package com.beginning.home2;

public class home5 {
    public static void main(String[] args) {
        branchesDeep(0);
        branchesWide(0);
    } public static void branchesDeep(int i){
        int maxDeep = 5;
        if(i<maxDeep && i>=0){
            System.out.println("/");
            branchesDeep(i+1);
        } else if (i<0){
            System.out.println("Это отрицательное расстояние, парень");
        }
    } public static void branchesWide(int i){
        int maxWide = 4;
        String sum = " ";
        if(i<maxWide && i>=0)
        branchesWide(i+1);
        sum = sum + " ";
        System.out.print(sum + "/");

    }
}
