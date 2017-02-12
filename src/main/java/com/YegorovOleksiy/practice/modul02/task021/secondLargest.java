package com.YegorovOleksiy.practice.modul02.task021;

/**
 * Created by Miles on 06.02.2017.
 */
public class SecondLargest {
    public static void main(String[] args) {
        int[] intArray = {1, 2, 3, 10, -5};
        double[] doubleArray = {1, 2, 3, 10, -5};

        SecondLargest mySecondLargest = new SecondLargest();

        mySecondLargest.methodSecondLargest(intArray);
        mySecondLargest.methodSecondLargest(doubleArray);

    }

    public void methodSecondLargest(int[] array) {

        int max = -2147483648;
        int max2 = -2147483648;
        for (int i = 0; i < array.length; i++) {

            if (max < array[i] ) {

                max2 = max;
                max = array[i];
            }
            if (max2 < array[i] && max != array[i] )
                max2 = array[i];

            System.out.println("Number " + (i + 1) + " = " + array[i]);
        }
        System.out.println("intMax = " + max);
        System.out.println("intMax2 = " + max2);

    }

    public void methodSecondLargest(double[] array) {

        double max = -2147483648;
        double max2 = -2147483648;
        for (int i = 0; i < array.length; i++) {


            if (max < array[i] ) {

                max2 = max;
                max = array[i];
            }
            if (max2 < array[i] && max != array[i] )
                max2 = array[i];

            System.out.println("Number " + (i + 1) + " = " + array[i]);
        }
        System.out.println("doubleMax = " + max);
        System.out.println("doubleMax2 = " + max2);

    }

}
