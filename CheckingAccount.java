public class CheckingAccount extends BankAccount {
    //Attributes
    private double monthlyFee;

    //Constructor
    public CheckingAccount(int accountNumber, double balance, String owner, double monthlyFee) {
        super(accountNumber, balance, owner);
        this.monthlyFee = monthlyFee;
    }

    //Mutator
    public void setMonthlyFee(double monthlyFee) {
        this.monthlyFee = monthlyFee;
    }

    //Accessor
    public double getMonthlyFee() {
        return this.monthlyFee;
    }
}


