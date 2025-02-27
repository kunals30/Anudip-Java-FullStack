import java.util.*;
public class CountOfOddAndEven{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int countOfOdd = 0;
        int countOfEven = 0;
        while (true) { 
        System.out.println("Enter the number:");
        int num = sc.nextInt();
            if(num == -1){
                System.out.println("count of Even numbers:"+countOfEven);
                System.out.println("count of Odd numbers:"+countOfOdd);
                System.exit(0);
            }
            else if(num % 2 == 0){
                countOfEven++;
            }else{
                countOfOdd++;
            }
        }
    }
}