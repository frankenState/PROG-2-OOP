/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Discussion_002_IT_D_1;

/**
 *
 * @author frank lou
 */
public class Rectangle 
        extends GeometricObject
            implements EventListener {
    
    private double width;
    private double length;
    
    public Rectangle(double length, double width, String color){
        super(color);
        this.width = width;
        this.length = length;
    }
    
    @Override
    public double getArea(){
        return this.length * this.width;
    }
    
    @Override
    public double getPerimeter(){
        return (this.width * 2) + (this.length * 2);
    }
    
    @Override
    public void onClick(int x, int y){
        System.out.printf("Clicked on (%d,%d)\n", x, y);
    }
    
    @Override
    public void onKeyPress(String key){
        System.out.printf("%s was pressed.\n", key);
    }

    public static void main(String[] args) {
    //    GeometricObject go = new GeometricObject("REd");
        GeometricObject r1 = new Rectangle(15, 10, "Gray");
        System.out.println("Area: " + r1.getArea());
        System.out.println("Perimeter: " + r1.getPerimeter());
        // Converted the GeometricObject Type to Rectangle Type                           
        Rectangle r2 = (Rectangle)r1;
        r2.onClick(3, 4);
        r2.onKeyPress("ARROW_DOWN");
    }
    
    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }
}
