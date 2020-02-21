/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LAB_001_IT_D;
import java.util.*;
/**
 *
 * @author frank lou
 */
public class Problem2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String inputStr = scan.nextLine();
        
        CaseCounter obj1 = new CaseCounter();
        obj1.setInputString(inputStr);
        System.out.println("Input : " + obj1.getInputString());
        System.out.println("Uppercase : " + obj1.uppercaseCount());
        System.out.println("Lowercase : " + obj1.lowercaseCount());
        CaseCounter obj2 = new CaseCounter();
        System.out.println("String: " + obj2.getInputString());
        
        
    }
}
