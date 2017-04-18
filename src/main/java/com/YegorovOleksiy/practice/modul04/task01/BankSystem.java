package com.YegorovOleksiy.practice.modul04.task01;

/**
 * Created by Miles on 11.04.2017.
 */
public interface BankSystem {

    void withdrawOfUser(User user, int amount);
    void fundUser(User user, int amount);
    void transferMoney(User fromUser, User toUser, int amount);
    void paySalary(User user);

}
