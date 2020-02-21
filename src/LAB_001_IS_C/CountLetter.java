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
public class CountLetter {

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
    // Constructor
    public CountLetter(){
        System.out.println("constructor was executed");
    }
    
    private int getCount(boolean isVowel){
        int consonants = 0, vowels = 0;
        for (int i = 0; i < this.inputString.length(); i++) {
            char letter = this.inputString.toUpperCase().charAt(i);
            
            if (letter == 'A' ||  letter == 'E' || letter == 'I' ||
                letter == 'O' ||  letter == 'U'){
                vowels++;
            } else if (letter > 'A' && letter <= 'Z'){
                consonants++;
            }
        }
        if (isVowel) 
            return vowels;
       else 
            return consonants;
    }
    
    public int getConsonantCount(){
       int consonantCount = this.getCount(false);
       return consonantCount;
    }
    
    public int getVowelCount(){
        int vowelCount = this.getCount(true);
        return vowelCount;
    }
    
    
}
