package model;

public class User {

    private static int bankIdCounter = 1000;

    private final int bankId;
    private final long accountNumber;
    private final String password;
    private final String name;
    private final Account account;
    public User(long accountNumber, String password, String name, Account account) {
        this.bankId = bankIdCounter++;
        this.accountNumber = accountNumber;
        this.password = password;
        this.name = name;
        this.account = account;
    }
    public int getBankId() {
        return bankId;
    }
    public long getAccountNumber() {
        return accountNumber;
    }

    public String getPassword() {
        return password;
    }

    public String getName() {
        return name;
    }

    public Account getAccount() {
        return account;
    }
}