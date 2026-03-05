package authentication;
import data.UserData;
import app.Main;
import ErrorHandlers.AuthError;

public class UserAuthentication {
    public boolean authenticate() throws AuthError {
        System.out.print("Enter account number: ");
        long accountNumber = Main.in.nextLong();
        UserData user = new UserData();
        if(accountNumber != user.getAccountNumber()){
            throw new AuthError("Invalid Account Number");
        }
        System.out.print("Enter password: ");
        String password = Main.in.next();
        if(!user.getPassword().equals(password)){
            throw new AuthError("Invalid Password");
        }
        return true;
    }
}