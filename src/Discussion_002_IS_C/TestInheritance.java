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
public class TestInheritance {
    public static void main(String[] args) {
        Circle c1 = new Circle(23.5, "Red");
        System.out.println("c1 Radius: " + c1.getRadius());
        System.out.println("c1 Color: " + c1.getColor());
        c1.print();
        // Polymorphism
        GeometricObject ob1 = new Circle(5.5, "Yellow");
        // Type Casting
        Circle c2 = (Circle)ob1;
        System.out.println("c2 Radius: " + c2.getRadius());
        System.out.println("c2 Color: " + c2.getColor());
        
        Circle c3 = new Circle(19.99);
        c3.print();
        // instantiate
        Circle c4 = new Circle();
        c4.print();
        
        
    }
}
/*
final class Class_A {
    
}

class Class_B extends Class_A {
    
}
*/