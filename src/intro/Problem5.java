/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package intro;

/**
 *
 * @author frank lou
 */
import java.util.*;

public class Problem5 {
    
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Enter employee's name: ");
        String name = scan.next();
        
        System.out.print("Enter number of hours worked in a week: ");
        int hours_worked = scan.nextInt();
        
        System.out.print("Enter hourly pay rate: ");
        double hourly_pay = scan.nextDouble();
        
        System.out.print("Enter federal tax withholding rate: ");
        double federal_tax = scan.nextDouble();
        
        System.out.print("Enter state tax withholding rate: ");
        double state_tax = scan.nextDouble();
        
        System.out.println("\nEmployee Name: " + name);
        System.out.println("Hours Worked: " + hours_worked);
        System.out.println("Pay Rate: " + hourly_pay);
        
        double gross_pay = (hours_worked * hourly_pay);
        System.out.println("Gross Pay: " + gross_pay);
        System.out.println("Deductions:");
        
        double federal_withholding_tax = (double)((hours_worked * hourly_pay) * federal_tax);
        System.out.println("\tFederal Withholding (" + (int)(federal_tax * 100) + "): " + federal_withholding_tax);
        
        double state_withholding_tax = (double)((hours_worked * hourly_pay) * state_tax);
        System.out.println("\tState Withholding (" + (int)(state_tax * 100) + "): " + state_withholding_tax);
        
        double total_deduction = federal_withholding_tax + state_withholding_tax;
        System.out.println("\tTotal Deduction: " + total_deduction );
        System.out.println("Net Pay: " + (gross_pay - total_deduction));
        
    }

}
