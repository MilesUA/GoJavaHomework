package com.YegorovOleksiy.practice.modul02.task021;

/**
 * Created by Miles on 06.02.2017.
 */
public class Modulus {
    public static void main(String[] args) {

        int[] intArray = {1, 2, 3, 10, -5};
        double[] doubleArray = {1, 2, 3, 10, -5};

        Modulus myModulus = new Modulus();

        myModulus.methodModulus(intArray);
        myModulus.methodModulus(doubleArray);

    }

    private void methodModulus(double[] doubleArray) {

        double doubleModul = 0;
        double first = 0;
        double last = 0;

        for (int i = 0; i < doubleArray.length; i++) {

            if (i == 0) {
                first = doubleArray[i];
                System.out.println("FirstNumber " + (i + 1) + " = " + doubleArray[i]);
            }
            if (i == (doubleArray.length - 1)) {
                last = doubleArray[i];
                System.out.println("LastNumber " + (i + 1) + " = " + doubleArray[i]);
            }

        }
        doubleModul = first % last;
        System.out.println("doubleModulus = " + doubleModul);

    }

    private void methodModulus(int[] intArray) {

        int intModul = 0;
        int first = 0;
        int last = 0;

        for (int i = 0; i < intArray.length; i++) {

            if (i == 0) {
                first = intArray[i];
                System.out.println("FirstNumber " + (i + 1) + " = " + intArray[i]);
            }
            if (i == (intArray.length - 1)) {
                last = intArray[i];
                System.out.println("LastNumber " + (i + 1) + " = " + intArray[i]);
            }

        }
        intModul = first % last;
        System.out.println("intModulus = " + intModul);

    }

}
