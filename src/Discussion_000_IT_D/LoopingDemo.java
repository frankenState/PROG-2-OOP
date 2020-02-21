/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Discussion_000_IT_D;
import java.util.*;
import javax.swing.*;
/**
 *
 * @author frank lou
 */
public class LoopingDemo {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        
        while (true){
            String name = JOptionPane.showInputDialog(null,
                    "Enter a name");
            
            names.add(name);
            
            int response = JOptionPane.showConfirmDialog(null, 
                    "Do you want to add again?", 
                    "Confirmation", 
                    JOptionPane.INFORMATION_MESSAGE);
 
            if (response != 0) break;
        }
        // for-each loop
        for (String name : names)
            System.out.println(name);
        
        
        
    }
}
