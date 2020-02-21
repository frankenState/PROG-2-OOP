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
public class TestingAbstract {
    public static void main(String[] args){
        System.out.println("Hello world");
        TestingAbstract ta = new TestingAbstract();
        
        
    }
}
interface AnotherApp {
    public void hello();
}

interface Applications{
    public void facebook();
    public void eat();
    
}

abstract class SocialMedia  {
    public abstract void app();
    
    public double getWages(int hours){
        return hours * 15.2;
    }
    
    protected SocialMedia(String s) {
        
    }
}

class Hello extends SocialMedia implements Applications, AnotherApp {
    
    public Hello(){
        super("");
    }
    
    @Override
    public void facebook(){
        
    }
    
    @Override
    public double getWages(int hours){
        return super.getWages(hours);
    }

    @Override
    public void app() {
        
    }

    @Override
    public void eat() {
        
    }

    @Override
    public void hello() {
        
    }

}

abstract class Product {
    public int getLength(String[] cart) { return cart.length; }
    
    public abstract void sayHello();
}

interface ProductAgain  {
     public int getLength(String[] cart);
}


class TestProduct extends Product implements ProductAgain {

    public int getLength(String[] cart) {
        return super.getLength(cart);
    }
    
    @Override
    public void sayHello() {
    
    }

    
}