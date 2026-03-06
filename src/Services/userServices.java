package Services;
import data.UserStore;
import model.User;
public class userServices {
    UserStore data = new UserStore();
    public boolean validateUser(User user,long account_number,String password){
        if(user==null) {
            System.out.println("Account Not found");
            return false;
        }
        if(!user.getPassword().equals(password)){
            System.out.println("Invalid PassWords for the Account:" + account_number);
            return false;
        }
        else{
            System.out.print("SuccessFull");
            return true;
        }
    }
    public User getUserdata(long accountNumber,String password){
        User user = data.getUsers(accountNumber);
        if(!validateUser(user,accountNumber,password)){
            System.out.println("Failed to Fetch Details");
        }
        return user;
    }
}
