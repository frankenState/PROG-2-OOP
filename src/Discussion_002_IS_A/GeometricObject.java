/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Discussion_002_IS_A;

/**
 *
 * @author frank lou
 */
public class GeometricObject {

    private String color;
    
    public GeometricObject(String color){
        this.color = color;
    }
    
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    
    public final void sayHello(){
        System.out.println("Hello!!!");
    }
    
    public String toString(){
        return "From GeometriObject";
    }
}
/*
final class Something {
    
}
class AnotherSomething extends Something {
    
}
*/

