/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package intro;

/**
 *
 * @author frank lou
 */
import java.util.*;

public class Problem1 {
    
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Enter a string : ");
        String text = scan.nextLine();
        
        String[] vowels = "AEIOUaeiou".split("");
        String[] consonants = "BCDFGHJKLMNPQRSTVWXYZbcdfghjklmnpqrstvwxyz".split("");
        
        int vowels_cnt = 0, consonants_cnt = 0;
        
        for (int i = 0; i < text.length(); i++) {
            for (String vowel : vowels) 
                if ((String.valueOf(text.charAt(i))).equals(vowel)) {
                    vowels_cnt++;
                    break;
                }
            
            for (String consonant : consonants)
                if ((String.valueOf(text.charAt(i)).equals(consonant))){
                    consonants_cnt++;
                    break;
                }
          
        }
        System.out.println("The number of vowels is " + vowels_cnt);
        System.out.println("The number of consonants is " + consonants_cnt);
    }
    
}
