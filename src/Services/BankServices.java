package Services;
import userDetails.BankAmountDetails;
import ErrorHandlers.InvalidAmount;
public class BankServices {
    public int checkBalance() throws InvalidAmount{
        BankAmountDetails services = new BankAmountDetails();
        return services.checkBalance();
    }
    public void deposit(){

    }
    public void debit(){}
}
