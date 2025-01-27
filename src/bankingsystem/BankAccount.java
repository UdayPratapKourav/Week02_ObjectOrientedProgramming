package bankingsystem;

public  abstract class BankAccount implements Loanable {
    private String accountNumber;
    private String holderName;

    public double getBalance() {
        return balance;
    }


    public void setBalance(double balance) {
        this.balance = balance;
    }

    private double balance;

    public BankAccount(String accountNumber,String holderName,double balance){
        this.accountNumber=accountNumber;
        this.holderName=holderName;
        this.balance=balance;
    }

    public void deposit(double amount){
        balance=balance+amount;
    }
    public void withdraw(double amount){
        balance=balance-amount;
    }
    public abstract double calculateInterest(int years);
    public void accountDetails(){
        System.out.println("Account holder name is :"+holderName);
        System.out.println("Account number :"+accountNumber);
        System.out.println("Balance is :"+balance);

    }

}
