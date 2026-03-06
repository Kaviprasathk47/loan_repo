package model;

public class Account {

    private static int accountCounter = 5000;

    private final int accountId;
    private int balance;
    private final String accountType;

    public Account(int initialBalance, String accountType) {
        this.accountId = accountCounter++;
        this.balance = initialBalance;
        this.accountType = accountType;
    }

    public int getAccountId() {
        return accountId;
    }

    public int getBalance() {
        return balance;
    }
    public String getAccountType() {
        return accountType;
    }
    public void deposit(int amount) {
        balance += amount;
    }
    public void withdraw(int amount) {
        balance -= amount;
    }
}