/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LAB_002_IS_A;

/**
 *
 * @author frank lou
 */
public class Employee extends User {
    private double hourlyRate;
    private double hoursWorked;
    
    public Employee(String name, double hourlyRate, double hoursWorked){
        super(name);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }
    
    public double getGrossPay(){
        return this.hoursWorked * this.hourlyRate;
    }

    public double getNetPay(double federalTaxRate, double stateTaxRate){
        return this.getGrossPay() - ((this.getGrossPay() * federalTaxRate ) + ( this.getGrossPay() * stateTaxRate ));
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
    
    public String toString(){
        return "Type Employee!";
    }
}
