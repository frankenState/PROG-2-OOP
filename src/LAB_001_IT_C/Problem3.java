/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LAB_001_IT_C;
/**
 *
 * @author frank lou
 */
public class Problem3 {
     public static void main(String[] args) {
        OddCharacter obj1 = new OddCharacter();
        obj1.getInput();
        OddCharacter obj2 = new OddCharacter();
        obj2.getInput();
        
        System.out.println("Obj1 string: " + obj1.getInputString());
        System.out.println("Odd Character: " + obj1.oddCharPosition());
        System.out.println("Obj2 string: " + obj2.getInputString());
        System.out.println("Odd Chracter: " + obj2.oddCharPosition());
    }
}
