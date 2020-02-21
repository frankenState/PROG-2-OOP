/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Discussion_000_IT_C;

/**
 *
 * @author frank lou
 */
import java.util.*;

public class Problem_4 {
   
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int[] nums = new int[4];
        // INPUT
        System.out.print("Enter 4 integers: ");
        for (int i = 0; i < nums.length; i++) {
            nums[i] = scan.nextInt();
        }
        // PROCESS
        Arrays.sort(nums);
        // OUTPUT
        // for-each loop 
//        for (int i : nums)
//            System.out.print(i + " ");
     
        System.out.println("High: " + nums[nums.length - 1]);
        System.out.println("Low: " + nums[0]);
    }
}
