/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LAB_001_IS_B;

/**
 *
 * @author frank lou
 */
public class TestIntegerList {
    public static void main(String[] args) {
        int[] array = {1,2,3,4};
        int[] array2 = {1,4,2,3};
        
        IntegerList list1 = new IntegerList(array);
        IntegerList list2 = new IntegerList();
        list2.setArray(array2);
        
        list1.print();
        list2.print();
        System.out.println("Is list1 equal to list2? " + list1.equalTo(list2));
    }
}
