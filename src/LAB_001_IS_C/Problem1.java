/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LAB_001_IS_C;
import java.util.*;
/**
 *
 * @author frank lou
 */
public class Problem1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String inputStr = scan.nextLine();
        
        CountLetter obj1 = new CountLetter();
        obj1.setInputString(inputStr);
        System.out.println("Input String: " + obj1.getInputString());
        System.out.println("Vowel: " + obj1.getVowelCount());
        System.out.println("Consonant: " + obj1.getConsonantCount());
    }
}
