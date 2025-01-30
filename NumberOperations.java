import java.util.Scanner;

class NumberOperations {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1:accept number and check it is even or odd\n2:find out the character is vowel or not\n3:accept a number and check it is divisible by 5 or not\n4:accept 3 number from user and find out the greatest");
        System.out.print("Enter the operation number:");
        int choice = sc.nextInt();

        switch (choice) {
            case 1: {
                System.out.print("Enter the number:");
                int num = sc.nextInt();
                if (num % 2 == 0) {
                    System.out.println(num + " is even");
                } else {
                    System.out.println(num + " is odd");
                }
                break;
            }
            case 2: {
                System.out.print("Enter the alphabetical character:");
                String c = sc.next();
                if (c.equals("a") || c.equals("A") || c.equals("e") || c.equals("E") || c.equals("i") || c.equals("I") || c.equals("o") || c.equals("O") || c.equals("u") || c.equals("U")) {
                    System.out.println(c + " is a vowel");
                } else {
                    System.out.println(c + " is not a vowel");
                }
                break;
            }
            case 3: {
                System.out.print("Enter the number:");
                int num = sc.nextInt();
                if (num % 5 == 0) {
                    System.out.println(num + " is divisible by 5");
                } else {
                    System.out.println(num + " is not divisible by 5");
                }
                break;
            }
            case 4: {
                System.out.print("Enter three numbers:");
                int a = sc.nextInt();
                int b = sc.nextInt();
                int c = sc.nextInt();
                /*
                    if (a > b){
                        if(a>c){
                        a is greatest
                        }
                        else{
                        c is greatest
                        }
                    }
                    else{
                        if(b>c){
                            b is greatest
                        }else{
                            c is greatest
                        }
                    }
                */
                if (a > b && a > c) {
                    System.out.println(a + " is the greatest number");
                } else if (b > a && b > c) {
                    System.out.println(b + " is the greatest number");
                } else {
                    System.out.println(c + " is the greatest number");
                }
                break;
            }
            default: {
                System.out.println("Invalid choice! Please enter a valid operation number between 1 and 4.");
                break;
            }
        }
    }
}
