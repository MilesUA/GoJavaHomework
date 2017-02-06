package com.YegorovOleksiy.practice.modul02.task023;

/**
 * Created by Miles on 06.02.2017.
 */
public class bankAccountOwners {
    public static void main(String[] args) {

        int[] balances = {1200, 250, 2000, 500, 3200};
        String[] ownerNames = {"Jane", "Ann", "Jack", "Oww", "Lane"};

        int accountOwner = 3;
        double withdrawal = 490;

        int balance = balances[accountOwner];
        double balanceAfter = 0;
        double commision = 0;

        balanceAfter = getBalanceAfter(balance, withdrawal);
        commision = withdrawal * 0.05;
        if (balanceAfter  < 0) {
            System.out.println(ownerNames[accountOwner] + " " + "NO");
        }
        else
            System.out.println(ownerNames[accountOwner] + " " + withdrawal + " " + balanceAfter);
    }

    private static int getBalanceAfter(int balance, double withdrawal) {
        double comission = withdrawal * 0.05;
        double balanceAfter = balance - withdrawal - comission;
        return (int) balanceAfter;
    }
}
