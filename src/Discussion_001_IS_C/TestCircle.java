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
public class TestCircle {
    
    public static void main(String[] args) {
        Circle c1 = new Circle(5.77);
        Circle c2 = new Circle();
        
        System.out.println("c1 radius = " + c1.getRadius());
        System.out.println("c2 radius = " + c2.getRadius());
        c2.setRadius(5.77);
        System.out.println("c1 radius = " + c1.getRadius());
        System.out.println("c2 radius = " + c2.getRadius());
        System.out.println("c1 area = " + c1.getArea());
        System.out.println("c2 area = " + c2.getArea());
        System.out.println("is c1 is equal to c2? " + c1.equalTo(c2));
        
    }
    
}
