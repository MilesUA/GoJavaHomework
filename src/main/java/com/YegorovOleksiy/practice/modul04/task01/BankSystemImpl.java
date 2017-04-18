package com.YegorovOleksiy.practice.modul04.task01;

/**
 * Created by Miles on 11.04.2017.
 */
public class BankSystemImpl implements BankSystem {


    @Override
    public void withdrawOfUser(User user, int amount) {
        double newBalance;
        if (amount > user.getBank().getLimitOfWithdrawal()){
            System.out.println("Ліміт для знятия перевищено.");

        }
        else if (user.balance < (user.getBank().getCommission(amount)/100 + amount)){
            System.out.println("Недостатньо коштів на рахунку.");

        }
        else {
            newBalance = user.balance - (amount + user.getBank().getCommission(amount)/100);
            user.setBalance(newBalance);
            System.out.println("Залишок " + newBalance);
        }

    }

    @Override
    public void fundUser(User user, int amount) {
        double newBalance;
        if (amount > user.getBank().getLimitOfFunding()){
            System.out.println("Ліміт поповнення перевищено.");
        }
        else {
            newBalance = user.balance + amount;
            user.setBalance(newBalance);
            System.out.println("Поповнено. На рахунку: " + newBalance);
        }
    }

    @Override
    public void transferMoney(User fromUser, User toUser, int amount) {
        double newBalanceFromUser;
        double newBalanceToUzer;
        double limitFrom = fromUser.getBank().getLimitOfWithdrawal();
        double balance = fromUser.balance;
        if (limitFrom > amount){
            System.out.println("Ліміт для знятия перевищено.");
        }
        else if (balance < amount){
            System.out.println("Недостатньо коштів на рахунку.");
        }
        else if (fromUser != toUser){
            fromUser.withdrawOfUser(fromUser, amount);
            toUser.fundUser(toUser,amount);
        }
    }

    @Override
    public void paySalary(User user) {

        double balance = user.getBalance() + user.getSalary();

        user.setBalance(balance);

        System.out.println("You get salary: " + user.getSalary() + "; Actual balance: " + balance);

    }
}
