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

public class DoWhileSample {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String word = scan.next();
        String rev_word = "";
        
        int counter = word.length();
        do {
            rev_word += word.charAt(counter - 1);
            counter--;
        } while (counter > 0);
        
        if (word.equals(rev_word))
            System.out.println("The input word is a Palindrome.");
        else 
            System.out.println("Not a palindrome.");
    }
}
