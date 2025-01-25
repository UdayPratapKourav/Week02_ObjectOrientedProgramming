package hierarchicalinheritance.bankaccounttypes;

public class Main {
    // main method
    public static void main(String[] args) {
        // create objects
        SavingAccount savingAccount = new SavingAccount(2025843501,25000,2.5);
        CheckingAccount checkingAccount = new CheckingAccount(2024213650,500000,15000);
        FixedDepositeAccount fdAccount = new FixedDepositeAccount(2025567005,250000,3);

        // call display method by different objects
        savingAccount.displayAccountType();
        checkingAccount.displayAccountType();
        fdAccount.displayAccountType();
    }
}
