/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Discussion_000_IS_A;

/**
 *
 * @author frank lou
 * Sana *
 */
import java.util.*;

public class Problem_5 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        
        ArrayList<String[]> allEmployees = new ArrayList<>();
        
        while (true){
            
            
            // INPUT
            System.out.print("Employee name: ");
            String name = scan.next();
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
            System.out.println("Deductions: ");
            System.out.println("\tFederal Tax (" 
                    + /** TYPE CASTING **/ (int)(federalTaxRate * 100) 
                    + ") : " 
                    + federalTax );
            System.out.println("\tState Tax (" 
                    + /** TYPE CASTING **/ (int)(stateTaxRate * 100) 
                    + ") : " 
                    + stateTax );
            System.out.println("\tTotal Deduction: " + totalDeduction);
            System.out.println("Net Pay: " + netPay);
            
           
                
            String[] employee = { name, 
                          String.valueOf(hoursWorked), 
                          String.valueOf(hourlyRate),
                          String.valueOf(grossPay),
                          String.valueOf(totalDeduction),
                          String.valueOf(netPay)
            };
            
            allEmployees.add(employee);
            
            System.out.println("Do you want to add another employee? ");
            char response = scan.next().charAt(0);
            
            if (response == 'N' || response == 'n') break;
            
        }
        
        // for-each loop
        for (String[] employee: allEmployees){
            System.out.printf("%10s%10.2f%10.2f%10.2f%10.2f%10.2f\n", 
                    employee[0], 
                    Double.parseDouble(employee[1]),
                    Double.parseDouble(employee[2]),
                    Double.parseDouble(employee[3]),
                    Double.parseDouble(employee[4]),
                    Double.parseDouble(employee[5]));
        }
        
    }
}
