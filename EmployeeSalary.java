
import java.util.*;

public class EmployeeSalary {

    public static void main(String[] args) {

        System.out.println("Calculate the Employee Salary:");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Employee salary:");
        int salary = sc.nextInt();
        if (salary > 15000) {
            int HRA = (salary*20)/100;
            int DA = (salary*60)/100;
            int totalSalary = salary + HRA + DA;
            System.out.println("Total Salary:" + totalSalary);
        } else {
            int HRA = 3000;
            int DA = (salary*70)/100;
            int totalSalary = salary + HRA + DA;
            System.out.println("Total Salary:" + totalSalary);
        }

        while (true) {
            System.out.println("\n-1.Continue\n2.Exit\nEnter Your Choice:");
            int choice = sc.nextInt();

            switch (choice) {
                case -1:
                    System.out.print("Enter the Employee salary:");
                    int salary2 = sc.nextInt();
                    if (salary2 > 15000) {
                        int HRA = (salary2*20)/100;
                        int DA = (salary2*60)/100;
                        int totalSalary = salary2 + HRA + DA;
                        System.out.println("Total Salary:" + totalSalary);
                    } else {
                        int HRA = 3000;
                        int DA = (salary2*70)/100;
                        int totalSalary = salary2 + HRA + DA;
                        System.out.println("Total Salary:" + totalSalary);
                    }
                    break;
                
                case 2: 
                    System.exit(0);

                default:
                    System.out.println("Wrong input!");
            }
        }

    }
}
