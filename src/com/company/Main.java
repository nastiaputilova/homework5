package com.company;

public class Main {

    public static void main(String[] args) {
	// 1/2 задача

        int [] array = new int [] {1,2,3};
        for (int i = 0; i < array.length - 1; i ++) {
            System.out.print(array[i] + ",");
        }
        System.out.print(array [array.length - 1]);

        System.out.println();

        double [] arrayTwo = new double [] {1.57, 7.654, 9.986};
        for (int i = 0; i < arrayTwo.length - 1; i ++) {
            System.out.print(arrayTwo[i] + ",");
        }
        System.out.print(arrayTwo [arrayTwo.length - 1] );

        System.out.println();

        int [] arrayThree = new int [] {1, 2, 5, 10, 25, 50};
        for (int i = 0; i < arrayThree.length - 1; i ++) {
            System.out.print(arrayThree[i] + ",");
        }
        System.out.print(arrayThree [arrayThree.length - 1] );

        System.out.println();

    // 3 задача

        int [] arrayFour = new int [] {1,2,3};
        for (int i = arrayFour.length - 1; i >= 0 ; i--) {
            System.out.print(arrayFour[i] + ",");
        }
        System.out.print(arrayFour [arrayFour.length - 1]);

        System.out.println();

        double [] arrayFive = new double [] {1.57, 7.654, 9.986};
        for (int i = arrayFive.length - 1; i >= 0 ; i--) {
            System.out.print(arrayFive[i] + ",");
        }
        System.out.print(arrayFive [arrayFive.length - 1] );

        System.out.println();

        int [] arraySix = new int [] {1, 2, 5, 10, 25, 50};
        for (int i = arraySix.length - 1; i >= 0 ; i--) {
            System.out.print(arraySix[i] + ",");
        }
        System.out.print(arraySix [arraySix.length - 1] );

        System.out.println();

    // 4 задача

        int [] arraySeven = new int [] {1,2,3};
        for (int i = 0; i < arraySeven.length; i++) {
            if (i == arraySeven[arraySeven.length % 2]) {
                System.out.print(arraySeven[i] + 1);
            } else {
                System.out.print(arraySeven[i] + ",");
            }
        }














    }
}
