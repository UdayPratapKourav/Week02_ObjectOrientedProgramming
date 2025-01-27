package bankingsystem;

public class SavingsAccount extends BankAccount {
    private double interestRate=12.0;

    public SavingsAccount(String accountNumber,String holderName,double balance){
        super(accountNumber,holderName,balance);
    }

    @Override
    public double calculateInterest(int years) {
       double interest=getBalance()*interestRate*years;
       setBalance(getBalance()+interest);
        return interest;
    }

    public void applyForLoan(){
        if(calculateLoanEligibility()){
            System.out.println("You have applied to get loan sucessfully");
        }
    }

    @Override
    public boolean calculateLoanEligibility() {
        if(getBalance()>10000.0){
            return true;
        }
        return false;
    }


}
