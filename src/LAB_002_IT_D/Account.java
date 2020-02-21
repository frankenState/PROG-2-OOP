/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LAB_002_IT_D;

/**
 *
 * @author frank lou
 */
public class Account {
    private double balance;
    private String pin;
    
    public Account(String pin, double balance){
        this.balance = balance;
        this.pin = pin;
    }

    /**
     * @return the balance
     */
    public double getBalance() {
        return balance;
    }

    /**
     * @param balance the balance to set
     */
    public void setBalance(double balance) {
        this.balance = balance;
    }

    /**
     * @return the pin
     */
    public String getPin() {
        return pin;
    }

    /**
     * @param pin the pin to set
     */
    public void setPin(String pin) {
        this.pin = pin;
    }
    
    public String toString(){
        return "Type Account";
    }
}
