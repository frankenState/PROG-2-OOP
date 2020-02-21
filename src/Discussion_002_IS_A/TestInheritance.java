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
public class TestInheritance {
    public static void main(String[] args) {
        Circle c1 = new Circle(5.5, "Red");
        System.out.println("C1 Radius: " + c1.getRadius());
        System.out.println("C1 Color: " + c1.getColor());
        
        Circle c2 = new Circle(25.1);
        System.out.println("C2 Radius: " + c2.getRadius());
        System.out.println("C2 Color: " + c2.getColor());
        System.out.println(c2.toString());
        // Polymorphism
        GeometricObject ob1 = new Circle(30.5);
        // Type Casting
        Circle ob2 = (Circle)ob1;
        System.out.println("OB2 Radius: " + ob2.getRadius());
        
        Circle c3 = new Circle();
        System.out.println("C3 Radius: " + c3.getRadius());
        System.out.println("C3 Color: " + c3.getColor());
    }
}
