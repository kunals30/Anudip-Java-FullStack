public class SavingAccount extends BankAccount{
    double interestRate = 5;

    public SavingAccount(String accountHolder, double accountNumber, double balance )  {
        super(accountHolder, accountNumber, balance);
    }

    @Override
    public void withdraw(double amount) {

        if (amount > 0 && balance >= amount) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount );
            System.out.println("Balance :" +balance);
        } else {
            System.out.println("Insufficient funds or invalid amount!");
        }


    }

    public void addInterest() {
        double interest = (balance * interestRate) / 100;
        balance += interest;
        System.out.println("Interest Added: " + interest );
        System.out.println(" New Balance: " + balance);
    }
}