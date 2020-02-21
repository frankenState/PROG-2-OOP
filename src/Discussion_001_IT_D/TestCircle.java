/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Discussion_001_IT_D;

/**
 *
 * @author frank lou
 */
public class TestCircle {
    public static void main(String[] args) {
        Circle circle1 = new Circle(10.5);
        Circle circle2 = new Circle();
        
        System.out.println("circle1 radius: " + circle1.getRadius());
        System.out.println("circle2 radius: " + circle2.getRadius());
        System.out.println("Object count: " + Circle.objCnt);
        
        circle2.setRadius(10.5);
        System.out.println("circle1 radius: " + circle1.getRadius());
        System.out.println("circle2 radius: " + circle2.getRadius());
        
        System.out.println("circle1 Area: " + circle1.getArea());
        System.out.println("circle2 Area: " + circle2.getArea());
        System.out.println("is circle1 is equal to circle2? : " + circle1.equalTo(circle2));
        
    }
}
