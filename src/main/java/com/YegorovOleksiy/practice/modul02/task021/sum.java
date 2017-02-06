package com.YegorovOleksiy.practice.modul02.task021;

/**
 * Created by Miles on 06.02.2017.
 */
public class sum {
    public static void main(String[] args) {
        int[] array = new int[10];
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            array[i] = getRandomInteger(100);
            sum += array[i];
            System.out.println("Number " + (i + 1) + " = " + array[i]);
        }
        System.out.println("sum = " + sum);
    }

    private static int getRandomInteger(int maxValue) {

        int randomValue = (int) (Math.random() * maxValue);

        return randomValue;
    }
}
