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
import javax.swing.JOptionPane;

public class GradeEquivalent {
    public static void main(String[] args){
       // 90 - 100  = 1.0
       // 80 - 89   = 2.0
       // 77 - 79   = 2.5
       // 75 - 76   = 3.0
       //  < 74     = 5.0
       Scanner scan = new Scanner(System.in);
       System.out.print("Enter the numeric grade: ");
       int grade = scan.nextInt();
       
       double equivGrade = 0.0;
       
       if (grade >= 90 && grade <= 100)
           equivGrade = 1.0;
       else if (grade >= 80 && grade <= 89)
           equivGrade = 2.0;
       else if (grade >= 77 && grade <= 79)
           equivGrade = 2.5;
       else if (grade >= 75 && grade <= 76)
           equivGrade = 3.0;
       else if (grade <= 74)
           equivGrade = 5.0;
           

           
       System.out.println("The Equivalent Grade for "
                    + grade 
                    + " = " 
               + equivGrade);
                       // conditional expression
       String remark = (grade < 75) ? "FAILED":"PASSED";
       System.out.println("Remarks: " + remark);
       
       try {
           int num = Integer.parseInt("asdfa");
           System.out.println("Num: " + num);
       } catch (Exception error){
        //   error.printStackTrace();
           System.out.println("ERROR: " + error.getMessage());
           JOptionPane.showMessageDialog(null, 
                   error.getMessage(),
                   "ERROR", 
                   JOptionPane.ERROR_MESSAGE);
    
       }
    }
}
