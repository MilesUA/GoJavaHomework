package com.YegorovOleksiy.practice.modul02.task021;

/**
 * Created by Miles on 06.02.2017.
 */
public class MinMax {
    public static void main(String[] args) {
        int[] intArray = {1, 2, 3, 10, -5};
        double [] doubleArray = {1, 2, 3, 10, -5};

        MinMax myMinMax = new MinMax();

        myMinMax.methodMinMax(intArray);
        myMinMax.methodMinMax(doubleArray);

    }

    private void methodMinMax(double[] doubleArray) {

        double min = 2147483647;
        double max = -2147483648;

        for (int i = 0; i < doubleArray.length; i++) {

            if (max < doubleArray[i])
                max = doubleArray[i];
            if (min > doubleArray[i])
                min = doubleArray[i];

            System.out.println("Number " + (i + 1) + " = " + doubleArray[i]);
        }
        System.out.println("doubleMin = " + min);
        System.out.println("doubleMax = " + max);

    }

    private void methodMinMax(int[] intArray) {

        int min = 2147483647;
        int max = -2147483648;

        for (int i = 0; i < intArray.length; i++) {

            if (max < intArray[i])
                max = intArray[i];
            if (min > intArray[i])
                min = intArray[i];

            System.out.println("Number " + (i + 1) + " = " + intArray[i]);
        }
        System.out.println("intMin = " + min);
        System.out.println("intMax = " + max);

    }


}
