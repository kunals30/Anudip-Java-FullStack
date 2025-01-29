import java.util.Scanner;
class EmployeeDetails{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Employee's Name:");
        String Emp_name = sc.nextLine();
        System.out.print("Enter Employee's Salary:");
        int Emp_salary = sc.nextInt();
        System.out.print("Enter Employee's Contact Number:");
        long Emp_contact_number = sc.nextLong();
        System.out.print("Enter Employee's Gender:");
        String Emp_gender = sc.next();

        System.out.println("\n----------Employee Details----------");
        System.out.println("Employee Name:"+Emp_name+"\nEmployee Salary:"+Emp_salary+"\nEmployee Contact Number:"+Emp_contact_number+"\nEmployee's Gender:"+Emp_gender);
    }
}