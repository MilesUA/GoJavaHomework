package com.YegorovOleksiy.practice.modul02.task022;

/**
 * Created by Miles on 06.02.2017.
 */
public class BankCommission {
    public static void main(String[] args) {

        int balance = 100;
        int withdrawal = 80;

        BankCommission myBankCommission = new BankCommission();
        myBankCommission.methodBankCommission(balance, withdrawal);

    }

    private void methodBankCommission(int balance, int withdrawal) {

        double commission = withdrawal * 0.05;
        double balanceAfter = balance - withdrawal - commission;

        if (balanceAfter < 0) {
            System.out.println("NO ");
        }

        else {
            System.out.println("OK " + commission + " " + balanceAfter);
        }

    }

}
