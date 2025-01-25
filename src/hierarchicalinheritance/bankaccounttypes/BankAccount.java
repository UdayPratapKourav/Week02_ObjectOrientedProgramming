package hierarchicalinheritance.bankaccounttypes;

public class BankAccount {
    // attributes
    private long accountNumber;
    private double accountBalance;

    // Constructor
    public BankAccount(long accountNumber, double accountBalance) {
        this.accountNumber = accountNumber;
        this.accountBalance = accountBalance;
    }

    // setters and getters
    public long getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    // Method to display account details
    public void displayAccountType(){
        // print account number and balance
        System.out.println("Account Number is : "+getAccountNumber());
        System.out.println("Account Balance is : "+getAccountBalance());
    }

}
