/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coe318.lab4;

/**
 *
 * @author zelen
 */
public class Account {
    private String name;        //Instance variables
    private int number;
    private double balance;
    
    public Account(String name, int number, double initialBalance){
        this.name = name;
        this.number = number;
        this.balance = initialBalance;
    }

    public String getName(){
        return name;
    }
    
    public int getNumber(){     //3 getters to get values returned
        return number;
    }
    
    public double getBalance(){
        return balance;
    }
    
    public boolean deposit(double amount){
        if (amount == 0 || amount < 0)  //If not depositing an allowed amount of money
            return false;               //(more than $0.00) then return false
        this.balance = balance + amount;// Only add amount to balance if adding
        return true;                    // a positive, real sum of money
        }
    
    public boolean withdraw(double amount){
        if (amount <= 0 || amount > balance ) // cannot withdraw negative $
            return false;                     // and cannot withdraw more than is in balance
        this.balance = balance - amount;      // subtract amount withdrawn from balance
        return true;
    }
    
    @Override
    public String toString() {//DO NOT MODIFY
        return "(" + getName() + ", " + getNumber() + ", " + String.format("$%.2f", getBalance()) + ")";
}

    }
