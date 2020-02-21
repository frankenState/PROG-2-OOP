/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LAB_001_IS_C;

import java.util.Scanner;

/**
 *
 * @author frank lou
 */
public class Faculty {
    
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
    
    public Faculty(){
        System.out.println("A faculty was created!");
    }
    
    public void getInput(){
        Scanner scan = new Scanner(System.in);
        Scanner scan1 = new Scanner(System.in);
        
        System.out.print("Enter the ID: ");
        this.id = scan.nextInt();
        System.out.print("Enter the Name: ");
        this.name = scan1.nextLine();
        System.out.print("Enter the Department: " );
        this.department = scan1.nextLine();
    }
    
    public void print(){
        System.out.println("------------------------");
        System.out.println("ID: " + this.id);
        System.out.println("Name: " + this.name);
        System.out.println("Department: " + this.department);
    }
    
    public boolean equalTo(Faculty faculty){
        int instructor1Id = this.getId(); // this.id;
        int instructor2Id = faculty.getId();
        
        if (instructor1Id == instructor2Id){
            return true;
        } else {
            return false;
        }
        
    //    return this.id == faculty.getId();
    }
}
