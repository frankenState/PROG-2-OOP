/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Discussion_000_IS_C;

/**
 *
 * @author frank lou
 */
public class MultiplicationTable {
    public static void main(String[] args) {
        
        for (int i = 1; i < 13; i++) {
            System.out.println();
            for (int j = 1; j < 13; j++) {
                System.out.printf("%4d", i * j);
            }
        }
        System.out.println();
    }
}