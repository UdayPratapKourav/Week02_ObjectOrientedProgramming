package bankingsystem;

public class Main {
    public static void main(String[] args) {
        BankAccount savingsAccount1 = new SavingsAccount("789123", "uday", 200000.0);
        BankAccount currentAccount1 = new CurrentAccount("123456", "pratap", 1000000.0);

        // checking for loan eligible
        if (currentAccount1.calculateLoanEligibility()) {
            System.out.println("Account is eligible for loan");
        }else {
            System.out.println("Account is not eligible for loan");
        }

        // appliying for loan
        currentAccount1.applyForLoan();

        // savings account intrest calculation for 5 years
        System.out.println(savingsAccount1.calculateInterest(1));
    }
}
