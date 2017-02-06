package com.YegorovOleksiy.practice.modul02.task022;

/**
 * Created by Miles on 06.02.2017.
 */
public class bankCommision {
    public static void main(String[] args) {
        int balance = 100;
        double balanceAfter = 0;
        double withdrawal = 99;
        double commision = 0;
        balanceAfter = getBalanceAfter(balance, withdrawal);
        commision = withdrawal * 0.05;
        if ((balanceAfter - commision) < 0) {
            System.out.println("NO");
        }
        else
            System.out.println("OK " + commision + " " + (balanceAfter - commision));
    }

    private static int getBalanceAfter(int balance, double withdrawal) {
        double balanceAfter = balance - withdrawal;
        return (int) balanceAfter;
    }

}
