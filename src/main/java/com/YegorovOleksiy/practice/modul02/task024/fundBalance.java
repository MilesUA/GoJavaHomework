package com.YegorovOleksiy.practice.modul02.task024;

/**
 * Created by Miles on 06.02.2017.
 */
public class FundBalance {
    public static void main(String[] args) {

        int[] balances = {1200, 250, 2000, 500, 3200};
        String[] ownerNames = {"Jane", "Ann", "Jack", "Oww", "Lane"};

        int accountOwner = -1;
        int withdrawal = 100;
        String ownerName = "Ann";

        for (int i = 0; i < ownerNames.length; i++) {
            if (ownerName == ownerNames[i])
            {
                accountOwner = i;
                break;
            }

        }

        FundBalance myFundBalance = new FundBalance();
        myFundBalance.methodFundBalance(balances[accountOwner], ownerNames[accountOwner], withdrawal);

    }

    private void methodFundBalance(int balance, String ownerName, int withdrawal) {

        int balanceAfter = balance + withdrawal;
        System.out.println(ownerName + " " + balanceAfter);
    }


}
