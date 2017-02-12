package com.YegorovOleksiy.practice.modul02.task021;

/**
 * Created by Miles on 06.02.2017.
 */
public class Multiplication {
    public static void main(String[] args) {
        int[] intArray = {1, 2, 3, 10, -5};
        double[] doubleArray = {1, 2, 3, 10, -5};

        Multiplication myMultiplication = new Multiplication();

        myMultiplication.methodMultiplication(intArray);
        myMultiplication.methodMultiplication(doubleArray);

    }

    private void methodMultiplication(double[] doubleArray) {

        double mult = 1;

        for (int i = 0; i < doubleArray.length; i++) {

            mult *= doubleArray[i];
            System.out.println("Number " + (i + 1) + " = " + doubleArray[i]);
        }
        System.out.println("doubleMultiplication = " + mult);

    }

    private void methodMultiplication(int[] intArray) {

        int mult = 1;

        for (int i = 0; i < intArray.length; i++) {

            mult *= intArray[i];
            System.out.println("Number " + (i + 1) + " = " + intArray[i]);
        }
        System.out.println("intMultiplication = " + mult);

    }

}
