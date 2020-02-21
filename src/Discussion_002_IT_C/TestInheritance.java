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
public class TestInheritance {
    public static void main(String[] args) {
        Circle c1 = new Circle(25.1, "RED");
//        System.out.println("C1 radius: " + c1.getRadius());
//        System.out.println("C1 color: " + c1.getColor());
        c1.print();
        // Polymorphism Example
        GeometricObject ob1 = new Circle(23.1, "ORANGE");
        // Type Casting
        Circle c2 = (Circle)ob1;
        System.out.println("c2 Radius: " + c2.getRadius());
        
        Circle c3 = new Circle(30.2);
        c3.print();
        
        Circle c4 = new Circle();
        c4.print();
    }
}
/*
// Final Class cannot be inherited
final class Something {
    
}

class AnotherClass extends Something {
    
}
*/

