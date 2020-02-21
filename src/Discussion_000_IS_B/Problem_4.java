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

public class Problem_4 {
    
    public static void main(String[] args){
        // declare a scanner object for input
        Scanner scan = new Scanner(System.in);
        // declare an integer array with 4 elements
        int num[] = new int[4];
        
        System.out.print("Enter 4 integers: ");
        for (int i = 0; i < num.length; i++) 
            num[i] = scan.nextInt();
        
        Arrays.sort(num);
        
        // for-each loop
        //for (int i : num ) System.out.print(i+ " ");
        
        System.out.println("High: " + num[num.length - 1]);
        System.out.println("Low: " + num[0]);
        
        int nums[] = new int[12];
        int grades[][] = new int[3][3];
       
        
        
    }
    
}
