/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LAB_001_IT_C;
import java.util.*;
/**
 *
 * @author frank lou
 */
public class Student {

    /**
     * @return the schoolId
     */
    public String getSchoolId() {
        return schoolId;
    }

    /**
     * @param schoolId the schoolId to set
     */
    public void setSchoolId(String schoolId) {
        this.schoolId = schoolId;
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
     * @return the program
     */
    public String getProgram() {
        return program;
    }

    /**
     * @param program the program to set
     */
    public void setProgram(String program) {
        this.program = program;
    }

    /**
     * @return the gender
     */
    public String getGender() {
        return gender;
    }

    /**
     * @param gender the gender to set
     */
    public void setGender(String gender) {
        this.gender = gender;
    }
    
    private String schoolId;
    private String name;
    private String program;
    private String gender;
    
    public Student(){
        System.out.println("A student was created!");
    }
    
    public void print(){
        System.out.println("----------- Student ------------");
        System.out.println("School ID: " + this.schoolId);
        System.out.println("Name: " + this.name);
        System.out.println("Program: " + this.program);
        System.out.println("Gender: " + this.gender);
    }
    
    public void getInput(){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the School ID: ");
        this.schoolId = scan.nextLine();
        System.out.print("Enter the student name: ");
        this.name = scan.nextLine();
        System.out.print("Enter the program: ");
        this.program = scan.nextLine();
        System.out.print("Enter the gender:");
        this.gender = scan.nextLine();
    }
    
    public boolean equalTo(Student student){
        // schoold id and the name
        String obj2SchoolID = student.getSchoolId();
        String obj2Name = student.getName();
        
        if (this.schoolId.equals(obj2SchoolID) 
                && this.name.equals(obj2Name)){
            return true;
        } else {
            return false;
        }
        
//        return this.schoolId.equals(student.getSchoolId()) 
//                && this.name.equals(student.getName());
    }
    
}
