import java.util.Scanner;

public class OnlineFoodOrderingSystem {
    public static void main(String[] args) {
        int choice, choice1, totalBill = 0;
        char ans;
        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to My Hotel :)");

        do {
            System.out.println("Select a category:");
            System.out.println("1: Starters\n2: Main Course\n3: Desserts\n4: Drinks");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Starters Menu:");
                    System.out.println("1: Spring Rolls - 120 Rs.");
                    System.out.println("2: Paneer Tikka - 150 Rs.");
                    System.out.println("3: Chicken Wings - 200 Rs.");
                    System.out.println("4: French Fries - 100 Rs.");
                    System.out.println("5: Nachos - 130 Rs.");
                    System.out.print("Enter your choice: ");
                    choice1 = sc.nextInt();

                    switch (choice1) {
                        case 1: totalBill += 120; break;
                        case 2: totalBill += 150; break;
                        case 3: totalBill += 200; break;
                        case 4: totalBill += 100; break;
                        case 5: totalBill += 130; break;
                        default: System.out.println("Invalid choice!");
                    }
                    break;

                case 2:
                    System.out.println("Main Course Menu:");
                    System.out.println("1: Butter Chicken - 300 Rs.");
                    System.out.println("2: Paneer Butter Masala - 250 Rs.");
                    System.out.println("3: Veg Biryani - 220 Rs.");
                    System.out.println("4: Chicken Biryani - 280 Rs.");
                    System.out.println("5: Dal Tadka - 180 Rs.");
                    System.out.print("Enter your choice: ");
                    choice1 = sc.nextInt();

                    switch (choice1) {
                        case 1: totalBill += 300; break;
                        case 2: totalBill += 250; break;
                        case 3: totalBill += 220; break;
                        case 4: totalBill += 280; break;
                        case 5: totalBill += 180; break;
                        default: System.out.println("Invalid choice!");
                    }
                    break;

                case 3:
                    System.out.println("Desserts Menu:");
                    System.out.println("1: Ice Cream - 100 Rs.");
                    System.out.println("2: Gulab Jamun - 90 Rs.");
                    System.out.println("3: Chocolate Cake - 150 Rs.");
                    System.out.println("4: Rasmalai - 120 Rs.");
                    System.out.println("5: Brownie - 180 Rs.");
                    System.out.print("Enter your choice: ");
                    choice1 = sc.nextInt();

                    switch (choice1) {
                        case 1: totalBill += 100; break;
                        case 2: totalBill += 90; break;
                        case 3: totalBill += 150; break;
                        case 4: totalBill += 120; break;
                        case 5: totalBill += 180; break;
                        default: System.out.println("Invalid choice!");
                    }
                    break;

                case 4:
                    System.out.println("Drinks Menu:");
                    System.out.println("1: Coffee - 80 Rs.");
                    System.out.println("2: Tea - 50 Rs.");
                    System.out.println("3: Soft Drink - 60 Rs.");
                    System.out.println("4: Juice - 100 Rs.");
                    System.out.println("5: Lassi - 90 Rs.");
                    System.out.print("Enter your choice: ");
                    choice1 = sc.nextInt();

                    switch (choice1) {
                        case 1: totalBill += 80; break;
                        case 2: totalBill += 50; break;
                        case 3: totalBill += 60; break;
                        case 4: totalBill += 100; break;
                        case 5: totalBill += 90; break;
                        default: System.out.println("Invalid choice!");
                    }
                    break;

                default:
                    System.out.println("Invalid category choice!");
            }

            System.out.print("Do you want to add any other item? (Y/N): ");
            ans = sc.next().charAt(0);
        } while (ans == 'Y' || ans == 'y');

        System.out.println("Your total bill is: " + totalBill + " Rs.");
        System.out.println("Thank you for ordering! Have a great day!");

        sc.close();
    }
}
