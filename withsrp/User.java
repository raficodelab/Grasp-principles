
package singleresponsibilityprinciple.withsrp;

public class User {
    private String name;
    public User(String name){
        this.name=name;
    }
   public void DisplayUser(){
       System.out.println("User:" + name);
   } 
   public String getName(){
       return name;
   }
}
