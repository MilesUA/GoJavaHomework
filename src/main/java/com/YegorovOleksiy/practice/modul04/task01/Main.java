package com.YegorovOleksiy.practice.modul04.task01;

/**
 * Created by Miles on 14.04.2017.
 */
public class Main {

    public static void main(String[] args) {

        Bank usBankUSD = new USBank(1001, "Canada", Currency.USD, 12, 1222, 12345, 12554889);
        Bank usBankEUR = new USBank(1002, "USA", Currency.EUR, 10, 1224, 12348, 12554819);

        Bank euBankUSD = new EUBank(1003, "Germany", Currency.USD, 20, 1522, 12845, 12586889);
        Bank euBankEUR = new EUBank(1004, "Poland", Currency.EUR, 15, 1822, 12864, 12587189);

        Bank chinaBankUSD = new ChinaBank(1005, "China", Currency.USD, 20, 1622, 12885, 16386889);
        Bank chinaBankEUR = new ChinaBank(1006, "Japan", Currency.EUR, 25, 1652, 16885, 16259589);

        User user1 = new User(2001, "Alex", 2000, 15, "Samsung", 1000, euBankEUR);
        User user2 = new User(2002, "Evgen", 12000, 60, "Epam", 3000, euBankUSD);
        User user3 = new User(2003, "Oleg", 15000, 50, "SoftServe", 2800, usBankUSD);
        User user4 = new User(2004, "Alexander", 3500, 55, "Luxoft", 3200, euBankUSD);
        User user5 = new User(2005, "Dmitriy", 6000, 65, "TAS", 2000, chinaBankEUR);
        User user6 = new User(2006, "Iryna", 2000, 25, "Epam", 1000, chinaBankUSD);

        user1.withdrawOfUser(user1, 200);
        System.out.println();
        user2.fundUser(user2, 500);
        System.out.println();
        user3.transferMoney(user3, user4, 250);
        System.out.println();
        user5.paySalary(user5);
        user6.paySalary(user6);


    }

}
