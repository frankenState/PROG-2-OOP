/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LAB_001_IS_B;

import java.util.Arrays;

/**
 *
 * @author frank lou
 */
public class IntegerList {

    /**
     * @return the array
     */
    public int[] getArray() {
        return array;
    }

    /**
     * @param array the array to set
     */
    public void setArray(int[] array) {
        this.array = array;
    }
    private int[] array;
    
    public IntegerList(int[] array){
        this.array = array;
    }
    
    public IntegerList(){
        this(new int[]{});
    }
    
    public void print(){
        System.out.print("Array : ");
        for (int i : this.array)
            System.out.print(i + " ");
        System.out.println();
    }
    
    public boolean equalTo(IntegerList list){
        int[] array2 = list.getArray();
        
        boolean matched = false;
        if (this.array.length == array2.length){
            Arrays.sort(array2);
            Arrays.sort(this.array);
            
            for (int i = 0; i < this.array.length; i++) {
                if (array2[i] == this.array[i])
                    matched = true;
                else 
                    return false;
            }
        } return matched;
    }
    
}
