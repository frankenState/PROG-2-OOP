/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Discussion_000_IS_C;
import java.util.*;
/**
 *
 * @author frank lou
 */
public class Problem_1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        // INPUT
        System.out.print("Enter a word: ");
        String word = scan.nextLine().toUpperCase();
        
        // PROCESS
        int consonants = 0, vowels = 0;
        for (int i = 0; i < word.length(); i++) {
            char letter = word.charAt(i);
            
            if (letter == 'A' || 
                letter == 'E' || 
                letter == 'I' ||
                letter == 'O' || 
                letter == 'U'){
                vowels++;
            } else if (letter > 'A' && letter <= 'Z'){
                consonants++;
            }
        }
        // OUTPUT
        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);
    }
}
