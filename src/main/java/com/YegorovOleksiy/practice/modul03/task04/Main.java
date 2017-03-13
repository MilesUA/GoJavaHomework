package com.YegorovOleksiy.practice.modul03.task04;

/**
 * Created by Miles on 13.03.2017.
 */
public class Main {

    public static void main(String[] args) {

        User user1 =new User("Iryna", 5000, 8, "Epam", 600, "Usd");

        user1.companyNameLenght();
        user1.paySalary(600);
        user1.withdraw(100);
        user1.monthIncreaser(7);

    }

}
