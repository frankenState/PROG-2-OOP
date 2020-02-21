/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Discussion_002_IT_C;

/**
 *
 * @author frank lou
 */
public class GeometricObject {

    private String color;
   // private final double PI = 3.14;
    
    public GeometricObject(String color){
        this.color = color;
    }
    
    public void print(){
        System.out.println("Color: " + this.color);
    }
    
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
