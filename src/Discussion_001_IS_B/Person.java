/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Discussion_001_IS_B;

/**
 * Sana *
 * @author frank lou
 */
public class Person {

    // attribute/properties
    // CTRL + ALT + SHIFT + E
    private String name;
    private double height;
    private double weight;
    // STATIC variable
    public static int instanceCount = 0;
    
    public Person(String name, double height, double weight){
        this.name = name;
        this.height = height;
        this.weight = weight;
        instanceCount++;
    }
    
    public Person(String name, double height){
       this(name, height, 0.0);
    }
    
    public Person(String name){
       this(name, 0.0, 0.0);
    }
    
    public Person(){
        this("", 0.0, 0.0);
    }
    
    public void sleep(double hours){
        System.out.println(this.getName() + " slept with : " + hours + " hours.");
    }
    
    public static void main(String[] args) {
   // class    object  instantiation
        Person james = new Person("James Reid", 5.4);
        Person nadine = new Person("Nadine Lustre", 5.3, 49);
        System.out.println("The number of objects: " + Person.instanceCount);
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the height
     */
    public double getHeight() {
        return height;
    }

    /**
     * @param height the height to set
     */
    public void setHeight(double height) {
        this.height = height;
    }

    /**
     * @return the weight
     */
    public double getWeight() {
        return weight;
    }

    /**
     * @param weight the weight to set
     */
    public void setWeight(double weight) {
        this.weight = weight;
    }

}
