package com.YegorovOleksiy.practice.modul02.task021;

/**
 * Created by Miles on 06.02.2017.
 */
public class Sum {
    public static void main(String[] args) {

        int[] intArray = {1, 2, 3, 10, -5};
        double[] doubleArray = {1, 2, 3, 10, -5};

        Sum mySum = new Sum();
        
        mySum.methodSum(intArray);
        mySum.methodSum(doubleArray);

    }

    public void methodSum(double[] doubleArray) {

        double doubleSum = 0;
        for (int i = 0; i < doubleArray.length; i++) {

            doubleSum += doubleArray[i];
            System.out.println("Number " + (i + 1) + " = " + doubleArray[i]);
        }

        System.out.println("DoubleSum = " + doubleSum);

    }

    public void methodSum(int[] intArray) {

        int intSum = 0;
        for (int i = 0; i < intArray.length; i++) {

            intSum += intArray[i];
            System.out.println("Number " + (i + 1) + " = " + intArray[i]);
        }

        System.out.println("IntSum = " + intSum);

    }

}
