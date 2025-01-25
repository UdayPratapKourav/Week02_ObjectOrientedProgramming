package hierarchicalinheritance.bankaccounttypes;

public class FixedDepositeAccount extends BankAccount{
    //attributes
    private double duration;

    //Constructor
    public FixedDepositeAccount(long accountNumber, double accountBalance, double duration) {
        super(accountNumber, accountBalance);
        this.duration = duration;
    }

    // setter and getter
    public double getDuration() {
        return  duration;
    }

    public void setDuration(double duration) {
        this.duration = duration;
    }
    @Override
    // Method to display account details
    public void displayAccountType(){
        System.out.println("\nThis is FD Account");
        super.displayAccountType();
        System.out.println("Duration of this FD Account is : "+getDuration());
    }
}
