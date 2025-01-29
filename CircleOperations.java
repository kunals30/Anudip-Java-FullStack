import java.util.Scanner;

class CircleOperations{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the radius of the circle:");
        int r = sc.nextInt();
        double circum = (2*3.14*r);
        double area = (3.14*r*r);

        System.out.println("Circumference of circle:"+circum);
        System.out.println("Area of circle:"+area);
    }
}