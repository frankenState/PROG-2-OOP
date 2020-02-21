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
public class TestDistinctInt {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 3, 4, 2, -100, 23, 5, 5};
        
        DistinctInt obj1 = new DistinctInt(array);
        obj1.setArray(array);
        
        System.out.println("Is # 2 distinct? : " + obj1.isDistinct(2));
        obj1.printAllDistinct();
    }
}
