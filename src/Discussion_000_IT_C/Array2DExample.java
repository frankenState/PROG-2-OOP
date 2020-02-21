/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Discussion_000_IT_C;
import java.util.*;
/**
 *
 * @author frank lou
 */
public class Array2DExample {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        String[][] grades = new String[3][4];
        
        for (String grade[] : grades){
            System.out.print("Student Name: ");
            grade[0] = scan.next();
            
            System.out.print("Midterm Grade: ");
            double midGrade = scan.nextDouble();
            // the type DOUBLE was converted to STRING
            grade[1] = String.valueOf(midGrade);
            System.out.print("Final Grade: ");
            
            double finGrade = scan.nextDouble();
            grade[2] = String.valueOf(finGrade);
            
            double average = (midGrade + finGrade) / 2;
            grade[3] = String.valueOf(average);
        }
        
        System.out.printf("%10s%10s%10s%10s%10s\n", 
                "Name", "Midterm","Final","Average", "Remarks"
        );
        
        int passed = 0, failed = 0;
        for (String grade[] : grades){
            String remarks = 
                    Double.parseDouble(grade[3]) > 75 ? 
                    "PASSED" : "FAILED";
            System.out.printf("%10s%10.2f%10.2f%10.2f%10s\n",
                    grade[0],
                    Double.parseDouble(grade[1]),
                    Double.parseDouble(grade[2]),
                    Double.parseDouble(grade[3]),
                    remarks
            );
            if (remarks.equals("PASSED")) passed++;
            else failed++;
        }
        System.out.println("# of PASSED: " + passed);
        System.out.println("# of FAILED: " + failed);
        
    }
}
