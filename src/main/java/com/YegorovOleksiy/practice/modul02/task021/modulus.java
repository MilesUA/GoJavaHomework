package com.YegorovOleksiy.practice.modul02.task021;

/**
 * Created by Miles on 06.02.2017.
 */
public class modulus {
    public static void main(String[] args) {
        int[] array = new int[10];
        int modul = 0;
        int firsl = 0;
        int last = 0;
        for (int i = 0; i < array.length; i++) {
            array[i] = getRandomInteger(100);
            if (i == 0) {
                firsl = array[i];
                System.out.println("Number " + (i + 1) + " = " + array[i]);
            }
            if (i == (array.length - 1)) {
                last = array[i];
                System.out.println("Number " + (i + 1) + " = " + array[i]);
            }

        }
        modul = firsl % last;
        System.out.println("modulus = " + modul);
    }

    public static int getRandomInteger(int maxValue) {

        int randomValue = (int) (Math.random() * maxValue);

        return randomValue;
    }
}
