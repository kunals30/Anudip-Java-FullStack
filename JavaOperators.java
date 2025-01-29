import java.util.Scanner;
class JavaOperators{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number:");
        int a = sc.nextInt();
        System.out.print("Enter second number:");
        int b = sc.nextInt();

        System.out.println("------Arithmetic Operators-------");
        System.out.println("a+b:"+(a+b));
        System.out.println("a-b:"+(a-b));
        System.out.println("a*b:"+(a*b));
        System.out.println("a/b:"+(a/b));
        System.out.println("a%b:"+(a%b));
        System.out.println("---------------------------------");

        System.out.println("------Comparison Operators-------");
        System.out.println("a>b:"+(a>b));
        System.out.println("a<b:"+(a<b));
        System.out.println("a>=b:"+(a>=b));
        System.out.println("a<=b:"+(a<=b));
        System.out.println("a!=b:"+(a!=b));
        System.out.println("a==b:"+(a==b));
        System.out.println("---------------------------------");

        System.out.println("------Logical Operators-------");
        System.out.println("a>b && a!=b"+(a>b && a!=b));
        System.out.println("a>b || a!=b"+(a>b || a!=b));
        System.out.println("!(a>b && a!=b)"+!(a>b && a!=b));
        System.out.println("a/b:"+(a/b));
        System.out.println("a%b:"+(a%b));
        System.out.println("---------------------------------");

        System.out.println("------Bitwise Operators-------");
        System.out.println("a&b:"+(a&b));
        System.out.println("a|b:"+(a|b));
        System.out.println("a^b:"+(a^b));
        System.out.println("---------------------------------");

        System.out.println("------Unary Operators-------");
        System.out.println("a++:"+(a++));
        System.out.println("++a:"+(++a));
        System.out.println("a--:"+(a--));
        System.out.println("--a:"+(--a));
        System.out.println("!(true)"+!(true));
        System.out.println("!(false)"+!(false));
        System.out.println("---------------------------------");

        System.out.println("------Assignment Operators-------");
        a+=10;
        System.out.println("a+=10:"+(a));
        a-=10;
        System.out.println("a-=10:"+(a));
        a*=4;
        System.out.println("a*=4:"+(a));
        a/=5;
        System.out.println("a/=5:"+(a));
        a%=3;
        System.out.println("a%=3:"+(a));
        System.out.println("---------------------------------");

    }
}