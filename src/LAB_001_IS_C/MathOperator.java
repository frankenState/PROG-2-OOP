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
public class MathOperator {

    private int[] array;
    
    public MathOperator(int[] array){
        this.array = array;
    }
    
    public MathOperator(){
        this(new int[2]);
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
    
    public int sum(){
        return this.array[0] + this.array[1];
    }
    
    public int difference(){
        return this.array[0] - this.array[1];
    }
    
    public int product(){
        return this.array[0] * this.array[1];
    }
    
    public double qoutient(){
        return this.array[0] / this.array[1];
    }
    
}
