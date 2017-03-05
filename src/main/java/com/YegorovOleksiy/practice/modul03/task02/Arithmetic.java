package com.YegorovOleksiy.practice.modul03.task02;

/**
 * Created by Miles on 05.03.2017.
 */
public class Arithmetic {

    private int a;
    private int b;


   public static void main(String[] args) {

       Arithmetic arithmetic = new Arithmetic();
       Adder adder = new Adder(arithmetic.a, arithmetic.b);

        System.out.println("Sum = " + arithmetic.add(8, 5));
        System.out.println("a > b ? It is " + adder.check(arithmetic.a, arithmetic.b) );

    }

    public Arithmetic() {
    }

    public Arithmetic(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public static int add(int a, int b){
        int sum = a + b;

        return sum;
    }


}
