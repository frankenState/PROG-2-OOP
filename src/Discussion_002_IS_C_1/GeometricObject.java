/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Discussion_002_IS_C_1;

/**
 *
 * @author frank lou
 */
public abstract class GeometricObject {
    private String color;
    public GeometricObject(String color){
        this.color = color;
    }
    
    abstract double getArea();
    abstract double getPerimeter();

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
