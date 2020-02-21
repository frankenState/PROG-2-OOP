/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LAB_001_IS_B;

/** 
 *
 * @author frank lou
 */
public class User {
    // properties
    private String firstName;
    private String lastName;
    private String username;
    private String password;
    private int age;
    // constructor
    public User(){
        
    }
    /**
     * @return the lastName
     */
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getUsername() {
        return username;
    }
    
    public void setUsername(String username) {
        this.username = username;
    }
    
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getAge() {
        return age;
    }
    
    public void setAge(int age) {
        this.age = age;
    }
    
    // mutator 'firstName'
    public void setFirstName(String firstName){
        this.firstName = firstName;
    }
    // accessor 'firstName'
    public String getFirstName(){
        return this.firstName;
    }
}
