/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Discussion_000_IT_C;

/**
 *
 * @author frank lou
 */
import java.util.*;

public class Problem_3 {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // INPUT
        System.out.print("Enter a string: ");
        String input = scan.nextLine();
        // PROCESS
        String output = "";
        
//        for (int i = 0; i < input.length(); i+=2)
//            output += input.charAt(i);
        
         for (int i = 0; i < input.length(); i++) 
            if ((i + 1) % 2 != 0)
               output += input.charAt(i);

        // OUTPUT
        System.out.println("The ODD position: " + output);
    }
}
