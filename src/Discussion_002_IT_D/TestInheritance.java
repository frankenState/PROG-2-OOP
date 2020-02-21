/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Discussion_002_IT_D;

/**
 *
 * @author frank lou
 */
public class TestInheritance {
    public static void main(String[] args) {
        Circle c1 = new Circle(5.5, "Red");
//        System.out.println("c1 Color: " + c1.getColor());
//        System.out.println("c1 Radius: " + c1.getRadius());
        c1.print();
        // Polymorphism Example
        GeometricObject ob1 = new Circle(23.1, "Orange");
        // Type casting
        Circle c2 = (Circle)ob1;
        System.out.println("c2 radius: " + c2.getRadius());
        
        Circle c3 = new Circle(5.999);
        c3.print();
        
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