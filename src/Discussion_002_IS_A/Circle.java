/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Discussion_002_IS_A;

/**
 *
 * @author frank lou
 */
public class Circle extends GeometricObject {

    private double radius;
    
    public Circle(double radius, String color){
        super(color);
        this.radius = radius;
    //    System.out.println("COLOR: " + super.getColor());
    }
    
    public Circle(double radius){
        this(radius, "Black");
    }
    
    public Circle(){
        this(0.0);
    }
    
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    // method overriding
    public String toString(){
        return "From Circle";
    }
    /*
    public final void sayHello(){
        
    }
    */
}
