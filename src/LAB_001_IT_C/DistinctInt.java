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
public class DistinctInt {
    
    public DistinctInt(){
        System.out.println("EXECUTED!");
    }
    public DistinctInt(int[] array){
        this.array = array;
    }
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
    
    public boolean isDistinct(int n){
        int foundCnt = 0;
        for (int i : this.array)
            if (n == i) foundCnt++;
        
        return foundCnt == 1;
    }
    
    public void printAllDistinct(){
        System.out.print("Distinct #'s : ");
        for (int i : this.array)
           if (isDistinct(i))
                System.out.print(i + " ");
    }
}
