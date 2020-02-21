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
public class Problem4 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        
        int[] ints = new int[4];
        
        System.out.print("Enter four integers: ");
        for( int i = 0; i < ints.length; i++){
            ints[i] = scan.nextInt();
        }
        
        Arrays.sort(ints);
        
        System.out.println("Highest: " + ints[ints.length - 1]);
        System.out.println("Lowest: " + ints[0]);
    }
}
