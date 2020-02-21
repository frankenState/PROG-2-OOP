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
public class OccurenceCount {

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
    
    public OccurenceCount(int[] array){
        this.array = array;
    }
    public OccurenceCount(){
        this(new int[]{});
    }
    
    public int getOccurence(int number){
        int cnt = 0;
        for (int i : this.array)
            if (i == number) cnt++;
        return cnt;
    }
    
    public void printAllOccurence(){
       for (int i : this.array )
           System.out.println("n("+i+") = " + this.getOccurence(i) );
    }
}
