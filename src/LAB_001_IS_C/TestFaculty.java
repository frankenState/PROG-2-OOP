/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LAB_001_IS_C;

/**
 *
 * @author frank lou
 */
public class TestFaculty {
    public static void main(String[] args) {
        Faculty instructor1 = new Faculty();
        instructor1.getInput();
        
        Faculty instructor2 = new Faculty();
        instructor2.getInput();
        
        instructor1.print();
        instructor2.print();
        
        
        boolean isEqual = instructor1.equalTo(instructor2);
        System.out.println(
                "Is instructor1 equal to instructor2? " + isEqual
        );
    }
}
