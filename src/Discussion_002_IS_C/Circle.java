/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Discussion_002_IS_C;

/**
 *
 * @author frank lou
 */
public class Circle extends GeometricObject {

    private double radius;
    public Circle(double radius, String color){
        super(color);
        this.radius = radius;
    }
    public Circle(double radius){
        this(radius, "Black");
    }
    public Circle(){
        this(0.0);
    }
    
    @Override
    public void print(){
        System.out.println("Color: " + super.getColor());
        System.out.println("Radius: " + this.radius);
    }
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}
