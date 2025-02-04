import java.util.Scanner;

public class NumOperations {

    // Method to display even numbers in a range
    public static void displayEvenNumbers(int min, int max) {
        System.out.println("Even numbers between " + min + " and " + max + ":");
        for (int i = min; i <= max; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    // Method to check if a number is prime
    public static boolean isPrime(int num) {
        if (num < 2) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }
        return true;
    }

    // Method to check if a number is palindrome
    public static boolean isPalindrome(int num) {
        int original = num, reverse = 0;
        while (num > 0) {
            int digit = num % 10;
            reverse = reverse * 10 + digit;
            num /= 10;
        }
        return original == reverse;
    }

    // Method to check if a number is Armstrong
    public static boolean isArmstrong(int num) {
        int original = num, sum = 0, digits = 0;
        int temp = num;

        while (temp > 0) { // Count digits
            temp /= 10;
            digits++;
        }

        temp = num;
        while (temp > 0) { // Calculate sum of powered digits
            int digit = temp % 10;
            sum += Math.pow(digit, digits);
            temp /= 10;
        }

        return sum == original;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        while (true) {
            System.out.println("\nChoose an option:");
            System.out.println("1. Display even numbers in a range");
            System.out.println("2. Check if a number is prime");
            System.out.println("3. Check if a number is palindrome");
            System.out.println("4. Check if a number is Armstrong");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter min value: ");
                    int min = sc.nextInt();
                    System.out.print("Enter max value: ");
                    int max = sc.nextInt();
                    displayEvenNumbers(min, max);
                    break;
                    
                case 2:
                    System.out.print("Enter a number: ");
                    int primeNum = sc.nextInt();
                    if (isPrime(primeNum)) {
                        System.out.println(primeNum + " is a prime number.");
                    } else {
                        System.out.println(primeNum + " is not a prime number.");
                    }
                    break;

                case 3:
                    System.out.print("Enter a number: ");
                    int palindromeNum = sc.nextInt();
                    if (isPalindrome(palindromeNum)) {
                        System.out.println(palindromeNum + " is a palindrome.");
                    } else {
                        System.out.println(palindromeNum + " is not a palindrome.");
                    }
                    break;

                case 4:
                    System.out.print("Enter a number: ");
                    int armstrongNum = sc.nextInt();
                    if (isArmstrong(armstrongNum)) {
                        System.out.println(armstrongNum + " is an Armstrong number.");
                    } else {
                        System.out.println(armstrongNum + " is not an Armstrong number.");
                    }
                    break;

                case 5:
                    System.out.println("Exiting program...");
                    sc.close();
                    System.exit(0);
                    
                default:
                    System.out.println("Invalid choice! Please enter a number between 1 and 5.");
            }
        }
    }
}
