
package singleresponsibilityprinciple.withsrp;


public class Main {

   
    public static void main(String[] args) {
        User user=new User("Rafi");
        user.DisplayUser();
        UserRepository repo=new UserRepository();
        repo.saveUser(user);
    }
    
}
