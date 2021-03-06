package com.YegorovOleksiy.practice.modul03.task04;

/**
 * Created by Miles on 06.03.2017.
 */
public class User {

    private String name;
    private int balance;
    private int monthsOfEmployment;
    private String companyName;
    private int salary;
    private String currency;

    private final double commission5 = 0.05;
    private final double commission10 = 0.1;

    public User(String name, int balance, int monthsOfEmployment, String companyName, int salary, String currency) {
        this.name = name;
        this.balance = balance;
        this.monthsOfEmployment = monthsOfEmployment;
        this.companyName = companyName;
        this.salary = salary;
        this.currency = currency;
    }

    public void paySalary(int salary) {
        balance += salary;
        System.out.println("Balance after pay salary " + balance);
    }

    public void withdraw(int summ) {

        if (summ < 1000) {
            balance -= (summ * commission5 + summ);
        } else {
            balance -= (summ * commission10 + summ);
        }
        if (balance < 0) {
            System.out.println("Not enough balance to make a withdrawal.");
        } else
        System.out.println("Balance after withdraw " + balance);
    }

    public void companyNameLenght() {
        int length = companyName.length();
        System.out.println("Company name letdth " + length);
    }

    public void monthIncreaser(int addMonth) {
        monthsOfEmployment += addMonth;
        System.out.println("Month of employment " + monthsOfEmployment);
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public int getMonthsOfEmployment() {
        return monthsOfEmployment;
    }

    public void setMonthsOfEmployment(int monthsOfEmployment) {
        this.monthsOfEmployment = monthsOfEmployment;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }
}
