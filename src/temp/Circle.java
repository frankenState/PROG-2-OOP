/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package temp;

/**
 *
 * @author frank lou
 */
public class Circle {
    
    
    private double radius;
       
    public double getRadius() {
        return radius;
    }
    
    public void setRadius(double radius) {
        this.radius = radius;
    }
    
    public Circle(double radius){
        this.radius = radius;
    }
    
    public boolean equalTo(Circle circle){
        return circle.getRadius() == this.getRadius();
    }
    
    public double getArea(){
        return Math.PI * Math.pow(this.getRadius(), 2);
    }
    
    public static void main(String[] args){
//        Circle c1 = new Circle(10);
//        Circle c2 = new Circle(10.5);
//        System.out.println("Does c1 is Equal to c2? : " 
//                + c1.equalTo(c2));

      //  Class_B cb = new Class_B();
     //   Class_A ca = new Class_B();
       // cb.sayHello();
    }
}



























//    private double radius;
//    
//    public Circle(){
//       this.radius = 0.0;
//    }
//    
//    public Circle(double radius) {
//        this.radius = radius;
//    }
//    
//    public double getRadius() {
//        return radius;
//    }
//
//    public void setRadius(double radius) {
//        this.radius = radius;
//    }
//
//    public double getArea(){
//        return Math.PI * Math.pow(this.radius, 2);
//    }
//    
//    public double getCircumference(){
//        return this.radius * 2 * Math.PI;
//    }


abstract class Class_A {
    abstract void method1();
    
    public void sayHello(){
        
    }
}

interface Interface_A {
    int RPM = 300;
    void sayHi();
}

interface Interface_B {
    void anotherSayHi();
}

class Class_B 
        extends Class_A 
            implements Interface_A, Interface_B {
    @Override
    public void method1(){
        
    }

    @Override
    public void sayHi() {
    
    }

    @Override
    public void anotherSayHi() {
    
    }
    
}








