public class CurrentAccount extends BankAccount{

    double overdraftLimit = 100000;

    public CurrentAccount(String accountHolder, double accountNumber, double balance )  {
        super(accountHolder, accountNumber, balance);
    }


    @Override
    public void withdraw(double amount){
        if (amount > 0 && (balance + overdraftLimit) >= amount) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount );
            System.out.println(" Remaining Balance: " + balance);
        } else {
            System.out.println("Withdrawal failed! Overdraft limit exceeded.");
        }
    }
}