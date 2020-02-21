/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package intro;

import java.util.Scanner;

/**
 *
 * @author frank lou
 */
public class Problem3 {
    public static void main(String[] args){
         Scanner scan = new Scanner(System.in);
        
        System.out.print("Enter a string : ");
        String text = scan.nextLine();
        
        String output = "";
        for (int i = 0; i < text.length(); i++) 
            if ((i+1) % 2 != 0) output += text.charAt(i);
        
        System.out.println("The ODD position characters: " + output);
        
    }
}
