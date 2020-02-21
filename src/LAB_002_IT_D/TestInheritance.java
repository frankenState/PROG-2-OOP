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
public class TestInheritance {
    public static void main(String[] args) {
        Loan l1 = new Loan("1991f", 15000, 50000, 9);
        System.out.println("Account Balance: " + l1.getBalance());
        System.out.println("Amount Loan: " + l1.getAmount());
        System.out.println("Monthly Interest Rate:" + l1.getMonthlyInterestRate());
        System.out.println("Annual Interest: " + l1.getAnnualInterest());
        System.out.println("Monthly Interest: " + l1.getMonthlyInterest());
        System.out.printf("Monthly Payment: %5.2f\n", l1.getMonthlyPayment());
        
    }
}
