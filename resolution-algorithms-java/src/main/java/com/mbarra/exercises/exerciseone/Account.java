package com.mbarra.exercises.exerciseone;

public class Account {

    //Attributes
    private String headline ;
    private double amount;

    //Constructors

    /*
    When a parameter is said to be "optional" in the context of constructors, it means that it
    is not necessary to provide a value for that parameter when creating an instance of the class.
    If no specific value is provided for an optional parameter, a default value is used.
     */

    public Account(String headline) {
        this.headline = headline;
        this.amount= 0;
    }

    public Account(String headline , double amount) {
        this.headline  = headline ;
        if (amount < 0) {
            this.amount = 0;
        } else {
            this.amount = amount;
        }
    }



    public String getHeadline() {
        return headline;
    }

    public void setHeadline(String headline) {
        this.headline = headline;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "Account{" +
                "headline='" + headline + '\'' +
                ", amount=" + amount +
                '}';
    }


    public void deposit(double amount)
    {
        if(amount>0)
            this.amount += amount;
    }

    public void withdraw(double amount)
    {
        if(this.amount-amount<0)
            this.amount = 0;
        else
            this.amount -= amount;
    }
}