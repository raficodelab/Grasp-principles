
package singleresponsibilityprinciple.withsrp;


public class UserRepository {
   public void saveUser(User user){
       System.out.println("saving user'" +user.getName() +"'To database..");
               
   }
} 
