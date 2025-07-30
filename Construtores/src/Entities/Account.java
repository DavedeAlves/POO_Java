/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entities;

/**
 *
 * @author Davede faiska
 */
public class Account {
    private Integer number;
    private String holder;
    private Double balance = 0.0;

    public Account() {
    }

    public Account(Integer number, String holder) {
        this.number = number;
        this.holder = holder;
    }

    public Account(Integer number, String holder, Double initialDeposit){
        this.number = number;
        this.holder = holder;
        deposit(initialDeposit);
    }

    public Integer getNumber() {
        return number;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public Double getBalance() {
        return balance;
    }

    public void deposit(double amount){
        this.balance += amount;
    }
    
    public void withdraw(double amount){
        this.balance -= amount + 5.0;
    }
    
    public String toString(){
        return "Account " + this.number
           + ", Holder: " + this.holder
           + ", Balance: $ " + String.format("%.2f", balance);
    }
    
}
