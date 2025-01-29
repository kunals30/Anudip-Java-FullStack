
import java.util.Scanner;

class RectangleOperations{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of Rectangle:");
        int l = sc.nextInt();
        System.out.print("Enter the width of Rectangle:");
        int w = sc.nextInt();

        System.out.println("\nThe perimeter of the rectangle:"+((2*l)+(2*w)));
        System.out.println("The area of the rectangle:"+(l*w));
    }
}