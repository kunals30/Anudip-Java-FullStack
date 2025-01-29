import java.util.Scanner;

class DisplayInterest{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Principle amount in Rs:");
        int P = sc.nextInt();
        System.out.print("Enter the Rate per annum in percent(%):");
        int R = sc.nextInt();
        System.out.print("Enter the number of years:");
        int N = sc.nextInt();

        System.out.println("------------------------------");
        System.out.println("Your total interest:"+((P*R*N)/100));
        

    }
}