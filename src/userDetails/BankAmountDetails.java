package userDetails;
import ErrorHandlers.InvalidAmount;
public class BankAmountDetails {
    private int balance = 10000;
    public void credit(int _amount){
        this.balance += _amount;
    }
    public void debit(int _amount) throws InvalidAmount {
        if(this.balance<_amount){
            throw new InvalidAmount("Insufficient Amount to Debit");
        }
        this.balance -=_amount;
    }
    public int checkBalance() throws  InvalidAmount{
        if(this.balance<0){
            throw new InvalidAmount("Nothing to see..");
        }
        return this.balance;
    }
}
