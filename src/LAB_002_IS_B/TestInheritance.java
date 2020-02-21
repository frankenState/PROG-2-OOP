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
public class TestInheritance {
    public static void main(String[] args) {
        Faculty f1 = new Faculty(50, 40, 30, "jane", "Password");
        System.out.println("Hourly Rate: " + f1.getHourlyRate());
        System.out.println("Hours Worked: " + f1.getHoursWorked());
        System.out.println("Gross Pay: " + f1.getGrosspay());
        System.out.println("Net Pay: " + f1.getNetPay(-371.21));
        System.out.println(f1);
    }
}
