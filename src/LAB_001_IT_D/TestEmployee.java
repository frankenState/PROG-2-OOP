/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LAB_001_IT_D;

/**
 *
 * @author frank lou
 */
public class TestEmployee {
    public static void main(String[] args) {
        Employee emp1 = new Employee();
        emp1.getInput();
        emp1.print();
        
        Employee emp2 = new Employee();
        emp2.getInput();
        emp2.print();
        
        boolean isEqual = emp1.equalTo(emp2);
        System.out.println("Is emp1 equal to emp2? " +isEqual);
//        
//        Employee[] emps = new Employee[5];
//        for (int i = 0; i < 5; i++) {
//            emps[i].getInput();
//            emps[i].print();
//        }
    }
}
