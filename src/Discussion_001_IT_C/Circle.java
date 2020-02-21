/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Discussion_001_IT_C;

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

    public double getArea() {
        double area = Math.PI * Math.pow(this.radius, 2);
        return area;
    }

    public double getCircumference() {
        double circum = 2 * Math.PI * this.radius;
        return circum;
    }

    public boolean equalTo(Circle circle) {
        return this.getArea() == circle.getArea();
    }

    // CONSTRUCTOR
    public Circle(double radius) {
        this.radius = radius;
        System.out.println("A new object was created.");
    }

    public Circle() {
        this(0);
        // this = Circle(radius: double)
    }

    // Property
    private double radius;

}
