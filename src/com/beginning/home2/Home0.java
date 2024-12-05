package com.beginning.home2;

import java.sql.SQLOutput;

public class Home0 {
    public static void main(String[] args) {
        int result= factorial(6);
        if (result==0){
            System.out.println("Факториала такого числа нет");
        } else {
            System.out.println(result);
        }
    }

    public static int factorial(int i) {
        if (i == 0 ){
            return 1;
        } else if ( i == 1) {
            return 1;
        } else if ( i < 0) {
            return 0;
        } else {
            return i*factorial(i-1);
        }
    }
}
//(((x-1)*(x-2))*x)


