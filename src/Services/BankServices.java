package Services;
import ErrorHandlers.AuthError;
import ErrorHandlers.InvalidAmount;
import model.User;

public class BankServices {
    public String getDetails(long accountNumber, String password, int option, int amount) throws AuthError, InvalidAmount {
        userServices userDataProvider = new userServices();
        User userdata = userDataProvider.getUserdata(accountNumber,password);
        if(option==1){//checkBalance
            int amt = checkBalance(userdata);
           return "The Balance is:" + (amt<0?"Empty..":amt);
        }
        else if(option==2){
            if(amount<=0) throw new InvalidAmount("Amount Entered is Invalid");
            return "Success";
        }
        else if(option==3){
            if(amount<=0) throw new InvalidAmount("Amount Entered is Invalid");
            if(!debitAmount(userdata,amount)) throw  new InvalidAmount("Debit failed");
            return "Debit Success";
        }
        else{
            return "Service Completed";
        }
    }
    private int checkBalance(User userData){
        return userData.getAccount().getBalance();
    }
    private void creditAmount(User userData,int creditAmount){
        userData.getAccount().deposit(creditAmount);
    }
    private boolean debitAmount(User userData,int debitAmount){
        int amount = checkBalance(userData);
        if(amount<debitAmount) return false;
        userData.getAccount().withdraw(debitAmount);
        return true;
    }
}
