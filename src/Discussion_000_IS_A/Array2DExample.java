/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Discussion_000_IS_A;

import Discussion_001_IS_B.Person;
import java.util.Scanner;

/**
 *
 * @author frank lou
 */
public class Array2DExample {
    
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
       String[][] grades = new String[2][4];
    
        for (int i = 0; i < grades.length; i++) {
            System.out.print("Student Name: " );
            grades[i][0] = scan.next();
            System.out.print("Midterm Grade: ");
            grades[i][1] = scan.next();
            System.out.print("Final Grade: ");
            grades[i][2] = scan.next();
            double midterm = Double.parseDouble(grades[i][1]);
            double finalterm = Double.parseDouble(grades[i][2]);
            double average = (midterm + finalterm) / 2;
            grades[i][3] = String.valueOf(average);
        }
        System.out.printf("%10s%10s%10s%10s\n", 
                "Name",
                "Midterm",
                "Final",
                "Average"
        );
       for (String[] grade : grades){
           System.out.printf("%10s%10.2f%10.2f%10.2f\n",
                   grade[0],
                   Double.parseDouble(grade[1]),
                   Double.parseDouble(grade[2]),
                   Double.parseDouble(grade[3])
           );
       }
       
     
    }
}
