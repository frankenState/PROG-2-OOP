/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LAB_001_IS_B;
import java.util.*;
/**
 *
 * @author frank lou
 */
public class HighLow {

    /**
     * @return the numbers
     */
    public int[] getNumbers() {
        return numbers;
    }

    /**
     * @param numbers the numbers to set
     */
    public void setNumbers(int[] numbers) {
        this.numbers = numbers;
    }
    // Property
    private int[] numbers;
    // class constructor
    public HighLow(int[] numbers){
        this.numbers = numbers;
    }
    
    public void sort(){
        Arrays.sort(this.numbers);
    }
    
    public void print(){
        System.out.print("Array Contents: ");
        for (int i : this.numbers)
            System.out.print(i + " ");
        System.out.println();
    }
    
    public HighLow(){
        System.out.print("Enter 4 integers: ");
        // scanner object declaration
        Scanner scan = new Scanner(System.in);
        // array for 4 integers input with length = 4
        int[] nums = new int[4];
        // input for loop 
        for (int i = 0; i < nums.length; i++) 
            nums[i] = scan.nextInt();
        
        this.numbers = nums;
    }
}
