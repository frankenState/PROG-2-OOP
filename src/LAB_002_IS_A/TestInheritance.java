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
public class TestInheritance {
    public static void main(String[] args) {
        Employee e1 = new Employee("Jane Doe", 50, 40);
        System.out.println("Hourly Rate: " + e1.getHourlyRate());
        System.out.println("Hours Worked: " + e1.getHoursWorked());
        System.out.println("Gross Pay: " + e1.getGrossPay());
        System.out.println("Net Pay: " + e1.getNetPay(0.10, 0.10));
        System.out.println(e1);
        User s1 = new User("John Doe");
        System.out.println(s1);
    }
}
