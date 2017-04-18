package com.YegorovOleksiy.practice.modul04.task01;

/**
 * Created by Miles on 11.04.2017.
 */
public class EUBank extends Bank {
    public EUBank(long id, String bankCountry, Currency currency, int numberOfEmployees,
                  double avrSalaryOfEmployee, long rating, long totalCapital) {
        super(id, bankCountry, currency, numberOfEmployees, avrSalaryOfEmployee,
                rating, totalCapital);
    }

    @Override
    int getLimitOfWithdrawal() {
        int withdrawal = 0;
        if (getCurrency().equals(Currency.USD)){
            withdrawal =2000;
        }
        else if (getCurrency().equals(Currency.EUR)){
            withdrawal = 2200;
        }
        return withdrawal;
    }

    @Override
    int getLimitOfFunding() {
        int limitOfFunding = 2147483647;
        if (getCurrency().equals(Currency.EUR)){
            limitOfFunding = 20000;
        }
        else if (getCurrency().equals(Currency.USD)){
            limitOfFunding = 10000;
        }
        return limitOfFunding;
    }

    @Override
    int getMonthlyRate() {
        int monthlyRate = 0;
        if (getCurrency().equals(Currency.USD)){
            monthlyRate = 0;
        }
        else if (getCurrency().equals(Currency.EUR)){
            monthlyRate = 1;
        }
        return monthlyRate;
    }

    @Override
    int getCommission(int summ) {
        int commission = 0;
        if (getCurrency().equals(Currency.USD)){
            if (summ < 1000){
                commission = 5;
            }
            else {
                commission = 7;
            }
        }
        else if (getCurrency().equals(Currency.EUR)){
            if (summ < 1000){
                commission = 2;
            }
            else {
                commission = 4;
            }
        }
        return commission;
    }
}
