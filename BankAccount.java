
/**
Is apart of the ObjectArray.java program
*/



public class BankAccount {

    private double balance = 0.0;
    private double  aWithdrawals = 0;
   
    

    // Constructors
    public BankAccount() {

        balance = 0.0;

    }

    public BankAccount(double startBalance) {

        balance = startBalance;

    }

    public BankAccount(String bS) {
        balance = Double.parseDouble(bS);
        //annualRate = Double.parseDouble(aRS);
    }

    // Setters
    public void deposit(double dAmount1) {
        balance += dAmount1;
     
    }

    public void deposit(String str) {
        balance += Double.parseDouble(str);

    }

    public void withdraw(double wAmount) {
        balance -= wAmount;
        aWithdrawals += wAmount;
    }

    public void withdraw(String str) {
        balance -= Double.parseDouble(str);

    }

    public void setBalance(double b) {
        balance = b;
    }

    public void setBalance(String str) {
        balance = Double.parseDouble(str);
    }

    // Getters
    public double getBalance() {
        return balance;
    }

}

