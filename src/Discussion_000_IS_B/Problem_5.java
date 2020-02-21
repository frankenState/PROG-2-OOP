/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Discussion_000_IS_B;

/**
 *
 * @author frank lou
 */
import java.util.*;
public class Problem_5 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        // INPUT
        System.out.print("Enter the employee's name: ");
        String name = scan.next();
        System.out.print("Enter the hours worked in a week: ");
        double hoursWorked = scan.nextDouble();
        System.out.print("Pay rate: ");
        double payRate = scan.nextDouble();
        System.out.print("Federal Tax : ");
        double federalTaxRate = scan.nextDouble();
        System.out.print("State Tax: ");
        double stateTaxRate = scan.nextDouble();
        
        // PROCESS
        double grossPay = hoursWorked * payRate;
        double federalTax = grossPay * federalTaxRate;
        double stateTax = grossPay *  stateTaxRate;
        double deduction = federalTax + stateTax;
        double netPay = grossPay - deduction;
        
        // OUTPUT
        System.out.println("Name: " + name );
        System.out.println("Hours Worked: " + hoursWorked);
        System.out.println("Pay Rate: " + payRate);
        System.out.println("Gross Pay: " + grossPay);
        System.out.println("Deductions:");
        System.out.println("\tFederal Tax (" + (int)(federalTaxRate*100)  +") : " + federalTax);
        System.out.println("\tState Tax (" + (int)(stateTaxRate*100) + ") : " + stateTax);
        System.out.println("\tTotal Deduction: " + deduction);
        System.out.println("NetPay: " + netPay);
        System.out.println("The equivalent integer for 'A' : " + (int)'A');
    }
}
