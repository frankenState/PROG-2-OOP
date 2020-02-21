/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Discussion_000_IT_D;
import java.util.*;
/**
 *
 * @author frank lou
 */
public class Problem_2 {
    public static void main(String[] args) {
        // INPUT
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String word = scan.nextLine();
        
        // PROCESS
        int lower = 0, upper = 0;
        for (int i = 0; i < word.length(); i++) {
            if (Character.isUpperCase(word.charAt(i)))
                upper++;
            else if (Character.isLowerCase(word.charAt(i)))
                lower++;
        }
        // OUTPUT
        System.out.println("# of Uppercase : " + upper);
        System.out.println("# of Lowercase : " + lower);
    }
}
