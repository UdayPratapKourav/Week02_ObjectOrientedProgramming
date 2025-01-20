class BankAccount{
   public int accountNumber;
   protected String  accountHolder;
   private double balance;

  public double getBalance() {
        return balance;
    }

   BankAccount(int accountNumber,String accountHolder,double balance){
       this.accountNumber=accountNumber;
       this.accountHolder=accountHolder;
       this.balance=balance;

   }

   public void modifyBalance(double amount){
       if(amount>0){
           balance= amount;
           System.out.println("balance updated to :"+balance);
       }else{
           System.out.println("invalid amount");
       }
   }

}

class SavingsAccount extends BankAccount{
     public SavingsAccount(int accountNumber,String accountHolder,double balance){
         super(accountNumber,accountHolder,balance);
     }

    public void displayAccountDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Balance: " + getBalance());
    }


}

public class BankAccountManagement {
    public static void main(String[] args) {
        SavingsAccount ud = new SavingsAccount(123, "Uday", 25000);

        // Display account details
        ud.displayAccountDetails();

        // Modify balance
        ud.modifyBalance(30000); // Updating balance to 30000

        // Display updated balance
        System.out.println("Updated Balance: " + ud.getBalance());

    }

}
