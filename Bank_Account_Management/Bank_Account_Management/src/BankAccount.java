public abstract class BankAccount{
    String accountHolderName;
    double accountNumber;
    double balance;

    BankAccount(String accountHolderName,double accountNumber,double balance) {
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public double getBalance(){
        return balance;
    }

    public void deposit(double amount){
        if(amount>0){
            balance += amount;
            System.out.println("Deposited Amount:"+amount);
            System.out.println("New Balance:"+balance);
        }else{
            System.out.println("Invalid deposit amount!");
        }
    }

    public abstract void withdraw(double amount);

    public void checkBalance() {
        System.out.println("Account Holder: " + accountHolderName);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Current Balance: " + balance);
    }
    
}