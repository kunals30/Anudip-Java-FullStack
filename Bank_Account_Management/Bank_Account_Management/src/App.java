
import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        SavingAccount saving = new SavingAccount("Kunal Shinde", 11253493, 100000);
        CurrentAccount current = new CurrentAccount("Kunal Shinde", 14934921, 1000000);

        while (true) {
            System.out.println("-*-*-*-*-*-*-*-*-*Bank Management System-*-*-*-*-*-*-*-*-*-*-*");
            System.out.println("1.Deposit");
            System.out.println("2.Withdraw");
            System.out.println("3.Check Balance");
            System.out.println("4.Exit");
            int choice = sc.nextInt();

            System.out.print("Select Account Type (1.Saving and 2.Current):");
            int accountType = sc.nextInt();

            BankAccount account = (accountType == 1) ? saving : current;

            switch (choice) {
                case 1:
                    System.out.println("Enter Deposit Amount :");
                    double depositAmount = sc.nextDouble();
                    account.deposit(depositAmount);
                    break;

                case 2:
                    System.out.println("Enter Withdraw Amount :");
                    double withdrawAmount = sc.nextDouble();
                    account.withdraw(withdrawAmount);
                    break;

                case 3:
                    account.checkBalance();
                    break;

                case 4:
                    System.out.println("Thank You For Using Bank Account System");
                    break;

                default:
                    System.out.println("Invalid Choice");

            }

        }
    }

}
