package com.beginning.home2;

public class work1 { //
    public static void main(String[] args) {
        branchDistance(0);
    }
    public static void branchDistance(int n) {
        String enter = " ";
        System.out.println("#");
        if (n > 0) {
            System.out.print("#" + enter);
            branchDistance(n - 1);
        }
    }
}





