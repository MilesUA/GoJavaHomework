package com.YegorovOleksiy.practice.modul03.task02;

/**
 * Created by Miles on 05.03.2017.
 */
public class Adder extends Arithmetic {


    public Adder(int a, int b) {
        super(a, b);
    }

    public static boolean check(int a, int b) {

        if (a >= b){
            return (true);
        }

        return (false);
    }
}
