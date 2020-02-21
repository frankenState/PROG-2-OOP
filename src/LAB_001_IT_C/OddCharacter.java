/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LAB_001_IT_C;
import java.util.*;
/**
 *
 * @author frank lou
 */
public class OddCharacter {

    /**
     * @return the inputString
     */
    public String getInputString() {
        return inputString;
    }

    /**
     * @param inputString the inputString to set
     */
    public void setInputString(String inputString) {
        this.inputString = inputString;
    }
    // Property
    private String inputString;
    // Class constructor
    public OddCharacter(){
        System.out.println("constructor was executed.");
    }
    // constructor overloading
    public OddCharacter(String inputString){
        this.inputString = inputString;
    }
    
    public void getInput(){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a string: ");
        this.inputString = scan.nextLine();
    }
    
    public String oddCharPosition(){
        String oddPosition = "";
        for (int i = 0; i < this.inputString.length(); i+=2) 
            oddPosition += this.inputString.charAt(i);
        
        return oddPosition;
    }
    
    
}
