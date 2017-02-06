package com.YegorovOleksiy.practice.modul02.task024;

/**
 * Created by Miles on 06.02.2017.
 */
public class fundBalance {
    public static void main(String[] args) {

        int[] balances = {1200, 250, 2000, 500, 3200};
        String[] ownerNames = {"Jane", "Ann", "Jack", "Oww", "Lane"};

        int accountOwner = -1;
        double withdrawal = 100;
        String ownerName = "Oww";

        for (int i = 0; i < ownerNames.length; i++) {
            if (ownerName == ownerNames[i])
            {
                accountOwner = i;
                break;
            }
        }

        int balance = balances[accountOwner];
        double balanceAfter = 0;

        balanceAfter = getBalanceAfter(balance, withdrawal);

        System.out.println(ownerNames[accountOwner] + " " + balanceAfter);
    }

    private static int getBalanceAfter(int balance, double withdrawal) {
        double balanceAfter = balance + withdrawal;
        return (int) balanceAfter;
    }
}
