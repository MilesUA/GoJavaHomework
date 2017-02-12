package com.YegorovOleksiy.practice.modul02.task021;

/**
 * Created by Miles on 06.02.2017.
 */
public class MaxPositive {
    public static void main(String[] args) {
        int[] intArray = {1, 2, 3, 10, -5};
        double [] doubleArray = {1, 2, 3, 10, -5};

        MaxPositive myMaxPositive = new MaxPositive();

        myMaxPositive.methodMaxPositive(intArray);
        myMaxPositive.methodMaxPositive(doubleArray);

    }

    private void methodMaxPositive(double[] doubleArray) {

        double max = -2147483648;
        for (int i = 0; i < doubleArray.length; i++) {

            if (max < doubleArray[i])
                max = doubleArray[i];

            System.out.println("Number " + (i + 1) + " = " + doubleArray[i]);
        }

        System.out.println("maxDouble = " + max);

    }

    private void methodMaxPositive(int[] intArray) {

        int max = -2147483648;
        for (int i = 0; i < intArray.length; i++) {

            if (max < intArray[i])
                max = intArray[i];

            System.out.println("Number " + (i + 1) + " = " + intArray[i]);
        }

        System.out.println("maxInt = " + max);

    }


}
