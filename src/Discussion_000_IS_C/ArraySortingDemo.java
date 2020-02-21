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
public class ArraySortingDemo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] nums = new int[5];
        
        System.out.print("Enter 5 integers :");
        for (int i = 0; i < nums.length; i++) 
            nums[i] = scan.nextInt();
        
        System.out.println("Array Values: ");
        // for-each loop
        for (int i : nums)
            System.out.print(i + " ");
        
        System.out.println("SORTING ...");
        Arrays.sort(nums);
        
        System.out.println("Array Values: ");
        // for-each loop
        for (int i : nums)
            System.out.print(i + " ");
        
        System.out.println("Printing the descending order:");
        
        for (int i = nums.length - 1; i >= 0; i--) {
            System.out.print(nums[i] + " ");
        }
    }
    
}
