package com.beginning.home1;

public class home4 {
    public static void main(String[] args) {
        int[] randomArray = {1, 6, 9, 4, 0, 4};
        for (int i = 0; i < randomArray.length / 2; i++) {
            int additionalVariable = randomArray[randomArray.length - 1 - i];
            randomArray[randomArray.length - 1 - i] = randomArray[i];
            randomArray[i] = additionalVariable;
        }
        for (int i = 0; i < randomArray.length / 2; i++) {
            System.out.println(randomArray[i]);
            System.out.println(randomArray[randomArray.length - 1 - i]);
        }
    }

    public class workout {
        public static void main(String[] args) {
            int[] randomArray = new int[100];
            for (int i = 0; i <= randomArray.length - 1; i++) {
                int Variable = randomArray[randomArray.length - 1 - i];
                randomArray[randomArray.length - 1 - i] = randomArray[i];
                randomArray[randomArray.length - 1 - i] = Variable;
                System.out.println(randomArray[i]);
                System.out.println(randomArray[randomArray.length - i]);
            }
        }
    }
}





