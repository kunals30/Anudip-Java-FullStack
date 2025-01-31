import java.util.Scanner;

public class FruitShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input fruit, day of the week, and quantity
        System.out.print("Enter fruit (banana, orange, pineapple, grapes, kiwi, grapefruit): ");
        String fruit = scanner.nextLine().toLowerCase();
        
        System.out.print("Enter day of the week (Monday, Tuesday, ..., Sunday): ");
        String day = scanner.nextLine().toLowerCase();
        
        System.out.print("Enter quantity: ");
        double quantity = scanner.nextDouble();

        // Define fruit prices for weekdays and weekend
        double price = 0;

        // Weekday prices
        double bananaWeekday = 2.50, orangeWeekday = 0.85, pineappleWeekday = 1.60, grapesWeekday = 2.50, kiwiWeekday = 2.70, grapefruitWeekday = 1.45;

        // Weekend prices
        double bananaWeekend = 2.70, orangeWeekend = 1.25, pineappleWeekend = 1.80, grapesWeekend = 3.00, kiwiWeekend = 3.00, grapefruitWeekend = 1.60;

        // Check if the input fruit and day are valid
        if (fruit.equals("banana") || fruit.equals("orange") || fruit.equals("pineapple") || fruit.equals("grapes")|| fruit.equals("kiwi")|| fruit.equals("grapefruit")) {
            if (day.equals("monday") || day.equals("tuesday") || day.equals("wednesday") || day.equals("thursday") || day.equals("friday")) {
                // Weekday prices
                switch (fruit) {
                    case "banana": price = bananaWeekday; break;
                    case "orange": price = orangeWeekday; break;
                    case "pineapple": price = pineappleWeekday; break;
                    case "grapes": price = grapesWeekday; break;
                    case "kiwi": price = kiwiWeekday; break;
                    case "grapefruit": price = grapefruitWeekday; break;
                }
            } else if (day.equals("saturday") || day.equals("sunday")) {
                // Weekend prices
                switch (fruit) {
                    case "banana": price = bananaWeekend; break;
                    case "orange": price = orangeWeekend; break;
                    case "pineapple": price = pineappleWeekend; break;
                    case "grapes": price = grapesWeekend; break;
                    case "kiwi": price = kiwiWeekend; break;
                    case "grapefruit": price = grapefruitWeekend; break;
                }
            } else {
                System.out.println("error");
                return;
            }

            // Calculate total price
            double totalPrice = price * quantity;
            System.out.printf("Total price: %.2f", totalPrice);
        } else {
            System.out.println("error");
        }

        scanner.close();
    }
}