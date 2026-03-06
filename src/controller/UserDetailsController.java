package controller;
import ErrorHandlers.InvalidAmount;
import Services.BankServices;
import ErrorHandlers.AuthError;
import Services.userServices;

public class UserDetailsController {
    userServices userServices = new userServices();
    public String insertNewUser(long accountNumber, String password, int amount, String name, String type) throws AuthError {
        userServices.insertUser(accountNumber, password, amount, name, type);
        return "User Inserted..";
    }
    BankServices bankServices = new BankServices();
    public String checkBalance(long account_number,String password) throws AuthError, InvalidAmount {
            return bankServices.getDetails(account_number,password,1,0);
    }
    public void updateAmount(long account_number,String password,int amount,int option) throws InvalidAmount, AuthError {
            System.out.println(bankServices.getDetails(account_number,password,option,amount));
    }
}
