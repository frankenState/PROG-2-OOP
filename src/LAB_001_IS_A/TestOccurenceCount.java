/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LAB_001_IS_A;

/**
 *
 * @author frank lou
 */
public class TestOccurenceCount {
    public static void main(String[] args) {
        int[] array = {1, 2, 2, 1, 3, 5, -100, 3, 10, 2};
        int[] array2 = {3, 5, 3, 5, 2, 1};
        
        OccurenceCount cnt1 = new OccurenceCount();
        cnt1.setArray(array);
        OccurenceCount cnt2 = new OccurenceCount(array2);
        
        System.out.println("Occurence of 2 : " + cnt1.getOccurence(2));
        cnt1.printAllOccurence();
        System.out.println("Occurence of 1: " + cnt2.getOccurence(1));
        cnt2.printAllOccurence();
    }
}
