package hierarchicalinheritance.bankaccounttypes;

public class CheckingAccount  extends BankAccount {
    // attributes
    private double withdrawalLimit;

    //    Constructor
    public CheckingAccount(long accountNumber, double accountBalance, double withdrawalLimit) {
        super(accountNumber, accountBalance);
        this.withdrawalLimit = withdrawalLimit;
    }

    public double getWithdrawalLimit() {
        return withdrawalLimit;
    }

    public void setWithdrawalLimit(double withdrawalLimit) {
        this.withdrawalLimit = withdrawalLimit;
    }

    @Override
    // Method to display account details
    public void displayAccountType() {
        System.out.println("\nThis is Checking Account");
        super.displayAccountType();
        System.out.println("Withdraw Limit For Account is : " + getWithdrawalLimit());
    }
}