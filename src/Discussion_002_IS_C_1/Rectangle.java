/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Discussion_002_IS_C_1;

/**
 *
 * @author frank lou
 */
public class Rectangle 
        extends GeometricObject 
            implements EventListener {
    
   private double length;
   private double width;
   public Rectangle(double length, double width, String color){
       super(color);
       this.length = length;
       this.width = width;
   }
   
   @Override 
   public double getArea(){
       return this.length * this.width;
   }
   
   @Override
   public double getPerimeter(){
      return (this.length * 2) + (this.width * 2);
      // double perimeter = (this.width * 2 ) + (this.length * 2);
      // return perimeter;
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
        GeometricObject go = new Rectangle(15, 10, "Gray");
        System.out.println("Area: " + go.getArea());
        System.out.println("Perimeter: " + go.getPerimeter());
        // Type-casting from GeometricObject to Type Rectangle
        Rectangle r1 = (Rectangle)go;
        r1.onClick(4, 3);
        r1.onKeyPress("ARROW_DOWN");
        
   }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }
}
