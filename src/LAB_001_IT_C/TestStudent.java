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
public class TestStudent {
    public static void main(String[] args) {
        Student obj1 = new Student();
        obj1.getInput();
        obj1.print(); 
        
        Student obj2 = new Student();
        obj2.getInput();
        obj2.print(); 
        
        boolean isEqual = obj1.equalTo(obj2);
        
        System.out.println("is obj1 is equal to obj2? " + isEqual);
    }
}
