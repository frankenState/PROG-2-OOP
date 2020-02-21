/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Discussion_001_IS_A;

/**
 *
 * @author frank lou
 */
public class Person {

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
     * @return the age
     */
    public int getAge() {
        return age;
    }

    /**
     * @param age the age to set
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * @return the status
     */
    public String getStatus() {
        return status;
    }

    /**
     * @param status the status to set
     */
    public void setStatus(String status) {
        this.status = status;
    }
     // PROPERTIES
     private String name;
     private int age;
     private String status;
     public static int objectCount = 0;
     // CLASS CONSTRUCTOR
    public Person(String name, int age, String status){
        this.name = name;
        this.age = age;
        this.status = status;
        System.out.println("A person was created.");
        objectCount++;
    }
    // CONSTRUCTOR OVERLOADING
    public Person(String name, int age){
        this(name, age, "Single");
    }
    public Person(){
        this("No name", 0, "Single");
    }
  
    public static void main(String[] args) {
        Person p1 = new Person("James", 21, "Single");
        Person p2 = new Person();
        p2.setName("Nadine");
        p2.setAge(19);
        p2.setStatus("Single");
        System.out.println("Object Count: " + Person.objectCount);
        System.out.println("P1 Name: " + p1.getName());
        System.out.println("P2 Name: " + p2.getName());
        System.out.println("P2 Status: " + p2.getStatus());
        System.out.println("P2 Age: " + p2.getAge());
    }
}
