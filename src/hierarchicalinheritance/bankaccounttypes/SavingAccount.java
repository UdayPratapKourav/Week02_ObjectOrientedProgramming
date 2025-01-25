package hierarchicalinheritance.bankaccounttypes;

public class SavingAccount  extends BankAccount {
    // attributes
    private double interestRate;

    public SavingAccount(long accountNumber, double accountBalance, double interestRate) {
        super(accountNumber, accountBalance);
        this.interestRate = interestRate;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    @Override
    // Method to display account details
    public void displayAccountType(){
        System.out.println("\nThis is Saving Account");
        super.displayAccountType();
        System.out.println("Interest Rate is : "+getInterestRate());
    }
}
