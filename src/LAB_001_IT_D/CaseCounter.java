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
public class CaseCounter {

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
    // class constructor
    public CaseCounter(){
        System.out.println("constructor was executed");
    }
    public int uppercaseCount(){
        int cnt = 0;
        for (int i = 0; i < this.inputString.length(); i++) 
            if (Character.isUpperCase(this.inputString.charAt(i)))
                cnt++;
        return cnt;
    }
    public int lowercaseCount(){
        int cnt = 0;
        for (int i = 0; i < this.inputString.length(); i++) 
            if (Character.isLowerCase(this.inputString.charAt(i)))
                cnt++;
        return cnt;
    }
}
