/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LAB_001_IT_D;
import java.util.*;
/**
 *
 * @author frank lou
 */
public class Employee {

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
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
     * @return the department
     */
    public String getDepartment() {
        return department;
    }

    /**
     * @param department the department to set
     */
    public void setDepartment(String department) {
        this.department = department;
    }
    private int id;
    private String name;
    private String department;
    
    public Employee(){
        System.out.println("An employee was created!");
    }
    
    public void getInput(){
        Scanner scan = new Scanner(System.in);
        Scanner scan2 = new Scanner(System.in);

        System.out.print("Enter the ID: ");
        this.id =  scan.nextInt();
        System.out.print("Enter the Name: ");
        this.name = scan2.nextLine();
        System.out.print("Enter the Department: ");
        this.department = scan2.nextLine();
    }
    
    public void print(){
        System.out.println("-------------------------------");
        System.out.println("ID : " + this.id);
        System.out.println("Name: " + this.name);
        System.out.println("Department: " + this.department);
    }
    
    public boolean equalTo(Employee employee){
        int emp2ID = employee.getId();
        int emp1ID = this.id;
        System.out.println("Emp2 : " + emp2ID);
        System.out.println("Emp1 : " + emp1ID);
        
        if (emp1ID == emp2ID)
            return true;
        else 
            return false;
        
    //   return this.id == employee.getId();
    }

}
