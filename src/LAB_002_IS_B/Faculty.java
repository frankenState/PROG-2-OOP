/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LAB_002_IS_B;

/**
 *
 * @author frank lou
 */
public class Faculty extends User {
   private double hourlyRate;
   private double hoursWorked;
    
   public Faculty(double hourlyRate, double hoursWorked, int id, String username, String password){
       super(id, username, password);
       this.hourlyRate = hourlyRate;
       this.hoursWorked = hoursWorked;
   }

    public double getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    public double getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(double hoursWorked) {
        this.hoursWorked = hoursWorked;
    }
    
    public double getGrosspay(){
        return this.hoursWorked * this.hourlyRate;
    }
    
    public double getNetPay(double deduction){
        return this.getGrosspay() - deduction;
    }
    @Override
    public String toString(){
        return "Faculty(Username: " + super.getUsername() + ", Password: " + this.getPassword()+ ", GrossPay: " +this.getGrosspay()+")";
    }
}
