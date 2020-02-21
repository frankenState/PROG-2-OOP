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
public class TestUser {
    public static void main(String[] args) {
        User user1 = new User();
        user1.setFirstName("AIJELETH");
        user1.setLastName("VILLADELGADO");
        user1.setAge(18);
        user1.setUsername("aijelethvilladelgado");
        user1.setPassword("password123***");
        
        System.out.println("First Name: "
                + user1.getFirstName());
        System.out.println("Last Name: " 
                + user1.getLastName());
        System.out.println("Age: "
                + user1.getAge());
        System.out.println("Username: "
                + user1.getUsername());
        System.out.println("Password: "
                + user1.getPassword());
    }
}
