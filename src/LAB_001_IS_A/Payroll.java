/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LAB_001_IS_A;
import java.util.*;
/**
 *
 * @author frank lou
 */
public class Payroll {

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the hoursWorked
     */
    public double getHoursWorked() {
        return hoursWorked;
    }

    /**
     * @param hoursWorked the hoursWorked to set
     */
    public void setHoursWorked(double hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    /**
     * @return the hourlyRate
     */
    public double getHourlyRate() {
        return hourlyRate;
    }

    /**
     * @param hourlyRate the hourlyRate to set
     */
    public void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    /**
     * @return the federalTaxRate
     */
    public double getFederalTaxRate() {
        return federalTaxRate;
    }

    /**
     * @param federalTaxRate the federalTaxRate to set
     */
    public void setFederalTaxRate(double federalTaxRate) {
        this.federalTaxRate = federalTaxRate;
    }

    /**
     * @return the stateTaxRate
     */
    public double getStateTaxRate() {
        return stateTaxRate;
    }

    /**
     * @param stateTaxRate the stateTaxRate to set
     */
    public void setStateTaxRate(double stateTaxRate) {
        this.stateTaxRate = stateTaxRate;
    }
    // Properties
    private String name;
    private double hoursWorked;
    private double hourlyRate;
    private double federalTaxRate;
    private double stateTaxRate;
    // class constructor
    public Payroll(){
        System.out.println("constructor was executed");
    }
    
    public double getGrossPay(){
        double grossPay = 
                this.hoursWorked * 
                this.hourlyRate;
        return grossPay;
    }
    
    public void getInput(){
        Scanner scan = new Scanner(System.in);        
        System.out.print("Name: ");
        this.name = scan.next();
        System.out.print("Hours Worked: ");
        this.hoursWorked = scan.nextDouble();
        System.out.print("Hourly Rate: ");
        this.hourlyRate = scan.nextDouble();
        System.out.print("Federal Tax Rate: ");
        this.federalTaxRate = scan.nextDouble();
        System.out.print("State Tax Rate: ");
        this.stateTaxRate = scan.nextDouble();
    }
    
    public void print(){
        System.out.println("Name: "
                + this.getName());
        System.out.println("Hours Worked: "
                + this.getHoursWorked());
        System.out.println("Hourly Rate: "
                + this.getHourlyRate());
        System.out.println("Gross Pay: "
                + this.getGrossPay() );
        System.out.println("Deductions: ");
        System.out.println("\tFederal Tax: " + this.getFederalTax());
        System.out.println("\tState Tax: " + this.getStateTax() );
        System.out.println("\tTotal Deduction: " 
                + (this.getFederalTax() + this.getStateTax()));
        System.out.println("Net Pay: " + this.getNetPay());
    }
    
    public double getFederalTax(){
        double federalTax = 
                this.getGrossPay() * this.federalTaxRate;
        return federalTax;
    }
    public double getStateTax(){
        return this.getGrossPay() * this.stateTaxRate;
    }
    public double getNetPay(){
        double netPay = this.getGrossPay()
                - (this.getFederalTax() + this.getStateTax());
        return netPay;
    }
}
