/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Discussion_000_IT_D;
import java.util.*;
/**
 *
 * @author frank lou
 */
public class Problem_5 {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        // INPUT
        System.out.print("Name: " + (int)'a');
        String name = scan.nextLine();
        System.out.print("Hours Worked: ");
        double hoursWorked = scan.nextDouble();
        System.out.print("Hourly Rate: ");
        double hourlyRate = scan.nextDouble();
        System.out.print("Federal Tax Rate: ");
        double federalTaxRate = scan.nextDouble();
        System.out.print("State Tax Rate: ");
        double stateTaxRate = scan.nextDouble();
        
        // PROCESS
        double grossPay = hoursWorked * hourlyRate;
        double federalTax = grossPay * federalTaxRate;
        double stateTax = grossPay * stateTaxRate;
        double totalDeduction = federalTax + stateTax;
        double netPay = grossPay - totalDeduction;
        
        // OUTPUT
        System.out.println("Name: " + name);
        System.out.println("Hours Worked: " + hoursWorked);
        System.out.println("Hourly Rate: " + hourlyRate);
        System.out.println("Gross Pay: " + grossPay);
        System.out.println("Deductions:");
        System.out.println("\tFederal Tax (" +
                (int)(federalTaxRate*100) +"): " + federalTax);
        System.out.println("\tState Tax (" + 
                (int)(stateTaxRate*100) +"): " + stateTax);
        System.out.println("\tTotal Deduction " + totalDeduction);
        System.out.println("NetPay: " + netPay);
        
    }
    
}
