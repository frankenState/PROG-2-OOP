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
public class Loan extends Account {
    private double amount;
    private double monthlyInterestRate;
    
    public Loan(String pin, double balance, double amount, double monthlyInterestRate){
        super(pin, balance);
        this.amount = amount;
        this.monthlyInterestRate = monthlyInterestRate / 100;
    }
    
    public double getMonthlyInterest(){
        return this.amount * this.monthlyInterestRate;
    }
    
    public double getAnnualInterest(){
        return this.getMonthlyInterest() * 12;
    }
    
    public double getMonthlyPayment(){
        return ( this.amount / 12 ) + this.getMonthlyInterest();
    }

    /**
     * @return the amount
     */
    public double getAmount() {
        return amount;
    }

    /**
     * @param amount the amount to set
     */
    public void setAmount(double amount) {
        this.amount = amount;
    }

    /**
     * @return the monthlyInterestRate
     */
    public double getMonthlyInterestRate() {
        return monthlyInterestRate;
    }

    /**
     * @param monthlyInterestRate the monthlyInterestRate to set
     */
    public void setMonthlyInterestRate(double monthlyInterestRate) {
        this.monthlyInterestRate = monthlyInterestRate / 100;
    }
    
    public String toString(){
        return "Type Loan";
    }
    
}
