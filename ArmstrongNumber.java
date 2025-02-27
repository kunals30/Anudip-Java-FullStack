import java.util.*;

public class ArmstrongNumber{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number between 100 and 1000:");
        int num = sc.nextInt();

        if(100<num && num<1000){
            int sumOfDigit = 0;
            int temp = num;
            while(num!=0){
                int digit = num % 10;
                sumOfDigit += digit*digit*digit;
                num = num / 10;
            }
            if(sumOfDigit == temp){
                System.out.println("The number is armstrong number");
            }else{
                System.out.println("The number is not armstrong number");
            }
        }else{
            System.out.println("Given number is not in range");
        }
    }
}