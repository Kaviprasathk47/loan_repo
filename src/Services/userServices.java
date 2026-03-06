package Services;
import ErrorHandlers.AuthError;
import data.UserStore;
import model.User;

import javax.management.RuntimeErrorException;

public class userServices {
    private static final UserStore data = new UserStore();
    private boolean validateUser(User user,long account_number,String password) throws AuthError{
        if(user==null) {
            throw  new AuthError("Account Not found");
        }
        if(!user.getPassword().equals(password)){
            throw  new AuthError("Invalid PassWords for the Account:" + account_number);
        }
        return true;
    }
    public User getUserdata(long accountNumber,String password) throws AuthError {
        User user = data.getUsers(accountNumber);
        if(!validateUser(user,accountNumber,password)){
            System.out.println("Failed to Fetch Details");
        }
        return user;
    }
    public void insertUser(long accountNumber, String password, int amount,String name,String type) throws AuthError{
        if(!data.addUserData(accountNumber, password, name, amount, type)){
            throw new AuthError("Insertion failed");
        }
    }
}
