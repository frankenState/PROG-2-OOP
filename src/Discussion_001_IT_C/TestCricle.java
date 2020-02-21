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
public class TestCricle {
    public static void main(String[] args) {
        Circle c1 = new Circle(10.3);
        Circle c2 = new Circle();
        
        System.out.println("c1 radius: " + c1.getRadius());
        System.out.println("c2 radius: " + c2.getRadius());
        c2.setRadius(9.7);
        System.out.println("c1 radius: " + c1.getRadius());
        System.out.println("c2 radius: " + c2.getRadius());
        System.out.println("c1 Area: " + c1.getArea());
        System.out.println("c2 Area: " + c2.getArea());
        System.out.println("is c1 equal to c2? " + c1.equalTo(c2));
    }
}
