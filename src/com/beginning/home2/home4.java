package com.beginning.home2;

public class home4 {// все натуральные числа от 1 до n

    public static void main(String[] args) {
        adjuster(5);
    }
    public static void adjuster(int n) {
        if (n > 0) {
            adjuster(n - 1);
            System.out.println(n);
        } else if (n < 0) {
            System.out.println("Упс, это не натуральное число");
        }

    }
}



