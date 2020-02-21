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
public class Problem2 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Enter a string : ");
        String text = scan.nextLine();
        
        String[] ups = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".split("");
        String[] lows = "abcdefghijklmnopqrstuvwxyz".split("");
        
        int low_cnt = 0, up_cnt = 0;
        
        for (int i = 0; i < text.length(); i++) {
           String letter = String.valueOf(text.charAt(i));
           
           for (String up : ups)
               if (up.equals(letter)){
                   up_cnt++;
               }
           
           for (String low: lows)
               if (low.equals(letter)){
                   low_cnt++;
               }
        }
        System.out.println("The number of lowercase is " + low_cnt);
        System.out.println("The number of uppercase is " + up_cnt);
    }
}
