/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Discussion_001_IS_B;
import java.util.*;
/**
 *
 * @author frank lou
 */
public class Discussion_001 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Person p1 = new Person("Garry");
        System.out.println("Name: " + p1.getName());
        p1.setName("Chan Chan");
        System.out.println("Name: " + p1.getName());
    }
}
