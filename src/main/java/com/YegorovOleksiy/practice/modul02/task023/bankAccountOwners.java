package com.YegorovOleksiy.practice.modul02.task023;

/**
 * Created by Miles on 06.02.2017.
 */
public class bankAccountOwners {
    public static void main(String[] args) {

        int[] balances = {1200, 250, 2000, 500, 3200};
        String[] ownerNames = {"Jane", "Ann", "Jack", "Oww", "Lane"};

        int accountOwner = -1;
        double withdrawal = 300;
        String ownerName = "Ann";

        for (int i = 0; i < ownerNames.length; i++) {
            if (ownerName == ownerNames[i])
            {
                accountOwner = i;
                break;
            }
        }

        bankAccountOwners myBankAccountOwners = new bankAccountOwners();
        myBankAccountOwners.methodBankAccountOwners(balances[accountOwner], ownerNames[accountOwner], withdrawal);

    }

    private void methodBankAccountOwners(int balance, String ownerName, double withdrawal) {

        double comission = withdrawal * 0.05;
        double balanceAfter = balance - withdrawal - comission;

        if (balanceAfter < 0) {
            System.out.println(ownerName + " " + "NO");
        } else
            System.out.println(ownerName + " " + withdrawal + " " + balanceAfter);
    }

}
