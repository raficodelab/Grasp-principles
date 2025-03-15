
package singleresponsibilityprinciple.withoutsrp;


public class UserManager {
    private String name;
    public UserManager(String name){
        this.name=name;
    }
    public void displayUser(){
        System.out.println("User:" +name);
    }
     public void saveToDatabase(){
         System.out.println("saving user to database..");
     }
     public static void main(String[]args){
         UserManager user=new UserManager("Rafi");
         user.displayUser();
         user.saveToDatabase();
     }
}
