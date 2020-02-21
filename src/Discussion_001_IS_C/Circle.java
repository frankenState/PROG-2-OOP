/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Discussion_001_IS_C;

/**
 *
 * @author frank lou
 */
public class Circle {

    /**
     * @return the radius
     */
    public double getRadius() {
        return radius;
    }

    /**
     * @param radius the radius to set
     */
    public void setRadius(double radius) {
        this.radius = radius;
    }
    
    public double getArea(){
        double area = Math.PI * Math.pow(this.radius, 2);
        return area;
    }
    
    public boolean equalTo(Circle circle){
        return this.getArea() == circle.getArea();
    }
    
    // Property
    private double radius;
    
    public Circle(double radius){
        this.radius = radius;
    }
    
    public Circle(){
        this(0.0);
    }
}
