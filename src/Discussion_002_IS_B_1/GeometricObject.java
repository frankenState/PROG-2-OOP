/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Discussion_002_IS_B_1;

/**
 *
 * @author frank lou
 */
public abstract class GeometricObject {

    private String color;
    
    protected GeometricObject(String color){
        this.color = color;
    }
    
    public abstract double getArea();
    public abstract double getPerimeter();
    
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    
}
