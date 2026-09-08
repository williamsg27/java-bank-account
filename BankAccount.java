/**
 * Represents a basic bank account.
 * Demonstrates encapsulation using private attributes,
 * constructors, getters, and setters.
 */
public class BankAccount {

    //Attributes
    private int accountNumber;
    private double balance;
    private String owner;

    //Constructors
    public BankAccount(int accountNumber, double balance, String owner){
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.owner = owner;
    }

    public void setAccountNumber(int accountNumber){this.accountNumber = accountNumber;}
    public void setBalance(double balance){this.balance = balance;}
    public void setOwner(String owner){this.owner = owner;}

    public int getAccountNumber(){return this.accountNumber;}
    public double getBalance(){return this.balance;}
    public String getOwner(){return this.owner;}

}
