/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LAB_001_IS_C;

import java.util.Scanner;

/**
 *
 * @author frank lou
 */
public class TestMathOperator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Enter 2 integers: ");
        int[] array = { scan.nextInt(), scan.nextInt() };
        
        MathOperator obj1 = new MathOperator();
        obj1.setArray(array);
        
        System.out.println("Sum: " + obj1.sum());
        System.out.println("Difference: " + obj1.difference());
        System.out.println("Product: " + obj1.product());
        System.out.println("Qoutient: " + obj1.qoutient());
    }
}
