/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practical8;

/**
 *
 * @author Prathamesh
 */
public class Student implements java.io.Serializable {
   private String firstName = null;
   private String lastName = null;
   private int age = 0;

   public Student() {
   }
   public String getFirstName(){
      return firstName;
   }
   public String getLastName(){
      return lastName;
   }
   public int getAge(){
      return age;
   }
   public void setFirstName(String firstName){
      this.firstName = firstName;
   }
   public void setLastName(String lastName){
      this.lastName = lastName;
   }
   public void setAge(int age){
      this.age = age;
   }
}
