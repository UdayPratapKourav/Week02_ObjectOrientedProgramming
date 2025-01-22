class BankAccount {
    // Static variable shared across all instances
    static String bankName = "Global Bank";
    static int totalAccounts = 0;

    // Final variable to ensure accountNumber is immutable
    private final int accountNumber;
    private String accountHolderName;

    // Constructor using 'this' to resolve ambiguity
    public BankAccount(int accountNumber, String accountHolderName) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        totalAccounts++;  // Increment the total account count
    }

    // Static method to display total number of accounts
    public static void getTotalAccounts() {
        System.out.println("Total Accounts: " + totalAccounts);
    }

    // Method to display account details
    public void displayAccountDetails() {
        // Using instanceof to check if the object is a BankAccount
        if (this instanceof BankAccount) {
            System.out.println("Bank Name: " + bankName);
            System.out.println("Account Holder: " + accountHolderName);
            System.out.println("Account Number: " + accountNumber);
        } else {
            System.out.println("Not a valid bank account.");
        }
    }

    // Main method to test the functionality
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount(101, "Alice");
        BankAccount account2 = new BankAccount(102, "Bob");

        account1.displayAccountDetails();
        account2.displayAccountDetails();

        // Display total number of accounts
        BankAccount.getTotalAccounts();
    }
}
