import java.util.Scanner;
class PersonalTitles{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the age of a person:");
        int age = sc.nextInt();
        System.out.print("Enter the gender of a person(m/f):");
        String gender = sc.next();

        if(age>0){
            if(age >= 16 && gender.equals("m")){
            System.out.println("Mr.");
        }
        else if(age >= 16 && gender.equals("f")){
            System.out.println("Ms.");
        }
        else if(age < 16 && gender.equals("m")){
            System.out.println("Master");
        }
        else{
            System.out.println("Miss");
        }
        }
        
    }
}